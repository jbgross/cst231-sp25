package wk15.sec3;

import java.util.Scanner;

public class Set {
    // something that an object knows about itself
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

    public static void main(String [] args) {
        Set s1 = new Set();
        Set s2 = new Set();
        Scanner in = new Scanner(System.in);
        int x = 5, y = 6;
        System.out.println(s1.contains("hello"));
        s1.add("hello");
        System.out.println(s1.contains("hell o"));
    }

}
