package model.Metier;

public class Metier {

    protected int PVdeBase;
    protected String name;

    public Metier() {
       super();
    }

    //PV
    public int getPVdeBase() {
        return PVdeBase;
    }
    public void setPVdeBase(int PVdeBase) {
        this.PVdeBase = PVdeBase;
    }

    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
