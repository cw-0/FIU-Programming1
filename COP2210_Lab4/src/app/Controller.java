package app;

import vehicle.Car;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void main(String[] args){

        yourInfoHeader("Lab 4");

        Car c1 = new Car();
        c1.displayInfo();
        Car.classDisplayInfo();

        Car c2 = new Car("White", 4);
        c2.displayInfo();

        Car c3 = new Car("Black", 2);
        c3.displayInfo();

        Car c4 = new Car("Blue", 4, 38500, 10432);
        c4.displayInfo();




        System.out.println("------------------------------");
        System.out.println("Working with instance method");
        System.out.println("------------------------------");
        c4.setColor("Green");
        c4.setNumberOfDoors(2);
        c4.displayInfo();


        System.out.println("------------------------------");
        System.out.println("Working with public instance variables");
        System.out.println("------------------------------");
        c2.displayInfo();
        c2.doYouLikeIt = "No";
        c2.displayInfo();


        System.out.println("------------------------------");
        System.out.println("Working with build-in string method");
        System.out.println("------------------------------");
        System.out.printf("%-39s %-20s\n", "Color of instance c1:", c1.getColor());
        System.out.printf("%-39s %-20s\n", "Length of Color of instance c1:", (c1.getColor()).length());

        System.out.println();

        System.out.println("CarID of instance c2: \t\t\t\t\t" + c2.getCarId());
        System.out.printf("Index of 'd' of c2's Car ID: \t\t\t%d\n", (c2.getCarId()).indexOf('d'));

        System.out.println();

        System.out.println("CarID of instance c2: \t\t\t\t\t" + c2.getCarId());
        System.out.printf("Index of the first 'o' of c2's Car ID:\t%d\n", (c2.getCarId()).indexOf('o'));

        System.out.println();

        System.out.println("CarID of instance c2: \t\t\t\t\t" + c2.getCarId());
        System.out.printf("Index of the second 'o' of c2's Car ID: %d\n", ((c2.getCarId()).replaceFirst("o", "~")).indexOf('o'));
    } // END OF MAIN

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
    } // END OF INFO HEADER

} // END OF CONTROLLER
