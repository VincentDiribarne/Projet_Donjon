package model.Donjon;

import model.Personne.Monstre;

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
        Salle salle4 = new Salle("Salle4",new Monstre("un Gobelin", 4, 1, -1, 0, 8, 1, 15));
        Salle salle5 = new Salle("Salle5");
        Salle salle6 = new Salle("Salle6");
        Salle salle7 = new Salle("Salle7");
        Salle salle8 = new Salle("Salle8");
        Salle salle9 = new Salle("Salle9");
        Salle salle10 = new Salle("Salle10");
        Salle salle11 = new Salle("Salle11");
        Salle salle12 = new Salle("Salle12");
        Salle salle13 = new Salle("Salle13");
        Salle salle14 = new Salle("Salle14");
        Salle salle15 = new Salle("Salle15");
        Salle salle16 = new Salle("Salle16");
        Salle salle17 = new Salle("Salle17");
        salleFin = new Salle("Salle final");


        salleDepart.lierSalle(salle4,"N");
        salle3.lierSalle(salle7,"N");
        salle4.lierSalle(salle5,"E");
        salle4.lierSalle(salle3,"O");
        salle5.lierSalle(salle9,"N");
        salle6.lierSalle(salle10,"N");
        salle6.lierSalle(salle2,"S");
        salle7.lierSalle(salle6,"O");
        salle8.lierSalle(salle7,"O");
        salle8.lierSalle(salle12,"N");
        salle9.lierSalle(salle8,"O");
        salle9.lierSalle(salle13,"N");
        salle10.lierSalle(salle14,"N");
        salle11.lierSalle(salle12,"E");
        salle12.lierSalle(salle13,"E");
        salle13.lierSalle(salle17,"N");
        salle14.lierSalle(salle15,"E");
        salle15.lierSalle(salle11,"S");
        salle16.lierSalle(salleFin,"N");
        salle17.lierSalle(salle16,"O");


    }

    public Salle getSalleDepart() {
        return salleDepart;
    }

    public Salle getSalleFin() {
        return salleFin;
    }
}
