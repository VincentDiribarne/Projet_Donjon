package model;

import java.util.Random;

public class De {
    private static int nb20 = 20;
    private static int nb12 = 12;
    private static int nb10 = 10;
    private static int nb6 = 6;
    private static int nb4 = 4;
    private static int nb1 = 1;
    private static int nbdes;


    public static int genererInt(int borneInf, int borneSup){
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);
        return nb;
    }

    public static int lancerDes(int n){
        Random random = new Random();
        nbdes = 1+random.nextInt(n-1);
        return nbdes;
    }


    public static int deDe100() {
        int nbdes1 = deDe10();
        int nbdes2 = deDe10();
        if (nbdes2 == 10) {
            nbdes2 = 0;
        }
        nbdes = ((nbdes1 * 10) + nbdes2);
        return nbdes;
    }

    public static int deDe20() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb20-nb1);
        return nbdes;
    }

    public static int deDe12() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb12-nb1);
        return nbdes;
    }

    public static int deDe10() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb10-nb1);
        return nbdes;
    }

    public static int deDe6() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb6-nb1);
        return nbdes;
    }

    public static int deDe4() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb4-nb1);
        return nbdes;
    }
}
