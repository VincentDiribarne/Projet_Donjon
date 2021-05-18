package controller;

import model.De;
import model.Inventaire.Loot;
import model.Donjon.Salle;
import model.Personne.Joueur;
import model.Personne.Monstre;
import model.Personne.Personne;
import view.CombatView;
import view.Console;
import view.MonstreView;
import view.Temps;

public class CombatController {

    private Joueur joueur = JoueurController.joueur;
    public MonstreView monstreView = new MonstreView();
    public CombatView combatView = new CombatView();
    private Monstre monstre;
    private Salle sallePrécédente;


    public void rencontreMonstre(Salle sallePrécédente) {
        this.sallePrécédente = sallePrécédente;
        monstre = joueur.getSalleActuelle().getMonstre();
        Console.parler("Que le meilleur gagne !\n");
        Personne p1 = calculInitiative();
        choixJoueur(p1);
    }

    public void choixJoueur(Personne p) {
        int choixDuJoueur = combatView.Menu();
        switch (choixDuJoueur) {
            case 1:
                combat(p);
                if (joueur.getPv() > 0 && monstre.getPv() > 0) {
                    choixJoueur(p);
                }
                else if (monstre.getPv() <= 0) {
                    combatView.Gagne(monstre);

                    //Aleatoire loot d'un monstre
                    Loot loot = LibraryController.library.getALoot();
                    if (loot.getProbability() > De.lancerDes(100)){
                        Console.ecrire("Vous avez obtenu l'arme suivante : ");
                        Console.ecrire(loot.getArme().toString());
                        joueur.getInventaire().addArme(loot.getArme());
                    }
                }
                break;
            case 2:
                int choix = combatView.Fuite();
                if (choix == 3) {
                    attaque(monstre, joueur);
                    choixJoueur(p);
                } else {
                    joueur.setSalleActuelle(sallePrécédente);
                }
                break;
            case 3:
                //Consommer une potion (option)
                break;
            default:
                Console.ecrire("Erreur");
                choixJoueur(p);
        }
    }

    public Personne calculInitiative() {
        Personne personne1;

        if (joueur.getInitiative() > monstre.getInitiative()) {
            personne1 = joueur;
        } else {
            personne1 = monstre;
        }
        return personne1;
    }

    public void combat(Personne p1) {
        Personne p2;
        if (p1 instanceof Monstre) {
            p2 = joueur;
        } else {
            p2 = monstre;
        }
        Temps.temps(800);
        if (p1.getPv() > 0) {
            Console.ecrire("Au tour de " + p1.getNom() + " d'attaquer");
            attaque(p1, p2);
        }
        Temps.temps(1000);
        if (p2.getPv() > 0) {
            Console.ecrire("Au tour de " + p2.getNom() + " d'attaquer");
            attaque(p2, p1);
        }
    }

    public void attaque(Personne personne, Personne cible) {
        int jetAttaque = De.lancerDes(20);
        int degat = personne.getDegat();

        if (jetAttaque == 20) {
            degat *= 2;
            cible.estAttaqué(degat);
            combatView.Critique(degat, personne, cible);
        } else {
            jetAttaque += personne.getBonusForce() + personne.getBonusBaseAttaque();

            if (cible.getClasseArmure() <= jetAttaque) {
                cible.estAttaqué(degat);
                combatView.Attaque(jetAttaque, degat, personne, cible);
            } else {
                combatView.Raté(personne, cible, jetAttaque);
            }
        }
    }
}
