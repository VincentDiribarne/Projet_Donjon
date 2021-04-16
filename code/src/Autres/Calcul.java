package Autres;

import java.util.Random;

public class Calcul {
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
    public static int desDe100() {
        int nbdes1 = desDe10();
        int nbdes2 = desDe10();
        if (nbdes2 == 10) {
            nbdes2 = 0;
        }
        nbdes = ((nbdes1 * 10) + nbdes2);
        return nbdes;
    }

    public static int desDe20() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb20-nb1);
        return nbdes;
    }

    public static int desDe12() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb12-nb1);
        return nbdes;
    }

    public static int desDe10() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb10-nb1);
        return nbdes;
    }

    public static int desDe6() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb6-nb1);
        return nbdes;
    }

    public static int desDe4() {
        Random random = new Random();
        nbdes = nb1+random.nextInt(nb4-nb1);
        return nbdes;
    }
}
