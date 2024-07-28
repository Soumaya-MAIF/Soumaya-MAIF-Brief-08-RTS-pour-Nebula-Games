package Classes;

import Enumeration.Constructibles;

public class Soldat extends  Personnage{

    Chef chef;
    public Soldat(String name, int health, Chef chef) {

        super(name, health);
        this.chef = chef;
    }

    public void defendre(){
        System.out.println("les soldats defendent le village"  );
    }

    public void seReposer(Constructibles typeConstructible) {
        System.out.println("le soldat "+ getName() + " se repose dans la " + typeConstructible);
    }

    public void attaquer(){
        System.out.println("les soldats attaquent" );
    }

    public void patrouiller(){
        System.out.println("les soldats patrouillent" );
    }

    public void obeir(){
        System.out.println("les soldats obeissent au chef "+ chef.getName() );
    }




}
