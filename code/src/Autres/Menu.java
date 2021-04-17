package Autres;

public class Menu {

    public static int Menu() {
        int reponse;
        System.out.println( "\t+------------------------------+\n" +
                            "\t|        Donjon Textuel        |\n" +
                            "\t+------------------------------+\n" +
                            "\t| 1 - Création d'un personnage |\n" +
                            "\t| 2 - Charger un personnage    |\n" +
                            "\t| 3 - Éditer la carte          |\n" +
                            "\t| 4 - Quitter                  |\n" +
                            "\t+------------------------------+\n" +
                            "\n" +
                            "Votre Choix ?"
        );
        reponse = FonctionAutre.Lecture();
        return reponse;
    }

}
