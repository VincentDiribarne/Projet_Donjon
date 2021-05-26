package model.Inventory;

import model.De;

public class Weapon {

    private String name;
    private int damage;
    private int critical;
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

    /**
     * Return a random damage with a dice roll
     * @return int
     */
    public int getDamage() {
        return De.lancerDes(damage);
    }

    @Override
    public String toString() {
        return name + " ("+type+") qui inflige " + damage + " dégats, critique : " + critical;
    }
}
