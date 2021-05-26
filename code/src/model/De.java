package model;

import java.util.Random;

public class De {

    public static int genererInt(int borneInf, int borneSup){
        Random random = new Random();
        return borneInf+random.nextInt((borneSup-borneInf) +1);
    }

    public static int lancerDes(int n){
        Random random = new Random();
        return random.nextInt((n-1) +1) + 1;
    }

}
