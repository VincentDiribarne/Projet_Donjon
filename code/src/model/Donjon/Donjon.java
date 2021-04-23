package model.Donjon;

public class Donjon {


    private Salle salleFin;
    private Salle salleDepart;

    public Donjon(){
        super();
    }



    public void creationDesSalles(){
        salleDepart = new Salle("salleDepart");
        Salle salle2 = new Salle("Salle2");
        Salle salle3 = new Salle("Salle3");
        Salle salle4 = new Salle("Salle4");
        Salle salle5 = new Salle("Salle5");
        Salle salle6 = new Salle("Salle6");
        Salle salle7 = new Salle("Salle7");
        Salle salle8 = new Salle("Salle8");
        Salle salle9 = new Salle("Salle9");
        Salle salle11 = new Salle("Salle11");
        Salle salle12 = new Salle("Salle12");
        Salle salle13 = new Salle("Salle13");
        Salle salle14 = new Salle("Salle14");
        Salle salle15 = new Salle("Salle15");
        salleFin = new Salle("Salle final");


        salleDepart.lierSalle(salle2,"N");
        salle2.lierSalle(salle3,"E");
        salle2.lierSalle(salle5,"O");
        salle3.lierSalle(salle4,"N");
        salle4.lierSalle(salle5,"O");
        salle5.lierSalle(salle6,"N");
        salle5.lierSalle(salle15,"O");
        salle6.lierSalle(salle7,"E");
        salle6.lierSalle(salle14,"O");
        salle7.lierSalle(salle8,"N");
        salle8.lierSalle(salle9,"O");
        salle9.lierSalle(salleFin,"N");
        salle5.lierSalle(salle15,"N");
        salle15.lierSalle(salle7,"O");
        salle7.lierSalle(salle11,"S");
        salle7.lierSalle(salle8,"N");
        salle8.lierSalle(salle12,"N");
        salle12.lierSalle(salle13,"E");
        salle13.lierSalle(salle14,"S");

    }

    public Salle getSalleDepart() {
        return salleDepart;
    }

    public Salle getSalleFin() {
        return salleFin;
    }
}
