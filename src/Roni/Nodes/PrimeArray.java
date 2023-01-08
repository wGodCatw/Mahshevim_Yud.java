package Roni.Nodes;

public class PrimeArray {
    public static boolean isPrimeArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = arr[0].length - 1; j < arr[0].length / 2 && k > (arr[0].length / 2) - 1; j++, k--) {
                if (!isPrimeNumber(arr[i][j] + arr[i][k])) return false;
            }
        }
        return true;
    }


    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
