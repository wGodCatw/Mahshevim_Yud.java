package IntroToProgramming.P1;

import java.util.Scanner;

public class P1_E3 {
    public static void main(String[] args) {
        double furniture;
        int floor;
        double distance;
        double weight;
        double price;

        Scanner in = new Scanner(System.in);

        System.out.println("Type the price of furniture(shekels): ");
        furniture = in.nextDouble();
        System.out.println("Type your floor: ");
        floor = in.nextInt();
        System.out.println("Type how far you live from our office(km): ");
        distance = in.nextDouble();
        System.out.println("Enter the weight of your furniture(kg): ");
        weight = in.nextDouble();

        price = furniture + (floor * weight) + distance * 5 + furniture * 0.1;
        System.out.println("Full price is: " + price);
    }
}
