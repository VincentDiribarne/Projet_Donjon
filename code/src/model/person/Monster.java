package model.person;

import model.De;

public class Monster extends Person {

    /**
     * It's a dice for attack, it's an random attack between 1 and the max dice
     */
    private final int deAttaque;

    /**
     * It's a bonus for attack
     */
    private final int bonusBaseAttaque;




    /**
     * Constructor of the monster
     * @param nom
     * @param PV
     * @param bonusDex
     * @param bonusForce
     * @param bonusInt
     * @param deAttaque
     * @param bonusBaseAttaque
     * @param classeArmure
     */
    public Monster(String nom, int PV, int bonusDex, int bonusForce, int bonusInt, int deAttaque, int bonusBaseAttaque, int classeArmure) {
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

    //Degat
    public int getDegat(){
        return De.lancerDes(deAttaque);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "deAttaque=" + deAttaque +
                ", bonusBaseAttaque=" + bonusBaseAttaque +
                ", pv=" + pv +
                ", bonusConst=" + bonusConst +
                ", bonusDex=" + bonusDex +
                ", bonusForce=" + bonusForce +
                ", bonusInt=" + bonusInt +
                ", nom='" + nom + '\'' +
                ", salleActuelle=" + roomActuelle +
                ", classeArmure=" + classeArmure +
                '}';
    }
}
