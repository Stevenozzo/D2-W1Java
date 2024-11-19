package com.java.esercizi;
import java.util.Scanner;

public class Esercizio3 {
    public static String componiFrase(Scanner scanner) {
        StringBuilder risultato = new StringBuilder();
        String input= "";
        while (!input.equals(":q")) {
            System.out.println("Inserisci una stringa da suddividere in caratteri separati da virgola (digita :q per uscire):");
            input = scanner.nextLine();
            if(!input.equals(":q")) risultato.append(String.join(",", input.split("")));
        }
        return risultato.toString();
    }
}

