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
                "| 1- Contenu                            |\n" +
                "| 2- L'arme équipée                     |\n" +
                "| 0- Quitter la gestion de l'inventaire |\n" +
                "+---------------------------------------+\n" +
                "\n");

        System.out.println("Votre choix : ");
        int choix;
        return choix = Clavier.LectureInt();

    }
}
