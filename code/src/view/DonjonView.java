package view;

import model.Donjon.Porte;
import model.Donjon.Salle;

import java.util.ArrayList;

public class DonjonView {

    public String choixSalle(ArrayList<Porte> sallesDisponibles, Salle salleJoueur){
        ArrayList<String> choixDisponibles = new ArrayList<String>();
        Console.ecrire("Vous êtes dans la salle "+ salleJoueur.getNom());
        Console.ecrire("Vous pouvez maintenant vous déplacer : ");
        for (Porte p: sallesDisponibles) {
            voirSallePorte(p,salleJoueur);
            if (p != null){
                choixDisponibles.add(p.getDirection(salleJoueur));
            }
        }
        return choixSalleJoueur(choixDisponibles);


    }

    public void voirSallePorte(Porte porte,Salle salle){
        if (porte != null){
            System.out.println("Porte " +porte.getDirection(salle)+ " vers la salle " + porte.emprunterPorte(salle).getNom());;
        }
    }

    public String choixSalleJoueur(ArrayList<String> choixDisponible){
        Console.ecrire("Votre choix : ");
        String res = Clavier.LectureString();
        for (String s: choixDisponible){
            if (res.equals(s)){
                return res;
            }
        }
        return choixSalleJoueur(choixDisponible);
    }


}
