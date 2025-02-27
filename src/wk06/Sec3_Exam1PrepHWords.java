package wk06;

import java.util.Scanner;

public class Sec3_Exam1PrepHWords {
    public static void main(String[] args) {
        int count = 0;
        int reps = 0;
        Scanner in = new Scanner(System.in);
        while(reps < 5) {
            System.out.print("Enter a word: ");
            String word = in.next();
            if(word.contains("h")) {
                count++;
            }
            reps++;
        }
        System.out.println("Number of words with 'h': "
        + count);
    }
}
