package wk08;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sec3_Wed_FileIO {
    public static void main(String[] args) throws IOException  {
        String filename = "src/wk08/grault.txt";
        FileReader fr = new FileReader(filename);

//        Scanner fs = new Scanner(System.in);
        Scanner fs = new Scanner(fr);
//        System.out.println(fs.next());

        int size = fs.nextInt();

        int i;
        for(i = 0; i < size && fs.hasNext(); i++) {
            System.out.println(fs.next());
        }

        fr.close();

        FileWriter fw = new FileWriter("src/wk08/baz.txt");
        PrintWriter pw = new PrintWriter(fw);
//        pw.println("hello");
        pw.println(i);

        fr = new FileReader(filename);
        fs = new Scanner(fr);
        fs.next();

        for(int k = 0;
            k < i;
            k++) {
            pw.println(fs.next());
        }

        fr.close();
        fw.close();
    }
}
