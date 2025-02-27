package wk06;
import java.util.*;
public class Sec1_Exam1Review {
    public static void main(String[] args) {
        System.out.println(Math.abs(Integer.MIN_VALUE + 1));
        int input = 1;
        Scanner in = new Scanner(System.in);
        while(input != 0) {
            System.out.print("Enter a whole number: ");
            input = in.nextInt();
            if(input == 0) {
                // do nothing
            } else if(input%2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
//            System.out.println("done with this iteration");
        }
    }
}
