# Cours de systemes distribué N°6

## Definitions/Autres

- Hibernate : framework open source gérant la persistance des objets en base de données relationnelle.

## Hibernate et persistance

Hibernate utilise aussi un fichier de configuration (hibernate.cfg.xml) qui contient les propriétés de connexions à la base de données relationnelle.

Ensuite dans la construction du code façon DAO on retrouve différentes classes avec différents rôles :
- La classe "Factory" pour la connexion à la base de données
- La classe qui contient les variables reliés aux champs de la base de données (avec @entity et @Table)
- La classe "Manager" qui va définir les méthodes sur les variables de la classe ci-dessus
