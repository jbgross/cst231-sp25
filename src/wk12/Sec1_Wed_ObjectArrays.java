package wk12;

import java.util.Scanner;

public class Sec1_Wed_ObjectArrays {

    public static void main(String[] args) {
//        sum(int [] a = {1, 2, 3, 4});
        int [] array = {5, 10, 15, 20, 25};
        int x = sum(array) + 5;
        double u = sum(new double[]{5.0, 10.0});
        System.out.println(x);
        foo(5);
        foo(5.0);
        Scanner in = new Scanner(System.in);
        String [] names = new String[4];
        for(int i = 0; i < names.length; i++) {
            System.out.print("Enter a name: ");
            String name = in.next();
            names[i] = name;
        }
        System.out.println("total characters: " + getCharacterCount(names));

    }

    public static int getCharacterCount(String [] s) {
        int characterCount = 0;
        for(int i = 0; i < s.length; i++) {
            characterCount += s[i].length();
        }

        return characterCount;
    }

    public static void foo(double u) {
        System.out.println("foo!" + u);
    }

    public static void foo(int x) {

    }

    public static void foo(String s) {

    }

//    public static void foo(String y) {
//
//    }

    public static double sum(double [] a) {
        double sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static int sum(int [] a) {
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
