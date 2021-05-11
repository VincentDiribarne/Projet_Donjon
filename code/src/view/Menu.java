package view;

import controller.DonjonController;
import controller.Histoire;
import controller.JoueurController;

public class Menu {

    private Clavier clavier = new Clavier();
    private JoueurController joueurController = Histoire.joueurController;
    private DonjonController donjonController = Histoire.donjonController;

    public void Menu() {
        Temps.temps(1000);
        System.out.println("\t+------------------------------+\n" +
                            "\t|        Donjon Textuel        |\n" +
                            "\t+------------------------------+\n" +
                            "\t| 1 - Création d'un personnage |\n" +
                            "\t| 2 - Charger un personnage    |\n" +
                            "\t| 3 - Éditer la carte          |\n" +
                            "\t| 4 - Afficher les règles      |\n" +
                            "\t| 5 - Quitter                  |\n" +
                            "\t| 6 - Debug                    |\n" +
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
                //chargerunPerso();
                break;
            case 3:
                //changerlaCarte()
                break;
            case 4:
                r.Regles();
                break;
            case 5:
                System.exit(1);
                break;
            case 6:
                joueurController.creationJoueurDebug();
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
                "\t| 2 - Éditer la carte          |\n" +
                "\t| 3 - Afficher les règles      |\n" +
                "\t| 4 - Quitter                  |\n" +
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
                donjonController.creationDonjon();
                joueurController.DemarrerLaPartie();

                break;
            case 2:
                //editter la carte();
                break;
            case 3:
                r.Regles();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                Menu2();
                break;
        }

    }
}
