package model.JobsClass;

public class Jobs {

    protected int firstPV;
    protected String name;
    protected int attackBonus = 0;

    /**
     * Constructor of Jobs
     */
    public Jobs() {
       super();
    }

    /**
     * Return PV of the player when he's create
     * @return int
     */
    public int getfirstPV() {
        return firstPV;
    }

    /**
     * @param firstPv
     */
    public void setFirstPV(int firstPv) {
        this.firstPV = firstPv;
    }

    /**
     * Return the job's name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setters for the job's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the AttackBonus for the player
     * @return int
     */
    public int getAttackBonus() {
        return attackBonus;
    }
}
