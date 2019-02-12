public class Main {

    public static void main(String[] args) {
        // House with 4 windows, 2 doors, 4 rooms and a garage
        House.HouseBuilder builder1 = new House.HouseBuilder(4, 2, 4);
        builder1.hasGarage();
        House house1 = builder1.build();

        // House with 4 windows, 2 doors, 4 rooms, a garage, a pool, statues and a garden
        House.HouseBuilder builder2 = new House.HouseBuilder(4, 2, 4);
        builder2
            .hasGarage()
            .hasSwimPool()
            .hasStatues()
            .hasGarden();
        House house2 = builder2.build();


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
