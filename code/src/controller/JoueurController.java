package controller;

import model.De;
import model.Donjon.Donjon;
import model.Donjon.Salle;
import model.Inventaire.Arme;
import model.Metier.Metier;
import model.Personne.Joueur;
import model.Personne.Monstre;
import model.Personne.Personne;
import model.Race.Race;
import view.Console;
import view.CreationPersonnageView;
import view.Temps;

public class JoueurController {

    private CreationPersonnageView creationPersoview;
    public static Joueur joueur = new Joueur();

    public JoueurController() {
        creationPersoview = new CreationPersonnageView();
    }

    public void creationPersonnage() {
        joueur.setNom(creationPersoview.Debutscript());
        Temps.temps(2000);

        creationPersoview.Mj();
        Temps.temps(2000);

        Console.ecrire("\n\tBienvenue dans le choix des races !");
        Temps.temps(1000);

        creationPersoview.affichage();
        Race choixRace = creationPersoview.choixRace();
        joueur.setRace(choixRace);

        Temps.temps(3000);

        Console.ecrire("\n\tBienvenue dans le choix des classes");
        Temps.temps(1000);
        creationPersoview.affichage();
        Metier metier = creationPersoview.choixClasse();
        joueur.setMetier(metier);

        Temps.temps(3000);

        Console.ecrire("\n\tBienvenue dans le choix de vos caractéritiques");
        Temps.temps(1000);
        creationPersoview.tirages();


        joueur.setBonusConst(bonus(joueur.getConstitution()));
        joueur.setBonusDex(bonus(joueur.getDexterité()));
        joueur.setBonusForce(bonus(joueur.getForce()));
        joueur.setBonusInt(bonus(joueur.getIntelligence()));
        joueur.setPv(joueur.getMetier().getPVdeBase() + joueur.getBonusConst());
        joueur.setClasseArmure(joueur.getClasseArmure() + joueur.getBonusDex());


        Temps.temps(3000);
        creationPersoview.finScript();
        Arme mainNue = new Arme("Poing", 2, 20,"Corps à corps");
        joueur.setArme(mainNue);
    }

    public void DemarrerLaPartie() {

        Joueur joueur = JoueurController.joueur;
        Donjon donjon = DonjonController.donjon;

        System.out.println("Debut de la partie");
        while (joueur.getSalleActuelle() != donjon.getSalleFin() && joueur.getPv() > 0) {
            //Inventaire
            //SeReposeer
            Salle salleActuelle = joueur.getSalleActuelle();
            String direction = DonjonController.donjonView.choixSalle(salleActuelle.porteDisponible(), salleActuelle);
            joueur.seDeplacer(direction);

            Monstre monstre = joueur.getSalleActuelle().getMonstre();
            if (monstre != null && monstre.getPv() > 0) {
                System.out.println("Il y a un monstre");
                Histoire.combatController.rencontreMonstre(salleActuelle);
            }
            if (joueur.getPv() > 0){
                //Continuer ....
                //Ouvrir coffre
            }

        }
        if (joueur.getPv() <= 0){
            System.out.println("Le joueur est mort");
            //TODO Game OVer
        }
        else {
            System.out.println("Victoire !");
        }

    }


    /**
     * Find bonus from a value
     *
     * @param valeur
     * @return int
     */
    public int bonus(int valeur) {
        int bonus;
        if (valeur >= 8 && valeur < 10) {
            bonus = -1;
        } else if (valeur >= 10 && valeur < 12) {
            bonus = 0;
        } else if (valeur >= 12 && valeur < 14) {
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

