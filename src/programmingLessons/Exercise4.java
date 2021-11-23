package programmingLessons;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in sides of the triangle:");
        int a = in.nextInt();
        int b = in.nextInt();
        double area = (double) (a * b) / 2;
        System.out.println("Area: " + area);
    }
}
