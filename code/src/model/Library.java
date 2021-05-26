package model;

import model.Inventory.Loot;
import model.Inventory.Weapon;
import model.Personne.Monstre;

import java.util.ArrayList;
import java.util.Random;

public class Library {

    private ArrayList<Monstre> monsters = new ArrayList<>();

    private ArrayList<Loot> loots = new ArrayList<>();

    private ArrayList<Weapon> weapons = new ArrayList<>();



    public void addLoot(Loot loot){
        loots.add(loot);
    }

    public void addMonster(Monstre monster){
        monsters.add(monster);
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    public Monstre getAMonster(){
        System.out.println(monsters.size());
        return monsters.get(new Random().nextInt(monsters.size()));
    }

    public Loot getALoot(){
        return loots.get(new Random().nextInt(loots.size()));
    }

    public Weapon getAWeapon(){
        return weapons.get(new Random().nextInt(weapons.size()));
    }



}
