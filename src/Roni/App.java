package Roni;

public class App {
    public static void main(String[] args) {
        //Rectangle
        Rectangle r1 = new Rectangle(0.16, 1.0);
        System.out.println(r1);
        r1.setLength(r1.getLength() / 4);
        r1.setWidth(r1.getWidth() * 4);
        System.out.println(r1);
        System.out.println(r1.isSquare());

        System.out.println("Area: " + r1.getArea());

        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println(r1.getDiagonal());


        //Pen
        Pen p1 = new Pen("Pilot");
        Pen p2 = new Pen("Parker");
        p1.setPrice(20.0);
        p1.isTheSamePrice(p2);


        //Actor
        Actor a1 = new Actor("John", "M", 10);
        Actor a2 = new Actor("Justin", "M", 20);
        a1.compare(a2);

    }
}
