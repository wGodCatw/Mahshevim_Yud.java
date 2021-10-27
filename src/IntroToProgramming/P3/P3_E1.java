package IntroToProgramming.P3;

import java.util.Scanner;

public class P3_E1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //E1
//        double price, salary, expenses, profit;
//
//        System.out.println("How much does motorcycle cost?: ");
//        price = in.nextDouble();
//        System.out.println("What is your salary?(per month): ");
//        salary = in.nextDouble();
//        System.out.println("How much do you spend every month?: ");
//        expenses = in.nextDouble();
//
//        profit = salary - expenses;
//        System.out.println("You can buy motorcycle in " + price / profit + " months");

        //E2
//        double a, b;
//        System.out.println("Equation: ax+b=0");
//        System.out.println("Type A: ");
//        a = in.nextDouble();
//        System.out.println("Type B: ");
//        b = in.nextDouble();
//        System.out.println("X: " + -b / a);

        //E3
//        int check = 0;
//        String ans;
//        System.out.println("Marriage check");
//        System.out.println("Are you close friends either with groom or bride?(Yes/No)");
//        ans = in.next();
//        if (Objects.equals(ans, "yes") || Objects.equals(ans, "Yes")) check += 500;
//
//        System.out.println("Are you family member of groom or bride?(Yes/No)");
//        ans = in.next();
//        if (Objects.equals(ans, "yes") || Objects.equals(ans, "Yes")) check += 1000;
//        else check += 250;
//
//        System.out.println("Do you know groom or bride more than 3 years?(Yes/No)");
//        ans = in.next();
//        if (Objects.equals(ans, "yes") || Objects.equals(ans, "Yes")) check += 50;
//
//        System.out.println("Do you need more than hour to come to the marriage?(Yes/No)");
//        ans = in.next();
//        if (Objects.equals(ans, "yes") || Objects.equals(ans, "Yes")) check -= 50;
//
//        System.out.println("Your marriage check: " + check);
        //E4
//        int availableBooks;
//        String ans;
//        System.out.println("Are you adult?(yes/no): ");
//        ans = in.next();
//
//        if (Objects.equals(ans, "yes") || Objects.equals(ans, "Yes")) availableBooks = 5;
//        else availableBooks = 3;
//
//        System.out.println("Do you have books at home? ");
//        ans = in.next();
//        if (Objects.equals(ans, "yes") || Objects.equals(ans, "Yes")) {
//            System.out.println("Do you keep them more than one month? ");
//            ans = in.next();
//            if (Objects.equals(ans, "yes") || Objects.equals(ans, "Yes")) availableBooks = 0;
//        }
//        System.out.println("You can borrow " + availableBooks + " now");

        //E5
//        int psycho, bagrut, english, math;
//        System.out.println("What's your psychometric mark?: ");
//        psycho = in.nextInt();
//        System.out.println("What's your bagrut mark?: ");
//        bagrut = in.nextInt();
//
//        if (bagrut >= 102) {
//            System.out.println("You are welcome to our university!(1)");
//        } else if (psycho >= 700) {
//            System.out.println("What's your math mark?: ");
//            math = in.nextInt();
//            System.out.println("What's your English mark?: ");
//            english = in.nextInt();
//            if (math >= 145 && english >= 120) System.out.println("You are welcome to our university!(2)");
//        } else if ((psycho * 0.8) + (bagrut / 1.2) >= 600) System.out.println("You are welcome to our university!(3)");
//        else System.out.println("Sorry, try next time(((");

        //E6
//        int pulse;
//
//        System.out.println("What is your resting pulse?: ");
//        pulse = in.nextInt();
//
//        System.out.println("Week 1-2: 3km");
//
//        if (pulse < 70)
//            System.out.println("Week 3-4: 5km");
//        else System.out.println("Week 3-4: 3km");
//
//        if (pulse < 60) {
//            System.out.println("Week 5 and after: 10km");
//        } else if (pulse < 70) {
//            System.out.println("Week 5 and after: 8km");
//        } else System.out.println("Week 5 and after: 3km");
    }
}
