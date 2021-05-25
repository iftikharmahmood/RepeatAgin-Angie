package chapter4;

import java.util.Scanner;

/**
 * recap FOR LOOP
 */

public class Cashier {
    public static void main(String[] args) {

        System.out.println("Enter number of item");
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();

        double total=0;

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(" enter the price for item number " + i);
            double price = scanner.nextDouble();
            total = total + price;

        }
        scanner.close();
        System.out.println(" The sum to pay is " + (total + (total * 0.25)) + " inc VAT");


    }
}
