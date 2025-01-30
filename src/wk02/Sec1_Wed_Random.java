package wk02;

import java.util.Random;

public class Sec1_Wed_Random {
    public static void main(String[] args) {
        Random r = new Random();
//        System.out.println(r.nextInt()%10 + 1);
        int first = Math.abs(r.nextInt());
//        System.out.println(first);
        first = first%10;
//        System.out.println(first);
        first = first + 1;
        System.out.println(first);

//        System.out.println(r.nextInt()%10 + 1);
        int second = Math.abs(r.nextInt());
//        System.out.println(second);
        second = second % 10;
//        System.out.println(second);
        second = second + 1;
        System.out.println(second);
//        System.out.println(r.nextInt()%10 + 1);

        int third = r.nextInt();
//        System.out.println(third);
        third = Math.abs(third % 10);
//        System.out.println(third);
        third += 1; // third = third + 1;
        System.out.println(third);

        boolean firstComparison = first > second;
        System.out.println("Is first greater than second: " + firstComparison);
        System.out.println("Is second greater than first: " + (second > first));
        System.out.println("Is second equal to first: " + (first == second));
    }
}
