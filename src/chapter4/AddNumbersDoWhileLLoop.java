package chapter4;

import java.util.Scanner;

/**
 * Recap Do WHILE LOOP
 */

public class AddNumbersDoWhileLLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean again;
        do {
            System.out.println(" Enter first number");
            double number1= scanner.nextDouble();
            System.out.println("Enter second number");
            double number2 = scanner.nextDouble();
            System.out.println(" Sum = " + (number1 + number2));
            System.out.println("Do You want to continue ?");
            again = scanner.nextBoolean();

        } while (again);

        scanner.close();
    }
}
