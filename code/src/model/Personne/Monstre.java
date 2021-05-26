package model.Personne;

import model.De;
import model.Inventory.Loot;

public class Monstre extends Personne{

    /**
     * It's a dice for attack, it's an random attack between 1 and the max dice
     */
    private int deAttaque;

    /**
     * It's a bonus for attack
     */
    private int bonusBaseAttaque;

    /**
     * It's for the loot of the monster, it's a random drop.
     */
    private Loot loot;


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


    /**
     * Another constructor but with the loot, the monster has a chance to drop a weapon
     * @param nom
     * @param PV
     * @param bonusDex
     * @param bonusForce
     * @param bonusInt
     * @param deAttaque
     * @param bonusBaseAttaque
     * @param classeArmure
     * @param loot
     */
    public Monstre(String nom, int PV, int bonusDex, int bonusForce, int bonusInt, int deAttaque, int bonusBaseAttaque, int classeArmure,Loot loot) {
        this(nom, PV, bonusDex, bonusForce, bonusInt, deAttaque, bonusBaseAttaque, classeArmure);
        this.loot = loot;
    }

    //Getters
    public int getBonusBaseAttaque() {
        return bonusBaseAttaque;
    }
    public int getDeAttaque() {
        return deAttaque;
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
        return "Monstre{" +
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
