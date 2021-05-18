package view;

import controller.JoueurController;
import model.Inventaire.Arme;
import model.Inventaire.Inventaire;

public class InventaireView {
    
    public void afficherInventaire(Inventaire inventaire){
        Console.ecrire(inventaire.toString());
    }

    public int menuInventaire(){
        Console.ecrire("\n" +
                "+---------------------------------------+\n" +
                "|              Inventaire               |\n" +
                "+---------------------------------------+\n" +
                "| 1- Voir l'inventaire                  |\n" +
                "| 2- Changer l'arme équipée             |\n" +
                "| 0- Quitter                            |\n" +
                "+---------------------------------------+\n" +
                "\n");

        System.out.println("Votre choix : ");
        int choix;
        return choix = Clavier.LectureInt();

    }
}
