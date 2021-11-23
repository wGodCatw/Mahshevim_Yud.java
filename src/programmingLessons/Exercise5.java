package programmingLessons;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int d1, d2, d3;
        Scanner in = new Scanner(System.in);
        System.out.println("Type in number: ");
        int num = in.nextInt();

        d1 = num % 10;
        d2 = (num % 100) / 10;
        d3 = (num - d2 * 10 - d1) / 100;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        String number = Integer.toString(d1) + Integer.toString(d2) + Integer.toString(d3);

        System.out.println("Sum: " + (d1 + d2 + d3));
        System.out.println("New number: " + number);
    }
}
