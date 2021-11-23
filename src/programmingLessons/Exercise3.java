package programmingLessons;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the price?: ");
        double sell_price = in.nextInt();
        System.out.println("How many kgs?: ");
        int sell_kgs = in.nextInt();
        System.out.println("How many kgs you wanna buy?: ");
        int buy_kgs = in.nextInt();
        double buy_price = sell_price*1.15;

        System.out.println("Final price: " + buy_kgs*buy_price);
        System.out.println("Kgs left: " + (sell_kgs-buy_kgs));
    }
}
