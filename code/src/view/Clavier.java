package view;

import java.util.Scanner;

public class Clavier {
    /**
     * Read a int
     * @return
     */
    public static int LectureInt() {
        Scanner clavier = new Scanner(System.in);
        int reponse = clavier.nextInt();
        return reponse;
    }

    /**
     * Read a String
     * @return
     */
    public static String LectureString() {
        Scanner clavier = new Scanner(System.in);
        String reponse = clavier.nextLine();
        return reponse;
    }
}
