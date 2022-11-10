package Roni;

public class Pen {
    String color;
    String made;
    double price;
    double weight;

    public Pen(String made){
        this.made = made;
        this.color = "red";
        this.price = 10.0;
        this.weight = 25.0;
    }

    public Pen(String color, String made, double price, double weight) {
        this.color = color;
        this.made = made;
        this.price = price;
        this.weight = weight;
    }

    public String getMade() {
        return made;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isTheSameName(Pen other){
        return this.getMade().equals(other.getMade());
    }

    public boolean isTheSamePrice(Pen other){
        return this.getPrice() == other.getPrice();
    }
}
