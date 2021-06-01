package controller;

import model.De;
import model.Inventory.Loot;
import model.Donjon.Room;

import model.Personne.Joueur;
import model.Personne.Monstre;
import model.Personne.Personne;
import view.CombatView;
import view.Console;
import view.Temps;

public class CombatController {

    /**
     * Instanciates the player
     * @see Joueur
     */
    private Joueur joueur = JoueurController.joueur;

    /**
     * Instanciates the view
     * @see CombatView
     */
    public CombatView combatView = new CombatView();

    /**
     * Instanciates the monster
     * @see Monstre
     */
    private Monstre monstre;

    /**
     * Instanciates a Room call "roomPrecedente"
     * @see Room
     */
    private Room roomPrécédente;


    /**
     * If a player meet a monster, this method is call
     * @param roomPrécédente
     */
    public void rencontreMonstre(Room roomPrécédente) {
        this.roomPrécédente = roomPrécédente;
        monstre = joueur.getSalleActuelle().getMonster();
        Console.parler("Que le meilleur gagne !\n");
        Personne p1 = calculInitiative();
        choixJoueur(p1);
    }

    /**
     * When a turn start, the player can choose in a menu
     * @param p
     */
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
                    joueur.setSalleActuelle(roomPrécédente);
                }
                break;
            default:
                Console.ecrire("Erreur");
                choixJoueur(p);
        }
    }

    /**
     * It's a calcul for know who start a fight
     * @return Personne
     * @see Personne
     */
    public Personne calculInitiative() {
        Personne personne1;

        if (joueur.getInitiative() > monstre.getInitiative()) {
            personne1 = joueur;
        } else {
            personne1 = monstre;
        }
        return personne1;
    }

    /**
     * The method for attack
     * @see Monstre
     * @see Joueur
     * @param p1
     */
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

    /**
     * It's for an attack
     * @param personne
     * @param cible
     * @see De
     * @see Personne
     */
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
