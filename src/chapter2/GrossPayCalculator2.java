/**
 * Siplified lculator
 */
package chapter2;

import java.util.Scanner;

public class GrossPayCalculator2 {
    public static void main(String[] args) {
        System.out.println("Tast inn antall timer arbeidet: ");
        Scanner scanner = new Scanner(System.in);
        double antalltimer = scanner.nextDouble();
        System.out.println("Tast inn tariff");
        double tariff = scanner.nextDouble();
        scanner.close();
        System.out.println("Lønn blir : " + antalltimer * tariff);
    }

}
