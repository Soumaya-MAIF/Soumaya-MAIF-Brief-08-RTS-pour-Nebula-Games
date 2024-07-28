package Classes;

import Enumeration.Constructibles;
import Interfaces.Constructible;

public abstract class Batiment extends Personnage implements Constructible {




    public Batiment(String name, Integer health ,Constructibles typeConstructible) {
        super(name, health);

    }

    public void habite(Constructible type){
        System.out.println(getName()+ " habite " + type);
    }


}
