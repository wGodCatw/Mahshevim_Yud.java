package Roni.Nodes;

public class Sublist {
    public static boolean isSublist(Node<Character> L1, Node<Character> L2) {
        Node temp1 = L1;
        Node temp2 = L2;
        int length2 = 0;
        while (temp2 != null) {
            length2++;
            temp2 = temp2.getNext();
        }
        temp2 = L2;
        int count = 0;
        while (temp2 != null) {
            while (temp1 != null) {
                if (temp1.getValue().equals(temp2.getValue())) {
                    count++;
                    break;
                }
                temp1 = temp1.getNext();
            }
            temp2 = temp2.getNext();
        }

        return count == length2;
    }
}
