package wk04;

import java.util.Scanner;

public class Mon_Sec3_LoopFun {
    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 'hello' to quit: ");
        input = in.next();
        int tries = 0;
        while(! input.equalsIgnoreCase("hello")){
            System.out.print("Enter 'hello' to quit: ");
            input = in.next();
            tries++;
        }
        System.out.println("It took you " + tries + " tries");

        int counter = 0;
        while(++counter < 5) {
//            counter++;
            System.out.print(counter + " ");
//             counter += 1; //counter = counter + 1;
        }
//        System.out.println("done");
//        System.out.println("final value for counter variable: " + counter);
    }
}
