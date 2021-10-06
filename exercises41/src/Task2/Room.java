package Task2;

public class Room {
    private int Walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public int getWalls() {
        return Walls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public Room(int _Walls, int _numberOfDoors, int _numberOfLamps, int _numberOfWindows) {
        this.Walls = _Walls;
        this.numberOfDoors =_numberOfDoors;
        this.numberOfLamps =_numberOfLamps;
        this.numberOfWindows =_numberOfWindows;
    }
}
