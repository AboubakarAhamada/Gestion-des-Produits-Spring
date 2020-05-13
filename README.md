
# Auteur :  ABOUBAKAR AHAMADA								 
# Date : 06/05/2020											 
# Lieu : Casablanca											 

# Projet :
Une application web de gestion des produits basée sur       
Java et le Framework Spring Boot.							 

# Fonctionalités :

C'est une application simple qui permet de réaliser des opérations
CRUD (Create, Retrive, Update,Delete) sur un ensemble des éléments que 
j'ai nommés prouits qui sont dans une base de données.
Concrêtement, l'utilisateur peut :

0. Se connecter et se déconnecter.
1. Chercher des produits par mot clé.
2. Ajouter un produit dans la base de données.
3. Modifier un produit existant.
4. Supprimer un produit de la base de données.

Pour la recherche des produits par mot clé, le resultat est affiché dans des pages sur lesquelles
on peut naviguer. Cela evite l'utilisateur de défiler la page dans le cas où la recherche renvoie 
plusieurs produits.

# Démo : 
 Voir une démo de l'application ici : https://github.com/AboubakarAhamada/Gestion-des-Produits-Spring/wiki 
 
# Structure de l'application :
 L'application est structurée en packages:
 1. Dans le package com.aboubakar.entities : il y a les entités Produit et User. 
 2. Dans la package com.aboubakar.dao: il y a l'interface ProduitRepository et UserRepository qui heritent de JpaRepository. 
 3. Dans le package com.aboubakar.web : il y a la classe ProuitControlleur. 
 
# Technologies utilisées :
- Java 
- Spring Boot
- Spring Data JPA 
- SGBD : MySQL. 
- UI : Thymeleaf, Bootstrap 3

# Outils de développement :
- IDE : Eclipse
- Gestion de dépendences : Maven
- Autre : Spring Boot DevTools

# Comment utiliser cette application ?
 Pour utiliser cette application, il suffit juste de  modifier le fichier 'application.properties' pour
 mettre le nom de choix votre base de donnée et les coordonées d'accès à la base de données
 à savoir le 'username' et le 'password'. 
 
# Contacter moi: 
LinkedIn : https://www.linkedin.com/in/aboubakar-ahamada-150a70b4/
 
