package wk05;

import java.util.Scanner;

public class Wed_Sec3_Flowchart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        while(age > 0) {
            if(age >= 18) {
                System.out.println("old");
            } else {
                System.out.println("young");
            }
            System.out.println(age);
        }
    }
}
