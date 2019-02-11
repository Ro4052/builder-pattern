public class House {

    private int numberOfWindows;
    private int numberOfDoors;
    private int numberOfRooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasStatues;
    private boolean hasGarden;

    public House(int numberOfWindows, int numberOfDoors, int numberOfRooms, boolean hasGarage, boolean hasSwimPool, boolean hasStatues, boolean hasGarden) {
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.numberOfRooms = numberOfRooms;
        this.hasGarage = hasGarage;
        this.hasSwimPool = hasSwimPool;
        this.hasStatues = hasStatues;
        this.hasGarden = hasGarden;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean getHasGarage() {
        return hasGarage;
    }

    public boolean getHasSwimPool() {
        return hasSwimPool;
    }

    public boolean getHasStatues() {
        return hasStatues;
    }

    public boolean getHasGarden() {
        return hasGarden;
    }
}
