package wk08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Sec1_Monday_Reading {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/wk08/foo.txt");
        Scanner fs = new Scanner(fr);
//        System.out.println(fs.nextInt());
//        System.out.println(fs.nextInt());
//        System.out.println(fs.nextInt());

        while(fs.hasNext()) {
            String x = fs.next();
            System.out.println(x);
        }

        fr.close();

        fr = new FileReader("src/wk08/bar.txt");
        fs = new Scanner(fr);
        int size = fs.nextInt();
        for(int i = 0; i < size; i++) {
            System.out.println(fs.next());
        }

        fr.close();
    }
}
