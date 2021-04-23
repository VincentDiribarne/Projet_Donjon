package model.Race;

public class Race {
    protected int bonusDex = 0;
    protected int chance = 0;
    protected int bonusInt = 0;
    protected int bonusConst = 0;

    public Race() {
        super();
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

    //Getters (autres)
    public int getChance() {
        return chance;
    }
}
