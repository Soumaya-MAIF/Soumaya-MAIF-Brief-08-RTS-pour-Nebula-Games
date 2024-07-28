package Classes;

public class Chef extends Personnage{
    public Chef(String name, int health) {
        super(name, health);
    }

    public void commander(){
        System.out.println("le Chef " +getName()+" commande ses troupes" );
    }

    public void ordonner(){
        System.out.println("le Chef " +getName()+" donne ses ordres à ses soldats" );
    }
}
