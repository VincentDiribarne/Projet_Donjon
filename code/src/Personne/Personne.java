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
    ArrayList<Integer> tirages = new ArrayList<Integer>();

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
        int tirage1, tirage2, tirage3, tirage4;

        tirages.add(Calcul.genererInt(8,18));
        tirages.add(Calcul.genererInt(8,18));
        tirages.add(Calcul.genererInt(8,18));
        tirages.add(Calcul.genererInt(8,18));

        afficheTirage();
        FonctionAutre.temps1500();

        System.out.println("\nCes tirages vont determiner la suite de votre aventure, consultez les règles pour en apprendre plus sur la création d'un personnage");
        FonctionAutre.temps2000();
        System.out.println("Chaque tirage correspond à un nombre, pensez écrire donc à entrer un nombre !");

        FonctionAutre.temps2000();
        System.out.print("\nAttribuez un tirage pour la Force : ");
        force = attributionAttribut();


        FonctionAutre.temps2000();
        System.out.print("\nAttribuez un tirage pour la Constitution : ");
        constitution = attributionAttribut();


        FonctionAutre.temps2000();
        System.out.print("\nAttribuez un tirage pour la Dextérité : ");
        dexterité = attributionAttribut();


        FonctionAutre.temps2000();
        System.out.print("\nVous attribuez donc le dernier tirage automatiquement !");
        intelligence = tirages.get(0);


        FonctionAutre.temps2000();
        System.out.println("\nVoici le récapitulatif de vos attributs : ");
        System.out.println("\t - Force : " +force);
        System.out.println("\t - Constitution : " +constitution);
        System.out.println("\t - Dexterité : " +dexterité);
        System.out.println("\t - Intelligence : " +intelligence);
    }

    public int attributionAttribut() {
        int reponse, attribut;

        reponse = FonctionAutre.Lecture();
        while (reponse > tirages.size()) {
            System.out.println("Erreur, recommencez !");
            reponse = FonctionAutre.Lecture();
        }
        attribut = tirages.get(reponse - 1);
        tirages.remove(reponse - 1);
        if (tirages.size() > 1) {
            afficheTirage();
        }
        return attribut;
    }

    public void afficheTirage() {
        FonctionAutre.temps1500();
        System.out.println("Voici les statistiques que vous pouvez attribuer");
        for (int i = 0; i < tirages.size(); i++) {
            System.out.println("\t - Tirage " +(i + 1)+ " - " +tirages.get(i));
        }
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
