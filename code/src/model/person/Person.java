/*
 *Created By Vincent
 *
 */
package model.person;

import model.De;
import model.donjon.Room;

public abstract class Person {

    /**
     * It's for the PV of a personne
     */
    protected int pv;

    //Bonus
    /**
     * It's for the bonus of a personne. Use for PV
     */
    protected int bonusConst;

    /**
     * It's for the ability of a personne. Use for determine who start a fight.
     */
    protected int bonusDex;

    /**
     * It's for the force of a personne. Use for damage
     */
    protected int bonusForce;

    /**
     * It's for intelligence of a personne
     */
    protected int bonusInt;

    /**
     * It's the name of the personne
     */
    protected String nom;

    /**
     * It's the basic armor of a personne
     */
    protected int classeArmure = 15;

    /**
     * It's the current room
     */
    protected Room roomActuelle;


    /**
     * Constructor of personne
     */
    public Person() {
        super();
    }


    //Name
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Determine who start the fight
     * @return int
     */
    public int getInitiative(){
        return De.lancerDes(20) + getBonusDex();
    }

    //Bonus
    public abstract int getBonusDex();
    public abstract int getBonusForce();
    public abstract int getBonusConst();
    public abstract int getBonusInt();

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

    //Damage
    public abstract int getDegat();
    public abstract int getBonusBaseAttaque();

    //PV
    public int getPv() {
        return pv;
    }
    public void setPv(int pv) {
        this.pv = pv;
    }

    /**
     * Returns the current life points of the player after attack
     * @param degat
     */
    public void estAttaque(int degat){
        pv-= degat;
    }

    //Room
    public void setSalleActuelle(Room roomActuelle) {
        this.roomActuelle = roomActuelle;
    }
    public Room getSalleActuelle() {
        return roomActuelle;
    }

    //Armor
    public void setClasseArmure(int classeArmure) {
        this.classeArmure = classeArmure;
    }
    public int getClasseArmure() {
        return classeArmure;
    }
}
