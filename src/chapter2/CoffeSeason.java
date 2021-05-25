/**
 * MADLIB oppgave 1
 */

package chapter2;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CoffeSeason {
    public static void main(String[] args) {
        System.out.println("What season is it now? ");
          Scanner scanner = new Scanner(System.in);
            String season = scanner.next();
        System.out.println("State an adjective : ");
            String adjective = scanner.next();
        System.out.println("Enter a random integer number");
         int tall = scanner.nextInt();
          scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimumm of " + tall + " cups of coffe. ");

    }
}

/**
 * InputStreamReader season = new InputStreamReader(System.in);
 */