package IntroToProgramming.P2;

import java.util.Scanner;

public class P2_EB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //E1
//        int a;
//        for(int x = 0;x<5;x++){
//            System.out.println("Type an integer: ");
//            a = in.nextInt();
//        }
//        System.out.println("The End");

        //E2
//        int a;
//        for(int x = 0;x<10;x++){
//            System.out.print("Type an integer: ");
//            a = in.nextInt();
//            System.out.print("The number " + a + " is ");
//            if (a % 2 == 0) System.out.println("even");
//            else System.out.println("not even");
//        }

        //E3
//for (int x = 0; x < 5; x++) {
//            char a;
//            boolean b;
//            System.out.println("Type one letter: ");
//            a = in.next().charAt(0);
//            b = Character.isUpperCase(a);
//            if (b) {
//                System.out.println("Char " + a + " is uppercase");
//            } else {
//                System.out.println("Char " + a + " is lowercase");
//            }
//        }

        //E4
//        int count = 0;
//        for(int x=0;x<10;x++){
//            System.out.println("Type one character: ");
//            char a = in.next().charAt(0);
//            boolean b = Character.isUpperCase(a);
//
//            if (!b) count++;
//        }
//        System.out.println("From 10 characters, " + count + " are lowercase");

        //E5
//        int a;
//        do{
//            System.out.println("Type integer: ");
//            a = in.nextInt();
//        }while (a % 11 != 0);

        //E6
//        int a;
//        do{
//            System.out.println("Type a number: ");
//            a = in.nextInt();
//        }while(a/100<1 | a/100>=10);

        //E7
//        int a = 0;
//        do{
//            System.out.println("Type number: ");
//            a = in.nextInt();
//        }while (a%7!=0);

        //E8
//        int a;
//        do {
//            System.out.println("Type number: ");
//            a = in.nextInt();
//            System.out.println("Your number is " + a);
//        } while (a != 7);
//        System.out.println("Boom!");

        //E9
//        System.out.println("Type an integer: ");
//        int input = in.nextInt();
//        int sum;
//        for(int x=1;x<input+1;x++){
//            if(x>=10){
//                sum = (x / 10) + x%10;
//            }else sum = x;
//            if(x%3==0 & sum<5) System.out.println("Number: " + x);
//        }

        //E10
//        char first, second, third;
//
//        do {
//            System.out.println("Type one character: ");
//            first = in.next().charAt(0);
//
//            System.out.println("Type one character: ");
//            second = in.next().charAt(0);
//
//            System.out.println("Type one character: ");
//            third = in.next().charAt(0);
//        } while (second - first + second != third);
//
//        System.out.println("You entered three consecutive letters!");
    }
}