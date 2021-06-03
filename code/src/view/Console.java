package view;

import model.person.Person;

public class Console {
    /**
     * Print text
     * @param texte
     */
    public static void ecrire(String texte) {
        System.out.println(texte);
    }

    /**
     * MJ print text
     * @param texte
     */
    public static void parler(String texte) {
        Console.ecrire("(MJ) - " +texte);
    }

    /**
     * Print text for a monster
     * @param texte
     * @param p
     */
    public static void personneParler (String texte, Person p) {
        Console.ecrire("(" +p.getNom()+ ") - " +texte);
    }
}
