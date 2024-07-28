package Interfaces;

import Enumeration.Constructibles;

public interface Constructible {



    public default void construireBatiment(Constructibles type){
        System.out.println(type +" a été construite");
    }


}
