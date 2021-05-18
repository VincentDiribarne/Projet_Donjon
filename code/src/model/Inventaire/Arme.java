package model.Inventaire;

import model.De;

public class Arme {

    private String nom;
    //De
    private int degats;
    private int critique;
    private String type;

    public Arme(String nom, int degats, int critique, String type){
        this.nom = nom;
        this.degats = degats;
        this.critique = critique;
        this.type = type;
    }

    public int getDegats() {
        return De.lancerDes(degats);
    }

    @Override
    public String toString() {
        return nom + " ("+type+") qui inflige " + degats + " dégats, critique : " + critique;
    }
}
