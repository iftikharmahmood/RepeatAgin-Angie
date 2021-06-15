package MadLibs;

import java.util.Scanner;

public class DayOfTheWeek {
    private static Scanner scanner = new Scanner(System.in);
    private static String [] uke = {"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag", " Feil nr på ukedag inntastet. Det finnes 7 dager i uken"};

        public static void hentDag(int dag){
            String ukeDag;

            if(dag <=0){
                System.out.println(uke[7]);
            }  else if (dag >= 1 && dag <= 7 ){
                System.out.println(uke[dag-1]);
            } else if (dag > 7 ){
                System.out.println(uke[7]);
            }
        }

    public static void main(String[] args) {
        System.out.println("Tast inn et tall mellom 1 og 7 ");
        int dag = scanner.nextInt();
        hentDag(dag);
        dagerIUken();
    }

    private static void dagerIUken() {
        System.out.println(" Dette er dagne i en uke");
        for(int i = 0; i < uke.length -1; i++){
            System.out.println(" Den " + (i+1) + " dagen i uken er " + uke[i]);
        }

        }
}
