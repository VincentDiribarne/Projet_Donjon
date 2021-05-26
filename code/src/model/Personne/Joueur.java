package model.Personne;

import model.Inventaire.Arme;
import model.Inventaire.Inventaire;
import model.Metier.Metier;
import model.Race.Race;

public class Joueur extends Personne {

    protected Inventaire inventaire = new Inventaire();
    private Arme arme;
    private Metier metier;

    private int constitution;
    private int dexterité;
    private int force;
    private int intelligence;
    protected Race race;


    public Joueur() {
        super();
    }

    /**
     *
     * @param direction
     */
    public void seDeplacer(String direction) {
        switch (direction) {
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
    public Metier getMetier() {
        return metier;
    }

    public void setMetier(Metier metier) {
        this.metier = metier;
    }

    //Degat

    public int getDegat(){
        return arme.getDegats();
    }


    /**
     *
     * @return int
     */
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

    //Race
    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getBonusConst() {
        return bonusConst + race.getBonusConst();
    }


    /**
     * bonusDex + race bonusDex
     *
     * @return
     */
    public int getBonusDex() {
        return bonusDex + race.getBonusDex();
    }

    /**
     * bonusForce + race bonusForce
     *
     * @return
     */
    public int getBonusForce() {
        return bonusForce + race.getBonusForce();
    }

    public int getBonusInt() {
        return bonusInt + race.getBonusInt();
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public Arme getArme() {
        return arme;
    }

    //Bonus base Attaque
    public int getBonusBaseAttaque()
    {
        return metier.getBonusBaseAttaque();
    }

    public Inventaire getInventaire() {
        return inventaire;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "arme=" + arme +
                ", pv=" + pv +
                ", bonusConst=" + bonusConst +
                ", bonusDex=" + bonusDex +
                ", bonusForce=" + bonusForce +
                ", bonusInt=" + bonusInt +
                ", nom='" + nom + '\'' +
                ", salleActuelle=" + salleActuelle +
                ", classeArmure=" + classeArmure +
                '}';
    }
}
