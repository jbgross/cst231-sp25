package wk06;

import java.util.Random;
import java.util.Scanner;

public class Sec1_Programming_Practice {
    public static void main(String[] args) {
        // Part 1
        double x = 2.50;
        System.out.println(x);
        x = x * 2;
        System.out.println(x);
//        double square = // call some method to square the value of x
        double square = Math.pow(x, 2);
        System.out.println(square);

        // prompt the user for a whole number
        // store the user's input in a variable
        // tell the user if the number is positive, negative, or zero
        System.out.print("Enter a whole number: ");
        int number;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        // a <> b
        if(number > 0) {
            System.out.println("positive");
        } else if(number < 0) {
            System.out.println("negative");
        } else if(number == 0) {
            System.out.println("zero");
        }

//        if(! (number == 5)) {}
//        if(number != 5) {}

        // randomly generate and print out five numbers
        // between 5 and 100
        // don't print the numbers
        // after the loop, print the sum of all of the numbers
        // and the count of odd numbers

        int sum = 0;
        int iterationCount = 0, oddCount = 0;
        int maxIteration = 5;
        Random r = new Random();
        while(iterationCount++ < maxIteration) {
            int randomNumber = (Math.abs(r.nextInt()) % 96) + 5;
            if(randomNumber % 2 == 1) {
                oddCount++;
            }
            sum += randomNumber;
        }
        System.out.println("Count of odd number: " + oddCount);
        System.out.println("Sum: " + sum);







    }
}
