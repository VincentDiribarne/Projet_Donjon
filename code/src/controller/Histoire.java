package controller;

import view.Console;
import view.Menu;
import view.Temps;

public class Histoire {

    /**
     * Instanciates the donjonController
     *
     * @see DonjonController
     */
    public static DonjonController donjonController = new DonjonController();

    /**
     * Instanciates the joueurController
     *
     * @see DonjonController
     */
    public static JoueurController joueurController = new JoueurController();

    /**
     * Instanciates the combatController
     *
     * @see DonjonController
     */
    public static CombatController combatController = new CombatController();

    /**
     * Instanciates the inventaireController
     *
     * @see DonjonController
     */
    public static InventaireController inventaireController = new InventaireController();

    /**
     * Instanciates the libraryController
     *
     * @see DonjonController
     */
    public static LibraryController libraryController = new LibraryController();

    /**
     * Start the game
     *
     * @see Menu
     */
    public static void main(String[] args) {
        Menu m = new Menu();

        Console.parler("Bonjour et bienvenue dans notre Donjon Textuel.");
        Console.ecrire("Le menu va apparaitre, entrez un nombre qui correspond.\n");

        m.Menu();
        Temps.temps(2000);
        Console.parler("Vous êtes un grand aventurier de niveau 20, nan je blague, c’est dans vos rêves ça.");
        Console.parler("Vous êtes plutôt un petit aventurier de niveau 1 à la recherche de la fortune et de la gloire.\n");
        Temps.temps(1000);
        Console.parler("Vous arrivez dans le petit village de Pran. Vous vous apercevez qu’il est composé de fermes et d’un château au centre. Le village est désert. Au loin, vous repérez un taverne, l’Aigle Hurlant. Vous pénétrez dans la bâtisse et là, c’est l’hécatombe… Une énorme fête est organisée dans la taverne, les bières fusent, et je ne parle pas de la danse des paysans.");
        Console.parler("Dans le fond de la salle, vous apercevez un homme, il vous fait des signes de main. Vous vous approchez, et après quelques pintes et une bonne dose de rigolade, il vous propose une quête : retrouver son anneau dans le château de Erostey, un château a une dizaine de kilomètres vers le Sud.\n");
        Temps.temps(1000);
        Console.ecrire("Le lendemain matin, vous arrivez dans le château, à la recherche de ce donjon, fidèlement décrit par le paysan.");
        Console.ecrire("Finalemement, vous trouvez ce donjon et rentrez dedans.\n");
        Temps.temps(1000);
        Console.parler("C’est le début de votre aventure");
        Console.parler("Bonne chance\n");
        m.Menu2();
    }

}
