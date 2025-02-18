package wk05;

import java.util.Scanner;

public class Mon_Sec3_SimpleFlowcharts {
    public static void main(String[] args) {
        int input;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        input = in.nextInt();
        if(input > 10) {
            System.out.println("Big");
        } else {
            System.out.println("Small");
        }
        System.out.println("Done");
    }
}
