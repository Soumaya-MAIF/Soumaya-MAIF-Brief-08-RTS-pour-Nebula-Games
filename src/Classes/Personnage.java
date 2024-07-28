package Classes;

import Enumeration.Constructibles;

public abstract class Personnage {

        private String name;
        private Integer health;

    public Personnage(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seReposer(Constructibles typeConstructible){
        System.out.println(this.name +" se repose dans la "+ typeConstructible);
    }

    public void seRavitailler(){
        System.out.println(this.name +" se ravitaille");
    }

    public void vogue(){
        System.out.println(this.name +" vogue dans le village");
    }
}
