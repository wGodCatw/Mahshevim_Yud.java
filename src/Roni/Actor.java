package Roni;

import java.util.Scanner;

public class Actor {
    String id;
    String gender;
    int numFilms;

    public Actor(String id, String gender, int numFilms) {
        Scanner in = new Scanner(System.in);
        this.id = id;
        this.gender = gender;
        this.numFilms = numFilms;
    }

    public void addFilm() {
        numFilms++;
    }

    public int compare(Actor other) {
        if (numFilms > other.numFilms) return 1;
        else if (numFilms < other.numFilms) return 2;
        else return 3;
    }
}
