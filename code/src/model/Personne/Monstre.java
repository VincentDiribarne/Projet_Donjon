package model.Personne;

import view.Console;

public class Monstre extends Personne{

    private int deAttaque;
    private int bonusBaseAttaque;

    public Monstre(String nom, int PV, int bonusDex, int bonusForce, int bonusInt, int deAttaque, int bonusBaseAttaque, int classeArmure) {
        super();
        this.nom = nom;
        this.PV = PV;
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
}
