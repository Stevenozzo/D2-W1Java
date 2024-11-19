package com.java.esercizi;
import java.util.Scanner;

public class Esercizio4 {
    public static void contoRovescia(Scanner scanner) {
        System.out.println("Scrivi un numero per il conto alla rovescia");
        int a = scanner.nextInt();
        for (int i = a; i > 0; i--) {
            System.out.println(i);
        }
    }
}
