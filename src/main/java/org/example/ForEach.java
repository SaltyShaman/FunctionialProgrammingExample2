package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

    static void forEachString(List<String> listOfStrings, Consumer<String> consumer) {
        for (String string: listOfStrings) {
            consumer.accept(string);
        }
    }
    static <T> void forEach(List<T> lst, Consumer<T> consumer) {
        for (T t:lst) {
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {

        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("viggo");

        Consumer<Long> square = t -> System.out.println(t*t);
        square.accept(50l);

        List<String> lstStr = Arrays.asList("hej", "du", "der");
        lstStr.forEach(toUpper);

        forEach(lstStr, toUpper);

        forEachString(lstStr, toUpper);

        List<Double> lstDouble = Arrays.asList(2.5, 3.5, 4.5);
        Consumer<Double> squareDouble = t -> System.out.println(t*t);
        forEach(lstDouble, squareDouble);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> out = (Integer x) -> System.out.println(x);
        forEach(list, out);

    }
}