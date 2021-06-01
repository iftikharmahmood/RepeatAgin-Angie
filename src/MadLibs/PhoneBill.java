package MadLibs;

import java.util.Scanner;

/**
 * Recap
 * VARIABLES & SCOPES
 * Itemised phone bill
 */

public class PhoneBill {

    private double alottedMinutes;
    private int iD;
    private double minutesUsed;
    private double overage;
    private double basePlan;

    private double vat;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PhoneBill bill = new PhoneBill();
        bill.createItemizedBill(getBase(), getOverage());
        scanner.close();

    }


    public void createItemizedBill(double basePlan, double overage){

        System.out.println(" Phone Bill Statement");
        System.out.println("Plan: $" + basePlan);
        System.out.println("Overage: $" + overage);
        double tax = ((overage+basePlan)*vat);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + (overage + basePlan + tax));
    }

    // 1a
    public double getAlottedMinutes() {
        return alottedMinutes;
    }


    //1b
    public void setAlottedMinutes(double alottedMinutes) {
    this.alottedMinutes = alottedMinutes;
    }

    // 2a
    public int getiD() {
        return iD;
    }

    //2b
    public void setiD(int iD) {
        this.iD = iD;
    }

    // 3a
    public double getMinutesUsed() {
        return minutesUsed;
    }

    //3b
    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

     //4a
    public double getOverage() {
         return overage;
     }

    //4b
    public void setOverage(double overage) {
        this.overage = overage;
    }

    public double getBase() {
        return basePlan;
    }

    public void setBasePlan(double basePlan){
        this.basePlan = basePlan;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }
    public double getVat(){
        return vat;
    }
}
