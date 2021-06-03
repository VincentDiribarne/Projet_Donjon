package model.Inventory;

import java.util.ArrayList;

public class Inventory {

    /**
     * Create an ArrayList for all the weapon
     * @see Weapon
     */
    private final ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    /**
     * Add a weapon in the ArrayList
     * @param weapon
     * @see Weapon
     */
    public void addArme(Weapon weapon){
        weapons.add(weapon);
    }

    @Override
    public String toString() {
        String resp = "Voici le contenu de l'inventaire : \n";
        int i = 1;
        for (Weapon weapon : weapons) {
            resp += "- " + i + " " + weapon + "\n";
            i++;
        }
        return resp;
    }

    public ArrayList<Weapon> getArmes() {
        return weapons;
    }

}
