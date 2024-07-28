package Classes;

import Enumeration.Constructibles;
import Enumeration.Ressources;

import java.util.ArrayList;
import java.util.List;

public class Villageois extends Personnage implements Interfaces.Ressources, Interfaces.Constructible {

    List<Ressources> sacADos=new ArrayList<Ressources>();
    public Villageois(String name, Integer health) {
        super(name, health);

    }

    public void collecter(Ressources ressources){
        System.out.println(getName()+" collecte " + ressources  );
    }

    public void construire(Constructibles typeConstructible){
        System.out.println(getName()+" a construit " + typeConstructible);
    }

    public void recolter(Ressources ressources){
        System.out.println(getName()+" a récolté " + ressources);
        this.sacADos.add(ressources);
        System.out.println(this.sacADos);
    }

    public void cultiver(Ressources ressources){
        System.out.println(getName()+" a cultivé  " + ressources);
    }



}
