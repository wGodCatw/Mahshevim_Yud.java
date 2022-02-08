package programmingLessons;

import java.util.Scanner;

public class Ex4 {
    static int n = 0;
    static boolean answer = true;

    static boolean justFunc(int n) {
        int n1, n2;
        while (n > 0 && answer) {
            n1 = n % 10;
            n2 = (n / 10) % 10;
            if (n1 == n2)
                answer = true;
            else
                answer = false;
            n = n / 100;
        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        n = in.nextInt();
        answer = justFunc(n);
        System.out.println(answer);

    }


}
