package controller;

import model.donjon.Donjon;
import model.donjon.Room;
import model.inventory.Weapon;
import model.job.Barbarian;
import model.job.Job;
import model.person.Monster;
import model.person.Person;
import model.person.Player;
import model.race.Humain;
import model.race.Race;
import view.Console;
import view.CreationPersonnageView;
import view.Temps;

public class JoueurController {

    /**
     * Instanciates CreationPersonnageView
     * @see CreationPersonnageView
     */
    private final CreationPersonnageView creationPersoview;

    /**
     * Instanciates the player
     */
    public static Player player = new Player();

    /**
     * Constructor of JoueurController
     * @see CreationPersonnageView
     */
    public JoueurController() {
        creationPersoview = new CreationPersonnageView();
    }

    /**
     *Create the player
     * @see CreationPersonnageView
     * @see Person
     */
    public void creationPersonnage() {
        player.setNom(creationPersoview.Debutscript());
        Temps.temps(2000);

        creationPersoview.Mj();
        Temps.temps(2000);

        Console.ecrire("\n\tBienvenue dans le choix des races !");
        Temps.temps(1000);

        creationPersoview.affichage();
        Race choixRace = creationPersoview.choixRace();
        player.setRace(choixRace);

        Temps.temps(3000);

        Console.ecrire("\n\tBienvenue dans le choix des classes");
        Temps.temps(1000);
        creationPersoview.affichage();
        Job job = creationPersoview.choixClasse();
        player.setMetier(job);

        Temps.temps(3000);


        Console.ecrire("\n\tBienvenue dans le choix de vos caractéritiques");
        Temps.temps(1000);
        creationPersoview.tirages();


        player.setBonusConst(bonus(player.getConstitution()));
        player.setBonusDex(bonus(player.getDexterite()));
        player.setBonusForce(bonus(player.getForce()));
        player.setBonusInt(bonus(player.getIntelligence()));
        player.setPv(player.getMetier().getfirstPV() + player.getBonusConst());
        player.setMaxPv(player.getPv());
        player.setClasseArmure(player.getClasseArmure() + player.getBonusDex());


        Temps.temps(3000);
        creationPersoview.finScript();

        Weapon mainNue = new Weapon("Poing", 2, 20,"Corps à corps");
        Weapon epeeCourte = new Weapon("Epee courte", 6,19,"Arme de guerre");
        player.setArme(mainNue);
        player.getInventaire().addArme(mainNue);
        player.getInventaire().addArme(epeeCourte);
    }

    /**
     * Start Game
     */
    public void DemarrerLaPartie() {

        Player player = JoueurController.player;
        Donjon donjon = DonjonController.donjon;

        System.out.println("Debut de la partie");

        while (player.getSalleActuelle() != donjon.getFinalRoom() && player.getPv() > 0) {
            Histoire.inventaireController.gestionInventaire();
            Room roomPrecedente = player.getSalleActuelle();
            String direction = DonjonController.donjonView.choixSalle(roomPrecedente.availableDoor(), roomPrecedente);
            player.seDeplacer(direction);

            Monster monster = player.getSalleActuelle().getMonster();
            if (monster != null && monster.getPv() > 0) {
                //Inventaire
                Histoire.inventaireController.gestionInventaire();

                DonjonController.donjonView.JetPerceptionMonstre(player.getSalleActuelle());
                Histoire.combatController.rencontreMonstre(roomPrecedente);
            }
            //Possibilité d'action après le combat

        }
        if (player.getPv() <= 0) {
            Histoire.combatController.combatView.Perdu(player.getSalleActuelle().getMonster());
        } else {
            Console.parler("Felicitation, vous avez réussi à terminer le donjon, je vous offre donc cet anneau pour la suite de votre quête");
            Console.ecrire("Affaire à suivre \uD83D\uDC40");
        }

    }

    /**
     * Find bonus from a value
     * @see Person
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

    /**
     * Create a default Player
     * @see Player
     */
    public void creationJoueurDebug() {
        player.setNom("John");
        player.setRace(new Humain());
        player.setMetier(new Barbarian());
        player.setBonusForce(3);
        player.setBonusConst(3);
        player.setBonusDex(2);
        player.setBonusInt(0);
        player.setPv(player.getMetier().getfirstPV() + player.getBonusConst());
        player.setClasseArmure(player.getClasseArmure() + player.getBonusDex());
        Weapon mainNue = new Weapon("Poing", 2, 20,"Corps à corps");
        Weapon epeeCourte = new Weapon("Epee courte", 6,19,"Arme de guerre");
        player.getInventaire().addArme(mainNue);
        player.getInventaire().addArme(epeeCourte);
        player.setArme(epeeCourte);
        creationPersoview.finScript();
    }
}

