package Classes;

import Enumeration.Constructibles;

public class Artisan extends Personnage {
    public Artisan(String name, int health) {
        super(name, health);
    }

    public void fabrique(Constructibles typeConstructible){
        System.out.println("le menuisier " + getName()+" fabrique des objets dans son "+ typeConstructible );
    }

    public void forger(Constructibles typeConstructible){
        System.out.println("le forgeron "+getName()+" fabrique des armes dans sa "+ typeConstructible);
    }

}
