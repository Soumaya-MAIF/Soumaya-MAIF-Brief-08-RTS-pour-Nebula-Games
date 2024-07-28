package Interfaces;

public interface Ressources {

    public default void récolte(Ressources ressources){
        System.out.println(" récolte de la" + ressources);
    }

    public default void cultive(Ressources ressources){

        System.out.println(" cultive " + ressources);
    }
}
