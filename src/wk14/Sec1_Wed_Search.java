package wk14;

import java.util.Random;

public class Sec1_Wed_Search {
    public static void main(String[] args) {
        int [] a = generateData(new Random(-7), 0, 20, 30);
        print(a);
        
        int returnValue = search(a, 7);
        System.out.println("returnValue = " + returnValue);
        System.out.println("count of occurences of 17: " + countOccurences(a, 17));
        System.out.println("count of occurences of 20: " + countOccurences(a, 20));
    }

    public static int findLargestValue1(int [] a) {
        int largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > largest) {
                largest = a[i];
            }
        }
        return largest;
    }

    public static int findLargestValue2(int [] a) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > largest) {
                largest = a[i];
            }
        }
        return largest;
    }

    public static int countOccurences(int [] a, int searchValue) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == searchValue) {
                count++;
            }
        }
        return count;
    }
    
    public static int search(int [] a, int searchValue) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int [] generateData(Random rand, int lowerBound, int upperBound, int arraySize) {
        int [] data = new int[arraySize];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(lowerBound, upperBound);
        }
        return data;
    }


}
