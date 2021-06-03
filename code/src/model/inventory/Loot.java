package model.inventory;



public class Loot {
    /**
     * Create a weapon
     * @see Weapon
     */
    private final Weapon arme;

    /**
     * Create a probability for a monster's loot
     */
    private final int probability;

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
