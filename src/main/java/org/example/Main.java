package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        String vowels = "aeiouyæøå";
        Predicate<Character> isVowel = (p) -> vowels.indexOf(p) != -1;


        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(new Soldier(4, "Jens"));
        soldiers.add(new Soldier(4, "Jens1"));
        soldiers.add(new Soldier(3, "Jens2"));
        soldiers.add(new Soldier(1, "Ole"));
        soldiers.add(new Soldier(5, "Kurt"));
        soldiers.forEach(System.out::println);

        Predicate<Soldier> startsWithJ = s -> s.getName().startsWith("J");

        Predicate<Soldier> isHighRanked = soldier -> soldier.getRank() > 3;

        soldiers.stream()
                .filter(isHighRanked)
                .forEach(System.out::println);

        List<Soldier> highLst = soldiers.stream().filter(isHighRanked).toList();
        System.out.println("soldiers rank 4 and above");
        highLst.forEach(System.out::println);
        System.out.println("High and J");
        List<Soldier> highAndJLst = soldiers.stream().filter(startsWithJ).filter(isHighRanked).toList();
        highAndJLst.forEach(System.out::println);

        System.out.println("Characters:");

        List<Character> lst = Arrays.asList('a', 'b', 'c', 'd', 'e');
        List<Character> vowList = lst.stream().filter(isVowel).collect(Collectors.toList());
        vowList.forEach(System.out::println);

        vowList.forEach(c -> System.out.println(c));

    }
}
