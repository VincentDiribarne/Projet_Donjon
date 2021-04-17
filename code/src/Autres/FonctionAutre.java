package Autres;

import java.util.Scanner;

public class FonctionAutre {

    Scanner clavier = new Scanner(System.in);
    public int LectureInt() {
        int reponse = clavier.nextInt();
        return reponse;
    }

    public String LectureString() {
        String reponse = clavier.nextLine();
        return reponse;
    }

    public  void temps(int temps) {
        try {
            Thread.sleep(temps);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
