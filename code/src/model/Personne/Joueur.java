package model.Personne;

import model.Inventory.Weapon;
import model.Inventory.Inventory;
import model.Jobs_Class.Jobs;
import model.Race.Race;

public class Joueur extends Personne {

    protected Inventory inventory = new Inventory();
    private Weapon weapon;
    private Jobs jobs;

    private int constitution;
    private int dexterité;
    private int force;
    private int intelligence;
    protected Race race;


    public Joueur() {
        super();
    }

    /**
     *
     * @param direction
     */
    public void seDeplacer(String direction) {
        switch (direction) {
            case "N":
                roomActuelle = roomActuelle.getNorthDoor().takeDoor(roomActuelle);
                break;
            case "S":
                roomActuelle = roomActuelle.getSouthDoor().takeDoor(roomActuelle);
                break;
            case "O":
                roomActuelle = roomActuelle.getOuestDoor().takeDoor(roomActuelle);
                break;
            case "E":
                roomActuelle = roomActuelle.getEstDoor().takeDoor(roomActuelle);
                break;
        }
    }

    //Classe
    public Jobs getMetier() {
        return jobs;
    }

    public void setMetier(Jobs jobs) {
        this.jobs = jobs;
    }

    //Degat

    public int getDegat(){
        return weapon.getDamage();
    }


    /**
     *
     * @return int
     */
    public int getForce() {
        return force;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getDexterité() {
        return dexterité;
    }

    public int getIntelligence() {
        return intelligence;
    }


    public void setForce(int force) {
        this.force = force;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setDexterité(int dexterité) {
        this.dexterité = dexterité;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Race
    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getBonusConst() {
        return bonusConst + race.getBonusConst();
    }


    /**
     * bonusDex + race bonusDex
     *
     * @return
     */
    public int getBonusDex() {
        return bonusDex + race.getBonusDex();
    }

    /**
     * bonusForce + race bonusForce
     *
     * @return
     */
    public int getBonusForce() {
        return bonusForce + race.getBonusForce();
    }

    public int getBonusInt() {
        return bonusInt + race.getBonusInt();
    }

    public void setArme(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getArme() {
        return weapon;
    }

    //Bonus base Attaque
    public int getBonusBaseAttaque()
    {
        return jobs.getAttackBonus();
    }

    public Inventory getInventaire() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "arme=" + weapon +
                ", pv=" + pv +
                ", bonusConst=" + bonusConst +
                ", bonusDex=" + bonusDex +
                ", bonusForce=" + bonusForce +
                ", bonusInt=" + bonusInt +
                ", nom='" + nom + '\'' +
                ", salleActuelle=" + roomActuelle +
                ", classeArmure=" + classeArmure +
                '}';
    }
}
