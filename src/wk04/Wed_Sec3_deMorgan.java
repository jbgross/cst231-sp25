package wk04;
import java.util.Scanner;
public class Wed_Sec3_deMorgan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int input = in.nextInt();
        // de Morgan's law
//        while(! (input > 0) || !( input < 11) ) {
        while(! (input > 0 && input < 11) ) {
            System.out.print("Enter a number between 1 and 10: ");
            input = in.nextInt();
        }
        System.out.println("your number is " + input);
    }
}
