package wk11;

import java.util.Scanner;

public class Sec1_Mon_Arrays {
    public static void main(String[] args) {
        int [] a = new int[5];
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        a[2] = 20;

//        System.out.println(a[0]);
        print(a);
//        for(int i = 0; i < a.length; i++) {
//            System.out.println(i + ": " + a[i]);
//        }

        Scanner in = new Scanner(System.in);
        System.out.print("How many elements? ");
        int size = in.nextInt();
        int [] data = new int[size];
        for(int i = 0; i < data.length; i++) {
            System.out.print("Enter value for element " + i + ": ");
            int temp = in.nextInt();
            data[i] = temp;
        }

        print(data);
        double [] doubleData = new double[5];
//        print(doubleData);
//        for(int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
    }

    public static void print(int [] quux) {
        for(int i = 0; i < quux.length; i++) {
            System.out.println(i + ": " + quux[i]);
        }
    }
}
