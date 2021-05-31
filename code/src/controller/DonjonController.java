package controller;

import model.Donjon.Donjon;
import model.Personne.Joueur;
import view.DonjonView;

public class DonjonController {

    /**
     * Instanciates the Donjon View
     * @see DonjonView
     */
    public static DonjonView donjonView = new DonjonView();

    /**
     * Instanciates the player
     * @see Donjon
     */
    public static Donjon donjon = new Donjon();

    /**
     * Instanciates the player
     * @see Joueur
     */
    private Joueur joueur = JoueurController.joueur;


    /**
     * Create the dongon
     * @see model.Donjon.Room
     * @see Donjon
     */
    public void creationDonjon(){
        donjon.createRooms();
        joueur.setSalleActuelle(donjon.getStartRoom());
    }
}
