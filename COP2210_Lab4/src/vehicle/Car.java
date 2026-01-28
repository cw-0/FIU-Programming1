package vehicle;

// TODO
// Current Step: How to code the price and VIN number for each car:
// underline, static
// - , private
// + , public
// readOnly , const
// : , type

public class Car {

    //-------------------
    // class variables
    //-------------------

    private static int vehicleCounter = 2000;

    //-------------------
    // instance variables
    //-------------------

    private String carID;
    private String color;
    private String factory;
    private int numberOfDoors;
    private double price;
    private int mileage;
    public String doYouLikeIt;

    //-------------------
    // CONSTANTS
    //-------------------
    private static final String CAR_FACTORY_ID = "Norwood";

    //-------------------
    // constructors
    //-------------------

    public Car(){

    }

    public Car(String color, int numberOfDoors){

    }

    public Car(String color, int numberOfDoors, double price, int mileage){

    }

    //-------------------
    // getters & setters
    //-------------------
    public static int getVehicleCounter(){

    }

    public static void setVehicleCounter(int vehicleCounter){

    }

    public String getCarId(){

    }

    public String getColor(){

    }

    public void setColor(String color){

    }

    public String getFactory(){

    }

    public int getNumberOfDoors(){

    }

    public void setNumberOfDoors(int numberOfDoors){

    }

    public double getPrice(){

    }

    //-------------------
    //  class utils
    //-------------------

    public static void classDisplayInfor(){

    }

    public void displayInfo(){

    }

} // END OF CAR
