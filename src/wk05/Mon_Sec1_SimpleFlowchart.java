package wk05;
import java.util.Scanner;
public class Mon_Sec1_SimpleFlowchart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        System.out.print("Enter a number: ");
        input = in.nextInt();
        if(input <= 10) {
            System.out.println("Small");
        } else {
            System.out.println("Big");
        }
    }
}
