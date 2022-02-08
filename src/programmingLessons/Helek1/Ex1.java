package programmingLessons.Helek1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print('*');
            }
            for (int k = 1; k < num-i; k++) {
                System.out.print('#');
            }
            System.out.println();
        }

    }
}
