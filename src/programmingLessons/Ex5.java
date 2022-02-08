package programmingLessons;

import java.util.Scanner;

public class Ex5 {
    static int win_height = 0, win_hooks = 0, height, hooks;
    static Scanner input = new Scanner(System.in);

    static void ask() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Please enter the height that you reached and the amount of hooks that you used ");
            height = input.nextInt();
            hooks = input.nextInt();
            compare();
        }

    }

    static void compare() {
        if (height > win_height) {
            win_height = height;
            win_hooks = hooks;
        } else if (win_height == height) {
            if (win_hooks > hooks)
                win_hooks = hooks;
        }

    }

    public static void main(String[] args) {
        ask();
        System.out.println("The winner reached the height of " + win_height + " meters and used " + win_hooks + " hooks");

    }


}
