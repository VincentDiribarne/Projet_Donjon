package controller;

import model.Donjon.Donjon;
import model.Donjon.Salle;
import model.Personne.Joueur;
import view.Console;
import view.DonjonView;

public class DonjonController {

    public static DonjonView donjonView = new DonjonView();
    public static Donjon donjon = new Donjon();
    private Joueur joueur = JoueurController.joueur;


    public void creationDonjon(){
        donjon.creationDesSalles();
        joueur.setSalleActuelle(donjon.getSalleDepart());
    }
}
