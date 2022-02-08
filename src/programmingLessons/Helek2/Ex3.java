package programmingLessons.Helek2;

import java.util.Scanner;

public class Ex3 {
    static void pyramide(int num, String c) {
        int count = num / 2;
        for (int i = 1; i < num + 1; i += 2) {
            for (int j = count; j > 0; j--) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
            count--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        pyramide(in.nextInt(), in.next());
    }
}
