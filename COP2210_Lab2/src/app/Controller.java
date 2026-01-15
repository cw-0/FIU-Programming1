package app;

public class Controller {

  public static void main(String[] args) {
    yourInfoHeader("Lab 2");
    printStepHeader(3);

    int minutes = 33;
    int hours = 15;
    int days = 4;

    int secondsInMinute = 60;
    int secondsInHour = 3600;
    int secondsInDay = 86400;
    int totalSeconds = (days * secondsInDay) + (hours * secondsInHour) +
                       (minutes * secondsInMinute);
    System.out.printf(
        "Number of seconds in %d days, %d hours, and %d minutes is %d\n", days,
        hours, minutes, totalSeconds);


    double initialInvestment = 125000;

    double year1InterestRate = 1.05;
    double year2InterestRate = 1.09;
    double year3InterestRate = 0.965;
    double year4InterestRate = 1.07;

    double totalInterestEarned =
        (year4InterestRate *
         (year3InterestRate *
          (year2InterestRate * (year1InterestRate * initialInvestment)))) -
        initialInvestment;

    double year1InvestmentValue = initialInvestment * year1InterestRate;
    double year2InvestmentValue = year1InvestmentValue * year2InterestRate;
    double year3InvestmentValue = year2InvestmentValue * year3InterestRate;
    double year4InvestmentValue = year3InvestmentValue * year4InterestRate;

    printStepHeader(4);

    System.out.println("USING PRINTLN");
    System.out.println("initialInvestment: \t\t" + initialInvestment);
    System.out.println("year1InvestmentValue: \t\t" + year1InvestmentValue);
    System.out.println("year2InvestmentValue: \t\t" + year2InvestmentValue);
    System.out.println("year3InvestmentValue: \t\t" + year3InvestmentValue);
    System.out.println("year4InvestmentValue: \t\t" + year4InvestmentValue);
    System.out.println("totalInterestEarned: \t\t" + totalInterestEarned);

    System.out.println();

    System.out.println("USING PRINTF");
    System.out.printf("initialInvestment: \t\t%10.2f\n", initialInvestment);
    System.out.printf("year1InvestmentValue: \t\t%10.2f\n",
                      year1InvestmentValue);
    System.out.printf("year2InvestmentValue: \t\t%10.2f\n",
                      year2InvestmentValue);
    System.out.printf("year3InvestmentValue: \t\t%10.2f\n",
                      year3InvestmentValue);
    System.out.printf("year4InvestmentValue: \t\t%10.2f\n",
                      year4InvestmentValue);
    System.out.printf("totalInterestEarned: \t\t%10.2f\n", totalInterestEarned);

    printStepHeader(5);
    double circleDiameter = 17.3543;
    double circleRadius = circleDiameter / 2;
    double circleCircumference = 2 * (Math.PI * circleRadius);
    double circleArea = Math.PI * Math.pow(circleRadius, 2);

    System.out.printf("%-30s %.4f\n", "circleDiameter:", circleDiameter);
    System.out.printf("%-30s %.4f\n", "circleRadius:", circleRadius);
    System.out.printf("%-30s %.4f\n", "circleCircumference:", circleCircumference);
    System.out.printf("%-30s %.4f\n", "circleArea:", circleArea);

    printStepHeader(6);
    double rectangleHeight = 19.4;
    double rectangleWidth = 34.7;

    double triangleHeight = 16.4;
    double triangleBase = 20.1;

    double rectanglePerimeter = (2 * rectangleHeight) + (2 * rectangleWidth);
    double rectangleArea = rectangleHeight * rectangleWidth;

    double triangleHypotenuse = (Math.sqrt(Math.pow(triangleHeight, 2) + Math.pow(triangleBase, 2)));

    double trianglePerimeter = triangleHypotenuse + triangleBase + triangleHeight;
    double triangleArea = (triangleBase * triangleHeight) / 2;

    double totalPerimeter = trianglePerimeter + rectanglePerimeter;
    double totalArea = triangleArea + rectangleArea;

    System.out.printf("%-20s %8.1f\n", "rectangleHeight:", rectangleHeight);
    System.out.printf("%-20s %8.1f\n", "rectangleWidth:", rectangleWidth);
    System.out.printf("%-20s %8.1f\n", "triangleHeight:", triangleHeight);
    System.out.printf("%-20s %8.1f\n", "rectanglePerimeter:", rectanglePerimeter);
    System.out.printf("%-20s %8.1f\n", "rectangleArea:", rectangleArea);
    System.out.printf("%-20s %8.1f\n", "triangleHypotenuse:", triangleHypotenuse);
    System.out.printf("%-20s %8.1f\n", "trianglePerimeter:", trianglePerimeter);
    System.out.printf("%-20s %8.1f\n", "triangleArea:", triangleArea);
    System.out.printf("%-20s %8.1f\n", "totalPerimeter:", totalPerimeter);
    System.out.printf("%-20s %8.1f\n", "totalArea:", totalArea);

    printStepHeader(7);
    double airflow = 1.253;
    double varX = 1.392;
    double varY = 0.72;
    double varZ = 4.2932;

    double temp1 = Math.cos(Math.pow(airflow, 3));
    double temp2 = Math.pow(Math.E, (6 * varX * Math.pow(varY, 4)));
    double temp3 = 2 * Math.sqrt((7 * varX * (Math.pow(varY, 5.23)) * varZ));
    double temp4 = 1.8 * varX * varY * varZ;
    double temp5 = (Math.pow(0.75, Math.pow(2, (varX * varY * varZ))));
    double temp6 = Math.sqrt((airflow + varX));
    double boost = temp1 * ((temp2 + temp3) / temp6) + temp4 + temp5;

    System.out.printf("%-20s %.6f\n", "airflow:", airflow);
    System.out.printf("%-20s %.6f\n", "x:", varX);
    System.out.printf("%-20s %.6f\n", "y:", varY);
    System.out.printf("%-20s %.6f\n", "z:", varZ);
    System.out.printf("%-20s %.6f\n", "temp1:", temp1);
    System.out.printf("%-20s %.6f\n", "temp2:", temp2);
    System.out.printf("%-20s %.6f\n", "temp3:", temp3);
    System.out.printf("%-20s %.6f\n", "temp4:", temp4);
    System.out.printf("%-20s %.6f\n", "temp5:", temp5);
    System.out.printf("%-20s %.6f\n", "temp6:", temp6);
    System.out.printf("%-20s %.6f\n", "boost:", boost);

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
    System.out.println("Assignment: "
                       + assignment);
    System.out.println();
    System.out.println(
        "CERTIFICATION: \nI understand FIU’s academic policies, and I certify");
    System.out.println("that this work is my own and that none of it is the");
    System.out.println("work of any other person.");
    System.out.println("==================================");
    System.out.println();
  }

  public static void printStepHeader(int stepNumber) {

    System.out.println();
    System.out.println();
    System.out.println("==================================");
    System.out.println("Step " + stepNumber);
    System.out.println("==================================");
  }
}
