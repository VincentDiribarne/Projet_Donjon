package controller;

import view.FonctionAutre;
import view.Menu;
import model.Donjon.Donjon;
import model.Personne.MenuPersonne;

public class Histoire {

    public static void main(String args[]){
        //Declaration
        Menu m = new Menu();
        MenuPersonne mP = new MenuPersonne();
        Donjon donjon = new Donjon();


        //controller.Histoire
        //donjon.creationDesSalles();
        //donjon.getSalleDepart().afficherSalle();
        //donjon.getSalleFin().afficherSalle();

        System.out.println("Bonjour et bienvenue dans notre model.Donjon Textuel.");
        System.out.println("Le menu va apparaitre, entrez un nombre qui correspond.");
        FonctionAutre.temps(1000);
        mP.choixMenu(m.Menu());
    }









}
