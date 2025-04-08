package wk11;

import java.util.Scanner;

public class Sec3_Mon_Arrays {
    public static void main(String[] args) {
        int size = 5;
        int [] a = new int[size];
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        a[2] = 20;
        System.out.println(a[4]);
        System.out.println(a.length);
        print(a);
//        for(int i = 0; i < a.length; i++) {
//            System.out.println(i + ": " + a[i]);
//        }

        Scanner in = new Scanner(System.in);
        System.out.print("How many elements? ");
        int count = in.nextInt();
        int [] data = new int[count];
        for(int i = 0; i < data.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            int temp = in.nextInt();
            data[i] = temp;
        }
        print(data);
        int value = foo();
        System.out.println(value );
//        System.out.println(foo());
//        for(int i = 0; i < data.length; i++) {
//            System.out.println(i + ": " + data[i]);
//        }
//        System.out.println("the value at index 5 is " + a[5]);
    }

    public static void print(int [] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(i + ": " + a[i]);
        }
    }

    public static int foo() {
        return 17;
    }
}
