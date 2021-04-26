package model.Race;

public class Race {
    protected String name;
    protected int bonusForce = 0;
    protected int bonusDex = 0;
    protected int bonusInt = 0;
    protected int bonusConst = 0;
    protected String classePrédi;
    public static final String CLASSE_PREDI_DEFAUT = "Aucune";

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

    //Autres
    public String getName() {
        return name;
    }

    public String getClassePrédi() {
        return classePrédi;
    }
}
