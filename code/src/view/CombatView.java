package view;

import model.De;
import model.person.Person;

public class CombatView {

    /**
     * Print the Menu
     * @return choix
     */
    public int Menu() {
        Console.ecrire("""
                +-------------------------+
                |     Choix du Player     |
                +-------------------------+
                | 1 - Attaque             |
                | 2 - Fuire               |
                +-------------------------+""");

        Console.ecrire("\nVotre choix ?");
        return Clavier.LectureInt();
    }

    /**
     * Print the text's attack
     * @param jetattaque
     * @param degat
     * @param attaquant
     * @param defenseur
     */
    public void Attaque(int jetattaque, int degat, Person attaquant, Person defenseur) {
        Console.ecrire("Le jet d'attaque est de : " +jetattaque+ ", il est superieur à la classe d'armure de " +defenseur.getNom());
        Console.ecrire(attaquant.getNom() + " inflige " +degat+ " dégat à " +defenseur.getNom()+ ". Il lui reste " +defenseur.getPv()+ " PV\n");
    }

    /**
     * Print the miss text
     * @param attaquant
     * @param defenseur
     * @param jet
     */
    public void missed(Person attaquant, Person defenseur, int jet) {
        int choix = De.genererInt(1, 5);
        Console.ecrire("Le jet d'attaque est de : " +jet+ ", il est inferieur à la classe d'armure de " +defenseur.getNom());
        switch (choix) {
            case 1:
                Console.ecrire("L'armure de " +defenseur.getNom()+ " est trop resistante");
                break;
            case 2:
                Console.ecrire(defenseur.getNom()+ " a reculé");
                break;
            case 3:
                Console.ecrire("Une poussière a aveuglé " +attaquant.getNom());
                break;
            case 4:
                Console.ecrire("Une mouche vole et distrait " +attaquant.getNom());
                break;
            case 5:
                if(attaquant instanceof Person) {
                    Console.ecrire("Vous avez réussi a parer l'attaque");
                } else {
                    Console.ecrire(defenseur.getNom()+ "a réussi a parer l'attaque");
                }
                break;
        }

        Console.ecrire("L'attaque a donc échoué \n");
    }

    /**
     * Print the critical text
     * @param degat
     * @param attaquant
     * @param defenseur
     */
    public void Critique(int degat, Person attaquant, Person defenseur) {
        Console.ecrire(attaquant.getNom()+ " a eu un super tirage, il fait un critique");
        Console.ecrire("Il inflige "+degat+ " dégat à "  +defenseur.getNom()+ ", il reste " + defenseur.getPv()+ " PV\n");
    }

    /**
     * Print the won text for the fight
     * @param monstre
     */
    public void Gagne(Person monstre) {
        Console.personneParler("AHHHHHH", monstre);
        Console.ecrire("Vous avez gagné le combat !");
        Console.parler("Felicitation\n");
        Console.ecrire("Vous pouvez passer à la salle suivante");
    }

    /**
     * Print the loose text for the fight
     * @param monstre
     */
    public void Perdu(Person monstre) {
        Console.personneParler("Ahahaha je t'ai eu", monstre);
        Console.parler("Vous êtes mort, enfin il me semble\n");
        Console.ecrire("Que voulez-vous faire ?");
        Console.ecrire("\t- Rejouer (1)");
        Console.ecrire("\t - Revenir au Menu (2)");
        Console.ecrire("\t - Quitter (3) \n");
    }

    /**
     * Print the leak text
     * @return
     */
    public int Fuite() {
        int chancedeFuite = De.genererInt(1, 3);
        if (chancedeFuite == 3) {
            Console.ecrire("Vous avez raté votre fuite");
            Console.ecrire("Le Monster vous attaque\n");
        }
        return chancedeFuite;
    }
}
