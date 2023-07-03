# MINOREASE 👨‍👩‍👦


## Description 🌱

Minorease est un projet qui nous a été introduit lors d'un hackathon organisé dans le cadre de notre formation en développement web. Son but est de simplifier et sécuriser le processus de réservation d'hôtels pour les mineurs.

En prenant en compte les réglementations et exigences spécifiques pour les mineurs séjournant seuls, Minorease offre une plateforme où les parents peuvent facilement réserver des chambres d'hôtels pour leurs enfants. Minorease assure une vérification approfondie pour garantir que les hôteliers accueillent les mineurs en toute sécurité. Le site facilite également la gestion des documents nécessaires pour l'hébergement d'un mineur.

##  Prérequis 🔐

1. Créer une base de données MYSQL <br />

    Dans ce projet, la base de données ici 'memorize' doit etre créer avant de lancer l'application. Cependant dans ce projet la base de données n'a pas besoin d'être créée préalablement car elle sera générée automatiquement à partir du code.<br />

    Si vous souhaitez récupérer la base de données avec les données fictives intégrées vous pouvez directement importer le fichier sql  dans phpMyAdmin.<br />
Chemin du fichier dans le projet :

2. Cloner le repository<br />

    Vous pouvez consulter la documentation correspondante en cliquant sur le lien     suivant : https://docs.github.com/fr/repositories/creating-and-managing-repositories/cloning-a-repository.<br /> 
 Elle contient toutes les informations nécessaires pour cloner le dépôt.
     
3. Modification de application.properties<br />

    Pour pouvoir vous connecter à votre base de donnée vous devrez adapter votre configuration dans ce fichier situé dans resources/application.properties
Le port utilisé par l'API est le port 8080 par défaut , pour utiliser un autre port veuillez ajouter la ligne suivante :

    >server.port=

    Suivi du numéro de port que vous souhaitez utiliser.

    Afin de créer les tables de Spring Security 'authorities' et 'users', il faut modifier deux lignes dans le fichier application.properties :

    - Pour le premier lancement du projet, remplacez `update` par  `create ` dans la ligne suivante :

   >  spring.jpa.hibernate.ddl-auto=update

    - De même, remplacez `never` par  `always`  dans la ligne suivante :

    > spring.sql.init.mode=never

    Ceci permettra de créer les tables nécessaires à la première exécution du projet.

    Une fois le projet lancé et les tables créées, vous devez remettre les paramètres à leurs valeurs initiales ("update" et "never").
        
## Langages et Framework utilisés 🛠️

![](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)

![CSS3 Badge](https://img.shields.io/badge/CSS3-1572B6?logo=css3&logoColor=fff&style=flat-square)

![HTML5 Badge](https://img.shields.io/badge/HTML5-E34F26?logo=html5&logoColor=fff&style=flat-square)

![Bootstrap Badge](https://img.shields.io/badge/Bootstrap-7952B3?logo=bootstrap&logoColor=fff&style=flat-square)

![JavaScript Badge](https://img.shields.io/badge/JavaScript-F7DF1E?logo=javascript&logoColor=000&style=flat-square)

![Thymeleaf Badge](https://img.shields.io/badge/Thymeleaf-005F0F?logo=thymeleaf&logoColor=fff&style=flat-square)

![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff&style=flat-square)

![Spring Security Badge](https://img.shields.io/badge/Spring%20Security-6DB33F?logo=springsecurity&logoColor=fff&style=flat-square)



![MySQL Badge](https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=fff&style=flat-square)

![Hibernate Badge](https://img.shields.io/badge/Hibernate-59666C?logo=hibernate&logoColor=fff&style=flat-square)

![](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)

## Utilisation 💻

1. Configurationde la base de données :

    Importer le fichier 'memorize.sql' dans votre base de données MySQL ou bien lancer simplement pour créer la base avec les modifications nécessaires dans applications.properties. 

2. Exécution du projet :

    Après avoir cloner le projet dans un IDE (comme IntelliJ IDEA ou Eclipse), lancez l'application.

3. Accès à l'application :

    Accédez à l'application en entrant http://localhost:8080 dans la barre d'adresse de votre navigateur.<br />
    **Attention si vous avez changez le port remplacez 8080 par le port sélectionnés.** 

## Fonctionnalités 📋

- Connexion/inscription : <br />
 Créer, modifier et supprimer un compte.
- Visualisation des Hôtels :<br /> 
Voir et filtrer les hôtels disponibles.

- Détails de l'Hôtel :<br /> Accéder à l'information complète de chaque hôtel.

- Réservation : <br />Créer une réservation avec choix des options et paiement et visualiser ses réservations à partir du profil.

- Favoris : <br />Ajouter des hôtels à une liste de favoris, visualiser cette liste sur le profil et supprimer un favoris.

- Avis :<br /> Créer un avis avec commentaire et note sur la page détail de l'hôtel.

## Déroulement d'une réservation 🏨

Le processus de réservation sur Minorease a été pensé pour être simple et intuitif. Voici comment cela se passe :

1. Page d'accueil : http://localhost:8080/

   Connectez-vous ou inscrivez-vous depuis la page d'accueil.

    **Visualisation des hôtels :** Consultez les hôtels disponibles, utilisez les filtres selon vos besoins, et sélectionnez votre choix en cliquant sur "Plus d'infos".

2. Page d'informations de l'hôtel : http://localhost:8080/hotel

     Vous accédez à la page d'informations de l'hotel avec ses détails. Si l'hôtel répond à vos besoins, cliquez sur "Réserver".

3. Page de réservation : http://localhost:8080/reservation

   **Informations sur le mineur et documents requis :** Fournissez les informations du mineur et les documents justificatifs.

   **Choix des options et des services :** Sélectionnez les options et services pour le séjour.

   **Paiement :** Après avoir rempli les informations nécessaires et sélectionné les options désirées, procéder au paiement.

   **Confirmation de la réservation :** Consulter le récapitulatif et confirmez votre réservation en cliquant sur "Réserver" 

4. Page de profil : http://localhost:8080/profil
 
    Accédez à votre page de profil via la page d'accueil pour voir le détail de vos réservations.
        
