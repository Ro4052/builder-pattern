public class House {

    private final int numberOfWindows;
    private final int numberOfDoors;
    private final int numberOfRooms;
    private final boolean hasGarage;
    private final boolean hasSwimPool;
    private final boolean hasStatues;
    private final boolean hasGarden;

    public House(HouseBuilder builder) {
        this.numberOfWindows = builder.numberOfWindows;
        this.numberOfDoors = builder.numberOfDoors;
        this.numberOfRooms = builder.numberOfRooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimPool = builder.hasSwimPool;
        this.hasStatues = builder.hasStatues;
        this.hasGarden = builder.hasGarden;
    }

    public static class HouseBuilder {

        private final int numberOfWindows;
        private final int numberOfDoors;
        private final int numberOfRooms;
        private boolean hasGarage = false;
        private boolean hasSwimPool = false;
        private boolean hasStatues = false;
        private boolean hasGarden = false;

        public HouseBuilder(int numberOfWindows, int numberOfDoors, int numberOfRooms) {
            this.numberOfWindows = numberOfWindows;
            this.numberOfDoors = numberOfDoors;
            this.numberOfRooms = numberOfRooms;
        }

        public HouseBuilder hasGarage() {
            this.hasGarage = true;
            return this;
        }

        public HouseBuilder hasSwimPool() {
            this.hasSwimPool = true;
            return this;
        }

        public HouseBuilder hasStatues() {
            this.hasStatues = true;
            return this;
        }

        public HouseBuilder hasGarden() {
            this.hasGarden = true;
            return this;
        }

        public House build() {
            return new House(this);
        }
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
