package wk01;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        int x = 5;
        System.out.println(x);
        x = 6;
        System.out.println(x);
        double y = 1005.01;
        System.out.println(x + y);
        System.out.println(x);
        System.out.println(y);
        x = x * x;
        System.out.println(x);
        double z = x + y;
        System.out.println(z);

        int a = 13;
        int b = 3;
        System.out.println(a/b);
        System.out.println(a%b);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = in.nextInt();
        System.out.println(input);
        System.out.print("Enter a decimal number: ");
        double decimalInput = in.nextDouble();
        System.out.println(decimalInput);

        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println("Hello, " + name);
    }
}
