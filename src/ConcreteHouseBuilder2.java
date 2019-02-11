public class ConcreteHouseBuilder2 implements HouseBuilder {

    private House house;

    public ConcreteHouseBuilder2() {
        house = new House();
    }

    @Override
    public HouseBuilder buildWindows() {
        house.setNumberOfWindows(4);
        return this;
    }

    @Override
    public HouseBuilder buildDoors() {
        house.setNumberOfDoors(2);
        return this;
    }

    @Override
    public HouseBuilder buildRooms() {
        house.setNumberOfRooms(4);
        return this;
    }

    @Override
    public HouseBuilder buildGarage() {
        house.setHasGarage(true);
        return this;
    }

    @Override
    public HouseBuilder buildSwimPool() {
        house.setHasSwimPool(true);
        return this;
    }

    @Override
    public HouseBuilder buildStatues() {
        house.setHasStatues(true);
        return this;
    }

    @Override
    public HouseBuilder buildGarden() {
        house.setHasGarden(true);
        return this;
    }

    @Override
    public House getHouse() {
        return house;
    }
}
