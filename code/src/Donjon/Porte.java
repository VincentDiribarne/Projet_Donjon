package Donjon;

public class Porte {
    private boolean verouillé = false;
    private Salle salle1;
    private Salle salle2;
    private String direction;

    public Porte(Salle salle1, Salle salle2, String direction){
        super();
        this.salle1 = salle1;
        this.salle2 = salle2;
        this.direction = direction;
    }

    public Salle emprunterPorte(Salle salleActuelle){
        if (salleActuelle == salle1){
            return salle2;
        }
        return salle1;
    }

    public String getDirection(Salle salle) {
        if (salle==salle1){
            return direction;
        }
        switch (direction){
            case "O":
                return "E";
            case "E":
                return "O";
            case "S":
                return "N";
            case "N":
                return "S";
            default:
                return "";
        }
    }
}
