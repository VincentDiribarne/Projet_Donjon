package controller;

import model.Donjon.Salle;
import model.Personne.Joueur;
import model.Personne.Personne;
import model.Race.DemiOrque;
import view.Clavier;
import view.Menu;
import model.Donjon.Donjon;
import view.Temps;

public class Histoire {

    public static DonjonController donjonController = new DonjonController();
    public static JoueurController joueurController = new JoueurController();

    public static void main(String args[]){
        //Declaration test
        Menu m = new Menu();
        //controller.Histoire
        //donjon.creationDesSalles();
        //donjon.getSalleDepart().afficherSalle();
        //donjon.getSalleFin().afficherSalle();

        System.out.println("Bonjour et bienvenue dans notre Donjon Textuel.");
        System.out.println("Le menu va apparaitre, entrez un nombre qui correspond.\n");
        m.Menu();
        m.Menu2();
    }
















}
