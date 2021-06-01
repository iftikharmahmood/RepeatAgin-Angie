package chapter6;
/**
 * Recap
 * OBJECTS AS METHOD PARAMETERS
 */

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
   private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Siden det ikke er mulig å kalle opp getRoom fordi denne metoden ikke er "static" og den skal beholdes
        //static, må den klasse som eier metoden kalles opp, det vil si den klassen som det jobbes med nå.

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathRoom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathRoom);
        System.out.println("total area : " + area);
        calculator.scanner.close();
    }

    private double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
    public Rectangle getRoom(){
        System.out.println("Enter length of the room : ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of the room : ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
        /**
         * Det samme som :
         * Rectangle room = new Rectangle(length, width);
         * return room;
          */

    }
}
