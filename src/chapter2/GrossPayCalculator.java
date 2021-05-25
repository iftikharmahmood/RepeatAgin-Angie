/**
 *
 /**
 * repetisjon av Angie kurs 20/5-21
 *
 */

package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String args[]) {
        // 1. get worked hours
        System.out.println("Tast inn antall arbeidstimer");
        Scanner scanner = new Scanner(System.in);
        int timer = scanner.nextInt();
        //2. get hourly pay rate
        System.out.println("Tast inn timelønn");
        double timepris = scanner.nextDouble();
        scanner.close();
        //3. multiply hours and pay rate
        double lønn = timer * timepris;

        //4. display result
        System.out.println("Lønn for ansatt blir : " + lønn);

    }
}
