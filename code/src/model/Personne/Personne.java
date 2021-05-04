/*
 *Created By Vincent
 *
 */
package model.Personne;

import model.Donjon.Salle;
import model.Inventaire.Inventaire;
import model.Metier.Metier;
import model.Race.Race;

public class Personne {
    protected int PV;

    //Bonus
    protected int bonusConst;
    protected int bonusDex;
    protected int bonusForce;
    protected int bonusInt;


    private int niveau;
    protected Race race;
    protected String nom;
    protected Salle salleActuelle;
    protected int classeArmure = 10;


    public Personne() {
        super();
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


    //Salle
    public void setSalleActuelle(Salle salleActuelle) {
        this.salleActuelle = salleActuelle;
    }

    public Salle getSalleActuelle() {
        return salleActuelle;
    }


    //Classe Armure

    public void setClasseArmure(int classeArmure) {
        this.classeArmure = classeArmure;
    }

    public int getClasseArmure() {
        return classeArmure;
    }

    //Bonus

    /**
     * bonusConst + race bonusConst
     *
     * @return
     */
    public int getBonusConst() {
        return bonusConst + race.getBonusConst();
    }

    /**
     * bonusDex + race bonusDex
     *
     * @return
     */
    public int getBonusDex() {
        return bonusDex + race.getBonusDex();
    }

    /**
     * bonusForce + race bonusForce
     *
     * @return
     */
    public int getBonusForce() {
        return bonusForce + race.getBonusForce();
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
