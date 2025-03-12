package wk08;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sec1_Wed_ReadingWriting {
    public static void main(String[] args) throws IOException {
        String inputFile = "src/wk08/grault.txt";
        FileReader fr = new FileReader(inputFile);

        Scanner fs = new Scanner(fr);

//        System.out.println(fs.nextInt());
        int size = fs.nextInt();
        System.out.println(size);
        int i;
        for (i = 0; i < size && fs.hasNext(); i++) {
            System.out.println(fs.next());
        }
        fr.close();

        FileWriter fw = new FileWriter("src/wk08/out.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(i);

        fr = new FileReader(inputFile);
        fs = new Scanner(fr);

        fs.next();
        for(int k = 0; k < i; k++) {
            pw.println(fs.next());
        }

        fr.close();
        fw.close();
    }
}
