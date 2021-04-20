package view;

import java.util.Scanner;

public class Clavier {

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
}
