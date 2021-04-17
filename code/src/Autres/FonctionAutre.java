package Autres;

import java.util.Scanner;

public class FonctionAutre {

    public static Scanner clavier = new Scanner(System.in);
    public static int LectureInt() {
        int reponse = clavier.nextInt();
        return reponse;
    }

    public static String LectureString() {
        String reponse = clavier.nextLine();
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
