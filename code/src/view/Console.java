package view;

import model.Personne.Personne;

public class Console {
    public static void ecrire(String texte) {
        System.out.println(texte);
    }

    public static void parler(String texte) {
        Console.ecrire("(MJ) - " +texte);
    }

    public static void personneParler (String texte, Personne p) {
        Console.ecrire("(" +p.getNom()+ ") - " +texte);
    }
}
