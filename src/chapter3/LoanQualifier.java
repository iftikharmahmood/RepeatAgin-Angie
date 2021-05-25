package chapter3;

import java.util.Scanner;

/**
 * Recap Nested IF statement
 * Earn certain amount ( at least 30000 $ )
 * Must be employed alt least 2 years at current position
 *
 */

public class LoanQualifier {
    public static void main(String[] args) {

        //init

        int requiredIncome = 30000;
        int employed = 2;

        //Get unknown values
        System.out.println("Enter your salary");
            Scanner scanner = new Scanner(System.in);
            double salary = scanner.nextDouble();
        System.out.println("Enter years of employment with current eployer");
            double years = scanner.nextDouble();
            scanner.close();
       // make decision
        if(salary >= requiredIncome){
            System.out.println("First condition met");
            if( years >= employed){
                System.out.println("    Second condition met");
                System.out.println("        You are qualified for loans");
            }
            else {
                System.out.println("Second condition not met");
                System.out.println("    You must be emlpoyed at current job at least for " + employed + " years.");
                System.out.println("        You do not qualifie for loans du to lack of stable employment");
            }
        }
        else {
            System.out.println("First condition not met");
            System.out.println("    The IF statement wil not continue an the second condition will not be evaluated");
            System.out.println("        You do not qualify for loans, due to lack of sufficient earnings");
            System.out.println("            You must earn at least " + requiredIncome + " in local currency");
        }

    }
}
