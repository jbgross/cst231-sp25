package wk06;

import java.util.Scanner;

public class Sec3_Exam1Review {
    public static void main(String[] args) {
        int doWhileLoopCounter = 0;
        int whileLoopCounter = 0;
        int maxReps = 5; // switch to zero to see while and do-while difference
        while(whileLoopCounter < maxReps) {
            System.out.print(whileLoopCounter + " ");
            whileLoopCounter++;
        }
        System.out.println();

        do {
            System.out.print(doWhileLoopCounter + " ");
            doWhileLoopCounter++;
        } while(doWhileLoopCounter < maxReps);
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a negative number: ");
        int input = s.nextInt();
        while(input >= 0) {
            System.out.print("Enter a negative number: ");
            input = s.nextInt();
        }
        System.out.println("Your negative number is " + input);

        int input2;
        do {
            System.out.print("Enter a negative number: ");
            input2 = s.nextInt();
        } while(input2 >= 0);
        System.out.println("Your negative number is " + input2);

    }
}
