package view;

public class Temps {

    public static void temps(int temps) {
        try {
            Thread.sleep(temps);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
