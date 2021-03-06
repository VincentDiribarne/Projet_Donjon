package view;

public class Regles {

    /**
     * View for the Rules
     */
    public void Regles () {
        Console.ecrire("\nVoici la liste des règles de ce jeu : \n");
        Console.ecrire("""
                \tDans ce jeu, vous incarnez un aventurier intrépide, et plein de fougue, dont sa quête est décrite au début du jeu.\s

                \tVous allez vous retrouvez dans un donjon pour retrouver l’anneau perdu d’un paysan dont la ferme a été pillé par des gobelins. Le Donjon est un labyrinthe de couloirs et de portes, et de monstres. Utilisez vos talents, vos armes avec votre plein potentiel pour battre ce donjon.

                \tAu début du jeu, vous pouvez créer votre personnage, pour faire varier les plaisirs et utiliser un personnage tout fait. Cela dépend de votre style.
                \tLes combats se déroulent en tour par tour.
                \tUn seul monstre peut être présent dans une salle, et un boss est présent dans la salle finale.
                \tLes monstres peuvent donner des loots et vous permettre d'améliorer votre expérience.

                \tLe jeu respecte les règles de Donjon & Dragon et vous devrait faire attention aux caractéristiques de votre personnage et de vos armes.

                \tJe vais expliquer les différents point des caractéristiques
                \t\tLa dextérité → Pour les tirs à l’arc et l’initiative (déterminer celui qui commence en premier)
                \t\tLa force → Pour les attaques
                \t\tLa constitution → Pour les PV
                \t\tL’intelligence → Pour déterminer si un monstre est présent et si on le reconnaît.

                Bonne chance\n""");
    }
}
