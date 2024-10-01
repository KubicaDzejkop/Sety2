package pl.gornik;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        for(int i = 1; i <= 30; i++){
            numbers.add(i);
            System.out.print(i + ", ");
        }
        System.out.println("\nWpisz 5 liczb nie przekraczając granicy 30: ");
        int liczba = scanner.nextInt();
        Set<Integer> yourNumbers = new HashSet<>();
        System.out.println("Brakuje ci liczb: ");

    }
}
