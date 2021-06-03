package controller;

import view.Console;
import view.Menu;

public class Histoire {

    /**
     * Instanciates the donjonController
     * @see DonjonController
     */
    public static DonjonController donjonController = new DonjonController();

    /**
     * Instanciates the joueurController
     * @see DonjonController
     */
    public static JoueurController joueurController = new JoueurController();

    /**
     * Instanciates the combatController
     * @see DonjonController
     */
    public static CombatController combatController = new CombatController();

    /**
     * Instanciates the inventaireController
     * @see DonjonController
     */
    public static InventaireController inventaireController = new InventaireController();

    /**
     * Instanciates the libraryController
     * @see DonjonController
     */
    public static LibraryController libraryController = new LibraryController();

    /**
     * Start the game
     * @see Menu
     */
    public static void main(String[] args){
        Menu m = new Menu();

        Console.parler("Bonjour et bienvenue dans notre Donjon Textuel.");
        Console.ecrire("Le menu va apparaitre, entrez un nombre qui correspond.\n");

        m.Menu();
        m.Menu2();
    }

}
