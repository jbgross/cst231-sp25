package wk15.sec1;

import java.util.Scanner;

public class Set {
    private String [] elements = new String[10];
    private int size = 0;

    public boolean add(String s) {
        if(contains(s)) {
            return false;
        }
        elements[size++] = s;
        return true;
    }

    public boolean contains(String s) {
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set s1 = new Set();
        Set s2 = new Set();
//        int x = in.nextInt();

        s1.add("hello");
        System.out.println(s1.contains("hello"));
    }
}
