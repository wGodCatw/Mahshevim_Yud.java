package programmingLessons.Helek1;

import java.util.Scanner;

public class Ex2 {
    static Scanner in = new Scanner(System.in);


    static int toMinutes(int hours, int minutes) {
        return (hours * 60) + minutes;
    }

    static int diffMinutes(int h1, int m1, int h2, int m2) {
        return toMinutes(h1, m1) - toMinutes(h2, m2);
    }

    static void work() {
        int max_mins = Integer.MIN_VALUE;
        int max_day = 0;

        for (int i = 1; i < 8; i++) {
            System.out.println("Day " + i + ". Start: ");
            int h1 = in.nextInt();
            int m1 = in.nextInt();
            System.out.println("Day " + i + ": End: ");
            int h2 = in.nextInt();
            int m2 = in.nextInt();

            int result_i = diffMinutes(h2, m2, h1, m1);

            if (result_i > max_mins) {
                max_mins=result_i;
                max_day = i;
            }
        }
        System.out.println("Day " + max_day);
    }

    public static void main(String[] args) {
        work();
    }
}
