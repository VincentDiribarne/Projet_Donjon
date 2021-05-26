package model.Inventory;



public class Loot {
    private Weapon arme;
    private int probability;

    public Loot(Weapon arme, int probability){
        super();
        this.arme = arme;
        this.probability = probability;
    }

    public int getProbability() {
        return probability;
    }

    public Weapon getArme() {
        return arme;
    }
}
