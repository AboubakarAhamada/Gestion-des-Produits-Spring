
# Auteur :  ABOUBAKAR AHAMADA								 
# Date : 06/05/2020											 
# Lieu : Casablanca											 

# PROJET 
Une application web de gestion des produits basé sur       
Java et le Framework Spring Boot.							 

# Fonctionaalités

C'est une application simple qui permet de réaliser des opérations
CRUD (Create, Retrive, Update,Delete) sur un ensemble des éléments que 
j'ai nommés prouits qui sont dans une base de données.
Un utilisateur se connecte, et selon ces droit, il peut effectuer 
les opérations qui lui sont autorisées. 

# En résumé : 

- Cette application va couvrir l'ajout, la consulatation, la suppression, la modification
des produits selon des droits.
- J'ai aussi utilisé un système de pagination pour ne pas afficher tous les produits sur la même page.
- La personne connectée, son nom est affiché sur la barde de menu.
- Il y a l'option pour se deconnecter.

# Technologies utilisées:

Dans cette pétite application basée sur le framework Spring boot, j'ai utilisé
différents modules de Spring notament : Spring JPA, Spring Security et bien
évidament le Spring web. 
Pour la base de données, c'est le SGBD MySQL qui est utilisé. 
Pour la partie Front end, j'ai utilisé  le moteur de templète Thymeleaf
accompagné de Bootstap 3 et un peu du css pour le design. 

# Ce que j'ai appris:

Avant je voyais Spring comme un casse-tête et je ne voyais pas son intêret 
vu qu'il y a le Servlet, JSP, etc. D'ailleurs, je vous invite à vister 
cette même application que j'ai crée mais avec les Servlet, JSP, JSTL et JDBC ici :
https://github.com/AboubakarAhamada/GestionPrdouits_JEE_JDBC/wiki

Après ça j'ai décidé de programmer cette même application avec Spring Boot. 
Et voilà ce que j'ai appris : 
1. Spring est là pour me faciliter la vie.
2. Avec Spring tout est rendu facile et sure.
3. Sprind Data JPA, facilite l'accès aux données. Sauf pour des requetes personnalisées mais
il de donne des fonctions qui permet de faires des opérations CRUD sans le mondre code SQL ni des PreparedStatement
comme le fait avec JDBC. 
la pagination, la validation des données (avant j'utilise 'required' hhhh) 
4. Spring Security, c'est le module de Spring qui m'a beaucoup surpris. 
5. Spring c'est tout sauf ce que je pensais avant. C'est l'avenir.
6. Je continue d'apprendre ce Framework. 