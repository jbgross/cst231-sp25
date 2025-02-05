package wk03;

import java.util.Scanner;

public class Wed_Sec1_NestedConditionals {
    public static void main(String[] args) {
        // create an int variable called a and set to zero
        int a = 0;
        double b = 0;
        boolean c = true;
        Scanner in = new Scanner(System.in);
        int literalInt = 7;
        System.out.print("Enter number: ");
        // get a number from the user that we will compare
        // with other numbers to show examples of nested conditionals
        int inputInt = in.nextInt();
        if (inputInt < 10) {
            System.out.println(inputInt + " is small");
        } else {
            System.out.println(inputInt + " is big");
            if (inputInt > 20) {
                System.out.println(inputInt + " is very big");
            } else {
                System.out.println(inputInt + " is not that big");
            }
        }

        if (literalInt == inputInt) {
            System.out.println("the two numbers are the same");
        }
        String d = "true";
        String s1 = "hello";
//        String s2 = "Hello";
//        String s3 = "hello";
//
//        if(s1 == s2) {
//            System.out.println("s1 and s2 are the same");
//        } else {
//            System.out.println("s1 and s2 are different");
//        }
        System.out.print("Enter word: ");
        String input = in.next();
        System.out.println("the word you entered was: " + input);

//        if(s1 == input) {
//            System.out.println("s1 and input are the same");
//        } else {
//            System.out.println("s1 and input are different");
//        }
        if (s1.equals(input)) {
            System.out.println("s1 and input are the same");
        } else {
            System.out.println("s1 and input are different");
        }

        if (true) {
            // do this if condition is true
            System.out.println("will this print?");
        } else if (true) {
            System.out.println("how about this?");
        }

        // then go here
        System.out.println("done");
    }

}
