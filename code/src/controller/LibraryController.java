package controller;

import model.inventory.Loot;
import model.inventory.Weapon;
import model.Library;
import model.person.Monster;

public class LibraryController {
    /**
     * Instanciate the Library
     * @see Library
     */
    public static Library library = new Library();

    /**
     * Create the library of weapon and monster
     */
    public void createLibrary(){
        library.addMonster(new Monster("Gobelin", 4, 1, -1, 0, 8, 1, 15));
        library.addMonster(new Monster("Orque", 4, 0, 3, -1, 6, 3, 14));

        Weapon epee = new Weapon("Epee courte", 6,19,"Arme de guerre");
        Weapon arc = new Weapon("Arc court", 4,20,"Arme de guerre");
        Weapon hache = new Weapon("Grande hache", 10,20,"Arme de guerre");
        Weapon lance = new Weapon("Lance", 6,20,"Arme courrante");
        Weapon epeeM = new Weapon("Epée courte de maître", 8,19,"Arme de guerre de maître");

        library.addWeapon(epee);
        library.addWeapon(arc);
        library.addWeapon(hache);
        library.addWeapon(lance);

        library.addLoot(new Loot(arc,75));
        library.addLoot(new Loot(hache,45));
        library.addLoot(new Loot(lance,60));
        library.addLoot(new Loot(epeeM,100));

    }




}


