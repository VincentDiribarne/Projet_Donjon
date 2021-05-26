package controller;

import model.De;
import model.Donjon.Donjon;
import model.Donjon.Salle;
import model.Inventaire.Arme;
import model.Metier.Barbare;
import model.Metier.Metier;
import model.Personne.Joueur;
import model.Personne.Monstre;
import model.Personne.Personne;
import model.Race.Humain;
import model.Race.Race;
import view.Clavier;
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
        Arme epeeCourte = new Arme("Epee courte", 6,19,"Arme de guerre");
        joueur.setArme(mainNue);
        joueur.getInventaire().addArme(mainNue);
        joueur.getInventaire().addArme(epeeCourte);

    }


    //TODO changer de place
    public void DemarrerLaPartie() {

        Joueur joueur = JoueurController.joueur;
        Donjon donjon = DonjonController.donjon;

        System.out.println("Debut de la partie");
        while (joueur.getSalleActuelle() != donjon.getSalleFin() && joueur.getPv() > 0) {

            //SeReposeer
            Salle sallePrecedente = joueur.getSalleActuelle();
            String direction = DonjonController.donjonView.choixSalle(sallePrecedente.porteDisponible(), sallePrecedente);
            joueur.seDeplacer(direction);

            Monstre monstre = joueur.getSalleActuelle().getMonstre();
            if (monstre != null && monstre.getPv() > 0) {
                //Inventaire
                Histoire.inventaireController.gestionInventaire();

                DonjonController.donjonView.JetPerceptionMonstre(joueur.getSalleActuelle());
                Histoire.combatController.rencontreMonstre(sallePrecedente);
            }
            if (joueur.getPv() > 0) {
                //Continuer ....
                //Ouvrir coffre
            }

        }
        if (joueur.getPv() <= 0) {
            Histoire.combatController.combatView.Perdu(joueur.getSalleActuelle().getMonstre());
        } else {
            Console.parler("Bravo, vous avez gagné !");
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

    public void creationJoueurDebug() {
        joueur.setNom("John");
        joueur.setRace(new Humain());
        joueur.setMetier(new Barbare());
        joueur.setBonusForce(3);
        joueur.setBonusConst(3);
        joueur.setBonusDex(2);
        joueur.setBonusInt(0);
        joueur.setPv(joueur.getMetier().getPVdeBase() + joueur.getBonusConst());
        joueur.setClasseArmure(joueur.getClasseArmure() + joueur.getBonusDex());
        Arme mainNue = new Arme("Poing", 2, 20,"Corps à corps");
        Arme epeeCourte = new Arme("Epee courte", 6,19,"Arme de guerre");
        joueur.getInventaire().addArme(mainNue);
        joueur.getInventaire().addArme(epeeCourte);
        joueur.setArme(epeeCourte);
        creationPersoview.finScript();
    }
}

