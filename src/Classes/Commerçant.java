package Classes;

public class Commerçant extends Personnage{
    public Commerçant(String name, int health) {
        super(name, health);
    }

    public void vendre(){
        System.out.println("Le commerçant vend ses produits" );
    }

    public void négocier(){
        System.out.println("le commerçat négocie avec ses clients" );
    }
}
