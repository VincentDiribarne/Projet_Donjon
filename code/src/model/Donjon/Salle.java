package model.Donjon;

public class Salle {
    private Porte porteNord = null;
    private Porte porteSud = null;
    private Porte porteEst = null;
    private Porte porteOuest = null;
    private String nom;


    public Salle(String nom){
        super();
        this.nom = nom;
    }


    public void afficherSalle(){
        voirSallePorte(porteOuest);
        voirSallePorte(porteNord);
        voirSallePorte(porteEst);
        voirSallePorte(porteSud);

    }

    public void voirSallePorte(Porte porte){
        if (porte != null){
            System.out.println("Vous pouvez prendre la porte " +porte.getDirection(this)+ " vers la salle " + porte.emprunterPorte(this).getNom());;
        }
    }





    /**
     * Fonction qui crée un lien entre deux salles en créant une porte. La direction prend comme referentiel la salle qui appelle la méthode.
     * @param salle2
     * @param direction
     */
    public void lierSalle(Salle salle2, String direction){
        Porte porte = new Porte(this,salle2,direction);
        switch (direction){
            case "O":
                setPorteOuest(porte);
                salle2.setPorteEst(porte);
                break;
            case "E":
                setPorteEst(porte);
                salle2.setPorteOuest(porte);
                break;
            case "N":
                setPorteNord(porte);
                salle2.setPorteSud(porte);
                break;
            case "S":
                setPorteSud(porte);
                salle2.setPorteNord(porte);
                break;
            default:
                System.out.println("Erreur lors de la création de la salle");
                break;
        }
    }




    //Accesseurs

    public Porte getPorteNord() {
        return porteNord;
    }

    public void setPorteNord(Porte porteNord) {
        this.porteNord = porteNord;
    }

    public Porte getPorteSud() {
        return porteSud;
    }

    public void setPorteSud(Porte porteSud) {
        this.porteSud = porteSud;
    }

    public Porte getPorteEst() {
        return porteEst;
    }

    public void setPorteEst(Porte porteEst) {
        this.porteEst = porteEst;
    }

    public Porte getPorteOuest() {
        return porteOuest;
    }

    public void setPorteOuest(Porte porteOuest) {
        this.porteOuest = porteOuest;
    }

    public String getNom() {
        return nom;
    }
}
