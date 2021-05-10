package view;

import model.De;
import model.Personne.Personne;

public class CombatView {

    public int Menu() {
        Console.ecrire("+-------------------------+\n" +
                "|     Choix du Joueur     |\n" +
                "+-------------------------+\n" +
                "| 1 - Attaque             |\n" +
                "| 2 - Fuire               |\n" +
                "| 3 - Consomme une potion |\n" +
                "+-------------------------+");

        int choix = Clavier.LectureInt();
        return choix;
    }

    public void Attaque(int jetattaque, int degat, Personne attaquant, Personne defenseur) {
        Console.ecrire("Au tour de " +attaquant.getNom()+ " d'attaquer");
        Console.ecrire("Le jet d'attaque est de : " +jetattaque+ ", il est superieur à la classe d'armure de " +defenseur.getNom());
        Console.ecrire(attaquant.getNom() + " inflige " +degat+ " dégat à " +defenseur.getNom()+ ". Il lui reste " +defenseur.getPv()+ " PV\n");
    }

    public void Raté(Personne attaquant, Personne defenseur, int jet) {
        int choix = De.genererInt(1, 5);
        String nom = "Vous";
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
                if(attaquant instanceof Personne) {
                    Console.ecrire("Vous avez réussi a parer l'attaque");
                } else {
                    Console.ecrire(defenseur.getNom()+ "a réussi a parer l'attaque");
                }
                break;
        }

        Console.ecrire("L'attaque a donc échoué \n");
    }

    public void Critique(int degat, Personne attaquant, Personne defenseur) {
        Console.ecrire(attaquant.getNom()+ " a eu un super tirage, il fait un critique");
        Console.ecrire("Il inflige "+degat+ " dégat à "  +defenseur.getNom()+ ", il reste " + defenseur.getPv()+ " PV\n");
    }

    public void Gagne(Personne monstre) {
        Console.personneParler("AHHHHHH", monstre);
        Console.ecrire("Vous avez gagné le combat !");
        Console.parler("Felicitation\n");
        Console.ecrire("Vous pouvez passer à la salle suivante");
    }

    public void Perdu(Personne monstre) {
        Console.personneParler("Ahahaha je t'ai eu", monstre);
        Console.parler("Vous êtes mort, enfin il me semble\n");
        Console.ecrire("Que voulez-vous faire ?");
        Console.ecrire("\t- Rejouer (1)");
        Console.ecrire("\t - Revenir au Menu (2)");
        Console.ecrire("\t - Quitter (3) \n");
    }

    public int Fuite() {
        int chancedeFuite = De.genererInt(1, 3);
        if (chancedeFuite == 3) {
            Console.ecrire("Vous avez raté votre fuite");
            Console.ecrire("Le Monstre vous attaque\n");
        }
        return chancedeFuite;
    }
}
