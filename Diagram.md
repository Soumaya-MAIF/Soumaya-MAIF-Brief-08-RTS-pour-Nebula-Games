```mermaid
---
title : Legacy of lands
---
classDiagram

%% CLASSES ABSTRAITES

class Personnage 
<<Abstract>> Personnage 
    Personnage: -String name
    Personnage: -Int health
    Personnage: seReposer()
    Personnage: seRaitailler()
    Personnage: voguer()
    
    

class Batiment 
<<Abstract>> Batiment
    Batiment : habite()

%%ENUMERATION

class Ressources{
<<Enumeration>>
    BOIS
    FER
    PIERRE
    NOURRITURE
}

class Constructible {
<<Enumeration>>
    MAISON
    CASERNE
    FERME
    ATELIER
    MURDEDEFENSE
    COMMERCE
}

class Soldat
    Soldat : defendre()
    Soldat : seReposer()
    Soldat : attaquer()
    Soldat : patrouiller()
    Soldat : obeir()

class Villageois
    Villageois : collecte()
    Villageois : construire()
    Villageois : récolte()
    Villageois : cultiver()

class Artisan
    Artisan : fabrique()
    Artisan : forger()


class Eclaireur
    Eclaireur : explorer()
    Eclaireur : transmet()


class Commerçant
    Commerçant : vendre()
    Commerçant : negocier()

class Chef
    Chef : commander()
    Chef : ordonner()

Personnage <|-- Soldat
Personnage <|-- Villageois
Personnage <|-- Artisan
Personnage <|-- Eclaireur
Personnage <|-- Commerçant
Personnage <|-- Chef
Chef <|-- Eclaireur
Batiment --> Constructible : typeConstructible
Personnage --> Ressources : typeRessources
Villageois --> Artisan
Villageois --> Commerçant
Villageois --> Chef
Soldat --> Chef
Artisan --> Commerçant
Eclaireur --> Chef
Personnage <|-- Batiment

