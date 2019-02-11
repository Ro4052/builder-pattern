public class ConcreteHouseBuilder1 implements HouseBuilder {

    private House house;

    public ConcreteHouseBuilder1() {
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
        house.setHasSwimPool(false);
        return this;
    }

    @Override
    public HouseBuilder buildStatues() {
        house.setHasStatues(false);
        return this;
    }

    @Override
    public HouseBuilder buildGarden() {
        house.setHasGarden(false);
        return this;
    }

    @Override
    public House getHouse() {
        return house;
    }
}
