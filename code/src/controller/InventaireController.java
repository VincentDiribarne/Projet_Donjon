package controller;

import model.Personne.Joueur;
import view.Clavier;
import view.Console;
import view.InventaireView;
import view.Temps;

public class InventaireController {

    /**
     * Instanciates the inventaireView
     * @see InventaireView
     */
    private InventaireView inventaireView = new InventaireView();

    /**
     * Instanciates the Joueur
     * @see Joueur
     */
    private Joueur joueur = JoueurController.joueur;

    /**
     * Gestion de l'inventaire.
     * @see InventaireView
     * @see model.Inventory.Inventory
     * @see InventaireController
     */
    public void gestionInventaire(){
        int choix = inventaireView.menuInventaire();
        switch (choix){
            case 1:
                inventaireView.afficherInventaire(JoueurController.joueur.getInventaire());
                Temps.temps(500);
                gestionInventaire();
                break;
            case 2:
                Console.ecrire("Votre arme équipée est :");
                Console.ecrire(JoueurController.joueur.getArme().toString());
                inventaireView.afficherInventaire(JoueurController.joueur.getInventaire());
                Console.ecrire("Selectionnez une arme : ");
                choix = Clavier.LectureInt();
                if (choix <= joueur.getInventaire().getArmes().size() && choix > 0){
                    joueur.setArme(joueur.getInventaire().getArmes().get(choix-1));
                    Temps.temps(500);
                    Console.ecrire("Vous avez équipé l'arme suivante : ");
                    Console.ecrire(joueur.getArme().toString());
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
