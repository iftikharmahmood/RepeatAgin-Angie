package MadLibs;

import java.util.Random;

/**
 * Recap Nested Loops
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 */

public class RollTheDieGame {
    public static void main(String[] args) {

        //init
        int space = 20;
        int players = 4;
        int rolls = 5;
        boolean trigger = false;

        for (int i = 0; i < players; i++) {
            System.out.println(" Paying now Player " + (i + 1));
            int place = 0;

            for (int j = 0; j < rolls; j++) {
                Random rnd = new Random();
                int die = rnd.nextInt(6) + 1;
                place = place + die;
                if ( place < space) {
                    System.out.println(" Player " + (i + 1) + " --- roll nr " + (j + 1) + " --- You advanced to space " + place + " --- You got " +( space - place) + " spaces left to achieve the goal");
                }
                else if (place >space){
                    System.out.println(" Player " + (i + 1) + " --- roll nr " + (j + 1) + " --- You lost the game, your position exceeded goal limit of 20 ..  GAME OVER");
                    trigger = true; }
                // else if(j == rolls && place < 20){
                   // System.out.println(" Player " + (i + 1) + " --- roll nr " + (j + 1) + " --- You lost the game, you have no more rolls left and lack of " + (space - place) + " spaces to goal ..  GAME OVER");
                 //   trigger=true;
             //   }
                else {
                    System.out.println(" Player " + (i + 1) + " --- roll nr " + (j + 1) + " --- You WON THE GAME");
                    trigger = true;
                }
                if (trigger){
                break;
                }
            }
        }
    }
}

/**
 *
 *  if (place < space && j < rolls) {
 *         } else if (place > space && j >= rolls || place > space) {
 *         System.out.println(" Player " + (i + 1) + " --- roll nr " + (j + 1) + " --- You advanced to space " + place);
 *
 *         }
 *         }
 *
 *
 *
 *
 *
 *
 */
