package kea.adventure;

public class Room {

    private Room north;
    private Room east;
    private Room west;
    private Room south;
    private final String roomName;
    private final String roomDescription;

    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public Room getNorthRoom() {
        return north;
    }

    public Room getEastRoom() {
        return east;
    }

    public Room getSouthRoom() {
        return south;
    }

    public Room getWestRoom() {
        return west;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setWest(Room west) {
        this.west = west;
    }


    public Room goNorth(Room currentRoom) {
        if (currentRoom.getNorthRoom() != null) {
            System.out.println("Going North");
            return currentRoom.getNorthRoom();
        } else {
            System.out.println("You cannot go that way");
            return currentRoom;
        }
    }

    public Room goEast(Room currentRoom) {
        if (currentRoom.getEastRoom() != null) {
            System.out.println("Going East");
            return currentRoom.getEastRoom();
        } else {
            System.out.println("You cannot go that way");
            return currentRoom;
        }
    }

    public Room goSouth(Room currentRoom) {
        if (currentRoom.getSouthRoom() != null) {
            System.out.println("Going South");
            return currentRoom.getSouthRoom();
        } else {
            System.out.println("You cannot go that way");
            return currentRoom;
        }
    }

    public Room goWest(Room currentRoom) {
            if (currentRoom.getWestRoom() != null) {
                System.out.println("Going West");
                return currentRoom.getWestRoom();
            }else {
                System.out.println("You cannot go that way");
                return currentRoom;
            }
    }
}
