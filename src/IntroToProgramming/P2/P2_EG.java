package IntroToProgramming.P2;

import java.util.Scanner;

public class P2_EG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //E1
//        int[] myarr = new int[15];
//
//        for (int x = 0; x < 15; x++) {
//            System.out.println("Type an integer: ");
//            int num = in.nextInt();
//            myarr[x] = num;
//        }
//
//        for (int i =0;i<15;i++) {
//            if (myarr[i] % 2 == 0) System.out.println("Number " + myarr[i] + " is even");
//        }

        //E2
//        char[] myarr = new char[10];
//        for (int x = 0; x < 10; x++) {
//            System.out.println("Type character: ");
//            myarr[x] = in.next().charAt(0);
//        }
//        for (int i = 0; i < 10; i++) {
//            if (Character.isUpperCase(myarr[i])) System.out.println(myarr[i]);
//        }

        //E3
//        int[] myarr = new int[10];
//        int x = 0, i = 0;
//        while (myarr[9] == 0) {
//            if (x % 3 == 0) {
//                myarr[i] = x;
//                i++;
//                System.out.println(x);
//            }
//            x++;
//        }

        //E4
//        int[] myarr = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Type an integer: ");
//            if (i % 2 == 0) {
//                myarr[i] = in.nextInt() + 1;
//            } else myarr[i] = in.nextInt();
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(myarr[i]);
//        }

        //E5
//        int[] myarr = new int[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Type an integer: ");
//            myarr[i] = in.nextInt();
//            if (i % 2 == 0) myarr[i]=myarr[i]+1;
//            if (i % 3 == 0) myarr[i]=myarr[i]-1;
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(myarr[i]);
//        }

        //E7
//        int[] myarr1 = new int[5];
//        int[] myarr2 = new int[5];
//
//        System.out.println("First array");
//        for (int x = 0; x < 5; x++) {
//            System.out.println("Type an integer: ");
//            myarr1[x] = in.nextInt();
//        }
//
//        System.out.println("Second array");
//        for (int x = 0; x < 5; x++) {
//            System.out.println("Type an integer: ");
//            myarr2[x] = in.nextInt();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            if (myarr1[i] == myarr2[i]) System.out.println("myarr[" + i + "]" + ": " + myarr1[i]);
//        }

        //E8
//        int[] myarr1 = new int[5];
//        int[] myarr2 = new int[5];
//        int[] sumArr = new int[5];
//
//        System.out.println("First array");
//        for (int x = 0; x < 5; x++) {
//            System.out.println("Type an integer: ");
//            myarr1[x] = in.nextInt();
//        }
//
//        System.out.println("Second array");
//        for (int x = 0; x < 5; x++) {
//            System.out.println("Type an integer: ");
//            myarr2[x] = in.nextInt();
//        }
//
//        System.out.println("Third array");
//        for (int i = 0; i < 5; i++) {
//            sumArr[i] = myarr1[i] + myarr2[i];
//            System.out.println("sumArr[" + i + "]: " + sumArr[i]);
//        }

        //E9
//        int[] myarr1 = new int[5];
//        int[] myarr2 = new int[5];
//        int x = 0;
//
//        System.out.println("First array");
//        for (int j = 0; j < 5; j++) {
//            System.out.println("Type an integer: ");
//            myarr1[j] = in.nextInt();
//        }
//
//        System.out.println("Second array");
//        for (int j = 0; j < 5; j++) {
//            System.out.println("Type an integer: ");
//            myarr2[j] = in.nextInt();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            if (myarr1[i] == myarr2[i]) x++;
//        }
//        if (x == 5) System.out.println("Arrays contain same items");

//        //E10
//            int[] myarr = new int[5];
//            int count = 0;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Type an integer: ");
//            myarr[i] = in.nextInt();
//        }
//
//        for (int i = 0; i < 4; i++) {
//            if((myarr[count])+1 == myarr[count+1]) {
//                count++;
//            }else {
//                System.out.println("Fail");
//                break;
//            }
//        }
//
//        if(count==4) System.out.println("Success");

    }
}
