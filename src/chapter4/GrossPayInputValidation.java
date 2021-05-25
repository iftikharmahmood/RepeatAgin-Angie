package chapter4;

import java.util.Scanner;

/**
 * Recap THE WHILE LOOP
 */
public class GrossPayInputValidation {
    public static void main(String[] args) {
        //init
        int hourlyRate = 15;
        int maxHours = 40;

        //get

        System.out.println("How many hours did you work this week ?");
        Scanner scanner = new Scanner(System.in);
        int workedHours = scanner.nextInt();
        //The validation loop
        while (workedHours > maxHours){
            System.out.println(" invalid entry! Your worked hours must be between 1 and 40");
            workedHours = scanner.nextInt();

        }
        scanner.close();

        //calculate
        double grossPay = workedHours * hourlyRate;
        System.out.println(" Gross pay $ = " +grossPay);
    }
}
