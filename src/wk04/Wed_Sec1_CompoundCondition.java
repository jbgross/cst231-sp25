package wk04;

import java.util.Scanner;

public class Wed_Sec1_CompoundCondition {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and "
            + max + ": ");
        int input = in.nextInt();
        while(! (input > 0 && input < 11)) {
            System.out.print("Enter a number between " + min + " and "
                    + max + ": ");
            input = in.nextInt();
        }

        System.out.println("Your answer is " + input);
    }
}
