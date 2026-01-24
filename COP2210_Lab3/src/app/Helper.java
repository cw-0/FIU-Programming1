package app;


public class Helper {
    final static double RADIUS = 10.7;
    final static double RECT_WIDTH = 20.7;
    final static double RECT_HEIGHT = 14.2;
    final static double TRIANGLE_BASE = 33.2;
    final static double TRIANGLE_HEIGHT = 16.2;

    public static void displayInfo(){
        System.out.println("====================================");
        System.out.println("DISPLAYINFO FROM HELPER CLASS");
        System.out.println("====================================");
    }

    public static void complexArea(int circleMultiplier, int rectangleMultiplier, int triangleMultiplier){

        double results =
                (circleMultiplier * Controller.calculateAreaOfCircle(RADIUS)) +
                (rectangleMultiplier * Controller.calculateAreaOfRectangle(RECT_HEIGHT, RECT_WIDTH)) +
                (triangleMultiplier * Controller.calculateAreaOfTriangle(TRIANGLE_BASE, TRIANGLE_HEIGHT))
        ; // END OF RESULTS ASSIGNMENT

        System.out.println("==================================");
        System.out.println("COMPLEXAREA FROM HELPER CLASS");
        System.out.println("==================================");
        System.out.printf("Result: %22.3f\n", results);
        System.out.printf("circleMultiplier: %5d\n", circleMultiplier);
        System.out.printf("rectangleMultiplier: %3d\n", rectangleMultiplier);
        System.out.printf("triangleMultiplier: %3d\n", triangleMultiplier);

    }

}
