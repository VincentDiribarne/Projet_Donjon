package model;

import model.inventory.Loot;
import model.inventory.Weapon;
import model.person.Monster;

import java.util.ArrayList;
import java.util.Random;

public class Library {

    /**
     * Array List for all the Monster
     * @see Monster
     */
    private final ArrayList<Monster> monsters = new ArrayList<>();

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
     * @see Monster
     */
    public void addMonster(Monster monster){
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
    public Monster getAMonster(){
        return monsters.get(new Random().nextInt(monsters.size()));
    }

    public Loot getALoot(){
        return loots.get(new Random().nextInt(loots.size()));
    }

}
