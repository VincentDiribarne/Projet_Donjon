package view;

public class Temps {

    /**
     * Wait time
     * @param temps
     */
    public static void temps(int temps) {
        try {
            Thread.sleep(temps);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
