package wk14;

import java.util.Random;

public class Sec3_Wed_Search {

    public static void main(String[] args) {
        int [] data = generateData(new Random(-7), 0, 20, 20);
        print(data);
        System.out.println(search(data, 7));
        System.out.println(countOccurences(data, 17));
//        print(generateData(new Random(), 0, 5, 10));
    }

    public static int findLargestValue1(int [] data) {
        int largest = data[0];
        for (int i = 1; i < data.length; i++) {
            if(data[i] > largest) {
                largest = data[i];
            }
        }
        return largest;
    }

    public static int findLargestValue2(int [] data) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if(data[i] > largest) {
                largest = data[i];
            }
        }
        return largest;
    }

    public static int countOccurences(int [] data, int searchValue) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == searchValue) {
                count++;
            }
        }
        return count;
    }

    public static int search(int [] data, int searchValue) {
        for (int i = 0; i < data.length; i++) {
            if(data[i] == searchValue) {
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
