package model.Donjon;

public class Door {

    /**
     * Create a Room
     * @see Room
     */
    private Room room1;

    /**
     * Create a Room 2
     * @see Room
     */
    private Room room2;

    /**
     * Create a way
     * @see Room
     */
    private String way;

    /**
     * Constructor of Door
     * @param room1
     * @param room2
     * @param way
     */
    public Door(Room room1, Room room2, String way){
        super();
        this.room1 = room1;
        this.room2 = room2;
        this.way = way;
    }

    /**
     * Cross a door and go to a another room
     * @param currentRoom
     * @return Room
     */
    public Room takeDoor(Room currentRoom){
        if (currentRoom == room1){
            return room2;
        }
        return room1;
    }


    /**
     * Get the direction of the player
     * @param room
     * @return way
     */
    public String getDirection(Room room) {
        if (room== room1){
            return way;
        }
        switch (way){
            case "O":
                return "E";
            case "E":
                return "O";
            case "S":
                return "N";
            case "N":
                return "S";
            default:
                return "";
        }
    }
}
