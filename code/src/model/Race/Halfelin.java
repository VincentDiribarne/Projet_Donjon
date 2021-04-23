package model.Race;

public class Halfelin extends Race {
    private int chance;
    private int bonusConstitution;
    private int bonusDextérité;

    public Halfelin() {
        chance = 1;
        bonusConstitution = 1;
        bonusDextérité = 2;
    }

    public int getChance() {
        return chance;
    }

    public int getBonusDextérité() {
        return bonusDextérité;
    }

    public int getBonusConstitution() {
        return bonusConstitution;
    }
}
