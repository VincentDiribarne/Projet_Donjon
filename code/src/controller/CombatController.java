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
        //Menu demander le choix du joueur
        int choixDuJoueur = 1;
        //Fuire :
        switch (choixDuJoueur) {
            case 1:
                System.out.println("Début du combat");
                combat(joueur.getSalleActuelle().getMonstre());
                if (monstre.getPv() > 0){
                    joueur.setSalleActuelle(sallePrécédente);
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

        boolean continuerAttaque = true;

        if (joueur.getInitiative() > monstre.getInitiative()) {
            personne1 = joueur;
            personne2 = monstre;
        } else {
            personne1 = monstre;
            personne2 = joueur;
        }
        System.out.println(personne1);
        System.out.println(personne2);

        while (continuerAttaque == true){
            attaque(personne1,personne2);
            if(personne2.getPv() > 0){
                attaque(personne2, personne1);
            }
            if (personne1.getPv() <= 0 || personne2.getPv() <= 0){
                continuerAttaque = false;
            }
            //TODO Demander si on veut fuir.
        }








    }

    public void attaque(Personne personne, Personne cible){
        int jetAttaque = De.lancerDes(20);

        int degat = personne.getDegat();
        if (jetAttaque == 20){
            degat *= 2;
            cible.estAttaqué(degat);
            System.out.println("Attaque critique de " + personne.getNom() + " de "+ degat+ " dégats");
            //TODO View personne attaque cible et lui met x dégat
        }
        else{
            jetAttaque += personne.getBonusForce() +personne.getBonusBaseAttaque();
            System.out.println("Jet d'attaque de " + jetAttaque + " de "+personne.getNom());
            if (cible.getClasseArmure() <= jetAttaque){
                cible.estAttaqué(degat);
                System.out.println("Attaque de " + personne.getNom() + " de "+ degat+ " dégats");

                //TODO View personne attaque cible et lui met x dégat
            }
            else {
                System.out.println("Attaque échoué");
                //TODO View attaque échoué
            }
        }
        System.out.println(cible.getNom() + " a " + cible.getPv() +" PV. \n");

    }
}
