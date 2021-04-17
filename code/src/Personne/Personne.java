package Personne;

import Autres.Calcul;
import Autres.*;

import java.util.ArrayList;

public class Personne {

    private int PV;
    private int pointAttaque;
    private double initiative;
    private int constitution;
    private int dexterité;
    private int force;
    private int intelligence;
    private int niveau;
    private String nom;
    private String salleActuelle;                                                       //Changer en type salle
    ArrayList<Integer> tirages = new ArrayList<>();

    //Declaration
    int reponse = 0;
    FonctionAutre fA = new FonctionAutre();

    public void Personne(String nom) {
        this.nom=nom;
        this.dexterité=dexterité;
        this.force=force;
        this.intelligence=intelligence;

        //Methode Recup Info Personnage
        //this.initiative=calculInitiative();
        //this.PV=nombreDePV();
    }

    /*public double calculInitiative() {
        return Calcul.genererInt(1, 18);
    }*/

    /*public int nombreDePV() {
        PV = (constitution + Calcul.genererInt(1, 20)) * 4;             //Mettre un PV.classe plus tard
        return PV;
    }*/

    public void creationPersonnage() {
        System.out.println("Choisissez votre Race parmi les suivantes : ");
        fA.temps(1000);
        System.out.println("Ecrivez le nom complet sans accent et sans fautes, sinon vous ne pourrez pas choisir la race !");
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
       String StringReponse = fA.LectureString();

    }

    public void choixRace() {

    }

    public void creationTirages() {

        tirages.add(Calcul.genererInt(8,18));
        tirages.add(Calcul.genererInt(8,18));
        tirages.add(Calcul.genererInt(8,18));
        tirages.add(Calcul.genererInt(8,18));

        System.out.println("\nLes tirages vont suivre vont determiner la suite de votre aventure, consultez les règles pour en apprendre plus sur la création d'un personnage");
        fA.temps(2000);
        System.out.println("\nChaque tirage correspond à un nombre, pensez écrire donc à entrer un nombre !");
        System.out.println("Si vous voulez prendre le tirage 1, notez 1, ainsi de suite");
        fA.temps(1000);
        System.out.println("\nVous pouvez attribuer vos tirages sur la Force, la Constitution, la Dexterité, l'Intelligence");

        fA.temps(2000);
        afficheTirage();

        fA.temps(2000);
        System.out.print("\nAttribuez un tirage pour la Force : ");
        force = attributionAttribut();


        fA.temps(2000);
        System.out.print("\nAttribuez un tirage pour la Constitution : ");
        constitution = attributionAttribut();


        fA.temps(2000);
        System.out.print("\nAttribuez un tirage pour la Dextérité : ");
        dexterité = attributionAttribut();


        fA.temps(2000);
        intelligence = tirages.get(0);
        System.out.print("\nVous attribuer donc " +intelligence+ " pour l'intelligence.");



        fA.temps(2000);
        System.out.println("\nVoici le récapitulatif de vos attributs : ");
        System.out.println("\t - Force : " +force);
        System.out.println("\t - Constitution : " +constitution);
        System.out.println("\t - Dexterité : " +dexterité);
        System.out.println("\t - Intelligence : " +intelligence);
    }

    public int attributionAttribut() {
        int attribut;
        reponse = fA.LectureInt();
        while (reponse > tirages.size()) {
            System.out.println("Erreur, recommencez !");
            reponse = fA.LectureInt();
        }
        attribut = tirages.get(reponse - 1);
        tirages.remove(reponse - 1);
        if (tirages.size() > 1) {
            afficheTirage();
        }
        return attribut;
    }

    public void afficheTirage() {
        fA.temps(1500);
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

    //Getters
    public String getNom() {
        return nom;
    }

    public int getDexterité() {
        return dexterité;
    }

    public int getForce() {
        return force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPointAttaque() {
        return pointAttaque;
    }

    public int getPV() {
        return PV;
    }
}
