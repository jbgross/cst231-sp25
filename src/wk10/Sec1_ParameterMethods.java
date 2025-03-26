package wk10;

import java.util.Scanner;

public class Sec1_ParameterMethods {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = getPositiveInt(s);
        System.out.println(number);
//        System.out.println(getPositiveInt());

        int rangedNumber = getIntInRange(s, 5, 10);
        System.out.println(rangedNumber);
    }

    public static int getPositiveInt(Scanner s) {
//        Scanner in = new Scanner(System.in);
        int input;
        do {
            input = getInt(s, "Enter a positive integer: ");
//            System.out.print("Enter a positive integer: ");
//            input = in.nextInt();
        } while(input < 1);
        return input;
    }

    public static int getIntInRange(Scanner in, int lower, int upper) {
        String prompt = "Enter an int between " + lower + " and " + upper + ": ";
        int input;
        do {
            input = getInt(in, prompt);
        } while( ! (input >= lower && input <= upper));
        return input;

    }

    public static int getInt(Scanner in, String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }

    public static String repeat(int n) {
        String s = "" + n;
        String repeat = s;
        for(int i = 0; i < 4; i++) {
            repeat += s;
        }
        return repeat;
    }

}
