package wk10;

import java.util.Scanner;

public class Sec3_ParameterizedMethods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = getPositiveInteger(s);
        System.out.println(number);
        int rangeNumber = getNumberInRange(s, 6, (int) 12.0);
        System.out.println(rangeNumber);
    }

    public static int getNumberInRange(Scanner in, int lowerBound, int upperBound) {
        String prompt = "Enter a number between " + lowerBound + " and " + upperBound + ": ";
        int input;
        do {
//            System.out.print(prompt);
//            input = in.nextInt();
            input = getInteger(prompt, in);
        } while(! (input >= lowerBound && input <= upperBound ));
        return input;
    }

    // method definition
    public static int getPositiveInteger(Scanner josh) {
//        return 0;
//        Scanner in = new Scanner(System.in);
        int input;
        do {
//            System.out.print("Enter a positive number: ");
//            input = in.nextInt();
            input = getInteger("Enter a positive number: ", josh);
        } while(input < 1);
        return input;
    }

    public static int getInteger(String prompt, Scanner in) {
        System.out.print(prompt);
        return in.nextInt();
    }
}
