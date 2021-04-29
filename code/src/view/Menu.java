package view;

import controller.JoueurController;
import model.Personne.Personne;

public class Menu {

    Clavier clavier = new Clavier();
    JoueurController joueurController = new JoueurController();

    public void Menu() {
        Temps.temps(1000);
        System.out.println( "\t+------------------------------+\n" +
                            "\t|        Donjon Textuel        |\n" +
                            "\t+------------------------------+\n" +
                            "\t| 1 - Création d'un personnage |\n" +
                            "\t| 2 - Charger un personnage    |\n" +
                            "\t| 3 - Éditer la carte          |\n" +
                            "\t| 4 - Afficher les règles      |\n" +
                            "\t| 5 - Quitter                  |\n" +
                            "\t+------------------------------+\n" +
                            "\n" +
                            "Votre Choix ?"
        );
        choixMenu(clavier.LectureInt());
    }

    public void choixMenu(int a) {
        Regles r = new Regles();

        if (a == 1) {
            joueurController.creationPersonnage();
        }

        if (a == 2) {
            //chargerunPerso();
        }

        if (a == 3) {
            //changerlaCarte()
        }

        if (a == 4) {
            r.Regles();
        }

        if (a == 5) {
            System.exit(1);
        }
    }

    public void Menu2() {

        System.out.println( "\t+------------------------------+\n" +
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
    }
}
