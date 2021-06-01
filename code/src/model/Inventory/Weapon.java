package model.Inventory;

import model.De;

public class Weapon {

    /**
     * Name of the weapon
     */
    private String name;

    /**
     * Damage of the weapon
     */
    private int damage;

    /*
     * Critical for the Weapon
     */
    private int critical;

    /**
     * Type of the Weapon
     */
    private String type;

    /**
     * Constructor of Weapon
     * @param name
     * @param damage
     * @param critical
     * @param type
     */
    public Weapon(String name, int damage, int critical, String type){
        this.name = name;
        this.damage = damage;
        this.critical = critical;
        this.type = type;
    }



    //Getters
    public int getDamage() {
        return De.lancerDes(damage);
    }

    @Override
    public String toString() {
        return name + " ("+type+") qui inflige " + damage + " dégats, critique : " + critical;
    }
}
