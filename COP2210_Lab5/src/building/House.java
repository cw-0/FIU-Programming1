package building;

import buildingunit.Room;

public class House {
  private Room kitchen;
  private Room livingRoom;
  private Room bedroom;
  private Room bathroom;

  public House(Room kitchen, Room livingRoom, Room bedroom, Room bathroom) {
    this.kitchen = kitchen;
    this.livingRoom = livingRoom;
    this.bedroom = bedroom;
    this.bathroom = bathroom;
  }

  public Room getKitchen() {
    return this.kitchen;
  }

  public Room getLivingRoom() {
    return this.livingRoom;
  }

  public Room getBedroom() {
    return this.bedroom;
  }

  public Room getBathroom() {
    return this.bathroom;
  }

  public void displayInfo() {
    System.out.println("========================");
    System.out.println("House DisplayInfo");
    System.out.println("========================");

    kitchen.roomStats("\t");
    System.out.println();

    livingRoom.roomStats("\t");
    System.out.println();

    bedroom.roomStats("\t");
    System.out.println();

    bathroom.roomStats("\t");
    System.out.println();
  }

  public double getHouseSquareFeet() {
    return calculateHouseSquareFeet();
  }

  private double calculateHouseSquareFeet() {
    double totalSquareFeet = 0.0;

    totalSquareFeet += (this.kitchen.getLength() * this.kitchen.getWidth());
    totalSquareFeet += (this.bathroom.getLength() * this.bathroom.getWidth());
    totalSquareFeet += (this.bedroom.getLength() * this.bedroom.getWidth());
    totalSquareFeet += (this.livingRoom.getLength() * this.livingRoom.getWidth());

    return totalSquareFeet;
  }
}
