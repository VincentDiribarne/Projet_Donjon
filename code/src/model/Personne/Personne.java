/*
*Created By Vincent
*
*/
package model.Personne;

import model.Classe.Metier;
import model.Donjon.Salle;

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
    private Metier metier;
    private Salle salleActuelle;


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

    public void setMetier(Metier metier) {
        this.metier = metier;
    }

    public void setForce(int force) {
        this.force = force;
    }


    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setDexterité(int dexterité) {
        this.dexterité = dexterité;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


}
