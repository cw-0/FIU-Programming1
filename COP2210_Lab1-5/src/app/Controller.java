package app;

public class Controller {

  public static void main(String[] args) {
    yourInfoHeader();

    int x = 10;
    double y = 20.3;
    double z = x + y;

    System.out.println("The value of x = " + x);
    System.out.println("The value of y = " + y);
    System.out.printf("The value of z = %.1f\n", z);

    System.out.println();

    String name = "John Doe";
    double hourlyWage = 35.5;
    double hoursWorked = 38.25;

    System.out.printf("name: \t\t\t %-20s \n", name);
    System.out.printf("hourlyWage: \t\t %-20.2f \n", hourlyWage);
    System.out.printf("hoursWorked: \t\t %-20.2f \n", hoursWorked);

    System.out.println();

    System.out.printf("name: %s\n", name);
    System.out.printf("name: %s hourlyWage: %.4f\n", name, hourlyWage);
    System.out.printf("name: %s \t hourlyWage: %.4f \t\t hoursWorked: %.3f\n",
                      name, hourlyWage, hoursWorked);

    double weekPay = hourlyWage * hoursWorked;

    System.out.println();

    System.out.printf("name: \t\t\t %-20s \n", name);
    System.out.printf("hourlyWage: \t\t %-20.1f \n", hourlyWage);
    System.out.printf("hoursWorked: \t\t %-20.2f \n", hoursWorked);
    System.out.printf("Employee: %s -> Weekly Pay is: $%.2f\n", name, weekPay);

  } // end main

  //-----------------------------------------------------------------
  // beginning of yourInfoHeader() method

  public static void yourInfoHeader() {

    System.out.println("==================================");
    System.out.println("PROGRAMMER: "
                       + "Caden Warren");
    System.out.println("PANTHER ID: "
                       + "6602666");
    System.out.println();
    System.out.println("CLASS: \t\t COP2210 ");
    System.out.println("SECTION: \t "
                       + "");
    System.out.println("SEMESTER: \t "
                       + "SPRING 2026");
    System.out.println("CLASSTIME: \t "
                       + "T/TH 9:30 - 12:15");
    System.out.println();
    System.out.println("Assignment: "
                       + "Lab 1.5");
    System.out.println();
    System.out.println(
        "CERTIFICATION: \nI understand FIU’s academic policies, and I certify");
    System.out.println("that this work is my own and that none of it is the");
    System.out.println("work of any other person.");
    System.out.println("==================================");
    System.out.println();
  } // end yourInfoHeader

} // end of class
