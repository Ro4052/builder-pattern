public class House {

    private int numberOfWindows;
    private int numberOfDoors;
    private int numberOfRooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasStatues;
    private boolean hasGarden;

    public House() { }

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

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean getHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean getHasSwimPool() {
        return hasSwimPool;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public boolean getHasStatues() {
        return hasStatues;
    }

    public void setHasStatues(boolean hasStatues) {
        this.hasStatues = hasStatues;
    }

    public boolean getHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }
}
