package wk07;

import java.util.Scanner;

public class Sec1_ForLoops {
    public static void main(String[] args) {
        int count = 0;
//        int x = 0;
        while(++count <= 10 /* || x < 10 */) {
            // x = 0;
            System.out.print(count + " ");
        }
        System.out.println();
//        System.out.println("x is " + x);

        for(int i = 1;
                i <= 10;
                i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // System.out.print(i + " ");
        System.out.println("done");

        Scanner in = new Scanner(System.in);
        int input = 0;
        for( ; input < 1; ) {
            System.out.print("Enter a positive number: ");
            input = in.nextInt();
        }
        System.out.println("your number was: " + input);
        System.out.println("done");

//        count = 0;
//        int i = 0;
//        while (count++ < 2) {
//            i = 0;
//        }
//        System.out.println(i + " ");


        int k;
        int m = 3;
        for(k = 0; k < 7; k++) {
            // System.out.print(k + " ");
            if(k % m == 0) {
                System.out.println("xx ");
            } else {
                System.out.println("yy ");
            }
        }
        System.out.println();
        System.out.println("the final value of k is: " + k);
    }
}
