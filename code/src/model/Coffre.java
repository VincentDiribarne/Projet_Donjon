package model;

import model.Inventory.Weapon;

import java.util.ArrayList;

public class Coffre {

    private String type;
    private ArrayList<Weapon> contenu = new ArrayList<>();

    public Coffre(String type){
        this.type = type;
    }
}
