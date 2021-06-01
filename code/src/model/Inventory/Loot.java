package model.Inventory;



public class Loot {
    /**
     * Create a weapon
     * @see Weapon
     */
    private Weapon arme;

    /**
     * Create a probability for a monster's loot
     */
    private int probability;

    /**
     * Constructor of Loot
     * @see Weapon
     * @see Inventory
     * @param arme
     * @param probability
     */
    public Loot(Weapon arme, int probability){
        super();
        this.arme = arme;
        this.probability = probability;
    }

    //Getters
    public int getProbability() {
        return probability;
    }

    public Weapon getArme() {
        return arme;
    }
}
