package controller;

import model.Des;
import model.Metier.Rodeur;
import model.Personne.Joueur;
import model.Personne.Personne;
import view.Clavier;
import view.CreationPersonnageView;
import view.Temps;

import java.util.ArrayList;

public class JoueurController {

    private Personne p;
    private CreationPersonnageView creationPersoview;

    public JoueurController(){
        creationPersoview = new CreationPersonnageView();
        p = new Joueur();
    }

    public void creationPersonnage() {
        creationPersoview.affichageRace();
        choixRace();
        //creationPersoview.affichageClasse();
        choixClasse();
        creationTirages();
    }

    public void choixClasse() {
        String StringReponse = Clavier.LectureString();
    }

    public void choixRace() {
        String choixRace = creationPersoview.choixRace();

        p.setRace(choixRace);
    }

    public void attributionBonusRace() {
        int bonusDexterité;

        switch (p.getRace()) {
            case "Halfelin" :
                bonusDexterité = 2;
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

        tirages.add(Des.genererInt(8,18));
        tirages.add(Des.genererInt(8,18));
        tirages.add(Des.genererInt(8,18));
        tirages.add(Des.genererInt(8,18));

        System.out.println("\nLes tirages vont suivre vont determiner la suite de votre aventure, consultez les règles pour en apprendre plus sur la création d'un personnage");
        Temps.temps(2000);
        System.out.println("\nChaque tirage correspond à un nombre, pensez écrire donc à entrer un nombre !");
        System.out.println("Si vous voulez prendre le tirage 1, notez 1, ainsi de suite");
        Temps.temps(1000);
        System.out.println("\nVous pouvez attribuer vos tirages sur la Force, la Constitution, la Dexterité, l'Intelligence");

        Temps.temps(2000);

        //VIEW
        afficheTirage(tirages);

        Temps.temps(2000);
        System.out.print("\nAttribuez un tirage pour la Force : ");
        p.setForce(attributionAttribut(tirages));
        System.out.print("\nVous attribuer donc " + p.getIntelligence() + " pour l'intelligence.");


        Temps.temps(2000);
        System.out.print("\nAttribuez un tirage pour la Constitution : ");
        p.setConstitution(attributionAttribut(tirages));
        System.out.print("\nVous attribuer donc " + p.getIntelligence() + " pour l'intelligence.");


        Temps.temps(2000);
        System.out.print("\nAttribuez un tirage pour la Dextérité : ");
        p.setDexterité(attributionAttribut(tirages));
        System.out.print("\nVous attribuer donc " + p.getIntelligence() + " pour l'intelligence.");



        Temps.temps(2000);
        p.setIntelligence(tirages.get(0));
        System.out.print("\nVous attribuer donc " + p.getIntelligence() + " pour l'intelligence.");



        Temps.temps(2000);
        System.out.println("\nVoici le récapitulatif de vos attributs : ");
        System.out.println("\t - Force : " + p.getForce());
        System.out.println("\t - Constitution : " + p.getConstitution());
        System.out.println("\t - Dexterité : " + p.getDexterité());
        System.out.println("\t - Intelligence : " + p.getIntelligence());
    }

    public int attributionAttribut(ArrayList<Integer> tirages) {
        int attribut;
        int reponse;
        reponse = Clavier.LectureInt();
        while (reponse > tirages.size()) {
            System.out.println("Erreur, recommencez !");
            reponse = Clavier.LectureInt();
        }
        attribut = tirages.get(reponse - 1);
        tirages.remove(reponse - 1);
        if (tirages.size() > 1) {
            afficheTirage(tirages);
        }
        return attribut;
    }

    public void afficheTirage(ArrayList<Integer> tirages) {
        Temps.temps(1500);
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
