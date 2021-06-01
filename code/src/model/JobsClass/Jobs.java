package model.JobsClass;

public class Jobs {

    /**
     * Create int for PV
     */
    protected int firstPV;

    /**
     * Create a String for the job name
     */
    protected String name;

    /**
     * Create int for attackbonus
     */
    protected int attackBonus = 0;

    /**
     * Constructor of Jobs
     */
    public Jobs() {
       super();
    }

    //Getter
    public int getfirstPV() {
        return firstPV;
    }

    public void setFirstPV(int firstPv) {
        this.firstPV = firstPv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackBonus() {
        return attackBonus;
    }
}
