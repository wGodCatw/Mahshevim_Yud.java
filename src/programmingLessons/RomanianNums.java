package programmingLessons;

import java.util.Scanner;

public class RomanianNums {
    static Scanner in = new Scanner(System.in);

    static void ones(int number) {
        int lastd = number % 10;
        if (lastd == 4) System.out.print("IV");
        else if (lastd == 9) System.out.print("IX");
        else {
            if (lastd < 5) {
                for (int i = 0; i < lastd; i++) {
                    System.out.print('I');
                }
            } else {
                System.out.print('V');
                for (int i = 0; i < lastd - 5; i++) {
                    System.out.print('I');
                }
            }
        }
    }

    static void tens(int number) {
        int lastd = number;
        if(lastd == 100) System.out.println('C');
        else if (lastd == 40) System.out.print("XL");
        else if (lastd == 90) System.out.print("XC");
        else {
            if (lastd < 50) {
                for (int i = 0; i < lastd/10; i++) {
                    System.out.print('X');
                }
            } else {
                System.out.print('L');
                for (int i = 0; i < (lastd - 50)/10; i++) {
                    System.out.print('X');
                }
            }
        }
    }

    static void convert() {
        int num = 1;
        while (num > 0 && num <= 100) {
            num = in.nextInt();
            tens(num-(num%10));
            ones(num);
        }
    }


    public static void main(String[] args) {
        convert();
    }
}
