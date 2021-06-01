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
    private ArrayList<Monstre> monsters = new ArrayList<>();

    /**
     * Array List for all the Monster
     * @see Loot
     */
    private ArrayList<Loot> loots = new ArrayList<>();

    /**
     * Array List for all the Monster
     * @see Weapon
     */
    private ArrayList<Weapon> weapons = new ArrayList<>();


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

    /**
     * Return a random monster
     * @see Monstre
     * @return int
     */
    public Monstre getAMonster(){
        System.out.println(monsters.size());
        return monsters.get(new Random().nextInt(monsters.size()));
    }

    /**
     * Return a random loot
     * @see Loot
     * @return int
     */
    public Loot getALoot(){
        return loots.get(new Random().nextInt(loots.size()));
    }


    /**
     * Return a random weapon
     * @see Weapon
     * @return int
     */
    public Weapon getAWeapon(){
        return weapons.get(new Random().nextInt(weapons.size()));
    }



}
