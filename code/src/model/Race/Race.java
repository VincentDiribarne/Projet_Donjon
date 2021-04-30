package model.Race;

public class Race {
    protected String name;

    //Attaque corps a corps
    protected int bonusForce = 0;


    //Initiative, qui commence le combat enter le monstre et le joueur ....
    protected int bonusDex = 0;

    //Sert pour les sorts
    protected int bonusInt = 0;

    //Point de vie
    protected int bonusConst = 0;
    protected String classePrédi;
    public final String CLASSE_PREDI_DEFAUT = "Aucune";

    public Race() {
        super();
        classePrédi = CLASSE_PREDI_DEFAUT;
    }

    //Getters (pour les bonus / malus)
    public int getBonusConst() {
        return bonusConst;
    }

    public int getBonusDex() {
        return bonusDex;
    }

    public int getBonusInt() {
        return bonusInt;
    }

    public int getBonusForce() {
        return bonusForce;
    }

    //Autres
    public String getName() {
        return name;
    }

    public String getClassePrédi() {
        return classePrédi;
    }


}
