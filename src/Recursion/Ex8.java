package Recursion;

public class Ex8 {
    public static int sumNums(int n) {
        //1234
        if (n <= 0) {
            return n;
        } else {
            return sumNums(n / 10) + n % 10;
        }
    }

    public static int sumEven(int n) {
        if (n <= 0) {
            if (n % 2 == 0) return n;
            else return 0;
        } else {
            if (n % 10 % 2 == 0) return sumEven(n / 10) + n % 10;
            else return sumEven(n / 10);
        }
    }

    public static int num13579(int n) {
        if (n <= 0) {
            if ((n % 10 % 2) != 0) return 1;
            return 0;
        } else {
            if (((n % 10) % 2) != 0) return num13579(n / 10) + 1;
            return num13579(n / 10);
        }
    }

    public static int nInNum(int a, int n){
        if(n <= 0){
            if(n==a) return 1;
            else return 0;
        } else{
            if(n%10==a) return nInNum(a, n/10) + 1;
            else return nInNum(a, n/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(num13579(1234));
        System.out.println(sumNums(1234));
        System.out.println(sumEven(2222));
        System.out.println(nInNum(3, 3332));
    }
}
