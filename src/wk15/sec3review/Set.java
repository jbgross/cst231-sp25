package wk15.sec3review;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Set {
    public static void main(String[] args) throws IOException {
        int [] setA = {1, 3, 5, 7, 9};
        int [] setB = {0, 3, 6, 9, 12};
        int [] setC = setUnion(setA, setB);
        print(setC);
        FileWriter fw = new FileWriter("wk15/sec3review/setOutput");
        PrintWriter pw = new PrintWriter(fw);
        for (int i = 0; i < setC.length; i++) {
            pw.print(setC[i] + " ");
        }
        pw.println();

        fw.close();
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean contains(int [] a, int searchValue, int max) {
        for (int i = 0; i < max && i < a.length; i++) {
            if(searchValue == a[i]) {
                return true;
            }
        }
        return false;
    }

    public static int [] setUnion(int [] a, int [] b) {
        int [] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        int elementsUsed = a.length;
        for (int i = 0; i < b.length; i++) {
            if(! contains(c, b[i], elementsUsed)) {
                c[elementsUsed++] = b[i];
            }
        }
        return c;
    }
}
