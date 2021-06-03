package model;

import model.Inventory.Loot;
import model.Inventory.Weapon;
import model.Personne.Monstre;

import java.util.ArrayList;
import java.util.Random;

public class Library {

    /**
     * Array List for all the Monster
     * @see Monstre
     */
    private final ArrayList<Monstre> monsters = new ArrayList<>();

    /**
     * Array List for all the Monster
     * @see Loot
     */
    private final ArrayList<Loot> loots = new ArrayList<>();

    /**
     * Array List for all the Monster
     * @see Weapon
     */
    private final ArrayList<Weapon> weapons = new ArrayList<>();


    /**
     * Add loot in the Array
     * @param loot
     * @see Loot
     */
    public void addLoot(Loot loot){
        loots.add(loot);
    }

    /**
     * Add monster in the Array
     * @param monster
     * @see Monstre
     */
    public void addMonster(Monstre monster){
        monsters.add(monster);
    }

    /**
     * Add weapon in the Array
     * @param weapon
     * @see Weapon
     */
    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    //Getters
    public Monstre getAMonster(){
        return monsters.get(new Random().nextInt(monsters.size()));
    }

    public Loot getALoot(){
        return loots.get(new Random().nextInt(loots.size()));
    }

    public Weapon getAWeapon(){
        return weapons.get(new Random().nextInt(weapons.size()));
    }



}
