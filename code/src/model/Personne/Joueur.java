package model.Personne;

public class Joueur extends Personne{



    private void seDeplacer(String direction){
        switch (direction){
            case "N":
                salleActuelle = salleActuelle.getPorteNord().emprunterPorte(salleActuelle);
                break;
            case "S":
                salleActuelle = salleActuelle.getPorteSud().emprunterPorte(salleActuelle);
                break;
            case "O":
                salleActuelle = salleActuelle.getPorteOuest().emprunterPorte(salleActuelle);
                break;
            case "E":
                salleActuelle = salleActuelle.getPorteEst().emprunterPorte(salleActuelle);
                break;
        }
    }

}
