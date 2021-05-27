package chapter6;

/**
 * RECAP
 * INSTANTIATING OBJECTS
 */
public class HomeAreaCalculator {
    public static void main(String[] args) {

        /**
         * Rectangle 1
         */

        //Create instance of Rectangle class med den første konstruktøren, derverdiene egentlig er satt til 0,
        // det er også sli DEFAULT CONSTRUCTOR er når det ikke er laget en konstruktør

     //Datatype    objektet   ny instans av Rectangle
        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(50);
        double areaOfRoom1 = room1.calculateArea();
        double perimeterOfRoom1 = room1.calculatePerimeter();
        // dette er et objekt ved navn room1 som er laget av den generelle klassen Rectangle, Rectangle er i seg selv
        // bare en tegning på hvordan objektet skal se ut / hvilke atributter og egenskaper den skalha dvs en blue print
        // det vil si objektet er "representasjon" av klassen Rectangle i objektformat


        /**
         * Rectangle 2
         */

        //Create instance of Rectangle class, bruker nå den andre konstruktøren vi lagde som forventet 2 parametre inn
        Rectangle room2 = new Rectangle(30, 70);
        double areaOfRoom2 = room2.calculateArea();
        double perimeterOfRoom2 = room2.calculatePerimeter();
        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println();

        System.out.println("Lende på rom 1: " + room1.getLength() + "  Bredden på rom 1: " + room1.getWidth());
        System.out.println("Arealet på rom 1: " +areaOfRoom1);
        System.out.println("Omkretsen av rom 1: " +perimeterOfRoom1);
        System.out.println();


        System.out.println("Lende på rom 2: " + room2.getLength() + "  Bredden på rom 2: " + room2.getWidth());
        System.out.println("Arealet på rom 2: " +areaOfRoom2);
        System.out.println("Omkretsen av rom 1: " +perimeterOfRoom2);
        System.out.println();

        System.out.println("Perimeter of both rooms = " + (perimeterOfRoom1 + perimeterOfRoom2));
        System.out.println("Area of both rooms = " + totalArea);


    }

}
