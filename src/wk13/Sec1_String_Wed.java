package wk13;

public class Sec1_String_Wed {
    public static void main(String[] args) {
        String s1 = new String("Foo");
        String s2 = new String("Foo");
        System.out.println(s1 == s2);
        System.out.println("bar" == "bar");
        System.out.println("bar".equals("bar"));

        String s3 = "hello";
        s3 = "goodbye";
        System.out.println(s3.length());
        for(int i = 0; i < s3.length(); i++) {
            System.out.println(s3.charAt(i));
        }

        char c1 = 'A';
        int i1 = 'A';
        System.out.println(c1);
        System.out.println(i1);
        char c2 = 66;
        System.out.println(c2);

        for(int i = 65; i < 91; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(char c = 65; c < 91; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        for(char c = 48; c <= 57; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        char [][] grid = new char[3][3];
        char gridValue = 48; // '0';
        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[row].length; col++) {
                grid[row][col] = gridValue++;
            }
        }

        print(grid);

    }

    public static void print(char [][] c) {
        for(int i = 0; i < c.length; i++) {
            for(int k = 0; k < c[i].length; k++) {
                System.out.print(c[i][k] + " ");
            }
            System.out.println();
        }
    }
}
