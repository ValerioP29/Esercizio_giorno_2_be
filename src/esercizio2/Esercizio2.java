package esercizio2;


public class Esercizio2 {
    public void stampaNumero(int numero) {
        switch ( numero) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore, numero non compreso tra 0 e 3");
        }
    }
}
