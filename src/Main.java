public class Main {

    public static void main(String[] args) {
        // House with 4 windows, 2 doors, 4 rooms and a garage
        Director director1 = new Director(new ConcreteHouseBuilder1());
        director1.constructHouse();
        House house1 = director1.getHouse();

        // House with 4 windows, 2 doors, 4 rooms, a garage, a pool, statues and a garden
        Director director2 = new Director(new ConcreteHouseBuilder2());
        director2.constructHouse();
        House house2 = director2.getHouse();

        System.out.println("<<<< House 1 >>>>");
        System.out.println("Number of windows: " + house1.getNumberOfWindows());
        System.out.println("Number of doors: " + house1.getNumberOfDoors());
        System.out.println("Number of rooms: " + house1.getNumberOfRooms());
        System.out.println("Has garage: " + house1.getHasGarage());
        System.out.println("Has pool: " + house1.getHasSwimPool());
        System.out.println("Has statues: " + house1.getHasStatues());
        System.out.println("Has garden: " + house1.getHasGarden());

        System.out.println("\n<<<< House 2 >>>>");
        System.out.println("Number of windows: " + house2.getNumberOfWindows());
        System.out.println("Number of doors: " + house2.getNumberOfDoors());
        System.out.println("Number of rooms: " + house2.getNumberOfRooms());
        System.out.println("Has garage: " + house2.getHasGarage());
        System.out.println("Has pool: " + house2.getHasSwimPool());
        System.out.println("Has statues: " + house2.getHasStatues());
        System.out.println("Has garden: " + house2.getHasGarden());
    }
}
