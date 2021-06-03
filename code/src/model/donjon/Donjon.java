package model.donjon;

import controller.LibraryController;
import model.person.Monster;

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
     * @see Room
     */
    public void createRooms(){
        startRoom = new Room("de Depart");
        Room room2 = new Room("2", LibraryController.library.getAMonster());
        Room room3 = new Room("3");
        Room room4 = new Room("4", LibraryController.library.getAMonster());
        Room room5 = new Room("5");
        Room room6 = new Room("6");
        Room room7 = new Room("7");
        Room room8 = new Room("8", LibraryController.library.getAMonster());
        Room room9 = new Room("9");
        Room room10 = new Room("10");
        Room room11 = new Room("11", LibraryController.library.getAMonster());
        Room room12 = new Room("12");
        Room room13 = new Room("13");
        Room room14 = new Room("14");
        Room room15 = new Room("15", LibraryController.library.getAMonster());
        Room room16 = new Room("16");
        Room room17 = new Room("17", LibraryController.library.getAMonster());
        finalRoom = new Room("finale", new Monster("Donotkesh Primeblood", 12, 0, 3, -1, 12, 3, 18));


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
     * @return Room
     */
    public Room getStartRoom() {
        return startRoom;
    }

    /**
     * Return the final Room
     * @return Room
     */
    public Room getFinalRoom() {
        return finalRoom;
    }
}
