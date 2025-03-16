package wk08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Sec3_Monday_FileReading {
    public static void main(String[] args) throws IOException {
//        FileReader fr =
//        new FileReader("C:/Users/Otter/IdeaProjects/cst231-sp25/src/wk08/quux.txt");
        FileReader fr = new FileReader("src/wk08/quux.txt");
        Scanner fs = new Scanner(fr);
//        int i1 = fs.nextInt();
//        System.out.println(i1);

        while(fs.hasNextInt()) {
            int i1 = fs.nextInt();
            System.out.println(i1);
        }


        fr.close();

        fr = new FileReader("src/wk08/grault.txt");
        fs = new Scanner(fr);

        int size = fs.nextInt();
        for(int i = 0; i < size && fs.hasNext(); i++) {
            String s = fs.next();
            System.out.print(s + " ");
        }
        System.out.println();

        fr.close();
    }
}
