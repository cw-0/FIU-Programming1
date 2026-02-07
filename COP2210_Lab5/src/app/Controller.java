package app;

import buildingunit.Room;
import cooling.AC;

public class Controller {

  public static void main(String[] args) {
    AC.acStats();
    Room kitchen = new Room("Kitchen", "White", 15.50, 10, 78);
    kitchen.roomStats("");

    Room livingRoom = new Room("Living Room", "Tan", 25, 20.70, 76.50);
    Room bathroom = new Room("Bathroom", "White", 15, 10, 74.30);
    Room bedroom = new Room("Bedroom", "Blue", 8, 8, 78);

    livingRoom.roomStats("");
    bathroom.roomStats("");
    bedroom.roomStats("");

  } // End of Main
} // End of Class Controller
