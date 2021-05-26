package controller;

import model.Inventaire.Loot;
import model.Inventaire.Arme;
import model.Library;
import model.Personne.Monstre;

public class LibraryController {
    public static Library library = new Library();

    public void createLibrary(){
        library.addMonster(new Monstre("Gobelin", 4, 1, -1, 0, 8, 1, 15));
        library.addMonster(new Monstre("Orque", 4, 0, 3, -1, 6, 3, 14));
        library.addMonster(new Monstre("Donotkesh Primeblood", 12, 0, 3, -1, 12, 3, 18));

        Arme epee = new Arme("Epee courte", 6,19,"Arme de guerre");
        Arme arc = new Arme("Arc court", 4,20,"Arme de guerre");
        Arme hache = new Arme("Grande hache", 10,20,"Arme de guerre");
        Arme lance = new Arme("Lance", 6,20,"Arme courrante");
        Arme epeeM = new Arme("Epée courte de maître", 8,19,"Arme de guerre de maître");

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


