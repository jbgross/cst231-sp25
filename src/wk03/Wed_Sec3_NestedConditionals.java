package wk03;

import java.util.Scanner;

public class Wed_Sec3_NestedConditionals {
    public static void main(String[] args) {
        // this is a comment
        /*

         */
        // create an int variable called x and give it a value of zero

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = in.nextInt();
        if(inputNumber < 10) {
            System.out.println(inputNumber + " is small");
        } else {
            System.out.println(inputNumber + " is big");
            if(inputNumber > 20) {
                System.out.println(inputNumber + " is very big");
            } else {
                System.out.println(inputNumber + " is not that big");
            }
        }
        System.out.println("done");

        String s1 = "hello";
        System.out.print("Enter a word: ");
        String inputString = in.next();

        if(inputString == s1) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }

        if(inputString.equals(s1)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }


        int x = 0;
        int y = 1 + x;
        if (false) {
            System.out.println("print this");
        } else if (false) {
            System.out.println("print that");
        }
//        else {
//            System.out.println("print the other");
//        }

        System.out.println("done");

        int a = 0;
        double b = 0;
        boolean c = true;
        String d = "hello";
    }
}
