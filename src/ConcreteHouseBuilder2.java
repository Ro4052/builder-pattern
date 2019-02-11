public class ConcreteHouseBuilder2 implements HouseBuilder {

    private House house;

    public ConcreteHouseBuilder2() {
        house = new House();
    }

    @Override
    public void buildWindows() {
        house.setNumberOfWindows(4);
    }

    @Override
    public void buildDoors() {
        house.setNumberOfDoors(2);
    }

    @Override
    public void buildRooms() {
        house.setNumberOfRooms(4);
    }

    @Override
    public void buildGarage() {
        house.setHasGarage(true);
    }

    @Override
    public void buildSwimPool() {
        house.setHasSwimPool(true);
    }

    @Override
    public void buildStatues() {
        house.setHasStatues(true);
    }

    @Override
    public void buildGarden() {
        house.setHasGarden(true);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
