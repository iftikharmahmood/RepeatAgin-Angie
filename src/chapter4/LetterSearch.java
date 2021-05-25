package chapter4;

import java.util.Scanner;

/**
 * Recap FOR LOOP
 */

public class LetterSearch {
    public static void main(String[] args) {
        //get text
        System.out.println("Enter some random text");
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.next();

        boolean letterFound = false;

        //search for letter
        System.out.println(" Enter the letter You want to search for in capital letter ");
        char letter1 = scanner.next().charAt(0);
        System.out.println(" Enter the letter You want to search for in antonym letter ");
        char letter2 = scanner.next().charAt(0);

        for (int i = 0; i < txt.length(); i++) {
            char currentLetter = txt.charAt(i);
            if(currentLetter == letter1 || currentLetter == letter2){
                letterFound = true;
                break;
            }

        }
        if (letterFound){
            System.out.println("This text contains a letter " + letter1 + " and / or " + letter2);
        }
        else {
            System.out.println("This text do not contain the letter you are searching for");

        }

    }
}
