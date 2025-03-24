package wk10;

public class Sec3_SimpleMethods {
    public static void main(String[] args) {
        System.out.println("beginning code");
        printHello();
//        System.out.println(printHello());
        System.out.println(return2());
        int foo = return2();
        System.out.println(foo + 7);
//        System.out.println(bar + 7);
        System.out.println("ending code");
    }

    public static void printHello() {
        System.out.println("Hello");
        return;
    }

    public static int return2() {
        System.out.println("Goodbye");
        int bar = 5;
        return bar;
//        return 7 + 5 + 9 + 1000000;
//        System.out.println("hello");
    }
}
