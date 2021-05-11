package view;

import controller.JoueurController;
import model.De;
import model.Donjon.Porte;
import model.Donjon.Salle;

import java.util.ArrayList;

public class DonjonView {

    public String choixSalle(ArrayList<Porte> sallesDisponibles, Salle salleJoueur){
        ArrayList<String> choixDisponibles = new ArrayList<String>();
        Console.ecrire("Vous êtes dans la salle "+ salleJoueur.getNom());
        Console.ecrire("Vous pouvez maintenant vous déplacer : ");
        for (Porte p: sallesDisponibles) {
            voirSallePorte(p,salleJoueur);
            if (p != null){
                choixDisponibles.add(p.getDirection(salleJoueur));
            }
        }
        return choixSalleJoueur(choixDisponibles);


    }

    public void voirSallePorte(Porte porte,Salle salle){
        if (porte != null){
            System.out.println("\t - Porte " +porte.getDirection(salle)+ " vers la salle " + porte.emprunterPorte(salle).getNom());;
        }
    }

    public String choixSalleJoueur(ArrayList<String> choixDisponible){
        Console.ecrire("\nVotre choix : ");
        String res = Clavier.LectureString().toUpperCase();
        for (String s: choixDisponible){
            if (res.equals(s)){
                return res;
            }
        }
        return choixSalleJoueur(choixDisponible);
    }

    public void JetPerceptionMonstre(Salle salleActuelle) {
        Console.ecrire("Vous apercevez un mouvement dans cette salle");
        Console.ecrire("Vous faites un lancer de dé pour essayer de reconnaitre cette forme\n");
        Temps.temps(1000);
        if (De.lancerDes(20) + JoueurController.joueur.getBonusInt() > 15) {
            Console.ecrire("Il vous semble qu'il s'agit d'un " +salleActuelle.getMonstre().getNom()+ "\n");
        } else {
            Console.ecrire("Vous n'avez pas assez de connaissance pour decouvrir le monstre\n");
        }
    }


}
