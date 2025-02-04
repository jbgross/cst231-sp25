package wk03;

import java.util.Scanner;

public class Sec3_Monday_Conditional {
    public static void main(String[] args) {
//        System.out.println(5/0);
        boolean b1 = true;
        boolean b2 = false;
//        b1 = false;
        int i1 = 5;
        double u1 = 7.0;
        String s = "true";
        if(i1 + u1 == 12) {
            System.out.println("this code ran");
            System.out.println("this code, too");
        }
        
        int secondsPerYear = 60 * 60 * 24 * 365;
        System.out.println("Seconds per year: " + secondsPerYear);
        int millisecondsPerYear = secondsPerYear * 1000;
        System.out.println("millisecondsPerYear = " + millisecondsPerYear);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = in.nextInt();
        if(inputNumber > 0) {
            System.out.println(inputNumber + " is positive");
        } else if(inputNumber == 0) {
            System.out.println(inputNumber + " is zero");
        }
//        else {
//            System.out.println(inputNumber + " is negative");
//        }
        System.out.println("done!");
    }
}
