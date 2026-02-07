package buildingunit;

public class Room {
  // -- VARIABLES --
  private String type;
  private String color;
  private double length;
  private double width;
  private double temperature;

  // -- CONSTRUCTORS --
  public Room(String type, String color, double length, double width,
              double temperature) {
    this.type = type;
    this.color = color;
    this.length = length;
    this.width = width;
    this.temperature = temperature;
  }

  // == GETTERS ==

  public String getType() { return this.type; }

  public String getColor() { return this.color; }

  public double getLength() { return this.length; }

  public double getWidth() { return this.width; }

  public double getTemperature() { return this.temperature; }

  // == SETTERS ==

  public void setType(String type) { this.type = type; }

  public void setColor(String color) { this.color = color; }

  public void setLength(double length) { this.length = length; }

  public void setWidth(double width) { this.width = width; }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }

  // == INSTANCE METHODS ==
  public void roomStats(String tabs) {
    System.out.println(tabs + "==========================");
    System.out.println(tabs + "Room Stats: " + type);
    System.out.println(tabs + "==========================");
    System.out.println(tabs + "Type: \t\t\t " + type);
    System.out.println(tabs + "Color: \t\t\t " + color);
    System.out.printf(tabs + "%-24s %.2f\n", "Temperature: ", this.temperature);
    System.out.printf(tabs + "%-24s %.2f\n", "Length: ", this.length);
    System.out.printf(tabs + "%-24s %.2f\n", "Width: ", this.width);
    System.out.printf(tabs + "%-24s %.2f\n",
                      "Square feet: ", calculateSquareFeet());

    System.out.println();
  }

  private double calculateSquareFeet() { return this.length * this.width; }

} // End of Class Room
