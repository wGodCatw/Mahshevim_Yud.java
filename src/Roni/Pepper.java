package Roni;

public class Pepper {
    private String color;
    private double weight;
    private int pieces;

    public Pepper(String color, double weight, int pieces) {
        this.color = color;
        this.pieces = pieces;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getPieces() {
        return pieces;
    }

    public String getColor() {
        return color;
    }

    public void cutPiecesIn2() {
        pieces *= 2;
    }

    public void cutPiecesInN(int n) {
        pieces *= n;
    }
}
