package wk06;

import java.util.Random;
import java.util.Scanner;

public class Sec3_Programming_Practice {
    public static void main(String[] args) {
        // create a variable and store 2.5
        double u = 2.50;
        System.out.println(u);
        // double the value and assign back to same variable
        u = u * 2; // u *= 2;
        System.out.println(u);
        double square = Math.pow(u, 2); // there must be a method to do this, but  don't remember it
//        double v;
//        v = 5.2;
        System.out.print("Enter a whole number");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(input > 0) {
            System.out.println("positive");
//        } else if(0 > input) {
        } else if(input < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        // randomly generate 5 numbers between 5-100
        // count the number of odd numbers
        // sum all of the generated numbers
        Random rand = new Random();
        int countIterations = 0, sum = 0, countOdds = 0, maxIterations = 5;
        while(countIterations++ < maxIterations) {
            int generatedNumber = (Math.abs(rand.nextInt()) %96) + 5;
            if(generatedNumber % 2 != 0) {
                countOdds++;
            }
            sum = sum + generatedNumber;
//            countIterations++;
        }
        System.out.println("countIterations = " + countIterations);
        System.out.println("sum = " + sum);

    }
}
