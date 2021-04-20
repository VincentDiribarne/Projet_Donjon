package controller;

import model.Personne.Personne;
import view.Clavier;
import view.Menu;
import model.Donjon.Donjon;
import view.Temps;

public class Histoire {


    public static void main(String args[]){
        //Declaration
        Menu m = new Menu();
        Donjon donjon = new Donjon();
        JoueurController joueurController = new JoueurController();


        //controller.Histoire
        //donjon.creationDesSalles();
        //donjon.getSalleDepart().afficherSalle();
        //donjon.getSalleFin().afficherSalle();

        System.out.println("Bonjour et bienvenue dans notre model.Donjon Textuel.");
        System.out.println("Le menu va apparaitre, entrez un nombre qui correspond.");
        Temps.temps(1000);
        joueurController.creationPersonnage();

    }















}
