package model.Personne;

import model.Inventaire.Inventaire;
import model.Metier.Metier;

public class Joueur extends Personne {

    protected Inventaire inventaire;
    private Metier classe;

    private int constitution;
    private int dexterité;
    private int force;
    private int intelligence;




    public Joueur() {
        super();
    }

    public void seDeplacer(String direction){
        switch (direction){
            case "N":
                salleActuelle = salleActuelle.getPorteNord().emprunterPorte(salleActuelle);
                break;
            case "S":
                salleActuelle = salleActuelle.getPorteSud().emprunterPorte(salleActuelle);
                break;
            case "O":
                salleActuelle = salleActuelle.getPorteOuest().emprunterPorte(salleActuelle);
                break;
            case "E":
                salleActuelle = salleActuelle.getPorteEst().emprunterPorte(salleActuelle);
                break;
        }
    }

    //Classe
    public Metier getClasse() {
        return classe;
    }
    public void setClasse(Metier classe) {
        this.classe = classe;
    }

    //Metier


    public int getForce() {
        return force;
    }
    public int getConstitution() {
        return constitution;
    }
    public int getDexterité() {
        return dexterité;
    }
    public int getIntelligence() {
        return intelligence;
    }


    public void setForce(int force) {
        this.force = force;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    public void setDexterité(int dexterité) {
        this.dexterité = dexterité;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }



}
