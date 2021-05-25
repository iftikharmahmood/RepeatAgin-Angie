package chapter3;

import java.util.Scanner;

/**
 * Recap Logical Operators
 * Earn certain amount ( at least 30000 $ )
 * Must be employed alt least 2 years at current position
 *
 */

public class LogicalOperatorLoanQualifier {
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
        if(salary >= requiredIncome && years >= employed ){
                System.out.println(" You are qualified for loans");
            }
        else {
                System.out.println("You do not qualify for loans");
                System.out.println("    You must be emlpoyed at current job at least for " + employed + " years and You must also earn at least " + requiredIncome );
        }

    }
}
