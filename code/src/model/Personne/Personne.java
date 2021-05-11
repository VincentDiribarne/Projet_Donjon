/*
 *Created By Vincent
 *
 */
package model.Personne;

import model.De;
import model.Donjon.Salle;

public abstract class Personne {
    protected int pv;

    //Bonus
    protected int bonusConst;
    protected int bonusDex;
    protected int bonusForce;
    protected int bonusInt;


    private int niveau;
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

    public int getInitiative(){
        return De.lancerDes(20) + getBonusDex();
    }

    public abstract int getBonusDex();
    public abstract int getBonusForce();
    public abstract int getBonusConst();
    public abstract int getBonusInt();

    public abstract int getDegat();
    public abstract int getBonusBaseAttaque();


    //PV
    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void estAttaqué(int degat){
        pv-= degat;
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
