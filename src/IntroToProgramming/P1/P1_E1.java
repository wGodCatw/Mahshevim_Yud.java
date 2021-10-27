package IntroToProgramming.P1;

import java.util.Scanner;

public class P1_E1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double rad = in.nextDouble();

        double area = 3.14 * rad * rad;
        double perimeter = 2 * 3.14 * rad;

        System.out.println("Radius: " + rad + ". Perimeter: " + perimeter + ". Area: " + area);
    }
}
