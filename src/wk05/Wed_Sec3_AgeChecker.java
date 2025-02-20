package wk05;

import java.util.Scanner;

public class Wed_Sec3_AgeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
//        System.out.println(age);
        do {
            System.out.print("What is your age? ");
            age = in.nextInt();
            System.out.println("Your age is: " + age);

            if(age > 17) {
                System.out.println("adult");
            } else {
                System.out.println("minor");
            }
        } while(age >= 0);
        System.out.println("Done");
    }
}
