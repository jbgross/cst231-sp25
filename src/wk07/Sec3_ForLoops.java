package wk07;

import java.util.Scanner;

public class Sec3_ForLoops {
    public static void main(String[] args) {
        int count = 0;
        int a = 0;
        while(++count <= 10 || a == 0) {
            a++; // int a = 0;
            System.out.print(count + " ");
        }
        System.out.println(a);
        System.out.println();

        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("done");

        Scanner s = new Scanner(System.in);
        int input = 0;
//        for(; input < 1; ) {
//            System.out.print("Enter a positive number: ");
//            input = s.nextInt();
//        }
        System.out.println("Your number was: " + input);

        int m = 3;
        for(int k = 0; k < 7; k++) {
            if(k % m == 0) {
                System.out.print("foo ");
            } else {
                System.out.print("bar ");
            }
        }
        System.out.println();

        for(int o = 0; o < 5; o++) {
            System.out.print(o + " ");
        }
        System.out.println();
        //System.out.println("the final value of o is " + o);
    }

}
