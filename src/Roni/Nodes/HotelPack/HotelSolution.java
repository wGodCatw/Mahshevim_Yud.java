package Roni.Nodes.HotelPack;

import java.util.Arrays;

public class HotelSolution {
    public static int hotelCheck(Hotel[] arr) {
        int[] ratings = new int[4];
        for (int i = 0; i < arr.length; i++) {
            ratings[arr[i].rating]++;
        }

        for (int i = 0; i < ratings.length; i++) {
            System.out.println("Rating " + i + 2 + ": " + ratings[i]);
        }
        Arrays.sort(ratings);

        return ratings[ratings.length - 1] + 2; // +2 because in arr counting starts from 0, and ratings start from 2
    }

    public static void hotelChange(Hotel[] arr, String name, int rating) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(name)) arr[i].setRating(rating);
        }
    }

}
