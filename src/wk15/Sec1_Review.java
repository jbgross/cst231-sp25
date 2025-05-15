package wk15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sec1_Review {
    public static void main(String[] args) throws IOException {
        printUserInput(new Scanner(System.in), "src/wk15/foo.txt");
        int [] a = new int[5];
        int x = 5;
        int y = 6;
        System.out.println(x);
        System.out.println(y);
        y = a(x);
        x = b(y);
        System.out.println(x);
        System.out.println(y);
        x = c(x);
        y = d(y);
        System.out.println(x);
        System.out.println(y);
        char c = 'c';
        c++;
        System.out.println(c);
    }

    public static void printUserInput(Scanner in, String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(fw);
        int input;
        do {
            System.out.print("Enter a number (or 0 to quit): ");
            input = in.nextInt();
            if(input != 0) {
                pw.println(input);
            }
        } while(input != 0);

        fw.close();
    }

    public static int a(int x) {
        return ++x;
    }

    public static int b(int y) {
        System.out.println(y++);
        return y;
    }

    public static int c(int x) {
        System.out.println(++x);
        return x--;
    }

    public static int d(int y) {
        return --y;
    }
}
