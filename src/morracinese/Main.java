package morracinese;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int segnoAvversario;
        int segnoUtente;
        int puntiUtente = 0;
        int puntiAvversario = 0;
        String outcome;
        String[] scelte = {"carta", "sasso", "forbice"};

        do {
            System.out.println("Sasso, carta, forbice?");
            String sceltaUtente = sc.nextLine();

            if (sceltaUtente.toLowerCase().equals("carta")) {
                segnoUtente = 0;
            } else if (sceltaUtente.toLowerCase().equals("sasso")) {
                segnoUtente = 1;
            } else if (sceltaUtente.toLowerCase().equals("forbice")) {
                segnoUtente = 2;
            } else {
                System.out.println("Scelta non valida. Riprova!");
                continue;
            }

            segnoAvversario = r.nextInt(3);

            switch (segnoAvversario) {
                case 0:
                    outcome = "Hai vinto!";
                    puntiUtente++;
                    break;
                case 1:
                    outcome = "Hai perso!";
                    puntiAvversario++;
                    break;
                default:
                    outcome = "Pareggio!";
            }

            System.out.println("Il tuo avversario ha scelto " + scelte[segnoAvversario] + ". " + outcome);
            System.out.println("Il tuo punteggio è " + puntiUtente + ", il punteggio del computer è " + puntiAvversario + ".");

        } while (sc.nextLine().equalsIgnoreCase("sì"));

        System.out.println("Grazie per aver giocato!");
    }
}
