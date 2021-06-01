package view;

import model.Inventory.Inventory;

public class InventaireView {

    /**
     * Print Inventory
     * @param inventory
     */
    public void afficherInventaire(Inventory inventory){
        Console.ecrire(inventory.toString());
    }

    /**
     * Print menu for inventory
     * @return int
     */
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
