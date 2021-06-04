package view;

import model.inventory.Inventory;

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
        Console.ecrire("""
                +---------------------------------------+
                |              Inventaire               |
                +---------------------------------------+
                | 1- Voir l'inventaire                  |
                | 2- Changer l'arme équipée             |
                | 0- Quitter                            |
                +---------------------------------------+
                """);

        Console.ecrire("Votre choix : ");
        return Clavier.LectureInt();
    }
}
