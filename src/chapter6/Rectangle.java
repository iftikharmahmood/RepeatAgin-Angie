package chapter6;

/**
 * Recap FIELDS & OBJECTS
 */

/*
The object Rectangle
 */
public class Rectangle {
    /*
    The fields og object rectangle
     */
    private double length; // The fields are encapsulated with private access modifier
    private double width;

    //konstruktør slik en default konstruktør er
    public Rectangle(){
       length = 0;
       width = 0;
    }
    //konstruktør
    public Rectangle(double length, double width){
        this.length = length; // kan skrives på denne måten
        setWidth(width); // eller man kan ta i bruk setter metoden som eksisterer med with verdien som inngangsparameter
    }
   public double getLength(){
        return length;
    } //get metode for å hente ut verdi, public så alle kan hente ut denne informasjonen gjennom denne metoden.
    public void setLength(double length){
        this.length = length;
    } // Set metode for å sette verdi, public så alle kan sette denne verdien gjennom denne metoden..
   public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    double calculatePerimeter(){
        return (2*length)+(2*width);
    }
    double calculateArea(){
        return length * width;
    }
}
