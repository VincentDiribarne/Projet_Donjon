package controller;

import model.Donjon.Salle;
import model.Personne.Joueur;
import model.Personne.Personne;
import model.Race.DemiOrque;
import view.Clavier;
import view.Console;
import view.Menu;
import model.Donjon.Donjon;
import view.Temps;

public class Histoire {

    public static DonjonController donjonController = new DonjonController();
    public static JoueurController joueurController = new JoueurController();
    public static CombatController combatController = new CombatController();

    public static void main(String args[]){
        Menu m = new Menu();

        Donjon donjon = new Donjon();
        JoueurController joueurController = new JoueurController();

        Console.parler("Bonjour et bienvenue dans notre Donjon Textuel.");
        Console.ecrire("Le menu va apparaitre, entrez un nombre qui correspond.\n");

        m.Menu();
        m.Menu2();
    }

}
