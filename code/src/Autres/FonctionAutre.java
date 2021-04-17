package Autres;

import java.util.Scanner;

public class FonctionAutre {

    public static int Lecture() {
        Scanner clavier = new Scanner(System.in);
        int reponse = clavier.nextInt();
        return reponse;
    }

    public static void temps(int temps) {
        try {
            Thread.sleep(temps);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
