package esercizio4;
import java.util.Scanner;

import java.util.Scanner;

public class Esercizio4 {
    public void  contoAllaRovescia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero intero: ");
        int numero = scanner.nextInt();

        System.out.println("conto alla rovescia: ");
        for (int i = numero; i>=0; i--) {
            System.out.println(i);


        }


    }
}
