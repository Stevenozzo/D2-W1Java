package com.java.esercizi;
import java.util.Scanner;

public class Esercizio2 {
    public static String convertiNumeri(Scanner scanner) {
        System.out.println("Inserisci un numero");
        int a = scanner.nextInt();
        return switch (a) {
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "Errore";
        };
    }
}
