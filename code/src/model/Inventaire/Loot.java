package model.Inventaire;

import model.Inventaire.Arme;

public class Loot {
    private Arme arme;
    private int probability;

    public Loot(Arme arme, int probability){
        super();
        this.arme = arme;
        this.probability = probability;
    }

    public int getProbability() {
        return probability;
    }

    public Arme getArme() {
        return arme;
    }
}
