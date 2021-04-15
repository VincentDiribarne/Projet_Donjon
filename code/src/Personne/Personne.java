package Personne;

import Autres.Calcul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        ArrayList<Integer> tirages = new ArrayList<Integer>();
        tirages.add(Calcul.genererInt(8,18)) ;
        tirages.add(Calcul.genererInt(8,18));
        tirages.add(Calcul.genererInt(8,18));
        tirages.add(Calcul.genererInt(8,18));

        System.out.println("Voici les tirages pour chacune de vos capacités");
        for (int i = 0; i < tirages.size(); i++) {
            System.out.println("\tTirage " +(i + 1)+ " - " +tirages.get(i));
        }

        System.out.println("\nAttribuez un tirage pour la Force");


    }

    public boolean utilisé() {
        return true;
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
