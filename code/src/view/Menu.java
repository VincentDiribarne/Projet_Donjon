package view;

import controller.DonjonController;
import controller.Histoire;
import controller.JoueurController;
import controller.LibraryController;


public class Menu {

    private Clavier clavier = new Clavier();
    private JoueurController joueurController = Histoire.joueurController;
    private DonjonController donjonController = Histoire.donjonController;
    private LibraryController libraryController = Histoire.libraryController;

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

    public void choixMenu(int a) {
        Regles r = new Regles();
        switch (a){
            case 1:
                joueurController.creationPersonnage();
                break;
            case 2:
                r.Regles();
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

    public void Menu2() {
        System.out.println("\t+------------------------------+\n" +
                "\t|        Donjon Textuel        |\n" +
                "\t+------------------------------+\n" +
                "\t| 1 - Lancer la partie         |\n" +
                "\t| 2 - Afficher les règles      |\n" +
                "\t| 3 - Quitter                  |\n" +
                "\t+------------------------------+\n" +
                "\n" +
                "Votre Choix ?"
        );
        choixMenu2(clavier.LectureInt());
    }

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
