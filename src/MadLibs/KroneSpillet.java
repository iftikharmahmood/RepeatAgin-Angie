package MadLibs;

import java.util.Scanner;

/**
 * Money game challenge
 */

public class KroneSpillet {
    public static void main(String[] args) {

        //innit
        double enKrone = 100;


        //get
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange Ett øringer vil du spille med");
        int etØre = scanner.nextInt();
        System.out.println("Hvor mange Ti øringer vil du spille med");
        int tiØrer = (scanner.nextInt() * 10);
        System.out.println(" Hvor mange Tjuefem øringer vil du spille med");
        int tjueFemØre = (scanner.nextInt() * 25);
        System.out.println("Hvor mange Femti øringer vil du spille med");
        int femtiØre = (scanner.nextInt() * 50);
        scanner.close();

        // calculate
        int sum = (etØre + tiØrer + tjueFemØre + femtiØre);

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
