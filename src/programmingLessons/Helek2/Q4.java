package programmingLessons.Helek2;

public class Q4 {
    public static int test(int x, int y, double z){
        return 0;
    }

    public static void main(String[] args) {
        //FIRST
        int x=test(3,7,8.2); //no errors

        //SECOND
        int b = 1;
        int t = test(b, b, 2.5); //no errors

        //THIRD
//        int c = test(7.8); //missing first and second argument

        //FOURTH
//        int m = test(4, 6.25, 9); //second argument has to be integer, not double

        //FIFTH
        if(test(2,4,6.1)==1){ //no errors
            int k=7;
        }
    }
}
