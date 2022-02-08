package programmingLessons.Helek2;

public class Q1 {
    static int check(int a, int b){
        if(b-a>5)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        int x = check(6,2);
        System.out.println(x); //OUTPUT: 0

//        int a = 2;
//        int b = 8;
//        System.out.println(check); //OUTPUT: java: cannot find symbol

        
        int m = 7;
        for (int i = 1; i < 4; i++) {
            System.out.println(check(i,m)); //OUTPUT: 1 0 0
        }

    }
}
