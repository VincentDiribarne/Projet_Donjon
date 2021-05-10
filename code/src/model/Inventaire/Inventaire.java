package model.Inventaire;

import java.util.ArrayList;

public class Inventaire {

    private ArrayList<Arme> armes = new ArrayList<Arme>();

    public ArrayList<Arme> getArmes() {
        return armes;
    }

    public void addArme(Arme arme){
        armes.add(arme);
    }

    @Override
    public String toString() {
        String resp = "Voici le contenu de l'inventaire : \n";
        int i = 1;
        for (Arme arme: armes) {
            resp += "- " + i + " " + arme + "\n";
            i++;
        }
        return resp;
    }
}
