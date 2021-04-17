import Autres.FonctionAutre;
import Autres.Menu;
import Donjon.Donjon;
import Personne.MenuPersonne;

public class Histoire {

    public static void main(String args[]){
        //Declaration
        Menu m = new Menu();
        MenuPersonne mP = new MenuPersonne();
        Donjon donjon = new Donjon();


        //Histoire
        //donjon.creationDesSalles();
        //donjon.getSalleDepart().afficherSalle();
        //donjon.getSalleFin().afficherSalle();
        //Personne p = new Personne();
        //p.creationTirages();

        System.out.println("Bonjour et bienvenue dans notre Donjon Textuel.");
        System.out.println("Le menu va apparaitre, entrez un nombre qui correspond.");
        FonctionAutre.temps(1000);
        mP.choixMenu(m.Menu());
    }









}
