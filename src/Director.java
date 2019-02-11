public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        houseBuilder.buildWindows();
        houseBuilder.buildDoors();
        houseBuilder.buildRooms();
        houseBuilder.buildGarage();
        houseBuilder.buildSwimPool();
        houseBuilder.buildStatues();
        houseBuilder.buildGarden();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
