package wk12;
import java.util.Scanner;
public class Sec3_Wed_ObjectArrays {
    public static void main(String[] args) {
        int [] data = {5, 10, 15, 20, 25, 0};
        double avg = average(data);
        System.out.println("the average is " + avg);
        int x = 17;
        int y = x;
        // int, double, boolean, long, char, float, short, byte
        // String, Scanner, Random, FileReader, FileWriter, PrintWriter
        Scanner in = new Scanner(System.in);
        String [] names = new String[4];
        for(int i = 0; i < names.length; i++) {
            System.out.print("Enter a name: ");
            String name = in.next();
            names[i] = name;
            System.out.println("name " + name + " has a length of "
                    + name.length() + " characters");
        }
        System.out.println("the total character in those names is "
        + getCharacterCount(names));
//        int [] smallArray = new int[1];
//        smallArray[0] = 5;
//        System.out.println(smallArray[0]);
//        bar(smallArray);
//        System.out.println(smallArray[0]);
//        foo();
    }

    public static int getCharacterCount(String [] s) {
        int characterCount = 0;
        for(int i = 0; i < s.length; i++) {
            characterCount += s[i].length();
        }
        return characterCount;
    }

    public static double average(int [] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (sum * 1.0)/a.length;
    }



    public static void bar(int [] x) {
//        x = new int[1];
        x[0] = 7;
    }

    public static void foo() {
        System.out.println("Called foo!");
    }
}
