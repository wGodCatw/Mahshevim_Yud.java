package Roni.Nodes;

public class Couple {
    private int digit;

    private int appears;

    public Couple(int digit, int appears) {
        this.digit = digit;
        this.appears = appears;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public int getAppears() {
        return appears;
    }

    public void setAppears(int appears) {
        this.appears = appears;
    }

    public static int addDigit(int num, int digit) {
        return num * 10 + digit;
    }

    public static int numberOfDigits(int digits, Node<Couple> L) {
        int num = 0;
        Node<Couple> first = L;
        //4,10  7,2 1,23 9,3 5,12
        //digits = 6
        int[] arr = new int[10];
        while (first != null) {
            arr[first.getValue().digit] += first.getValue().appears;
            first = first.getNext();
        }

        first = L;

        int count = 0;
        for (int j = 9; j > 0; j--) {
            while (arr[j] != 0) {
                if (count == 6) {
                    while (first != null) {
                        first.getValue().setAppears(arr[first.getValue().digit]);
                        System.out.println(first.getValue().digit + ": " + arr[first.getValue().digit]);
                        first = first.getNext();
                    }
                    return num;
                }
                num = addDigit(num, j);
                arr[j]--;

                count++;
            }
            System.out.println(num);
        }


        return num;
    }
}
