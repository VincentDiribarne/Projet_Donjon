package Personne;

import Autres.Regles;

public class MenuPersonne {

    //A mettre dans Menu pour veiter de l'appeler en boucle
    public void choixMenu(int a) {
        Regles r = new Regles();
        Personne p = new Personne();
        if (a == 1) {
            p.creationPersonnage();
        }

        if (a == 2) {
            //chargerunPerso();
        }

        if (a == 3) {
            //changerlaCarte()
        }

        if (a == 4) {
            r.Regles();
        }

        if (a == 5) {
            System.exit(1);
        }
    }
}
