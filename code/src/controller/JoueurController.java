package controller;

import model.De;
import model.Classe.Archer;
import model.Personne.Personne;
import view.FonctionAutre;

import java.util.ArrayList;

public class JoueurController {

    Personne p;

    public JoueurController(Personne p){
        this.p = p;
    }

    public void creationPersonnage() {
        System.out.println("Choisissez votre Race parmi les suivantes : ");
        FonctionAutre.temps(1000);
        System.out.println("Ecrivez le nom complet sans accent et sans fautes et sans le tiret, sinon vous ne pourrez pas choisir la race !");
        System.out.println("Si vous ecrivez, le nom, ne vous inquietez pas, cela vous donnera les caractéristiques de la race selectionnée, avant de vous demander une confirmation");
        System.out.println(
                "Races Pur Sang : \n" +
                        "\t - Halfelin \n" +
                        "\t - Gnome \n" +
                        "\t - Nain \n" +
                        "\t - Humain \n" +
                        "\t - Elfe \n" +

                        "\nRaces Sang-Melées : \n" +
                        "\t - Demi-Orque \n" +
                        "\t - Demi-Elfe\n"
        );
        choixRace();
        choixClasse();
        creationTirages();
    }

    public void choixClasse() {
        String StringReponse = FonctionAutre.LectureString();
        p.setMetier(new Archer("Archer"));


    }

    public void choixRace() {
        String StringReponse = FonctionAutre.LectureString();

        if (StringReponse == "Halfelin") {
            System.out.println("Vous avez choisi un Halfelin");
            System.out.println("Les halfelins vivent dans un monde rempli de personne plus grande qu'eux. Il mesure 90 centimètres maximum, il paraissent inoffensifs");
            System.out.println("Les bonus et les malus de l'Halphelin");
            System.out.println( "\t - Si vous obtenez 1 lord d'un tirage de dés, vous pouvez le relancer une seconde fois. (Ne marche qu'une seule fois par combat)\n" +
                    "\t - Votre dextérité augmente de 2 \n" +
                    "\t - Votre Constitution augmente de 1 si votre taille depasse les 80 centimètres"
            );

            System.out.println("Voulez-vous choisir un Halfelin (Y) ou changer de race (N)");
            confirmation(FonctionAutre.LectureString());
        }
    }

    public String confirmation(String StringReponse) {
        if (StringReponse == "Y") {

        } else if (StringReponse == "N") {

        } else {
            System.out.println("Erreur");
        }
        return null;

    }

    public void creationTirages() {
        ArrayList<Integer> tirages = new ArrayList<>();

        tirages.add(De.genererInt(8,18));
        tirages.add(De.genererInt(8,18));
        tirages.add(De.genererInt(8,18));
        tirages.add(De.genererInt(8,18));

        System.out.println("\nLes tirages vont suivre vont determiner la suite de votre aventure, consultez les règles pour en apprendre plus sur la création d'un personnage");
        FonctionAutre.temps(2000);
        System.out.println("\nChaque tirage correspond à un nombre, pensez écrire donc à entrer un nombre !");
        System.out.println("Si vous voulez prendre le tirage 1, notez 1, ainsi de suite");
        FonctionAutre.temps(1000);
        System.out.println("\nVous pouvez attribuer vos tirages sur la Force, la Constitution, la Dexterité, l'Intelligence");

        FonctionAutre.temps(2000);

        //VIEW
        afficheTirage(tirages);

        FonctionAutre.temps(2000);
        System.out.print("\nAttribuez un tirage pour la Force : ");
        p.setForce(attributionAttribut(tirages));
        System.out.print("\nVous attribuer donc " + p.getIntelligence() + " pour l'intelligence.");


        FonctionAutre.temps(2000);
        System.out.print("\nAttribuez un tirage pour la Constitution : ");
        p.setConstitution(attributionAttribut(tirages));
        System.out.print("\nVous attribuer donc " + p.getIntelligence() + " pour l'intelligence.");


        FonctionAutre.temps(2000);
        System.out.print("\nAttribuez un tirage pour la Dextérité : ");
        p.setDexterité(attributionAttribut(tirages));
        System.out.print("\nVous attribuer donc " + p.getIntelligence() + " pour l'intelligence.");



        FonctionAutre.temps(2000);
        p.setIntelligence(tirages.get(0));
        System.out.print("\nVous attribuer donc " + p.getIntelligence() + " pour l'intelligence.");



        FonctionAutre.temps(2000);
        System.out.println("\nVoici le récapitulatif de vos attributs : ");
        System.out.println("\t - Force : " + p.getForce());
        System.out.println("\t - Constitution : " + p.getConstitution());
        System.out.println("\t - Dexterité : " + p.getDexterité());
        System.out.println("\t - Intelligence : " + p.getIntelligence());
    }

    public int attributionAttribut(ArrayList<Integer> tirages) {
        int attribut;
        int reponse;
        reponse = FonctionAutre.LectureInt();
        while (reponse > tirages.size()) {
            System.out.println("Erreur, recommencez !");
            reponse = FonctionAutre.LectureInt();
        }
        attribut = tirages.get(reponse - 1);
        tirages.remove(reponse - 1);
        if (tirages.size() > 1) {
            afficheTirage(tirages);
        }
        return attribut;
    }

    public void afficheTirage(ArrayList<Integer> tirages) {
        FonctionAutre.temps(1500);
        System.out.println("\nVoici les statistiques que vous pouvez attribuer");
        for (int i = 0; i < tirages.size(); i++) {
            System.out.println("\t - Tirage " +(i + 1)+ " - " +tirages.get(i));
        }
    }

    public int bonus(int valeur) {
        int bonus;
        if (valeur >= 8 && valeur < 10) {
            bonus = -1;
        } else if(valeur >= 10 && valeur < 12) {
            bonus = 0;
        } else if(valeur >= 12 && valeur < 14) {
            bonus = 1;
        } else if (valeur >= 14 && valeur < 16) {
            bonus = 2;
        } else if (valeur >= 16 && valeur < 18) {
            bonus = 3;
        } else {
            bonus = 4;
        }
        return bonus;
    }
}
