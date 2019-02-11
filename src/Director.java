public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        houseBuilder
            .buildWindows()
            .buildDoors()
            .buildRooms()
            .buildGarage()
            .buildSwimPool()
            .buildStatues()
            .buildGarden();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
