package model.Donjon;

import model.Personne.Monstre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Salle {
    private Porte porteNord = null;
    private Porte porteSud = null;
    private Porte porteEst = null;
    private Porte porteOuest = null;
    private String nom;
    private Monstre monstre;

    public Salle(String nom){
        super();
        this.nom = nom;
    }
    public Salle(String nom, Monstre monstre){
        this(nom);
        this.monstre = monstre;

    }

    public ArrayList porteDisponible(){
        ArrayList<Porte> porteDisponible = new ArrayList<>();
        if (porteNord != null){
            porteDisponible.add(porteNord);
        }
        if (porteSud != null){
            porteDisponible.add(porteSud);
        }
        if (porteEst != null){
            porteDisponible.add(porteEst);
        }
        if (porteOuest != null){
            porteDisponible.add(porteOuest);
        }
        return porteDisponible;

    }

    /**
     * Fonction qui crée un lien entre deux salles en créant une porte. La direction prend comme referentiel la salle qui appelle la méthode.
     * @param salle2
     * @param direction
     */
    public void lierSalle(Salle salle2, String direction){
        Porte porte = new Porte(this,salle2,direction);
        switch (direction){
            case "O":
                setPorteOuest(porte);
                salle2.setPorteEst(porte);
                break;
            case "E":
                setPorteEst(porte);
                salle2.setPorteOuest(porte);
                break;
            case "N":
                setPorteNord(porte);
                salle2.setPorteSud(porte);
                break;
            case "S":
                setPorteSud(porte);
                salle2.setPorteNord(porte);
                break;
            default:
                System.out.println("Erreur lors de la création de la salle");
                break;
        }
    }

    public Porte getPorte(String direction){
        switch (direction){
            case "O":
                return porteOuest;
            case "E":
                return porteEst;
            case "N":
                return porteNord;
            case "S":
                return porteSud;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "Vous êtes dans la salle " + nom + ".\n "+ monstre;
    }

    //Accesseurs

    public Porte getPorteNord() {
        return porteNord;
    }

    public void setPorteNord(Porte porteNord) {
        this.porteNord = porteNord;
    }

    public Porte getPorteSud() {
        return porteSud;
    }

    public void setPorteSud(Porte porteSud) {
        this.porteSud = porteSud;
    }

    public Porte getPorteEst() {
        return porteEst;
    }

    public void setPorteEst(Porte porteEst) {
        this.porteEst = porteEst;
    }

    public Porte getPorteOuest() {
        return porteOuest;
    }

    public void setPorteOuest(Porte porteOuest) {
        this.porteOuest = porteOuest;
    }

    public String getNom() {
        return nom;
    }

    public Monstre getMonstre() {
        return monstre;
    }
}