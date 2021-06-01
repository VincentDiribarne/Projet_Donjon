package model.Personne;

import model.Inventory.Weapon;
import model.Inventory.Inventory;
import model.JobsClass.Jobs;
import model.Race.Race;

public class Joueur extends Personne {

    /**
     * Instantiates the inventory of the player
     * @see Inventory
     */
    protected Inventory inventory = new Inventory();

    /**
     * It's the actual weapon in his hand
     * @see Weapon
     */
    private Weapon weapon;

    /**
     * It's for the jobs of our player, it's for damage, pv bonus, etc
     * @see Jobs
     */
    private Jobs jobs;

    /**
     * It's for the breed of our player, it's for damage, pv bonus, etc too
     * @see Race
     */
    protected Race race;


    /**
     * Determine the points of the player's life
     */
    private int constitution;

    /**
     * Determine the ability of the player
     */
    private int dexterité;

    /**
     * Determine the strenght of the player. It's use for the damage.
     */
    private int force;

    /**
     * Determine the intelligence of the player. Useful for knowledge.
     */
    private int intelligence;


    /**
     * Constructor of the player
     */
    public Joueur() {
        super();
    }

    /**
     * Gives the existing directions of the current room
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

    //Jobs
    public Jobs getMetier() {
        return jobs;
    }
    public void setMetier(Jobs jobs) {
        this.jobs = jobs;
    }

    //Damages
    public int getDegat(){
        return weapon.getDamage();
    }

    //Attributs
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

    //Breed
    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }

    //Bonus
    public int getBonusConst() {
        return bonusConst + race.getBonusConst();
    }
    public int getBonusDex() {
        return bonusDex + race.getBonusDex();
    }
    public int getBonusForce() {
        return bonusForce + race.getBonusForce();
    }
    public int getBonusInt() {
        return bonusInt + race.getBonusInt();
    }

    //Weapon
    public void setArme(Weapon weapon) {
        this.weapon = weapon;
    }
    public Weapon getArme() {
        return weapon;
    }

    //Attack
    public int getBonusBaseAttaque()
    {
        return jobs.getAttackBonus();
    }

    //Inventory
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
