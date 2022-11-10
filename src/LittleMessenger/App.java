package LittleMessenger;

public class App {
    public static void main(String[] args) {
        Client c1 = new Client("Dave");
        Client c2 = new Client("Barbara");

        c1.addMessage(c1, "Hello");
        System.out.println(c2.getMessage());
        c2.addMessage(c2, "Shalom");
        System.out.println(c1.getMessage());
    }
}
