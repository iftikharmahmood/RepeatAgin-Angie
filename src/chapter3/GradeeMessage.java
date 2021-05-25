package chapter3;
/**
 * Recap SWITCH statement
 */

import java.util.Scanner;

public class GradeeMessage {
    public static void main(String[] args) {

        //inn
        System.out.println("enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();


        String message;

        switch (grade){
            case "A":
                message = "Excelent";
                break;
            case "a":
                message = "Excelen";
                break;
            case "B":
                message = "Weary Good Grades";
                break;
            case "b":
                message = "Weary Good Grades";
                break;
            case "C":
                message = " Just good";
                break;
            case "c":
                message = " Just good";
                break;
            case "D":
                message= " Not so good";
                break;
            case "d":
                message= " Not so good";
                break;
            case "E":
                message = "Bad grades";
                break;
            case "e":
                message = "Bad grades";
                break;
            case "F":
                message = " You FAILED retardo";
                break;
            case "f":
                message = " You FAILED retardo";
                break;
            default:
                message = " Error, Invalid value entered";
                break;
        }
        System.out.println(message);
    }
}
