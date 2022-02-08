package programmingLessons;

import java.util.Scanner;

public class Ex3 {
    static int count = 0;
    static int guess(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int res = (int)(Math.random()*99)+1;
            for (int j = 0; j < 2; j++) {
                int guess = in.nextInt();
                if(((res-5)<=guess && guess<=res)||(guess>=res && guess<=(res+5))) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(guess());

    }
}
