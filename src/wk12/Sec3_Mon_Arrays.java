package wk12;

import java.util.Scanner;

public class Sec3_Mon_Arrays {
    public static void main(String[] args) {
        int v1 = 0;
        setX(v1);
        System.out.println("v1 = " + v1);
//        int [] a = 3;
        int max = 5;
        int [] a = new int[max];
//        int [] b = new int[6];
        int [] b = {5, 10, 15, 20, 25};
        System.out.println(a);
//        for(int i = 0; i < a.length; i++) {
//        for(int i = 0; i < b.length && i < a.length; i++) {
        for(int i = 0; i < Math.min(a.length, b.length); i++) {
            System.out.print(a[i] + " ");
            System.out.print(b[i] + " ");
        }
        System.out.println();

        int [] data = new int[5];
        loadArray(data);
        print(data);

        String [] names = new String[5];
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }

    public static void setX(int x) {
        x = 5;
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
