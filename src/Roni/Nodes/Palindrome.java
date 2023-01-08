package Roni.Nodes;

public class Palindrome {
    public static boolean isPalindrome(Node<Character> L) {
        //Efficiency of function isPalindrome() is O(n^2), because linked list length can differ, and in the function
        //there is "while" cycle that depends on the length, with another while that depends on the length of the list


        int ch1, ch2;
        Node moreHalf = L;
        Node lessHalf = L;

        int length = 0;
        while (moreHalf != null) {
            length++;
            moreHalf = moreHalf.getNext();
        }

        moreHalf = L;

        int newLength = length / 2;
        if (length % 2 != 0) newLength++;

        // A B C C B A
        for (int i = 0; i < (length%2==0?newLength+1:newLength); i++) {
            moreHalf = moreHalf.getNext();
        }

        int anotherCount = 1;
        while (moreHalf != null) {
            int count = 1;
            while (count != newLength - anotherCount) {
                count++;
                lessHalf = lessHalf.getNext();
            }

            if (lessHalf.getValue() != moreHalf.getValue()) return false;

            lessHalf = L;
            anotherCount++;
            moreHalf = moreHalf.getNext();
        }
        return true;
    }
}
