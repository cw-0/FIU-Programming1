package vehicle;

// underline, static
// - , private
// + , public
// readOnly , const
// : , type

import java.util.Random;

public class Car {

  //-------------------
  // class variables
  //-------------------

  private static int vehicleCounter = 2000;
  public static final Random randomGenerator = new Random();
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
  final double MIN_PRICE = 35000;
  final double MAX_PRICE = 45000;



  //-------------------
  // constructors
  //-------------------

  public Car() {
    color = "Red";
    numberOfDoors = 2;
    price = randomGenerator.nextDouble(MIN_PRICE, MAX_PRICE + 1);
    mileage = 0;
    carID = "VIN" + '-' + CAR_FACTORY_ID + '-' + vehicleCounter;
    factory = CAR_FACTORY_ID;
    doYouLikeIt = "yes";
    vehicleCounter++;
  }

  public Car(String color, int numberOfDoors) {
    this();
    this.color = color;
    this.numberOfDoors = numberOfDoors;
  }

  public Car(String color, int numberOfDoors, double price, int mileage) {
    this();
    this.color = color;
    this.numberOfDoors = numberOfDoors;
    this.price = price;
    this.mileage = mileage;
  }

  //-------------------
  // getters & setters
  //-------------------
  public static int getVehicleCounter() {
    return vehicleCounter;
  }

  public static void setVehicleCounter(int vehicleCounter) {
    Car.vehicleCounter = vehicleCounter;
  }

  public String getCarId() {
    return carID;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getFactory() {
    return CAR_FACTORY_ID;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  public double getPrice() {
    return price;
  }

  //-------------------
  //  class utils
  //-------------------

  public static void classDisplayInfo() {
    System.out.println("------------------------------");
    System.out.println("Car Class Info");
    System.out.println("------------------------------");
    System.out.printf("vehicleCounter: \t\t%s\n", Car.vehicleCounter);
    System.out.printf("CAR_FACTORY_ID: \t\t%s\n", Car.CAR_FACTORY_ID);
  }

  // TODO FIX FORMAT
  public void displayInfo() {
    System.out.println("------------------------------");
    System.out.println("Car Info");
    System.out.println("------------------------------");
    System.out.printf("%-25s %-15s\n", "CarID:", this.carID);
    System.out.printf("%-25s %-15s\n", "Factory:", this.factory);
    System.out.printf("%-25s %-15s\n", "Number of Doors:", this.numberOfDoors);
    System.out.printf("%-25s %-15s\n", "Color:", this.color);
    System.out.printf("%-25s %-15d\n", "Mileage:", this.mileage);
    System.out.printf("%-25s $%-15.2f\n", "Price:", this.price);
    System.out.printf("%-25s %-15s\n", "Do you like it:", this.doYouLikeIt);

  }

} // END OF CAR
