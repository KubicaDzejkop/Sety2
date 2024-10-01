package pl.gornik;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MathSet {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(3, 1, 9, 5, 7, 11));
        System.out.println("Zbiór A: " + setA);
        Set<Integer> setB = new HashSet<>(Arrays.asList(2, 3, 4, 6, 7, 8, 12));
        System.out.println("Zbiór B: " + setB);

        Set<Integer> setASumB = new HashSet<>(setA);
        setASumB.addAll(setB);
        System.out.println("Suma zbiorów A i B: " + setASumB);

        Set<Integer> setASubstractB = new HashSet<>(setA);
        setASubstractB.removeAll(setB);
        System.out.println("Różnica zbiorów A i B: " + setASubstractB);


        Set<Integer> setAMultiplyB = new HashSet<>(setA);
        setAMultiplyB.retainAll(setB);
        System.out.println("Iloczyn zbiorów A i B: "+ setAMultiplyB);

        Set<Integer> sortedSetA = new TreeSet<>(setA);
        System.out.println("Posortowany zbiór A: " + sortedSetA);
    }
}
