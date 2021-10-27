package IntroToProgramming.P1;

import java.util.Scanner;

public class P1_E2 {
    public static void main(String[] args) {
        int[] toppings = new int[3];
        int top;
        int n = 0;
        int price = 12;
        Scanner in = new Scanner(System.in);

        System.out.println("1. Olives. 2. Pepper. 3.Yellow cheese. 4. Parmesan. 5. Mushrooms");
        System.out.println("Choose number of topping. Type 0 to skip topping. Max 3 toppings: ");

        while (n < 3) {
            top = in.nextInt();
            toppings[n] = top;
            n++;
        }


        for (int x = 0; x < 3; x++) {
            if (toppings[x] > 3 & toppings[x] <= 5) {
                price += 3;
            } else if (toppings[x] < 1 || toppings[x] > 5) {
                price += 0;
            } else {
                price += 2;
            }
        }
        System.out.print("Toast with ");
        for (int x = 0; x < 3; x++) {
            if (toppings[x] == 1) {
                System.out.print("olives, ");
            } else if (toppings[x] == 2) {
                System.out.print("pepper, ");
            } else if (toppings[x] == 3) {
                System.out.print("yellow cheese, ");
            } else if (toppings[x] == 4) {
                System.out.print("parmesan, ");
            } else if (toppings[x] == 5) {
                System.out.print("mushrooms, ");
            } else System.out.print("ERROR ");
        }
        System.out.print("price is " + price + " shekels");
    }
}