package view;

import controller.JoueurController;
import model.De;
import model.Donjon.Door;
import model.Donjon.Room;

import java.util.ArrayList;

public class DonjonView {

    /**
     * Print text for the current room and the way
     * @param sallesDisponibles
     * @param roomJoueur
     * @return
     */
    public String choixSalle(ArrayList<Door> sallesDisponibles, Room roomJoueur){
        ArrayList<String> choixDisponibles = new ArrayList<String>();
        Console.ecrire("Vous êtes dans la salle "+ roomJoueur.getName());
        Console.ecrire("Vous pouvez maintenant vous déplacer : ");
        for (Door p: sallesDisponibles) {
            voirSallePorte(p, roomJoueur);
            if (p != null){
                choixDisponibles.add(p.getDirection(roomJoueur));
            }
        }
        return choixSalleJoueur(choixDisponibles);


    }

    /**
     * Put text for door if the room is available
     * @param porte
     * @param room
     */
    public void voirSallePorte(Door porte, Room room){
        if (porte != null){
            System.out.println("\t - Porte " +porte.getDirection(room)+ " vers la salle " + porte.takeDoor(room).getName());;
        }
    }

    /**
     * Text for the door choose
     * @param choixDisponible
     * @return
     */
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

    /**
     * Text to know if we can recognize the monster
     * @param roomActuelle
     */
    public void JetPerceptionMonstre(Room roomActuelle) {
        Console.ecrire("Vous apercevez un mouvement dans cette salle");
        Console.ecrire("Vous faites un lancer de dé pour essayer de reconnaitre cette forme\n");
        Temps.temps(1000);
        if (De.lancerDes(20) + JoueurController.joueur.getBonusInt() > 13) {
            Console.ecrire("Il vous semble qu'il s'agit d'un " + roomActuelle.getMonster().getNom()+ "\n");
        } else {
            Console.ecrire("Vous n'avez pas assez de connaissance pour decouvrir le monstre\n");
        }
    }


}
