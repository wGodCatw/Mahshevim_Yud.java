package Roni.Nodes;

public class main {
    public static void main(String[] args) {
        Node n5 = new Node(7);
        Node n4 = new Node(3, n5);
        Node n3 = new Node(5, n4);
        Node n2 = new Node(13, n3);
        Node n1 = new Node(8, n2);


    }
}
