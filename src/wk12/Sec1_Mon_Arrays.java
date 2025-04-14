package wk12;

import java.util.Scanner;

public class Sec1_Mon_Arrays {
    public static void main(String[] args) {
        int max = 5;
        int v1 = 0;
        System.out.println("value of v1: " + v1);
        set(v1);
        System.out.println("value of v1: " + v1);

        int [] v2 = {0};
        System.out.println("v2 at index 0: " +v2[0]);
        set(v2);
        System.out.println("v2 at index 0: " +v2[0]);

        int [] array1 = new int[max];
        loadArray(array1);
        print(array1);
//        int [] array2 = {0, 5, 10, 15, 20, 25};
//        System.out.println(array1);
//        for(int i = 0; i < array1.length && i < array2.length; i++) {
//        for(int i = 0; i < max; i++) {
//        for(int i = 0; i < Math.min(array1.length, array2.length); i++) {            System.out.print(array1[i] + " ");
//            System.out.print(array2[i] + " ");
//        }
//        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);
//        System.out.println(array1[3]);
//        System.out.println(array1[4]);
    }

    public static void set(int x) {
        x = 5;
        System.out.println("in the set method, x = " + x);
    }

    public static void set(int [] x) {
        x[0] = 5;
    }

    public static void print(int [] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void loadArray(int [] a) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            a[i] = in.nextInt();
        }
    }
}
