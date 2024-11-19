package com.java.esercizi;
import java.util.Scanner;

public class Esercizio1 {
    public static boolean stringaPariDispari (Scanner scanner) {
        System.out.println("Scrivi una stringa");
        String a = scanner.nextLine();
        if (a.length() % 2 == 0) return true;
        else return false;
    }

    public static boolean annoBisestile (Scanner scanner) {
        System.out.println("Scrivi un anno");
        int a = scanner.nextInt();
        if (a % 4 == 0 || a % 100 == 0 && a % 400 == 0) return true;
        else return false;
    }
}

