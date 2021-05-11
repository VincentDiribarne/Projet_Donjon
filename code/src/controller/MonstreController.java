package controller;

import model.Personne.Monstre;
import java.util.ArrayList;

public class MonstreController {

    ArrayList<Monstre> monstres = new ArrayList<>();

    private ArrayList creationMonstre() {
        Monstre gobelin = new Monstre("Gobelin", 4, 1, -1, 0, 8, 1, 15);
        Monstre orque = new Monstre("Orque", 4, 0, 3, -1, 6, 3, 14);
        Monstre bossOrque = new Monstre("Donotkesh Primeblood", 12, 0, 3, -1, 12, 3, 18);

        ajoutArrayList(gobelin);
        ajoutArrayList(orque);
        ajoutArrayList(bossOrque);
        return monstres;
    }

    private void ajoutArrayList(Monstre nom) {
        monstres.add(nom);
    }
}


