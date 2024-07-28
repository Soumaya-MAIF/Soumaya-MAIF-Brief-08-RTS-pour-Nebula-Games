package Classes;

public class Eclaireur extends Personnage{

    private Chef chef;
    public Eclaireur(String name, int health, Chef chef) {

        super(name, health);
        this.chef = chef;
    }
    public void explorer(){
        System.out.println("l'eclaireur explore les environs" );
    }

    public void transmettre(){
        System.out.println("l'eclaireur " + getName()+ " transmet des informations au chef " +chef.getName());
    }
}
