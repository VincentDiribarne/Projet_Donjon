package view;

import controller.DonjonController;
import controller.Histoire;
import controller.JoueurController;
import controller.LibraryController;


public class Menu {

    /**
     * Instanciates joueurController
     * @see JoueurController
     */
    private final JoueurController joueurController = Histoire.joueurController;
    private final DonjonController donjonController = Histoire.donjonController;
    private final LibraryController libraryController = Histoire.libraryController;

    /**
     * Print Menu
     */
    public void Menu() {
        Temps.temps(1000);
        System.out.println("""
                \t+------------------------------+
                \t|        Donjon Textuel        |
                \t+------------------------------+
                \t| 1 - Création d'un personnage |
                \t| 2 - Afficher les règles      |
                \t| 3 - Personnage tout fait     |
                \t| 4 - Quitter                  |
                \t+------------------------------+

                Votre Choix ?"""
        );
        choixMenu(Clavier.LectureInt());
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
