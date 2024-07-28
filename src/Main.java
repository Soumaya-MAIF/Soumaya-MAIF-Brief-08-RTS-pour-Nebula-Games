import Classes.*;
import Enumeration.Constructibles;
import Enumeration.Ressources;
import Interfaces.Constructible;

public class Main {
    public static void main(String[] args) {



// Création initiale des villageois et du chef
        Villageois villageois1 = new Villageois("Leofric", 10);
        Villageois villageois2 = new Villageois("Godefroy", 10);
        Villageois villageois3 = new Villageois("Bertram", 10);
        Chef chef = new Chef("Gerard", 100);

// Les villageois construisent les premières maisons
        villageois1.construire(Constructibles.MAISON);
        villageois2.construire(Constructibles.MAISON);
        villageois3.construire(Constructibles.MAISON);


// Les villageois commencent à cultiver et récolter des ressources
        villageois1.cultiver(Ressources.NOURRITURE);
        villageois1.recolter(Ressources.NOURRITURE);
        villageois3.collecter(Ressources.NOURRITURE);
        villageois3.recolter(Ressources.NOURRITURE);

// Création des artisans pour développer les infrastructures
        Artisan artisan1 = new Artisan("Anselm", 10);
        Artisan artisan2 = new Artisan("Wilfred", 10);

// Les artisans s'activent dans leur domaine
        artisan1.fabrique(Constructibles.ATELIER);
        artisan2.forger(Constructibles.FORGE);

// Le chef surveille le village
        chef.vogue();

// Création d'un éclaireur et d'un soldat pour protéger et explorer
        Eclaireur eclaireur = new Eclaireur("Ulric", 20, chef);
        Soldat soldat = new Soldat("Armand", 50, chef);

// L'éclaireur part explorer les environs et rapporte des informations
        eclaireur.explorer();
        eclaireur.transmettre();

// Le village se développe et un nouveau villageois est créé
        Villageois villageois4 = new Villageois("Isabeau", 10);

// Le nouveau villageois construit une caserne pour la défense
        villageois4.construire(Constructibles.CASERNE);

// Le soldat se repose dans la caserne pour être prêt à défendre
        soldat.seReposer(Constructibles.CASERNE);
        soldat.patrouiller();
        soldat.defendre();


// Les villageois continuent à construire et récolter pour le village
        villageois2.construire(Constructibles.COMMERCE);
        villageois1.recolter(Ressources.NOURRITURE);
        villageois1.recolter(Ressources.FER);

// Le soldat reste vigilant et défend le village
        soldat.obeir();
        soldat.defendre();




    }
}