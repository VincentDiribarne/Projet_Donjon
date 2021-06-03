package model.person;

import model.inventory.Weapon;
import model.inventory.Inventory;
import model.job.Job;
import model.race.Race;

public class Player extends Person {

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
     * It's for the job of our player, it's for damage, pv bonus, etc
     * @see Job
     */
    private Job job;

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
    private int dexterite;

    /**
     * Determine the strenght of the player. It's use for the damage.
     */
    private int force;

    /**
     * Determine the intelligence of the player. Useful for knowledge.
     */
    private int intelligence;

    /**
     * Determine the number max of PV of the player
     */
    private int maxPv;


    /**
     * Constructor of the player
     */
    public Player() {
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

    //Job
    public Job getMetier() {
        return job;
    }
    public void setMetier(Job job) {
        this.job = job;
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
    public int getDexterite() {
        return dexterite;
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
    public void setDexterite(int dexterite) {
        this.dexterite = dexterite;
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
        return job.getAttackBonus();
    }

    //Inventory
    public Inventory getInventaire() {
        return inventory;
    }

    public void setMaxPv(int maxPv) {
        this.maxPv = maxPv;
    }

    public int getMaxPv() {
        return maxPv;
    }

    @Override
    public String toString() {
        return "Player{" +
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
