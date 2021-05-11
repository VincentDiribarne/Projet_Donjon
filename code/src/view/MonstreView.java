package view;

import model.Personne.Monstre;

public class MonstreView {

    public void presentation(Monstre m) {
        Console.personneParler("Bonjour, je suis " +m.getNom()+ ", j'ai " +m.getPv()+ " PV, j'ai comme bonus : ", m);
        Console.personneParler("\n\t - Dextérité : " +m.getBonusDex(), m);
        Console.personneParler("\t - Force : " +m.getBonusForce(), m);
        Console.personneParler("\t - Intelligence : " +m.getBonusInt(), m);
        Console.parler("\n J'ai 1d " +m.getDeAttaque() + m.getBonusForce()+ ", j'ai " + m.getBonusBaseAttaque()+ " en bonus de base à l'attaque et " +m.getClasseArmure()+ " comme classe d'Armure");
    }
}
