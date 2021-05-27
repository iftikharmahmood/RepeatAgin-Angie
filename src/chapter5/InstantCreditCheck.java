package chapter5;
/**
 * Recap Credit Calculator
 * scope of variables
 */

import java.util.Scanner;

public class InstantCreditCheck {

    static int reqSalary = 25000;
    static int reqCreditScore = 700;
    static boolean isQualifyed = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //get
        double salary = getSalary();
        double creditScore = getCreditScore();

        //check / calculate
        //isQualifyed = qualifyer(salary, creditScore);

        //Notify / output
        notification(isQualifyed = qualifyer(salary, creditScore));

    }

    private static void notification(boolean isQualifyed) {
        /*
          Output information to user
         */
        if (isQualifyed) {
            System.out.println("You qualify for loan");
        } else {
            System.out.println("You do not qualify for loan");
        }
    }

    public static double getCreditScore() {
        /*
          get information from user
         */
        System.out.println(" Enter your credit score");
        return scanner.nextInt();
    }

    public static double getSalary() {
        /*
          get information from user
         */
        System.out.println(" Enter your salary");
        return scanner.nextDouble();
    }

    public static boolean qualifyer(double salary, double creditScore) {
        /*
          evaluation an calculation
         */
        boolean isQualifyed = false;
        if (salary >= reqSalary && creditScore >= reqCreditScore) {
            isQualifyed = true;
        }
        return isQualifyed;
    }
}