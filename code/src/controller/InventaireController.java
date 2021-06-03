package controller;

import model.person.Player;
import view.Clavier;
import view.Console;
import view.InventaireView;
import view.Temps;

public class InventaireController {

    /**
     * Instanciates the inventaireView
     * @see InventaireView
     */
    private final InventaireView inventaireView = new InventaireView();

    /**
     * Instanciates the Player
     * @see Player
     */
    private final Player player = JoueurController.player;

    /**
     * Gestion de l'inventaire.
     * @see InventaireView
     * @see model.inventory.Inventory
     * @see InventaireController
     */
    public void gestionInventaire(){
        int choix = inventaireView.menuInventaire();
        switch (choix){
            case 1:
                inventaireView.afficherInventaire(JoueurController.player.getInventaire());
                Temps.temps(500);
                gestionInventaire();
                break;
            case 2:
                Console.ecrire("Votre arme équipée est :");
                Console.ecrire(JoueurController.player.getArme().toString());
                inventaireView.afficherInventaire(JoueurController.player.getInventaire());
                Console.ecrire("Selectionnez une arme : ");
                choix = Clavier.LectureInt();
                if (choix <= player.getInventaire().getArmes().size() && choix > 0){
                    player.setArme(player.getInventaire().getArmes().get(choix-1));
                    Temps.temps(500);
                    Console.ecrire("Vous avez équipé l'arme suivante : ");
                    Console.ecrire(player.getArme().toString());
                }
                else {
                    Console.ecrire("Erreur ! ");
                    gestionInventaire();
                }
                break;
            case 0:
                //Quitter
                break;
            default:
                Console.ecrire("Erreur ! ");
                gestionInventaire();
        }
    }
}
