package Task2;

public class Building {
    private int Rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;


    public int getRooms() {
        return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public Building(int _Rooms, int _numberOfBathrooms, int _numberOfFloors, boolean _isOfficeBuilding) {
        this.isOfficeBuilding = _isOfficeBuilding;
        this.numberOfFloors = _numberOfFloors;
        this.numberOfBathrooms = _numberOfBathrooms;
        this.Rooms = _Rooms;
    }
}
