package donjon;

public class Donjon {

    private Salle salleFin;

    private Salle salleDepart;

    public Donjon(){
        super();
    }

    public void creationDesSalles(){
        salleDepart = new Salle("salleDepart");
        Salle salle2 = new Salle("Salle2");
        salleDepart.lierSalle(salle2,"N");

        Salle salle3 = new Salle("Salle3");
        salleDepart.lierSalle(salle3,"O");

        Salle salle4 = new Salle("Salle4");
        salle2.lierSalle(salle4,"N");

        salleFin = new Salle("Salle final");
        salle4.lierSalle(salleFin,"E");

    }

    public Salle getSalleDepart() {
        return salleDepart;
    }

    public Salle getSalleFin() {
        return salleFin;
    }
}
