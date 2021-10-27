package semester1.lesson1_1_intro;

import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in the year: ");
        int num = in.nextInt();
        if (num % 4 == 0) System.out.println("This is a leap year");
        else System.out.println("This is not a leap year");
    }
}
