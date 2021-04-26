package view;

import java.util.Scanner;

public class Clavier {
    public static int LectureInt() {
        Scanner clavier = new Scanner(System.in);
        int reponse = clavier.nextInt();
        return reponse;
    }

    public static String LectureString() {
        Scanner clavier = new Scanner(System.in);
        String reponse = clavier.nextLine();
        return reponse;
    }
}
