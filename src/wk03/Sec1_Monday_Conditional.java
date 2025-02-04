package wk03;

public class Sec1_Monday_Conditional {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
//        boolean b3 =
        int i1 = 6, i2 = 7, i3 = 0;
//        System.out.println(i1/i3);
        double u1 = 6.0;
        if (i1 + u1 == 12) {
            System.out.println("this is going to run");
        }

        if(12 == i1 + u1) {
            System.out.println("this is not going to run ");
        }

        int secPerYear = 60 * 60 * 24 * 365;
        System.out.println(secPerYear);
        int msPerYear = secPerYear * 1000;
        System.out.println(msPerYear);
    }

}
