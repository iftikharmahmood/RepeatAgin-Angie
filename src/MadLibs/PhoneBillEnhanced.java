package MadLibs;

import java.util.Scanner;

/**
 * Recap
 * VARIABLES & SCOPES
 * Itemised phone bill
 */

public class PhoneBillEnhanced {

    private int iD;
    private double basePlan;
    private double allottedminutes;
    private double minutesUsed;
    private double overage;
    private double vat;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBillEnhanced bill = new PhoneBillEnhanced();
        bill.getInfoUser();
        bill.createItemizedBill(bill.getiD(), bill.getBasePlan(), bill.getAllottedminutes(), bill.getMinutesUsed(), bill.getVat());
        scanner.close();
    }
    public void getInfoUser(){
        System.out.println(" What is your Phone ID ?");
        setiD(scanner.nextInt());

        System.out.println("Enter your base plan policy");
        setBasePlan(scanner.nextDouble());

        System.out.println(" Enter allotted minutes for this period");
        setAllottedminutes(scanner.nextDouble());

        System.out.println("Enter minutes used for this period ?");
        setMinutesUsed(scanner.nextDouble());

        System.out.println("What is the percentage of Value Added Tax in your country ?");
        setVat(scanner.nextDouble());
    }
    public void createItemizedBill(int iD, double basePlan, double allottedminutes, double minutesUsed, double vat){

        System.out.println(" Enhanced Phone Bill Statement for User :" + iD);
        System.out.println("Periodically base cost: $" + basePlan);
        System.out.println(" Total minutes included in base plan " + allottedminutes + " minutes");
        System.out.println(" Total minutes used this period: " + minutesUsed + " minutes");

        if (minutesUsed > allottedminutes){
            overage = minutesUsed - allottedminutes;
        } else if(allottedminutes > minutesUsed){
            overage = 0;
        }
        System.out.println(" Overage charge this period: $" + overage);
        System.out.println("     +");
        System.out.println(" Sub Total this period: " + (basePlan + overage ));
        System.out.println("-------------------------------------");
        double tax = ((overage+basePlan)*vat);
        System.out.println("     +");
        System.out.println(" Tax: $" + tax);
        System.out.println(" Total to pay this period: $" + (overage + basePlan + tax) + " VAT included");
        System.out.println("==============================================");
        System.out.println(" Taxation percentage: " + vat);
    }

    // 1a
    public double getAllottedminutes() {
        return allottedminutes;
    }
    //1b
    public void setAllottedminutes(double allottedminutes) {
    this.allottedminutes = allottedminutes;
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
    public double getBasePlan() {
        return basePlan;
    }
    public void setBasePlan(double basePlan){
        this.basePlan = basePlan;
    }
    public void setVat(double vat) {
        this.vat = vat/100;
    }
    public double getVat(){
        return vat;
    }
}
/**
 *
 //4a
 public double getOverage() {
 return overage;
 }
 //4b
 public void setOverage() {
 this.overage = getMinutesUsed() - getAllottedminutes();
 }
 */
