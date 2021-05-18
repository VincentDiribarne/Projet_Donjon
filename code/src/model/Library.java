package model;

import model.Inventaire.Loot;
import model.Inventaire.Arme;
import model.Personne.Monstre;

import java.util.ArrayList;
import java.util.Random;

public class Library {

    private ArrayList<Monstre> monsters = new ArrayList<>();

    private ArrayList<Loot> loots = new ArrayList<>();

    private ArrayList<Arme> weapons = new ArrayList<>();



    public void addLoot(Loot loot){
        loots.add(loot);
    }

    public void addMonster(Monstre monster){
        monsters.add(monster);
    }

    public void addWeapon(Arme weapon){
        weapons.add(weapon);
    }

    public Monstre getAMonster(){
        System.out.println(monsters.size());
        return monsters.get(new Random().nextInt(monsters.size()));
    }

    public Loot getALoot(){
        return loots.get(new Random().nextInt(loots.size()));
    }

    public Arme getAWeapon(){
        return weapons.get(new Random().nextInt(weapons.size()));
    }



}
