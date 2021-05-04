package model.Personne;

import model.De;

public class Monstre extends Personne{

    private int deAttaque;
    private int bonusBaseAttaque;

    public Monstre(String nom, int PV, int bonusDex, int bonusForce, int bonusInt, int deAttaque, int bonusBaseAttaque, int classeArmure) {
        super();
        this.nom = nom;
        this.pv = PV;
        this.bonusDex = bonusDex;
        this.bonusForce = bonusForce;
        this.bonusInt = bonusInt;
        this.bonusBaseAttaque = bonusBaseAttaque;
        this.deAttaque = deAttaque;
        this.classeArmure = classeArmure;
    }

    //Getters
    public int getBonusBaseAttaque() {
        return bonusBaseAttaque;
    }
    public int getDeAttaque() {
        return deAttaque;
    }


    public int getBonusConst() {
        return bonusConst;
    }



    /**
     * bonusDex
     *
     * @return
     */
    public int getBonusDex() {
        return bonusDex;
    }

    /**
     * bonusForce
     *
     * @return
     */
    public int getBonusForce() {
        return bonusForce;
    }

    public int getBonusInt() {
        return bonusInt;
    }

    //Degat

    public int getDegat(){
        return De.lancerDes(deAttaque);
    }



}
