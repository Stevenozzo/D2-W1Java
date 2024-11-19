package com.java.main;
import java.util.Scanner;
import com.java.esercizi.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Esercizio 1 - A
        boolean pariDispari = Esercizio1.stringaPariDispari(scanner);
        System.out.println("La lunghezza della stringa è " + pariDispari + " (True = Pari, False = Dispari)");

        //Esercizio 1 - B
        boolean confermaBisestile = Esercizio1.annoBisestile(scanner);
        System.out.println("L'anno inserito è " + confermaBisestile + " (True = Bisestile, False = Non Bisestile)");

        //Esercizio 2
        String parolaNumero = Esercizio2.convertiNumeri(scanner);
        System.out.println(parolaNumero);

        //Esercizio 3
        String fraseFormata = Esercizio3.componiFrase(scanner);
        System.out.println(fraseFormata);

        //Esercizio 4
        Esercizio4.contoRovescia(scanner);
    }
}
