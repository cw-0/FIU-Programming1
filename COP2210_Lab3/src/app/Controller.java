package app;
import java.lang.Math;

public class Controller {

  public static void main(String[] args) {
    yourInfoHeader("Lab 3");
    displayHeaderForPartA();
    double radius = 8.25;
    double area = calculateAreaOfCircle(radius);
    displaySingleResult(area, "calculateAreaOfCircle");

    int value1 = 5;
    double value2 = 59.5;
    multipleNumbersIntAndDouble(value1, value2);

    calculateAreaOfTriangleWithOutput(36.3, 18.2);

    double base = 17.16332;
    double height = 20.172391;
    double width = 20.51723;
    System.out.printf("Triangle info-> %-11s base: %.3f %-8s height: %.5f %-3s area: %.2f\n", "", base, "", height, "", calculateAreaOfTriangle(base, height));
    System.out.printf("Rectangle info-> %-10s height: %.4f %-5s width: %.1f %-8s area: %.5f\n", "", height, "", width, "", calculateAreaOfRectangle(height, width));
  }

  public static void yourInfoHeader(String assignment) {

    System.out.println("==================================");
    System.out.println("PROGRAMMER: "
                       + "Caden Warren");
    System.out.println("PANTHER ID: "
                       + "6602666");
    System.out.println();
    System.out.println("CLASS: \t\t COP2210 ");
    System.out.println("SECTION: \t "
                       + "U01");
    System.out.println("SEMESTER: \t "
                       + "SPRING 2026");
    System.out.println("CLASSTIME: \t "
                       + "T/TH 9:30 - 12:15");
    System.out.println();
    System.out.println("Assignment: " + assignment);
    System.out.println();
    System.out.println(
        "CERTIFICATION: \nI understand FIU’s academic policies, and I certify");
    System.out.println("that this work is my own and that none of it is the");
    System.out.println("work of any other person.");
    System.out.println("==================================");
    System.out.println();
  }

  public static void displayHeaderForPartA() {
    System.out.println("============================");
    System.out.println("SECTION Lab3a");
    System.out.println("============================");
    System.out.println();
  }

  public static double calculateAreaOfCircle(double radius) {
    if (radius < 0) {
      return -1;
    }
    return Math.PI * (radius * radius);
  }

  public static void displaySingleResult(double value, String methodName) {
    System.out.println("============================");
    System.out.printf("%s\n", methodName);
    System.out.println("============================");
    System.out.printf("%-20s %.4f\n", "Value: ", value);
    System.out.println();
  }

  public static void multipleNumbersIntAndDouble(int firstNumber,
                                                 double secondNumber) {

    double result = firstNumber * secondNumber;
    System.out.printf("Running multipleNumbersIntAndDouble -> %d, %f\n",
                      firstNumber, secondNumber);
    System.out.printf("\tfirstNumber: \t\t%d\n", firstNumber);
    System.out.printf("\tsecondNumber: \t\t%.1f\n", secondNumber);
    System.out.printf("\tResult: \t\t%.1f\n", result);
  }

  public static void calculateAreaOfTriangleWithOutput(double base, double height){
    double areaOfTriangle = .5 * (base * height);
    displaySingleResult(areaOfTriangle, "calculateAreaOfTriangleWithOutput");
  }

  public static double calculateAreaOfTriangle(double base, double height){
    return (.5 * (base * height));
  }

  public static double calculateAreaOfRectangle(double height, double width){
    return (height * width);
  }

} // END CONTROLLER
