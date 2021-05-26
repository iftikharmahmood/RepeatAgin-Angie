package chapter4;

import java.util.Scanner;

/**
 * Recap Nestet LOOPS
 */
public class AvrageTestScore {
    public static void main(String[] args) {
        //init

        int antallStudenter = 24;
        int antallPrøver = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < antallStudenter; i++) {

            System.out.println("Karakterer for student nr " + (i+1));
            double total = 0;

            for (int j = 0; j < antallPrøver; j++) {
                System.out.println("Tast inn karakteren for fag nr " +(j+1));
                double karakter = scanner.nextDouble();
                total = total + karakter;

            }
            double snitt = total / antallPrøver;
            System.out.println(" Snitt karakteren for student nr " + (i+1) + " er " + snitt);

        }
        scanner.close();

    }
}
