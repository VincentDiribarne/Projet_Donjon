package Personne;

import Autres.Regles;

public class menuPersonne {

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
