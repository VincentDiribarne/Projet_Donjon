package controller;

import model.De;
import model.inventory.Loot;
import model.donjon.Room;
import model.person.Person;
import model.person.Player;
import model.person.Monster;
import view.CombatView;
import view.Console;
import view.Temps;

public class CombatController {

    /**
     * Instanciates the player
     * @see Player
     */
    private final Player player = JoueurController.player;

    /**
     * Instanciates the view
     * @see CombatView
     */
    public CombatView combatView = new CombatView();

    /**
     * Instanciates the monster
     * @see Monster
     */
    private Monster monster;

    /**
     * Instanciates a Room call "roomPrecedente"
     * @see Room
     */
    private Room roomPrecedente;


    /**
     * If a player meet a monster, this method is call
     * @param roomPrecedente
     */
    public void rencontreMonstre(Room roomPrecedente) {
        this.roomPrecedente = roomPrecedente;
        monster = player.getSalleActuelle().getMonster();
        Console.parler("Que le meilleur gagne !\n");
        Person p1 = calculInitiative();
        choixJoueur(p1);
    }

    /**
     * When a turn start, the player can choose in a menu
     * @param p
     */
    public void choixJoueur(Person p) {
        int choixDuJoueur = combatView.Menu();
        switch (choixDuJoueur) {
            case 1:
                combat(p);
                if (player.getPv() > 0 && monster.getPv() > 0) {
                    choixJoueur(p);
                }
                else if (monster.getPv() <= 0) {
                    combatView.Gagne(monster);
                    if (player.getPv() < player.getMaxPv()) {
                        player.setPv(player.getPv() + 3);
                    }
                    if (player.getPv() > player.getMaxPv()) {
                        player.setPv(player.getMaxPv());
                    }
                    Console.ecrire("Vous avez regénérer votre vie.");
                    Console.ecrire("Vous avez " + player.getPv() +" PV.");


                    //Aleatoire loot d'un monster
                    Loot loot = LibraryController.library.getALoot();
                    if (loot.getProbability() > De.lancerDes(100)){
                        Console.ecrire("Vous avez obtenu l'arme suivante : ");
                        Console.ecrire(loot.getArme().toString());
                        player.getInventaire().addArme(loot.getArme());
                    }
                }
                break;
            case 2:
                int choix = combatView.Fuite();
                if (choix == 3) {
                    attaque(monster, player);
                    choixJoueur(p);
                } else {
                    player.setSalleActuelle(roomPrecedente);
                }
                break;
            default:
                Console.ecrire("Erreur");
                choixJoueur(p);
        }
    }

    /**
     * It's a calcul for know who start a fight
     * @return Person
     * @see Person
     */
    public Person calculInitiative() {
        Person person1;

        if (player.getInitiative() > monster.getInitiative()) {
            person1 = player;
        } else {
            person1 = monster;
        }
        return person1;
    }

    /**
     * The method for attack
     * @see Monster
     * @see Player
     * @param p1
     */
    public void combat(Person p1) {
        Person p2;
        if (p1 instanceof Monster) {
            p2 = player;
        } else {
            p2 = monster;
        }
        Temps.temps(800);
        if (p1.getPv() > 0) {
            Console.ecrire("Au tour de " + p1.getNom() + " d'attaquer");
            attaque(p1, p2);
        }
        Temps.temps(1000);
        if (p2.getPv() > 0) {
            Console.ecrire("Au tour de " + p2.getNom() + " d'attaquer");
            attaque(p2, p1);
        }
    }

    /**
     * It's for an attack
     * @param person
     * @param cible
     * @see De
     * @see Person
     */
    public void attaque(Person person, Person cible) {
        int jetAttaque = De.lancerDes(20);
        int degat = person.getDegat();

        if (jetAttaque == 20) {
            degat *= 2;
            cible.estAttaque(degat);
            combatView.Critique(degat, person, cible);
        } else {
            jetAttaque += person.getBonusForce() + person.getBonusBaseAttaque();

            if (cible.getClasseArmure() <= jetAttaque) {
                cible.estAttaque(degat);
                combatView.Attaque(jetAttaque, degat, person, cible);
            } else {
                combatView.missed(person, cible, jetAttaque);
            }
        }
    }
}
