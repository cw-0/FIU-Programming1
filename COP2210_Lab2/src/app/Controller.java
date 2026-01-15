package app;

public class Controller {

  public static void main(String[] args) {
    yourInfoHeader();
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
    double circleArea = Math.pow((Math.PI * circleRadius), 2);

    System.out.printf("circleDiameter: \t\t%10.2f\n", initialInvestment);
  }

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
                       + "Lab 2");
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
