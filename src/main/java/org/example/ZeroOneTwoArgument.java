package org.example;

public class ZeroOneTwoArgument {

    public interface ZeroArgument {
        public void myFunc();
    }

    public static void printZero(ZeroArgument z0) {
        z0.myFunc();
    }

    public interface OneArgument {
        public void myFunc(String str);
    }

    public static void takeOneArgumentAsParameter(OneArgument o1, String str) {
        o1.myFunc(str);
        System.out.println("Hello Functional Programming Example");
    }

    // TwoArgument interface med generics
    public interface TwoArgument<T, U, R> {
        R myFunc(T t, U u);
    }

    public static void main(String[] args) {

        ZeroArgument z = () -> System.out.println("Hello I am interface");
        printZero(z);

        OneArgument out = (str) -> System.out.println(str);
        out.myFunc("Hej one arg");

        // To add two integers
        TwoArgument<Integer, Integer, Integer> two = (x, y) -> x + y;
        int i1 = two.myFunc(5, 6);
        System.out.println("i1=" + i1);

        // To multiply two integers
        TwoArgument<Integer, Integer, Integer> twomult = (x, y) -> x * y;
        int i2 = twomult.myFunc(4, 5);
        System.out.println("i2=" + i2);

        // Skriver en metode der tager OneArgument som parameter;
        takeOneArgumentAsParameter(out, "Hello I take oneArgument as a parameter");
    }
}
