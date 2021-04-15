import donjon.Donjon;
import donjon.Porte;
import donjon.Salle;

import javax.sound.sampled.Port;

public class Histoire {


    public static void main(String args[]){
        Donjon donjon = new Donjon();
        donjon.creationDesSalles();
        donjon.getSalleDepart().afficherSalle();
        donjon.getSalleFin().afficherSalle();

    }









}
