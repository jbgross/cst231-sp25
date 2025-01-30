package wk02;

import java.util.Random;

public class FooBar {
    public static void main(String[] args) {
        int x = 4;
        int y = x * 2;
        y = y * 2;
        y *= 2;
//        x * 2;
        // metasyntactic names
        int foo = 5;
        int bar = 10;
        double grault = 0.05;
        String message = "this is a message of some sort";
        boolean quux = true;
//        int bigNumber = 4000000000;
        String baz = "10";
        int bah = 10;
        quux = false;
        String requestNumber = "Enter a number: ";
//        System.out.print(requestNumber);

        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt());
        System.out.println(r.nextInt());
    }
}
