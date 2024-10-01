package pl.gornik;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakiś tekst");

        String text = scanner.nextLine();
        Set<Character> uniqueChars = new HashSet<>();
        for (Character character : text.toCharArray()){
            if (Character.isLetter(character)) // sprawdza czy sa literami
            uniqueChars.add(character);
        }
        System.out.println("Unikalne znaki");
        for (Character char1 : uniqueChars){
            System.out.print(char1 + ", ");
        }
    }
}
