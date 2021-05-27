package chapter5;

import java.util.Scanner;

/**
 * Recap FIRST METHOD
 */

public class Greetings {
    public static void main(String[] args) {
        skrivHilsen(getName());
        System.out.println();
        System.out.println("Det var det");

    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Tast inn navnet ditt");
        String navn = scanner.next();

        return navn;
    }

    public static void skrivHilsen(String navn) {
        System.out.println(" Hei der " + navn);
    }

}
