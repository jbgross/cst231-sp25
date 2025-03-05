package wk07;

import com.sun.security.jgss.GSSUtil;

public class Sec1_NestedLoops {
    public static void main(String[] args) {
//        System.out.println("* * * * * ");
//        int count = 0;
        int size = 5;
//        while(count++ < size) {
//            System.out.print("* ");
//        }
//        System.out.println();

        int cols, rows = 0;
        while(rows < size) {
            cols = 0;
            rows++;
            while(cols < size) {
                System.out.print("* ");
                cols++;
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

        int width = 3, height = 5;
        for(int row = 0; row < height; row++) {
            for(int col = 0; col < width; col++) {
                System.out.print("X ");
            }
            System.out.println();
        }


        System.out.println();

        for(int row = 0; row < size; row++) {
            for(int col = 0; col <= row; col++) {
//            for(int col = 0; col < row + 1; col++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
