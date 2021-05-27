package MadLibs;

import java.util.Scanner;

/**
 * Recap
 * VARIABLES & SCOPES
 * Itemised phone bill
 */

public class PhoneBill {

    public  static double basePlan;
    public  static double overage;
    public static final double vat = 0.15;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        createItemizedBill(getBase(), getOverage());

    }

    public static double getOverage() {
        System.out.println(" Enter overage for this period");
        return scanner.nextDouble();
    }

    public static double getBase() {
        System.out.println(" Enter baseplan of your bill");
        return scanner.nextDouble();
    }

    public static void createItemizedBill(double basePlan, double overage){
        System.out.println(" Phone Bill Statement");
        System.out.println("Plan: $" + basePlan);
        System.out.println("Overage: $" + overage);
        double tax = ((overage+basePlan)*vat);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + (overage + basePlan + tax));
    }

}
