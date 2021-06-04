package view;

import java.util.Scanner;

public class Clavier {
    /**
     * Read a int
     * @return int
     */
    public static int LectureInt() {
        Scanner clavier = new Scanner(System.in);
        return clavier.nextInt();
    }

    /**
     * Read a String
     * @return string
     */
    public static String LectureString() {
        Scanner clavier = new Scanner(System.in);
        return clavier.nextLine();
    }
}
