package model.Donjon;

import model.Personne.Monstre;
import java.util.ArrayList;

public class Room {
    /**
     * Create a northDoor
     * @see Door
     */
    private Door northDoor = null;

    /**
     * Create a southDoor
     * @see Door
     */
    private Door southDoor = null;

    /**
     * Create a estDoor
     * @see Door
     */
    private Door estDoor = null;

    /**
     * Create a ouestDoor
     * @see Door
     */
    private Door ouestDoor = null;
    private final String name;
    private Monstre monster;

    /**
     * Constructor of Room
     * @param name
     */
    public Room(String name){
        super();
        this.name = name;
    }

    /**
     * Constructor of Room with a monster
     * @param name
     * @param monster
     * @see Monstre
     */
    public Room(String name, Monstre monster){
        this(name);
        this.monster = monster;
    }

    /**
     * Give the list of door in a room
     * @see Door
     * @return ArrayList
     */
    public ArrayList availableDoor(){
        ArrayList<Door> availableDoor = new ArrayList<>();
        if (northDoor != null){
            availableDoor.add(northDoor);
        }
        if (southDoor != null){
            availableDoor.add(southDoor);
        }
        if (estDoor != null){
            availableDoor.add(estDoor);
        }
        if (ouestDoor != null){
            availableDoor.add(ouestDoor);
        }
        return availableDoor;

    }

    /**
     * Link Room with doors
     * @see Room
     * @param room2
     * @param way
     */
    public void lierSalle(Room room2, String way){
        Door porte = new Door(this, room2,way);
        switch (way){
            case "O":
                setOuestDoor(porte);
                room2.setEstDoor(porte);
                break;
            case "E":
                setEstDoor(porte);
                room2.setOuestDoor(porte);
                break;
            case "N":
                setNorthDoor(porte);
                room2.setSouthDoor(porte);
                break;
            case "S":
                setSouthDoor(porte);
                room2.setNorthDoor(porte);
                break;
            default:
                System.out.println("Erreur lors de la création de la salle");
                break;
        }
    }

    @Override
    public String toString() {
        return "Vous êtes dans la salle " + name + ".\n ";
    }

    //Accesseurs
    public Door getNorthDoor() {
        return northDoor;
    }
    public Door getSouthDoor() {
        return southDoor;
    }
    public Door getEstDoor() {
        return estDoor;
    }
    public Door getOuestDoor() {
        return ouestDoor;
    }

    public void setNorthDoor(Door northDoor) {
        this.northDoor = northDoor;
    }
    public void setSouthDoor(Door southDoor) {
        this.southDoor = southDoor;
    }
    public void setEstDoor(Door estDoor) {
        this.estDoor = estDoor;
    }
    public void setOuestDoor(Door ouestDoor) {
        this.ouestDoor = ouestDoor;
    }

    public String getName() {
        return name;
    }

    public Monstre getMonster() {
        return monster;
    }
}