package IntroToProgramming.P2;

import java.util.Scanner;

public class P2_EA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //E1
//        System.out.println("How old are you?: ");
//        int age = in.nextInt();
//        if(age < 18){
//            System.out.println("You are minor");
//        }else System.out.println("You are adult");

        //E2
//        System.out.println("How old are you?: ");
//        int age = in.nextInt();
//        if(age < 18) {
//            System.out.println("You are minor");
//        }else if (age < 65) {
//            System.out.println("You are adult");
//        }else System.out.println("You are retiree");

        //E3
//        System.out.println("Type two-digit number: ");
//        int num = in.nextInt();
//        if (num % 11 == 0) System.out.println("In number " + num + ", two digits match");
//        else System.out.println("There are no matching numbers");

        //E4
//        System.out.println("Type three-digit number: ");
//        int num = in.nextInt();
//        if (num % 111 == 0) System.out.println("In number " + num + ", three digits match");
//        else System.out.println("There are no matching numbers");

        //E5
//        System.out.println("Type two-digit number: ");
//        int num1 = in.nextInt();
//        int num2 = num1%10;
//        num1 = (num1-num2)/10;
//        if ((num2-num1) == 1){
//            System.out.println("Digits follow each other");
//        }else System.out.println("Digits don't follow each other");

        //E6
//        System.out.println("Type three-digit number: ");
//        int num = in.nextInt();
//        int num2 = ((num%100)-(num%100%10))/10;
//        int num3 = num%10;
//        int num1 = (num-num3-num2)/100;
//        if ((num3-num2) == 1 & (num2-num1 ==1)){
//            System.out.println("Digits follow each other");
//        }else System.out.println("Digits don't follow each other");

        //E7
//        System.out.println("What the volume of your fuel tank?: ");
//        double volume = in.nextDouble();
//        System.out.println("How much fuel do you have now in your tank?: ");
//        double fuel = in.nextDouble();
//        if ((volume/100*15)>=fuel) System.out.println("You have to fo to the gas station!");
//        else System.out.println("You have enough fuel. Have a good trip!");

        //E8
//        System.out.println("How long, do you think, will it take you to run the distance? (minutes)");
//        int ans = in.nextInt();
//        if(ans<50){
//            System.out.println("You belong to the group A");
//        }else if(ans >= 50 & ans <= 60){
//            System.out.println("You belong to the group B");
//        }else
//            System.out.println("You belong to the group C");

        //E9
//        System.out.println("Type in the date in 8-digit format");
//        int date = in.nextInt();
//        int day = (date-(date%1000000))/1000000;
//        int month = date%1000000/10000-date%1000000/10000%1;
//        int year = date%10000;
//
//        System.out.println("The year is: " + year + ". The month is: " + month + ". The day is: " + day);

        //E10
        //same as E9???

        //E11
//        System.out.println("Type in the date in 8-digit format");
//        int date = in.nextInt();
//        int month = date%1000000/10000;
//        if ((month>0 & month < 3) | month == 12){
//            System.out.println("Season is winter");
//        }else if (month > 2 & month < 6){
//            System.out.println("Season is spring");
//        }else if (month > 5 & month < 9){
//            System.out.println("Season is summer");
//        }else if (month > 8 & month < 12){
//            System.out.println("Season is automn");
//        }else System.out.println("Error, try again");
    }
}
