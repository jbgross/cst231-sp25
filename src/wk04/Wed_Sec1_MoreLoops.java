package wk04;

import java.util.Locale;
import java.util.Scanner;

public class Wed_Sec1_MoreLoops {
    public static void main(String[] args) {

        String password = "Pass1234";
//        String passwordLowercase = password.toLowerCase(Locale.ROOT);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your password, jerk: ");
        String input = in.next();
//        {
//            int b = 0;
//        }
        int count = 1;
        while(! password.equalsIgnoreCase(input)) {
            System.out.print("Enter your password, jerk: ");
            input = in.next();
            count++;
//            System.out.println(b);
        }
        System.out.println("You are logged in");
        System.out.println("It took " + count + " tries");

    }
}
