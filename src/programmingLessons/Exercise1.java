package programmingLessons;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many of nails do you have: ");
        int num = in.nextInt();

        int boxes = num/50;
        int remainder = num-(boxes*50);

        System.out.println(boxes + " boxes will be full");
        System.out.println(remainder + " nails will remain");
    }
}
