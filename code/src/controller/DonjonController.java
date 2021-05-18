package controller;

import model.Donjon.Donjon;
import model.Personne.Joueur;
import view.DonjonView;

public class DonjonController {

    public static DonjonView donjonView = new DonjonView();
    public static Donjon donjon = new Donjon();
    private Joueur joueur = JoueurController.joueur;


    public void creationDonjon(){
        donjon.createRooms();
        joueur.setSalleActuelle(donjon.getStartRoom());
    }
}
