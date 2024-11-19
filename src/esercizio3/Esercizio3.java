package esercizio3;
import java.util.Scanner;

public class Esercizio3 {
    public void separaLettere() {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Inserisci una stringa o :q per uscire: ");
            String string = scanner.nextLine();

        if (string.equals(":q")) {
            System.out.println("Uscita dal programma");
            break;
        }
            System.out.println("ecco le lettere separate: ");
            for (char c : string.toCharArray()) {
                System.out.println(c);
            }
        }

        }
    }

