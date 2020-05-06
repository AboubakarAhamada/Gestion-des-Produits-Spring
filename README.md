
# Auteur :  ABOUBAKAR AHAMADA								 
# Date : 06/05/2020											 
# Lieu : Casablanca											 

# PROJET 
Une application web de gestion des produits bas� sur       
Java et le Framework Spring Boot.							 

# Fonctionaalit�s

C'est une application simple qui permet de r�aliser des op�rations
CRUD (Create, Retrive, Update,Delete) sur un ensemble des �l�ments que 
j'ai nomm�s prouits qui sont dans une base de donn�es.
Un utilisateur se connecte, et selon ces droit, il peut effectuer 
les op�rations qui lui sont autoris�es. 

# En r�sum� : 

- Cette application va couvrir l'ajout, la consulatation, la suppression, la modification
des produits selon des droits.
- J'ai aussi utilis� un syst�me de pagination pour ne pas afficher tous les produits sur la m�me page.
- La personne connect�e, son nom est affich� sur la barde de menu.
- Il y a l'option pour se deconnecter.

# Technologies utilis�es:

Dans cette p�tite application bas�e sur le framework Spring boot, j'ai utilis�
diff�rents modules de Spring notament : Spring JPA, Spring Security et bien
�vidament le Spring web. 
Pour la base de donn�es, c'est le SGBD MySQL qui est utilis�. 
Pour la partie Front end, j'ai utilis�  le moteur de templ�te Thymeleaf
accompagn� de Bootstap 3 et un peu du css pour le design. 

# Ce que j'ai appris:

Avant je voyais Spring comme un casse-t�te et je ne voyais pas son int�ret 
vu qu'il y a le Servlet, JSP, etc. D'ailleurs, je vous invite � vister 
cette m�me application que j'ai cr�e mais avec les Servlet, JSP, JSTL et JDBC ici :
https://github.com/AboubakarAhamada/GestionPrdouits_JEE_JDBC/wiki

Apr�s �a j'ai d�cid� de programmer cette m�me application avec Spring Boot. 
Et voil� ce que j'ai appris : 
1. Spring est l� pour me faciliter la vie.
2. Avec Spring tout est rendu facile et sure.
3. Sprind Data JPA, facilite l'acc�s aux donn�es. Sauf pour des requetes personnalis�es mais
il de donne des fonctions qui permet de faires des op�rations CRUD sans le mondre code SQL ni des PreparedStatement
comme le fait avec JDBC. 
la pagination, la validation des donn�es (avant j'utilise 'required' hhhh) 
4. Spring Security, c'est le module de Spring qui m'a beaucoup surpris. 
5. Spring c'est tout sauf ce que je pensais avant. C'est l'avenir.
6. Je continue d'apprendre ce Framework. 