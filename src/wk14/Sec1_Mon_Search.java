package wk14;

import java.util.Random;
import java.util.Scanner;

public class Sec1_Mon_Search {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random(-7);
        int [] data = generateArray(10, rand);
        int input;
        do {
            print(data);
            input = getUserInput(in);
            System.out.println(contains(data, input));
        } while(input >= -20 && input <= 20);
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

    public static int getUserInput(Scanner in) {
        System.out.print("Enter a number: ");
        return in.nextInt();
    }

    public static int [] generateArray(int size, Random rand) {
        int max = 20;
        int [] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(-max, max);
        }
        return data;
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


}
