package controller;

import model.Metier.Metier;
import model.Personne.Joueur;
import model.Personne.Personne;
import model.Race.Race;
import view.Console;
import view.CreationPersonnageView;
import view.Temps;

public class JoueurController {

    private CreationPersonnageView creationPersoview;
    public static Joueur p = new Joueur();

    public JoueurController(){
        creationPersoview = new CreationPersonnageView();
    }

    public void creationPersonnage() {
        p.setNom(creationPersoview.Debutscript());
        Temps.temps(2000);

        creationPersoview.Mj();
        Temps.temps(2000);

        Console.ecrire("\n\tBienvenue dans le choix des races !");
        Temps.temps(1000);

        creationPersoview.affichage();
        Race choixRace = creationPersoview.choixRace();
        p.setRace(choixRace);

        Temps.temps(3000);

        Console.ecrire("\n\tBienvenue dans le choix des classes");
        Temps.temps(1000);
        creationPersoview.affichage();
        Metier metier = creationPersoview.choixClasse();
        p.setClasse(metier);

        Temps.temps(3000);

        Console.ecrire("\n\tBienvenue dans le choix de vos caractéritiques");
        Temps.temps(1000);
        creationPersoview.tirages(p);


        p.setBonusConst(bonus(p.getConstitution()));
        p.setBonusDex(bonus(p.getDexterité()));
        p.setBonusForce(bonus(p.getForce()));
        p.setBonusInt(bonus(p.getIntelligence()));
        p.setPV(p.getClasse().getPVdeBase() + p.getBonusConst());
        p.setClasseArmure(p.getClasseArmure() + p.getBonusDex());


        Temps.temps(3000);
        creationPersoview.finScript();
    }



    /**
     * Find bonus from a value
     * @param valeur
     * @return int
     */
    public int bonus(int valeur) {
        int bonus;
        if (valeur >= 8 && valeur < 10) {
            bonus = -1;
        } else if(valeur >= 10 && valeur < 12) {
            bonus = 0;
        } else if(valeur >= 12 && valeur < 14) {
            bonus = 1;
        } else if (valeur >= 14 && valeur < 16) {
            bonus = 2;
        } else if (valeur >= 16 && valeur < 18) {
            bonus = 3;
        } else {
            bonus = 4;
        }
        return bonus;
    }
}

