package Autres;

public class Menu {

    FonctionAutre fA = new FonctionAutre();

    public int Menu() {
        int reponse;
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
        reponse = fA.LectureInt();
        return reponse;
    }

    public int Menu2() {
        int reponse;
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
        reponse = fA.LectureInt();
        return reponse;
    }


}
