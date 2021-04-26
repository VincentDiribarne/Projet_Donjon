package controller;

import model.Donjon.Donjon;
import model.Donjon.Salle;
import model.Personne.Joueur;
import view.Console;
import view.DonjonView;

public class DonjonContoller {

    private static DonjonView donjonView = new DonjonView();

    public static void main(String args[]){
        Joueur joueur = new Joueur();
        Donjon donjon = new Donjon();

        donjon.creationDesSalles();
        joueur.setSalleActuelle(donjon.getSalleDepart());

        while (joueur.getSalleActuelle() != donjon.getSalleFin()){
            Salle salleActuelle = joueur.getSalleActuelle();
            String direction = donjonView.choixSalle(salleActuelle.porteDisponible(), salleActuelle);
            joueur.setSalleActuelle(salleActuelle.getPorte(direction).emprunterPorte(salleActuelle));
        }
        Console.ecrire("Vous avez gagné ! ");

    }
}
