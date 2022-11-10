package Roni.Nodes;

public class Sheela {
    public static int countNodes(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.getNext();
        }
        return count;
    }

    public static boolean isEven(Node head){
        while(head!=null){
            if(head.getValue()%2!=0) return false;
            head = head.getNext();
        }
        return true;
    }
}
