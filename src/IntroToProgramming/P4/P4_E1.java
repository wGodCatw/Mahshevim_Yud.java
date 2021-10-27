package IntroToProgramming.P4;

import java.util.Scanner;
import java.util.SortedMap;

public class P4_E1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //E1


        //E2
//        String stringNum;
//        System.out.println("Type an integer: ");
//        stringNum = in.next();
//        for(int x=0;x<stringNum.length();x++){
//            if(x%2==0) System.out.print(stringNum.charAt(x));
//        }

        //E3
//        String num1, num2;
//
//        num1 = in.next();
//        num2 = in.next();
//
//        for (int i = 0; i < num1.length(); i++) {
//            if(num1.charAt(i) == num2.charAt(i)) System.out.print(num1.charAt(i));
//        }

        //E4
//        System.out.println("Type in passport number (without hyphen): ");
//        String passNum = in.next();
//        int passSum = 0;
//
//        char[] numArray = passNum.toCharArray();
//        for (int i = 0; i < numArray.length; i++) {
//            if (i % 2 == 0) numArray[i] *= numArray[i] * 2;
//        }
//
//        for (char c : numArray) {
//            passSum += c;
//        }
//        int result = passSum;
//        while (passSum % 10 != 0) {
//            passSum++;
//        }
//
//        System.out.println("Your last digit in passport number is: " + (passSum - result));

        //E5
//        int result;
//        System.out.println("Type in number: ");
//        String number = in.next();
//        StringBuilder sb = new StringBuilder(number);
//        if(number.length()%2!=0) {
//            System.out.print(number.charAt(0) - '0');
//            sb.deleteCharAt(0);
//            number = sb.toString();
//        }
//        int[] myarr = new int[number.length()];
//        for (int i = 0; i < number.length(); i++) {
//            myarr[i] = number.charAt(i)-'0';
//        }
//        for(int x = 0; x < myarr.length; x+=2) {
//                result = myarr[x + 1];
//                myarr[x + 1] = myarr[x];
//                myarr[x] = result;
//        }
//        for (int j : myarr) {
//            System.out.print(j);
//        }

        //E6
//        System.out.println("Type in number: ");
//        String number = in.next();
//        System.out.print(number);
//        for (int i = number.length()-1; i >=0 ; i--) {
//            System.out.print(number.charAt(i));
//        }

        //E7
//        String a;
//        do {
//            System.out.println("Type in expression (without spaces): ");
//            a = in.next();
//            System.out.print((a.charAt(0) - '0') - (a.charAt(2) - '0'));
//            System.out.println((a.charAt(0) - '0') + (a.charAt(2) - '0'));
//        } while (a.charAt(1) != '-');

        //E8
//        System.out.println("Type first number: ");
//        String num = in.next();
//
//        System.out.println("Type second number: ");
//        String num2 = in.next();
//
//        int count = 0;
//
//        int[] digits2 = new int[num2.length()];
//        for (int i = 0; i < num2.length(); i++) {
//            digits2[i] = num2.charAt(i)-'0';
//        }
//
//        int[] digits = new int[num.length()];
//        for (int i = 0; i < num.length(); i++) {
//            digits[i] = num.charAt(i)-'0';
//        }
//
//        for (int i = 0; i < digits.length; i++) {
//            count = digits[i];
//            for (int j = 0; j < count; j++) {
//                System.out.print(digits2[i]);
//            }
//        }

        //E9
//        System.out.println("Type in number: ");
//        int num = in.nextInt();
//        System.out.println("What will be the size of dividing: ");
//        int digit = in.nextInt();
//
//        int len = Integer.toString(num).length();
//        for (int i = 0; i < (len / digit) + (len % digit); i++) {
//            int add_num = num % 100;
//            System.out.print(add_num % 10);
//            if(add_num/10==0) break;
//            System.out.println(add_num / 10);
//            num = (num - (num % 100)) / 100;
//        }

        //E10
//        System.out.println("Type in number: ");
//        int num = in.nextInt();
//        int count1 = 1;
//        int count2 = num - count1;
//
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < count1; j++) {
//                System.out.print("*");
//            }
//            count1 += 1;
//            for (int j = 0; j < count2; j++) {
//                System.out.print("#");
//            }
//            count2 -= 1;
//            System.out.println();
//        }

        //E11
        int num = 7;
        int count1 = 1; //spaces
        int count2 = num - count1; //stars
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < count1; j++) {

            }
        }
    }
}