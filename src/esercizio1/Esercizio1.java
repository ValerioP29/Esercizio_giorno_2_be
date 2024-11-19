package esercizio1;

public class Esercizio1 {
    public boolean pariDispari(String string) {
        if (string.length() % 2 == 0) {
            System.out.println("La stringa è pari");
            return true;
        } else {
            System.out.println("La stringa è dispari");
            return false;
        }
    }
        public boolean annoBis(int anno) {
            if ((anno % 4 ==0 && anno % 100 != 0) || ( anno % 400 == 0)) {
                System.out.println("l'anno è bisestile");
                return true;
            }
            else {
                System.out.println("l'anno non è bisestile");
                return false;
            }

        }


}
