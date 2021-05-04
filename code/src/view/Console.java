package view;

import model.Personne.Monstre;

public class Console {
    public static void ecrire(String texte) {
        System.out.println(texte);
    }

    public static void parler(String texte) {
        Console.ecrire("(MJ) - " +texte);
    }

}
