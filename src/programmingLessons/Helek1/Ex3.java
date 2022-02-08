package programmingLessons.Helek1;

import java.util.Scanner;

public class Ex3 {
    static int len(int n) {
        int length = 0;
        while (n != 0) {
            length++;
            n /= 10;
        }
        return length;
    }

    static int confNum(int num) {
        int d1 = (int) (num / (Math.pow(10, len(num) - 1)));
        int d2 = num % 10;

        num = num * 10 + ((d1 + d2) % 10);

        d2 = num % 10;
        num = num * 10 + ((d1 + d2) % 10);
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println(confNum(in.nextInt()));
        }
    }
}
