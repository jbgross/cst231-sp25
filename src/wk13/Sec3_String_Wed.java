package wk13;

public class Sec3_String_Wed {
    public static void main(String[] args) {
        String s1 = new String("foo");
        String s2 = new String("foo");
        System.out.println(s1 == s2);
        System.out.println("foo" == "foo");
        System.out.println(s1.equals(s2));

        s1 = "goodbye";
        System.out.println("the length of s1 is " + s1.length());
        for(int i = 0; i <= s1.length(); i++) {
//            System.out.println(s1.charAt(i));
            char c1 = 'A';
            char c2 = 66;
            System.out.println(c1);
            System.out.println(c2);
            int i1 = 'A';
            System.out.println(i1);
        }

        for(int c = 65; c <= 90; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
        for(char c = 65; c <= 90; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        for(int c = 48; c <= 57; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        for(char c = 48; c <= 57; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        char digitValue = '0';
        char [][] digitArray = new char[3][3];
        for(int r = 0; r < digitArray.length; r++) {
            for(int c = 0; c < digitArray[r].length; c++) {
                digitArray[r][c] = ++digitValue;
            }
        }
        print(digitArray);
    }

    public static void sumEvenAndOdd2(int [][] data) {
        int total = 0; // sum(data);
        int evens = sumEvens(data);
        int odds = 0;
        for(int r = 0; r < data.length; r++) {
            for(int c = 0; c < data[r].length; c++) {
                if(data[r][c] % 2 != 0) {
                    odds = odds + data[r][c];
                }
            }
        }

        System.out.println("total: " + total);
        System.out.println("evens: " + evens);
        System.out.println("odds: " + odds);
    }

    public static void sumEvenAndOdd1(int [][] data) {
        int total = 0; // sum(data);
        int evens = sumEvens(data);
        int odds = total - evens;
        System.out.println("total: " + total);
        System.out.println("evens: " + evens);
        System.out.println("odds: " + odds);
    }

    public static int sumEvens(int [][] data) {
        int evenSum = 0;
        for(int r = 0; r < data.length; r++) {
            for(int c = 0; c < data[r].length; c++) {
                if(data[r][c] % 2 == 0) {
                    evenSum = evenSum + data[r][c];
                }
            }
        }
        return evenSum;
    }

    public static void print(char [][] a) {
        for(int r = 0; r < a.length; r++) {
            for(int c = 0; c < a[r].length; c++) {
                System.out.print(a[r][c]);
            }
            System.out.println();
        }
    }
}
