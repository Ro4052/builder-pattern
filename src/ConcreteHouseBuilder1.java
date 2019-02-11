public class ConcreteHouseBuilder1 implements HouseBuilder {

    private House house;

    public ConcreteHouseBuilder1() {
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
        house.setHasSwimPool(false);
    }

    @Override
    public void buildStatues() {
        house.setHasStatues(false);
    }

    @Override
    public void buildGarden() {
        house.setHasGarden(false);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
