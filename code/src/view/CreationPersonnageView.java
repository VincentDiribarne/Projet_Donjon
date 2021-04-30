package view;

import controller.JoueurController;
import model.De;
import model.Metier.*;
import model.Personne.Joueur;
import model.Personne.Personne;
import model.Race.Halfelin;
import model.Race.*;

import java.util.ArrayList;

public class CreationPersonnageView {

    //Autres
    public String Debutscript() {
        Console.ecrire("\nBienvenue dans la création de personnages.");
        Console.ecrire("Dans un premier temps, choisissez votre nom de joueur. Suite à cela, vous allez choisir votre race. De plus, vous devrait choisir votre classe (l'équivalent d'un metier dans un jeu de role).");
        Console.ecrire("Enfin, vous allez attribuer des tirages à votre personnage afin qu'il possède une force, des points vie, etc\n");
        Temps.temps(1000);

        Console.ecrire("Quel est votre nom ?");
        return Clavier.LectureString();
    }

    public void Mj() {
        Console.parler("Bonjour à toi " + JoueurController.p.getNom() + " bienvenue dans le jeu, je te souhaite bonne chance... Pour ce qui va t'arriver ensuite, MOUAH AH AH AH !!");
        Console.parler("Ouais, je suis horrible et alors !");
    }


    public void affichage() {
        Temps.temps(1000);
        Console.ecrire("\nEcrivez le nom complet tel qu'il est écrit plus tard, sinon cela va engendrer une erreur !");
        Temps.temps(1000);
        Console.ecrire("Si vous ecrivez, le nom, ne vous inquietez pas, cela vous donnera les caractéristiques de la race selectionnée, avant de vous demander une confirmation");
        Temps.temps(1000);
        Console.ecrire("Rendez vous dans l'onglet aide, si vous voulez tout savoir de ces races");
        Temps.temps(1000);
    }

    public void finScript() {
        Console.ecrire("\nLa création de votre personnage est faite !");
        Console.ecrire("\nVous êtes un " +JoueurController.p.getRace().getName()+ " avec comme classe : " +JoueurController.p.getClasse().getName()+ ".");
        Console.ecrire("Vous avez " +JoueurController.p.getPV()+ " PV\n");

        Console.parler("Bonne chance à toi, " +JoueurController.p.getNom());
    }

    public Boolean confirmation() {
        Console.ecrire("Tapez 'Y' pour confirmer ou 'N' pour refuser");
        String confirmChoix = Clavier.LectureString();
        confirmChoix.toUpperCase();
        switch (confirmChoix) {
            case "Y" :
                Temps.temps(1000);
                return true;
            case "N" :
                Temps.temps(1000);
                return false;
            default:
                Console.ecrire("Erreur");
                Temps.temps(1000);
                confirmation();
        }
        return false;
    }

    //Race
    public String nomRace() {
        String reponseRace;
        Console.ecrire("\nChoisissez votre Race parmi les suivantes : ");
        Temps.temps(1000);
        Console.ecrire("Races Pur Sang : \n" +
                        "\t - Humain \n" +
                        "\t - Elfe \n" +
                        "\t - Gnome \n" +
                        "\t - Halfelin \n" +
                        "\t - Nain \n"
        );
        Temps.temps(1000);
        Console.ecrire(
                        "Races Sang-Melées : \n" +
                        "\t - Demi-Elfe\n" +
                        "\t - Demi-Orque \n"
        );
        Temps.temps(2000);
        Console.ecrire("Votre Choix ?");
        reponseRace = Clavier.LectureString();
        return reponseRace;
    }

    public Race choixRace() {
        String reponseRace = nomRace();
        Console.ecrire("\nVous avez choisi un " +reponseRace+ "\n");
        String choix = reponseRace.toUpperCase();

        Temps.temps(1000);
        switch (choix) {
            case "HUMAIN":
                Console.ecrire("Les humains sont des pionniers, des marchands, des voyageurs, ect...");
                Console.ecrire("Ils sont très varié que cela soit au niveau physique ou même mental.");
                Temps.temps(1000);
                Console.ecrire("\nIls ne possèdent pas vraiment de bonus ou de malus liés à leur race. Si le personnage idéal, si vous ne voulez pas voir des bonus ou malus impacter votre partie");
                Temps.temps(1000);
                Console.ecrire("Ils parlent uniquement le commun.");
                Temps.temps(1000);
                Console.ecrire("Vous ne possedez pas de classe de prédilection\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir Humain");
                    return new Humain();
                }
                break;

            case "HALFELIN" :
                Console.ecrire("Les halfelins vivent dans un monde rempli de personne plus grande qu'eux. Ils mesurent 90 centimètres maximum, ils paraissent inoffensifs");
                Temps.temps(1000);

                Console.ecrire("\nLes bonus et les malus de l'Halfelin : ");
                Temps.temps(1000);
                Console.ecrire("\t - Votre force baisse de 2");
                Temps.temps(700);
                Console.ecrire("\t - Votre dextérité augmente de 2\n");

                Temps.temps(1000);
                Console.ecrire("Votre classe de prédilection est Roublard\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir Halfelin");
                    return new Halfelin();
                }
                break;

            case "GNOME" :
                Console.ecrire("Les gnomes vivent dans des terriers creusés sous des collines. Ils sont de petites tailles, et ils excellent dans l'alchimie, et les inventions");
                Temps.temps(1000);

                Console.ecrire("\nBonus et malus du Gnome : ");
                Temps.temps(1000);
                Console.ecrire("\t - Votre intelligence augmente de 1");
                Temps.temps(700);
                Console.ecrire("\t - Votre constitution augmente de 2");
                Temps.temps(700);
                Console.ecrire("\t - Votre force baisse de 2\n");

                Temps.temps(1000);
                Console.ecrire("Ils parlent le commun et le nain");
                Console.ecrire("Votre classe de prédilection est Pretre\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir Gnome");
                    return new Gnome();
                }
                break;

            case "NAIN" :
                Console.ecrire("Les nains sont d'énormes travailleurs volontaire. ILs ont eu très grade connaissance des secrets de la terre et la quantité de biere qu'ils ingurgitent est plus que démentiel");
                Temps.temps(1000);

                Console.ecrire("\nLes bonus et les malus de du Nain : ");
                Temps.temps(1000);
                Console.ecrire("\t - Votre constitution augmente de 2\n");
                Temps.temps(700);

                Console.ecrire("Ils parlent leur langue (l'alphabet runique) et le commun");
                Console.ecrire("Votre classe de prédilection est Guerrier\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir Nain");
                    return new Nain();
                }
                break;

            case "ELFE" :
                Console.ecrire("Les elfes sont des êtres très âgés, ils sont célèbre pour leurs poésies, leurs chants et leurs danses");
                Temps.temps(1000);

                Console.ecrire("\nLes bonus et les malus de l'Elfe : ");
                Temps.temps(1000);
                Console.ecrire("\t - Votre constitution baisse de 2");
                Temps.temps(700);
                Console.ecrire("\t - Votre dextérité augmente de 2\n");

                Temps.temps(1000);
                Console.ecrire("Ils parlent le commun et l'elfique");
                Console.ecrire("Votre classe de prédilection est Magicien\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir Elfe");
                    return new Elfe();
                }
                break;

            case "DEMI-ORQUE" :
                Console.ecrire("Les Demi-Orques vivent chez leurs deux parents, ils sont la fusion d'orques et d'humain. Ils ont en contact avec les deux cultures.");
                Temps.temps(1000);

                Console.ecrire("\nLes bonus et les malus du Demi-Orque : ");
                Temps.temps(1000);
                Console.ecrire("\t - Votre force augmente de 2");
                Temps.temps(700);
                Console.ecrire("\t - Votre intelligence baisse de 2\n");

                Temps.temps(1000);
                Console.ecrire("Ils parlent le commun et l'orque");
                Console.ecrire("Votre classe de predilection est le Barbare\n");

                if (confirmation()) {
                    Console.ecrire("\nVous venez de choisir Demi-Orque");
                    return new DemiOrque();
                }
                break;

            case "DEMI-ELFE" :
                Console.ecrire("Les Demi-Elfes sont les enfants d'une liaison entre un humain et un elfe. Cette liaison se termine souvent prématurement suite à la mort de l'humain, qui vit moins longtemps qu'un elfe. \nMais elles perdurent à travers leurs enfants");
                Temps.temps(1000);

                Console.ecrire("\nIls ne possèdent pas vraiment de bonus ou de malus liés à leur race. Si le personnage idéal, si vous ne voulez pas voir des bonus ou malus impacter votre partie");
                Temps.temps(1000);

                Console.ecrire("\nIls parlent le commun et l'elfique");
                Console.ecrire("Vous ne possedez pas de classe de prédilection\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir Demi-Elfe");
                    return new DemiElfe();
                }
                break;

            default :
                Console.ecrire("Erreur");
        }
        return choixRace();
    }

    //Classes
    public String nomClasse() {
        String reponseClasse;
        Console.ecrire("\nVous avez choisi un " +JoueurController.p.getRace().getName()+ ", votre classe de predilection est " +JoueurController.p.getRace().getClassePrédi());
        Console.ecrire("Vous n'êtes pas obligé de prendre cette classe");
        Console.ecrire("\nChoisissez votre classe parmi les suivantes :\n");
        Temps.temps(1000);
        Console.ecrire("Metiers : \n" +
                "\t - Barbare  \n" +
                "\t - Guerrier \n" +
                "\t - Magicien \n" +
                "\t - Pretre \n" +
                "\t - Rôdeur \n" +
                "\t - Roublard\n"
        );
        Temps.temps(2000);
        Console.ecrire("Votre Choix ?");
        reponseClasse = Clavier.LectureString();
        return reponseClasse;
    }

    public Metier choixClasse() {
        String reponseClasse = nomClasse();
        Console.ecrire("\nVous avez choisi un " +reponseClasse);
        String choix = reponseClasse.toUpperCase();

        Temps.temps(1000);
        switch (choix) {
            case "BARBARE":
                Console.ecrire("\nLes barbares sont des guerriers sanguinaires, téméraires et courageux. Ils vivent dans les grandes étendues gelées du Nord");
                Temps.temps(1000);

                Console.ecrire("\nLes barbares sont d'excellents combattants, très facile à comprendre, idéal si vous souhaitez commencer une aventure en solo. Niveau facile");
                Console.ecrire("Ils possèdent 1d12 de point de vie au niveau 1");
                Temps.temps(800);

                Console.ecrire("\nLa force et la constitution sont importantes pour les guerriers");
                Temps.temps(800);
                Console.ecrire("Ils ne peuvent pas lire ou ecrire.");
                Temps.temps(800);
                Console.ecrire("Attention, les barbares ne peuvent pas lancer de sorts.\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir un Barbare");
                    return new Barbare();
                }
                break;

            case "PRETRE" :
                Console.ecrire("\nLes pretres sont des intermédiaires terrestres entre les hommes et les dieux. Les pretres 'gentils' soignent, sauvent et aident leurs prochains." );
                Console.ecrire("Tandis que les prêtres maléfiques sement la terreur, la mort et la destruction.");
                Temps.temps(1000);

                Console.ecrire("\nLes pretres peuvent se soigner, et combattre à la fois. Niveau Normal");
                Console.ecrire("Ils possèdent 1d8 point de vie au niveau 1");
                Temps.temps(800);

                Console.ecrire("\nL'intelligence et la force sont importants pour un prêtre");
                Temps.temps(800);
                Console.ecrire("Attention, les pretres ne lancent pas de sorts offensifs\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir Pretre");
                    return new Pretre();
                }
                break;

            case "GUERRIER" :
                Console.ecrire("\nLes guerriers, que ce soit le seigneur local, l'aventurier, ou le pire des brigand, ce sont tous des guerriers. vivent dans des terriers creusés sous des collines. Ils sont de petites tailles, et ils excellent dans l'alchimie, et les inventions");
                Console.ecrire("Ils sont tous en quêtes d'aventures perpetuelles et de missions diverses, ou pour les crapules, de pauvres gens à débourser");
                Temps.temps(1000);
                Console.ecrire("\nLes Guerriers sont un peu plus dur à manier que les barbares, mais ils restent simple. Niveau Normal");
                Console.ecrire("Ils possèdent 1d10 de vie au niveau 1");
                Temps.temps(800);

                Console.ecrire("\nLa force et la constitution sont importantes pour les guerriers");
                Temps.temps(800);
                Console.ecrire("Attention, les guerriers ne peuvent pas lancer de sorts offensifs.\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir un Guerrier");
                    return new Guerrier();
                }
                break;

            case "MAGICIEN" :
                Console.ecrire("Les magiciens manient l'art de prononcer des phrases incompréhensibles mais tout aussi dévastatrice que les haches ou les épees des combattants.");
                Console.ecrire("Les magiciens necessitent de longues heures de travail et d'apprentissage pour maitriser leur sort. Il faut aussi qu'ils se reposent tous les jours pour récuperer de leur sort.");
                Temps.temps(1000);
                Console.ecrire("\nLes magiciens seuls ont très peu de point de vie, ils sont donc extrememenent dur à manier, si vous commencez le jeu. Niveau très difficile");
                Console.ecrire("Ils possèdent 1d4 de vie au niveau 1");
                Temps.temps(800);

                Console.ecrire("\nL'intelligence est très importante et la constitution aussi si vous voulez avoir quelques points de vie supplémentaire.");
                Temps.temps(800);
                Console.ecrire("Attention, les magiciens ne sont pas très fort au corps à corps et ne peuvent pas manier des armures lourdes.\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir un Magicien");
                    return new Magicien();
                }
                break;

            case "RODEUR" :
                Console.ecrire("\nLes rodeurs sont des personnes qui traquent leur proie sans efforts, ils manient l'arc comme personne.");
                Console.ecrire("Ils connaissent les points faibles de leurs ennemis");
                Temps.temps(1000);

                Console.ecrire("\nLes rodeurs possèdent beaucoup de vie et leur arc font très mal. Niveau Normal");
                Console.ecrire("Ils possèdent 1d10 de vie au niveau 1");
                Temps.temps(800);

                Console.ecrire("\nLa dextérité et la constitution sont importants pour un rodeur");
                Temps.temps(800);
                Console.ecrire("Attention, les rodeurs ne peuvent pas lancer de sorts.\n");

                if (confirmation()) {
                    Console.ecrire("Vous venez de choisir un Rodeur");
                    return new Rodeur();
                }
                break;

            case "ROUBLARD" :
                Console.ecrire("\nLes roublards sont des voleurs sournois, des escrocs, des espions, des éclaireurs. Leur but est de se glisser dans des pièces inaccessibles, des salles aux trésors, des chambres fortes, etc");
                Temps.temps(1000);

                Console.ecrire("\nLes roublards ont pas beaucoup de vie et ce sont pas très fort, il doivent être discret, etc");
                Console.ecrire("Ils possèdent 1d6 de vie au niveau 1");
                Temps.temps(800);

                Console.ecrire("\nLa dextérité est importante pour un roublard");
                Temps.temps(800);
                Console.ecrire("Attention, un roublard ne lancent pas de sort et ne peut pas porter d'armure lourde\n");

                if (confirmation()) {
                    Console.ecrire("\nVous venez de choisir un Roublard");
                    return new Roublard();
                }
                break;

            default :
                Console.ecrire("Erreur");
                return choixClasse();
        }
        return choixClasse();
    }


    //Tirages
    public void tirages(Joueur p) {
    ArrayList<Integer> tirages = new ArrayList<>();

        tirages.add(De.genererInt(8,18));
        tirages.add(De.genererInt(8,18));
        tirages.add(De.genererInt(8,18));
        tirages.add(De.genererInt(8,18));

        Console.ecrire("\nLes tirages vont suivre vont determiner la suite de votre aventure, consultez les règles pour en apprendre plus sur la création d'un personnage");
        Temps.temps(2000);
        Console.ecrire("\nChaque tirage correspond à un nombre, pensez écrire donc à entrer un nombre !");
        Console.ecrire("Si vous voulez prendre le tirage 1, notez 1, ainsi de suite");
        Temps.temps(1000);
        Console.ecrire("\nVous pouvez attribuer vos tirages sur la Force, la Constitution, la Dexterité, l'Intelligence");

        Temps.temps(2000);

    afficheTirage(tirages);

        Temps.temps(2000);
        Console.ecrire("\nAttribuez un tirage pour la Force : ");
        p.setForce(attributionAttribut(tirages));
        Console.ecrire("Vous attribuer donc " + p.getForce() + " pour la Force.\n");
        afficheTirage(tirages);

        Temps.temps(2000);
        Console.ecrire("\nAttribuez un tirage pour la Constitution : ");
        p.setConstitution(attributionAttribut(tirages));
        Console.ecrire("Vous attribuer donc " + p.getConstitution() + " pour la Constitution.\n");
        afficheTirage(tirages);

        Temps.temps(2000);
        Console.ecrire("\nAttribuez un tirage pour la Dextérité : ");
        p.setDexterité(attributionAttribut(tirages));
        Console.ecrire("Vous attribuer donc " + p.getDexterité() + " pour la Dextérité.\n");
        Temps.temps(2000);

        p.setIntelligence(tirages.get(0));
        Console.ecrire("\nVous attribuer donc " + p.getIntelligence() + " pour l'intelligence.");

        Temps.temps(2000);
        Console.ecrire("\nVoici le récapitulatif de vos attributs : ");
        Console.ecrire("\t - Force : " + p.getForce());
        Console.ecrire("\t - Constitution : " + p.getConstitution());
        Console.ecrire("\t - Dexterité : " + p.getDexterité());
        Console.ecrire("\t - Intelligence : " + p.getIntelligence());
    }

    public int attributionAttribut(ArrayList<Integer> tirages) {
        int attribut;
        int reponse;
        reponse = Clavier.LectureInt();
        while (reponse > tirages.size()) {
            System.out.println("Erreur, recommencez !");
            reponse = Clavier.LectureInt();
        }
        attribut = tirages.get(reponse - 1);
        tirages.remove(reponse - 1);
        return attribut;
    }

    public void afficheTirage(ArrayList<Integer> tirages) {
        Temps.temps(1500);
        Console.ecrire("\nVoici les statistiques que vous pouvez attribuer");
        for (int i = 0; i < tirages.size(); i++) {
            Console.ecrire("\t - Tirage " + (i + 1) + " - " + tirages.get(i));
        }
    }
}
