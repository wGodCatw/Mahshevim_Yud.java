package Recursion;

public class Ex1 {
    static void recurs(int n){
        if(n>22);
        else {
            System.out.println(n);
            recurs(n+3);

        }

    }

    static void recurs2(int n){
        if(n>4);
        else{
            System.out.print(n*10 + " ");
            recurs2(n+1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        recurs2(1);
    }
}
