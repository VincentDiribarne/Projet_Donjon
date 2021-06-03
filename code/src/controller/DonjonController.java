package controller;

import model.donjon.Donjon;
import model.person.Player;
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
     * @see Player
     */
    private final Player player = JoueurController.player;


    /**
     * Create the dongon
     * @see model.donjon.Room
     * @see Donjon
     */
    public void creationDonjon(){
        donjon.createRooms();
        player.setSalleActuelle(donjon.getStartRoom());
    }
}
