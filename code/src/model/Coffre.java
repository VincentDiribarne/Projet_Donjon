package model;

import model.Inventaire.Arme;

import java.util.ArrayList;

public class Coffre {

    private String type;
    private ArrayList<Arme> contenu = new ArrayList<>();

    public Coffre(String type){
        this.type = type;
    }
}
