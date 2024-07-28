```mermaid

sequenceDiagram

Villageois ->> Ressources: Récolte des ressources
Villageois ->> Village: Ramène les ressources
Village ->> MurDefense: Utilise les ressources pour terminer le mur de défense
Villageois ->> Maison: Part se reposer dans sa maison
Ennemis ->> Village: Un groupe de soldats ennemis attaque
Ennemis ->> MurDefense: Détruit le nouveau mur de défense
