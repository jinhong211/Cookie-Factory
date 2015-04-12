Pour lancer le système de CoD:

    Dans le j2e: mvn clean package tomee:run
    Dans le client: mvn exec:java
    Pour le client connecter à distant: mvn clean package exec:java -Dexec.args="52.16.103.158" Mais, il faut lancer le serveur d'abord avec le fichier appserv.sem qui est à la racine de j2e.

#############################Comment utilise notre CodSystem############################
Vous pouvez choisir auto-run pour la démonstration automatique. 

Précondition: Le serveur est déjà lancé, après lancez l'utilisateur.

1. Insérez le nom d'utilisateur(Il y a trois utilisateurs prédéfinis dans notre système);
	*<<Tom>>: client
	*<<Carter>>: Cadre de boutique
	*<<Faith>>: Responsable de l'entreprise TCF

2. Soit vous êtes <<Faith>>, vous pouvez
	*créer une boutique
	*créer un ingrédient
	*créer une façon
	2.1. Pour créer une boutique, vous pouvez suivre les étapes et inséser les informations de boutique.
		*insérer l'addresse de boutique
		*la taxe
		*l'horaire de boutique. 
	2.2. Pour créer un ingrédient, vous pouvez suivre les étapes et inséser les informations d'ingrédient.
		*insérer le nom d'ingrédient
		*le prix d'ingrédient
	2.3. Pour créer une façon, vous pouvez suivre les étapes et inséser les informations de façon.
		*insérer le nom de façon
		*le temps utilisé de façon

3. Soit vous êtes <<Carter>>, vous pouvez regarder la statistique de chiffre de vente de chaque boutique.
	3.1. Vous pouvez suivre les étapes pour regarder le résultat.

4. Soit vous êtes <<Tom>>, vous pouvez passer une commande.
	4.1. Choisir une boutique
	4.2. Choisir une recette prédefini ou créer une nouvelle recette
	4.3. Insérer le date de récupération
	4.4. Insérer le quantité
	4.5. Insérer les informations de payment
		*le nom de client
		*l'addresse de client
		*le compte de banque
