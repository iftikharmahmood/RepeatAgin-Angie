package chapter7;

import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" Hvor mange karakterer skal tastes inn ?");
        grades = new int[scanner.nextInt()];

        getgrades();
        System.out.println(" Snittkarakter blir " + String.format("%.2f", snittKatrakter()));
        System.out.println(" Sum karakter : " + summerKarakter());
        System.out.println(" Høyeste karakter: " + høyesteKarakter());
        System.out.println(" Laveste karakter : " + lavesteKarakter());




    }

    public static void getgrades(){
        for (int i = 0; i < grades.length; i++){
            System.out.println("Tast in karakter # "  + (i+1));
            grades[i] = scanner.nextInt();
        }

    }
    public static  int summerKarakter(){
        int sum = 0;
        for (int karakter : grades){
            sum = sum + karakter;
        }
        return sum;
    }

    public static double snittKatrakter(){
        return summerKarakter()/grades.length;
    }

    public static int høyesteKarakter(){
        int høyest = grades[0];
        for (int karakter : grades){
            if (karakter > høyest){
                høyest = karakter;
            }
        }
        return høyest;
    }

    public static int lavesteKarakter(){
        int lavest = grades[0];
        for (int karakter : grades){
            if (karakter < lavest){
                lavest = karakter;
            }
        }
        return lavest;
    }
}


