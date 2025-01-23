package wk01;

import java.util.Scanner;

public class Hello_Sec3 {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        int x = 5;
        System.out.println(x);
        x = 6;
        System.out.println(x);
//        x = 6.0;
        double y = 1006.5;
//        x + y;
        System.out.println(x + y);
        double z = x + (y * x);
        System.out.println(z);
        int a = 13;
        int b = 4;
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(1.0*a/b);
        double u = a/b;
        System.out.println(u);
        System.out.println(1/3.0);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int whole = in.nextInt();
        System.out.println(whole);
        System.out.print("Enter a decimal number: ");
        double decimal = in.nextDouble();
        System.out.println(decimal);
        String className = "CST231";
        String message = "Hello, ";
        System.out.print("What is your name? ");
        String name = in.next();
        System.out.println(message + name);
    }
}
