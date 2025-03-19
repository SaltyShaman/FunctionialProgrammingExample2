package org.example;

import java.util.List;
import java.util.Arrays;



public class BeregnSum {

    // Summerer alle værdier i listen baseret på en given TwoArgument-funktion
    static int sumTwoArgFunction(List<Integer> list, TwoArgument<Integer, Integer, Integer> two) {
        int sum = 0;
        for (int t : list) {
            sum += two.myFunc(t, t);
        }
        return sum;
    }

    // Valutaomregner, der kan håndtere en kurs med kommatal (double)
    static double valutaomregner(List<Integer> list, TwoArgument<Integer, Double, Double> two, double kurs) {
        double sum = 0;
        for (int t : list) {
            sum += two.myFunc(t, kurs);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Lambda, der lægger to tal sammen
        TwoArgument<Integer, Integer, Integer> twoplus = (x, y) -> x + y;
        int ss = sumTwoArgFunction(list, twoplus);
        System.out.println("Sum af listen (x + x): " + ss);

        // Lambda, der ganger to tal
        TwoArgument<Integer, Integer, Integer> twomult = (x, y) -> x * y;
        ss = sumTwoArgFunction(list, twomult);
        System.out.println("Produkt af listen (x * x): " + ss);

        // Liste af dollarsedler
        List<Integer> dollarSedler = Arrays.asList(1, 5, 10);

        // Lambda til valutakonvertering (USD -> DKK)
        TwoArgument<Integer, Double, Double> valutaCalc = (beløb, kurs) -> beløb * kurs;
        double pengedk = valutaomregner(dollarSedler, valutaCalc, 6.52);

        System.out.println("Dollars: " + dollarSedler);
        System.out.println("Omregnet til DKK = " + pengedk);
    }
}

