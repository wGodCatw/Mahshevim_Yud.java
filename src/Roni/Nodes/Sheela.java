package Roni.Nodes;

public class Sheela {
    public static boolean countNodes(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.getNext();
        }
        return count%2==0;
    }

//    public static boolean isEven(Node head) {
//        while (head != null) {
//            if (head.getValue() % 2 != 0) return false;
//            head = head.getNext();
//        }
//        return true;
//    }

//    public static boolean isEvenTwice(Node head) {
//        if (isEven(head) && countNodes(head)) return true;
//        return false;
//    }
}
