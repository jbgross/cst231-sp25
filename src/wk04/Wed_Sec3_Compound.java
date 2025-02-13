package wk04;

public class Wed_Sec3_Compound {
    public static void main(String[] args) {
        int a = 5;

        if(a == 5) {
            System.out.println("they're the same!");
        }
//        a++;
//        a += 1;
        int x = 6;
        {
            x = 6;
//            x = 6;
        }


        System.out.println(x);

        if(a + 1 > 5) {
            System.out.println("maybe this will print, maybe not");
        }
        int countdown = 10;
        while(countdown >= 0) {
            System.out.print(countdown + " ");
            countdown--;
        }
        System.out.println();

        System.out.println("this is the end");
    }
}
