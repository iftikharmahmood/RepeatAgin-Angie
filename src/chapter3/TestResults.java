package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {

        // get score
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        // determine score/ grade
        char grade;
        if(score < 60){
            grade = 'F';
        } else if(score < 70){
            grade = 'E';
        } else  if(score < 80){
            grade = 'D';
        } else if(score < 90){
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println(" Based on your score, your grade is : " + grade);
    }
}
