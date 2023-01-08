package Roni;

public class Roza {
    public static double salary(int hours) {
        if (hours > 55) {
            return 2500;
        } else if (hours >= 24 && hours <= 55) {
            return 35.7 * hours;
        } else return 1000;
    }

    public static void main(String[] args) {

    }
}
