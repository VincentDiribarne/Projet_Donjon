package model.Race;

public class Race {
    protected String name;

    /**
     * Bonus for the damage
     */
    protected int bonusForce = 0;


    /**
     * Bonus for who start fight
     */
    protected int bonusDex = 0;


    /**
     * Bonus for knowlegde
     */
    protected int bonusInt = 0;


    /**
     * Bonus for PV
     */
    protected int bonusConst = 0;

    /**
     * Prefered Jobs obtains with the breed
     */
    protected String classePrédi;

    /**
     * Return the final predilection jobs
     */
    public final String CLASSE_PREDI_DEFAUT = "Aucune";

    /**
     * Constructor of the breed
     */
    public Race() {
        super();
        classePrédi = CLASSE_PREDI_DEFAUT;
    }

    //Bonus / Malus
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

    //Other
    public String getName() {
        return name;
    }
    public String getClassePrédi() {
        return classePrédi;
    }


}
