package view;

import model.Race.Halfelin;
import model.Race.*;

public class CreationPersonnageView {

    public void affichageRace() {
        Console.ecrire("Choisissez votre Race parmi les suivantes : ");
        Temps.temps(1000);
        Console.ecrire("Ecrivez le nom complet sans accent et sans fautes et sans le tiret, sinon vous ne pourrez pas choisir la race !");
        Console.ecrire("Si vous ecrivez, le nom, ne vous inquietez pas, cela vous donnera les caractéristiques de la race selectionnée, avant de vous demander une confirmation");
        Temps.temps(1000);
        Console.ecrire(
                "Races Pur Sang : \n" +
                        "\t - Humain \n" +
                        "\t - Halfelin \n" +
                        "\t - Gnome \n" +
                        "\t - Nain \n" +
                        "\t - Elfe \n" +

                        "\nRaces Sang-Melées : \n" +
                        "\t - Demi-Orque \n" +
                        "\t - Demi-Elfe\n"
        );
        Temps.temps(2000);
    }

    public Race choixRace() {
        String StringReponse = Clavier.LectureString();

        Console.ecrire("Vous avez choisi un " +StringReponse);
        Temps.temps(1000);
        switch (StringReponse) {

            case "Humain" :



            case "Halfelin" :
                Console.ecrire("Les halfelins vivent dans un monde rempli de personne plus grande qu'eux. Il mesure 90 centimètres maximum, il paraissent inoffensifs");
                Console.ecrire("Les bonus et les malus de l'Halphelin");
                Console.ecrire("\t - Si vous obtenez 1 lord d'un tirage de dés, vous pouvez le relancer une seconde fois. (Ne marche qu'une seule fois par combat)\n" +
                        "\t - Votre dextérité augmente de 2 \n" +
                        "\t - Votre Constitution augmente de 1 si votre taille depasse les 80 centimètres."
                );
                if (confirmation()) {
                    return new Halfelin();
                }

            case "Gnome" :


            case "Nain" :


            case "Elfe" :


            case "Demi-Orque" :


            case "Demi-Elfe" :

        }
        affichageRace();
        return choixRace();
    }

    public Boolean confirmation() {
        String StringReponse = Clavier.LectureString();
        switch (StringReponse) {
            case "Y" :
                return true;
            case "N" :
                return false;
            default:
                Console.ecrire("Erreur");
                confirmation();
        }
        return false;
    }
}
