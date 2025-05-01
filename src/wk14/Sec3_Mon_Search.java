package wk14;

import java.util.Random;
import java.util.Scanner;

public class Sec3_Mon_Search {

    public static void main(String[] args) {
        int [] data = generateArray(10, new Random(-7));
        print(data);
        testContains(data);
    }

    public static void testContains(int [] data) {
        Scanner in = new Scanner(System.in);
        int input;
        do {
            System.out.print("Enter a number (or 0 to stop): ");
            input = in.nextInt();
            System.out.println("Is " + input + " in the array? " + contains(data, input));
        } while(input != 0);
    }

    public static void print(int [] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int [] generateArray(int size, Random rand) {
        int max = 20;
        int [] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(-max, max);
        }
        return data;
    }

    public static boolean contains(int [] data, int searchValue) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == searchValue) {
               return true;
            }
//            else {
//                return false;
//            }
        }
        return false;
    }
}
