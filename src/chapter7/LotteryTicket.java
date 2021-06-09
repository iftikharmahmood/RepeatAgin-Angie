package chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.*;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];

        Random rnd = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            /*
            * Generate random number an den serch and eliminate duplicate numbers
             */
            do {
                randomNumber = rnd.nextInt(MAX_TICKET_NUMBER)+1;
            } while(search(ticket, randomNumber));
            /* Here no duplicate numbers exists */
            ticket[i] = randomNumber;
        }
        return ticket;
}
public static void printTicket(int ticket[]){
    for (int i = 0; i < LENGTH; i++) {
        System.out.print(ticket[i] + " |");

    }
}

    /**
     * sekvensiell søk i tabell for å finne en verdi
     * @param array tabellen det søkes igjennom
     * @param numberToSearchFor verdien det søkes etter
     * @return resultat er sann hvis funnet og usann hvis ikke funnet
     */
    public static boolean search(int[] array, int numberToSearchFor){
        /* enhansed loop
        *It iterates through array and each time assign the current element to value
        */
        for (int value: array) {
            if(value == numberToSearchFor){
                return true;
            }
        }
        /*
        * At this point the entire array was searched an value not found
         */
        return false;
}



/*
*example of binary search ( the array must be sorted first to use binary search
 */

 /*   public static boolean binarySearch(int[] array, int numberToSearchFor){
        //sort array
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >=0){
            return true;
        } else return false;

    } */
}
