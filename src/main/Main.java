package main;
import esercizio1.Esercizio1;
import esercizio2.Esercizio2;
import esercizio3.Esercizio3;
import esercizio4.Esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Esercizio 1
        Esercizio1 esercizio1 = new Esercizio1();
        boolean risultato = esercizio1.pariDispari("BRAZORF");
        System.out.println("RISULTATO: " + risultato);

        System.out.println("l'anno è bisestile? ");
        esercizio1.annoBis(2025);
        esercizio1.annoBis(2026);
        esercizio1.annoBis(2027);
        esercizio1.annoBis(2028);

        //Esercizio 2

        Scanner scanner= new Scanner(System.in);

        System.out.println("Inserisci un numero tra 0 e 3");
        int numero = scanner.nextInt();

        Esercizio2 esercizio2 = new Esercizio2();
        esercizio2.stampaNumero(numero);



        //Esercizio3
        Esercizio3 esercizio3 = new Esercizio3();
        esercizio3.separaLettere();


        //Esercizio4
        Esercizio4 esercizio4 = new Esercizio4();
        esercizio4.contoAllaRovescia();

    scanner.close();

    }
}