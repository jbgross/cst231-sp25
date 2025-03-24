package wk10;

public class Sec1_SimpleMethods {
    public static void main(String[] args) {
        int bar = 5;
        System.out.println("starting main");
        int foo = return2();
        int accumulator = 0;
        for(int i = 0; i < 5; i++) {
//            accumulator += return2();
//            System.out.println(quux);
            accumulator = accumulator + return2();
            int grault = 9;
        }
        System.out.println(accumulator);
//        System.out.println(return2());
//        System.out.println(printHello());
        for(int i = 0; i < 5; i++) {
            printHello();
        }
        System.out.println("ending main");
    }

    public static void printHello() {
        System.out.println("hello");
    }

    public static int return2() {
        int quux = 7;
        return quux;
    }


}
