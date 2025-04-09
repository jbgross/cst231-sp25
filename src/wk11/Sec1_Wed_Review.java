package wk11;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Sec1_Wed_Review {

    public static void main(String[] args) throws IOException {
        writeTenNumbers();
        int sum = sum("src/wk11/sec1_out.txt");
//        System.out.println(sum("src/wk11/sec1_out.txt"));
        System.out.println(sum);
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

    public static void writeTenNumbers() throws IOException {
        String filename = "src/wk11/sec1_out.txt";
        FileWriter fw = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(fw);
        pw.println();
        int max = 20;
        Random rand = new Random(-7);
        for(int i = 0; i < 10; i++) {
//            System.out.println(rand.nextInt());
//            pw.println(Math.abs(rand.nextInt()%max + 1));
            pw.println(Math.abs(rand.nextInt()%max) + 1);
        }

        fw.close();
    }
}
