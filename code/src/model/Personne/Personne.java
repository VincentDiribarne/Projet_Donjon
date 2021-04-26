/*
*Created By Vincent
*
*/
package model.Personne;

import model.Donjon.Salle;
import model.Metier.Metier;
import model.Race.Race;

public class Personne {

    private int PV;
    private int constitution;
    private int dexterité;
    private int force;
    private int intelligence;
    private int bonusConst;
    private int bonusDex;
    private int bonusForce;
    private int bonusInt;
    private int niveau;
    private Race race;
    private Metier classe;
    private String nom;
    protected Salle salleActuelle;

    public void Personne(String nom) {
        this.nom=nom;
        this.dexterité=dexterité;
        this.force=force;
        this.intelligence=intelligence;
    }

    //Nom
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }


    //PV
    public int getPV() {
        return PV;
    }
    public void setPV(int PV) {
        this.PV = PV;
    }

    //Race
    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }

    //Classe
    public Metier getClasse() {
        return classe;
    }
    public void setClasse(Metier classe) {
        this.classe = classe;
    }

    //Tirages
    public int getForce() {
        return force;
    }
    public int getConstitution() {
        return constitution;
    }
    public int getDexterité() {
        return dexterité;
    }
    public int getIntelligence() {
        return intelligence;
    }


    public void setForce(int force) {
        this.force = force;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    public void setDexterité(int dexterité) {
        this.dexterité = dexterité;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Salle
    public void setSalleActuelle(Salle salleActuelle) {
        this.salleActuelle = salleActuelle;
    }
    public Salle getSalleActuelle() {
        return salleActuelle;
    }

    //Bonus
    public int getBonusConst() {
        return bonusConst;
    }
    public int getBonusDex() {
        return bonusDex;
    }
    public int getBonusForce() {
        return bonusForce;
    }
    public int getBonusInt() {
        return bonusInt;
    }


    public void setBonusConst(int bonusConst) {
        this.bonusConst = bonusConst;
    }
    public void setBonusDex(int bonusDex) {
        this.bonusDex = bonusDex;
    }
    public void setBonusForce(int bonusForce) {
        this.bonusForce = bonusForce;
    }
    public void setBonusInt(int bonusInt) {
        this.bonusInt = bonusInt;
    }
}
