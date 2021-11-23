package programmingLessons;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write all of  your throws: ");
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();

        int series=t1+t2+t3;
        double avg = (double)series/3;

        System.out.println("Series: "+ series + " . Avg: "+ avg);
    }
}
