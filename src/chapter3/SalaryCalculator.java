package chapter3;

import java.util.Scanner;

/*
 Recap If statement
 Salery is 1000 pr week
 print salary with bonus if number of sales in a week exeeds or meets qouta of 10
 else print salary without bonus

 */
public class SalaryCalculator {
    public static void main(String[] args) {
        //1. initialise known values
        int salary = 1000;
        int bonus = 250;
        int qouta = 10;

        //2. get unknown values
        System.out.println(" Enter number of sales this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //3. quiq detour for bonus earners

        if(sales >= qouta){
            salary = salary + bonus;
        }
        //4. Output

        System.out.println("The salary hvis week is " + salary );

    }
}
