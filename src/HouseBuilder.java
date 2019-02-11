public interface HouseBuilder {
    HouseBuilder buildWindows();
    HouseBuilder buildDoors();
    HouseBuilder buildRooms();
    HouseBuilder buildGarage();
    HouseBuilder buildSwimPool();
    HouseBuilder buildStatues();
    HouseBuilder buildGarden();
    House getHouse();
}
