package programmingLessons;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Start time: ");
        System.out.print("Hours: ");
        int hour = in.nextInt();
        System.out.print("Minutes: ");
        int min = in.nextInt();
        System.out.print("Seconds: ");
        int sec = in.nextInt();
        System.out.println("End time: ");
        System.out.print("Hours: ");
        int hour1 = in.nextInt();
        System.out.print("Minutes: ");
        int min1 = in.nextInt();
        System.out.print("Seconds: ");
        int sec1 = in.nextInt();
        int hour2 = hour + hour1;
        int min2 = min + min1;
        int sec2 = sec + sec1;
        if (sec2 > 60) {
            min2 = min2 + sec2 / 60;
            sec2 = sec2 % 60;
        }
        if (min2 > 60) {
            hour2 = hour2 + min2 / 60;
            min2 = min2 % 60;
        }
        System.out.println("You ended conversation ");
        System.out.println("Hour: " + hour2);
        System.out.println("Minutes: " + min2);
        System.out.println("Seconds: " + sec2);
    }
}