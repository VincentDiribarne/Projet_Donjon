package view;

import controller.DonjonController;
import controller.Histoire;
import controller.JoueurController;
import controller.LibraryController;


public class Menu {

    /**
     * Instanciates keyboard
     */
    private Clavier clavier = new Clavier();

    /**
     * Instanciates joueurController
     * @see JoueurController
     */
    private JoueurController joueurController = Histoire.joueurController;
    private DonjonController donjonController = Histoire.donjonController;
    private LibraryController libraryController = Histoire.libraryController;

    /**
     * Print Menu
     */
    public void Menu() {
        Temps.temps(1000);
        System.out.println("\t+------------------------------+\n" +
                            "\t|        Donjon Textuel        |\n" +
                            "\t+------------------------------+\n" +
                            "\t| 1 - Création d'un personnage |\n" +
                            "\t| 2 - Afficher les règles      |\n" +
                            "\t| 3 - Personnage tout fait     |\n" +
                            "\t| 4 - Quitter                  |\n" +
                            "\t+------------------------------+\n" +
                            "\n" +
                            "Votre Choix ?"
        );
        choixMenu(clavier.LectureInt());
    }

    /**
     * Choise for the menu
     * @param a
     */
    public void choixMenu(int a) {
        Regles r = new Regles();
        switch (a){
            case 1:
                joueurController.creationPersonnage();
                break;
            case 2:
                r.Regles();
                Menu();
                break;
            case 3:
                joueurController.creationJoueurDebug();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                Menu();
                break;
        }
    }

    /**
     * Second Menu
     */
    public void Menu2() {
        System.out.println("""
                \t+------------------------------+
                \t|        Donjon Textuel        |
                \t+------------------------------+
                \t| 1 - Lancer la partie         |
                \t| 2 - Afficher les règles      |
                \t| 3 - Quitter                  |
                \t+------------------------------+

                Votre Choix ?"""
        );
        choixMenu2(Clavier.LectureInt());
    }

    /**
     * Choise for the menu
     * @param a
     */
    public void choixMenu2(int a) {
        Regles r = new Regles();
        switch (a){
            case 1:
                libraryController.createLibrary();
                donjonController.creationDonjon();
                joueurController.DemarrerLaPartie();
                break;
            case 2:
                r.Regles();
                a = 0;
                choixMenu2(a);
                break;
            case 3:
                System.exit(1);
                break;
            default:
                Menu2();
                break;
        }

    }
}
