package controller;

import view.Console;
import view.Menu;

public class Histoire {

    public static DonjonController donjonController = new DonjonController();
    public static JoueurController joueurController = new JoueurController();
    public static CombatController combatController = new CombatController();
    public static InventaireController inventaireController = new InventaireController();
    public static LibraryController libraryController = new LibraryController();

    public static void main(String args[]){
        Menu m = new Menu();

        Console.parler("Bonjour et bienvenue dans notre Donjon Textuel.");
        Console.ecrire("Le menu va apparaitre, entrez un nombre qui correspond.\n");

        m.Menu();
        m.Menu2();
    }

}
