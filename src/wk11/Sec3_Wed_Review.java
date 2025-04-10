package wk11;

import org.w3c.dom.ls.LSOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Sec3_Wed_Review {
    public static void main(String[] args) throws IOException {
        String filename = "src/wk11/sec3_out.txt";
        writeFile();
        int sum = sum(filename);
//        System.out.println("sum: " + sum(filename));
        System.out.println("sum: " + sum);

        Random r1 = new Random(-7);
        Random r2 = new Random(-7);
        Random r3 = new Random(-8);
        printThrrrRandomNumbers(r1);
        printThrrrRandomNumbers(r2);
        printThrrrRandomNumbers(r2);
        printThrrrRandomNumbers(r3);

    }

    public static int sum(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        int sum = 0;
        while(fs.hasNextInt()) {
            sum += fs.nextInt();
        }
        fr.close();
        return sum;
    }

    public static void writeFile() throws IOException {
        String filename = "src/wk11/sec3_out.txt";
        FileWriter fw = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(fw);
        pw.println();
        int max = 20;
         Random rand = new Random(-7);
        for(int i = 0; i < 100; i++) {
            pw.println(Math.abs(rand.nextInt()%max) + 1);
        }
//        System.out.println(5 - 2);

        fw.close();
    }

    public static void printThrrrRandomNumbers(Random r) {
        for(int i = 0; i < 3; i++) {
            System.out.print(r.nextInt() + " ");
        }
        System.out.println();
    }
}
