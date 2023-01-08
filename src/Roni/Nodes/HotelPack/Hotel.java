package Roni.Nodes.HotelPack;

public class Hotel {
    String name;
    String city;
    int rating;

    public Hotel(String name, String city, int rating) {
        this.name = name;
        this.city = city;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
