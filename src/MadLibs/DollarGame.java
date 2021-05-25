package MadLibs;

import java.util.Scanner;

/**
 * Money game challenge
 */

public class DollarGame {
    public static void main(String[] args) {

        //innit
        double enKrone = 1;
        // etØre = 0.01;
        //tiØre = 0.1;
        //tjueFemØre = 0.25;
        // femtiØre = 0.5;

        //get
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange Ett øringer vil du spille med");
        double etØre = (scanner.nextDouble() * 0.01);
        System.out.println("Hvor mange Ti øringer vil du spille med");
        double tiØrer = (scanner.nextDouble() * 0.1);
        System.out.println(" Hvor mange Tjuefem øringer vil du spille med");
        double tjueFemØre = (scanner.nextDouble() * 0.25);
        System.out.println("Hvor mange Femti øringer vil du spille med");
        double femtiØre = (scanner.nextDouble() * 0.5);
        scanner.close();

        // calculate
        double sum = (etØre + tiØrer + tjueFemØre + femtiØre);

        // output
        if (sum < enKrone) {
            System.out.println(" Du fikk ikke eksakt 1 krone, du manglet " + (enKrone - sum) + " ører for å kunne vinne spillet");
        } else if (sum > enKrone) {
            System.out.println("Sumen av pengene du spilte med tilsvarer ikke en krone, du hadde  " + (sum - enKrone) + " formye i ører over en krone");
        } else {
            System.out.println(" Gratulerer !!!! Du fikk akkurat en krone av de pengene du spilte med du har vunnet spillet");
        }
    }
}
