package wk02;

import java.util.Random;

public class Sec3_Wed_Random {
    public static void main(String[] args) {
        Random rand = new Random();
//        System.out.println(rand.nextInt()%10 + 1);
        int first = Math.abs(rand.nextInt()%10) + 1;
//        System.out.println(rand.nextInt()%10 + 1);
        System.out.println(first);

        int second = rand.nextInt();
//        System.out.println(second);
        second = Math.abs(second);
//        System.out.println(second);
        second = second % 10;
//        System.out.println(second);
        second = second + 1;
        System.out.println(second);

        int third = Math.abs(rand.nextInt()%10) + 1;
        System.out.println(third);
        System.out.println("Is first bigger than second? " + (first > second));
        System.out.println("Is first less than second? " + (first < second));
        System.out.println("Is first equal to than second? " + (first == second));

//        System.out.println(rand.nextInt()%10 + 1);
    }
}
