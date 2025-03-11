package wk07;

public class Sec3_NestedLoops {
    public static void main(String[] args) {
        System.out.println("* * * * * ");
        int count = 5;
        while(count > 0) {
            System.out.print("* ");
            count--;
        }
        System.out.println();
        System.out.println();

        int size = 5;
        int r = 0, c;
        while(r < size) {
            r++;
            c = 0;
            while(c < size) {
                System.out.print("* ");
                c++;
            }
            System.out.println();
        }
        System.out.println();

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for(int row = 0; row < size; row++) {
//            for(int col = 0; col <= row; col++) {
            for(int col = 0; col < row + 1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
