import Autres.FonctionAutre;
import Autres.Menu;
import Donjon.Donjon;
import Personne.Personne;
import Personne.menuPersonne;

public class Histoire {

    public static void main(String args[]){
        //Declaration
        Menu m = new Menu();
        menuPersonne mP = new menuPersonne();
        Donjon donjon = new Donjon();
        FonctionAutre fA = new FonctionAutre();


        //Histoire
        //donjon.creationDesSalles();
        //donjon.getSalleDepart().afficherSalle();
        //donjon.getSalleFin().afficherSalle();
        //Personne p = new Personne();
        //p.creationTirages();

        System.out.println("Bonjour et bienvenue dans notre Donjon Textuel.");
        System.out.println("Le menu va apparaitre, entrez un nombre qui correspond.");
        fA.temps(1000);
        mP.choixMenu(m.Menu());
    }









}
