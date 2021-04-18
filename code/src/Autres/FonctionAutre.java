package Autres;

import java.util.Scanner;

public class FonctionAutre {

    //Remplacer par une fonction clavier
    public static Scanner clavier = new Scanner(System.in);
    public static int LectureInt() {
        int reponse = clavier.nextInt();
        return reponse;
    }

    public static String LectureString() {
        String reponse = clavier.nextLine();
        return reponse;
    }

    //Creer un classe temps
    public static void temps(int temps) {
        try {
            Thread.sleep(temps);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
