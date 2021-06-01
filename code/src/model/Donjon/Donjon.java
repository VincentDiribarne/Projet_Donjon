package model.Donjon;

import model.Personne.Monstre;

public class Donjon {

    /**
     * First Room
     * @see Room
     */
    private Room finalRoom;

    /**
     * Final Room
     * @see Room
     */
    private Room startRoom;

    /*
     * Constructor of Donjon
     */
    public Donjon(){
        super();
    }

    /**
     * Create 19 rooms for the donjon and link with doors
     * @author Baptiste Buvron
     * @see Room
     */
    public void createRooms(){
        startRoom = new Room("de Depart");
        Room room2 = new Room("2");
        Room room3 = new Room("3");
        Room room4 = new Room("4", new Monstre("Gobelin", 4, 1, -1, 0, 8, 1, 15));
        Room room5 = new Room("5");
        Room room6 = new Room("6");
        Room room7 = new Room("7");
        Room room8 = new Room("8");
        Room room9 = new Room("9");
        Room room10 = new Room("10");
        Room room11 = new Room("11");
        Room room12 = new Room("12");
        Room room13 = new Room("13");
        Room room14 = new Room("14");
        Room room15 = new Room("15");
        Room room16 = new Room("16");
        Room room17 = new Room("17");
        finalRoom = new Room("finale");


        startRoom.lierSalle(room4,"N");
        room3.lierSalle(room7,"N");
        room4.lierSalle(room5,"E");
        room4.lierSalle(room3,"O");
        room5.lierSalle(room9,"N");
        room6.lierSalle(room10,"N");
        room6.lierSalle(room2,"S");
        room7.lierSalle(room6,"O");
        room8.lierSalle(room7,"O");
        room8.lierSalle(room12,"N");
        room9.lierSalle(room8,"O");
        room9.lierSalle(room13,"N");
        room10.lierSalle(room14,"N");
        room11.lierSalle(room12,"E");
        room12.lierSalle(room13,"E");
        room13.lierSalle(room17,"N");
        room14.lierSalle(room15,"E");
        room15.lierSalle(room11,"S");
        room16.lierSalle(finalRoom,"N");
        room17.lierSalle(room16,"O");
    }

    /**
     * Return the first Room
     * @return Salle
     */
    public Room getStartRoom() {
        return startRoom;
    }

    /**
     * Return the final Room
     * @return
     */
    public Room getFinalRoom() {
        return finalRoom;
    }
}
