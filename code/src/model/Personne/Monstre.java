package model.Personne;

public class Monstre extends Personne{

    private int deAttaque;
    private int bonusAttaque;

    public Monstre(String nom, int PV, int bonusDex, int bonusForce, int bonusInt, int deAttaque, int bonusAttaque, int classeArmure) {
        super();
        this.nom = nom;
        this.PV = PV;
        this.bonusDex = bonusDex;
        this.bonusForce = bonusForce;
        this.bonusInt = bonusInt;
        this.bonusAttaque = bonusAttaque;
        this.deAttaque = deAttaque;
        this.classeArmure = classeArmure;
    }






}
