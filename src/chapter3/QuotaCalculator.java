package chapter3;

import java.util.Scanner;

/**
 * Recap  IF ELSE
 * Salery is 1000 pr week
 *  print salary with bonus if number of sales in a week exeeds or meets qouta of 10
 *  else print salary without bonus, alsp print a congratolary message
 *  for those who dont inform them of how short they were

 **/

public class QuotaCalculator {
    public static void main(String[] args) {
        //init
        int quota = 10;
        int salary = 1000;
        int bonus = 250;


        // get unknown values
        System.out.println("Enter number of sales this week");
            Scanner scanner = new Scanner(System.in);
                int sales = scanner.nextInt();
            scanner.close();

        // make decision on path to take, output
        if(sales >= quota){
            System.out.println("Congrats You met qouta, salary is  " + (salary + bonus));
        }
        else {
            System.out.println(" Qouta was not met, you are " + (quota-sales) + " sales to short, the slary is " + salary);

        }

    }
}
