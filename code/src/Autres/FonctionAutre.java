package Autres;

import java.util.Scanner;

public class FonctionAutre {

    public static int Lecture() {
        Scanner clavier = new Scanner(System.in);
        int reponse = clavier.nextInt();
        return reponse;
    }

    public static void temps2000() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void temps1500() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
