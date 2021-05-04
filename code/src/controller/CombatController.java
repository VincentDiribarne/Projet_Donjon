package controller;

import model.De;
import model.Donjon.Salle;
import model.Personne.Joueur;
import model.Personne.Monstre;
import model.Personne.Personne;
import view.Console;
import view.MonstreView;

public class CombatController {

    private Joueur joueur = JoueurController.joueur;
    private MonstreView monstreView = new MonstreView();


    public void rencontreMonstre(Salle sallePrécédente) {
        Monstre monstre = joueur.getSalleActuelle().getMonstre();
        System.out.println("Il y a un monstre");
        monstreView.presentation(monstre);
        //Menu demander le choix du joueur
        int choixDuJoueur = 1;
        //Fuire :
        switch (choixDuJoueur) {
            case 1:
                System.out.println("Début du combat");
                combat(joueur.getSalleActuelle().getMonstre());
                if (monstre.getPv() > 0 && joueur.getPv() > 0){
                    rencontreMonstre(sallePrécédente);
                }
                break;
            case 2:
                //Fuire
                joueur.setSalleActuelle(sallePrécédente);
                break;
            case 3:
                //Consommer une potion (option)
                break;
            default:
                Console.ecrire("Erreur");
                rencontreMonstre(sallePrécédente);
        }

    }

    public void combat(Monstre monstre) {
        Personne personne1;
        Personne personne2;

        if (joueur.getInitiative() > monstre.getInitiative()) {
            personne1 = joueur;
            personne2 = monstre;
        } else {
            personne1 = monstre;
            personne2 = joueur;
        }
        attaque(personne1,personne2);
        if(personne2.getPv() > 0){
            attaque(personne2, personne1);
        }



    }

    public void attaque(Personne personne, Personne cible){
        int jetAttaque = De.lancerDes(20);
        int degat = personne.getDegat();
        if (jetAttaque == 20){
            degat *= 2;
            cible.estAttaqué(degat);
            //TODO View personne attaque cible et lui met x dégat
        }
        else{
            jetAttaque += personne.getBonusForce() +personne.getBonusBaseAttaque();
            if (cible.getClasseArmure() <= jetAttaque){
                cible.estAttaqué(degat);
                //TODO View personne attaque cible et lui met x dégat
            }
            else {
                //TODO View attaque échoué
            }
        }

    }


}
