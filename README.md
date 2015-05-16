Pour lancer le système de CoD:

    Dans le j2e: mvn clean package tomee:run
    Dans le client: mvn exec:java
    Pour le client connecter à distant: mvn clean package exec:java -Dexec.args="52.16.103.158" Mais, il faut lancer le serveur d'abord avec le fichier appserv.sem qui est à la racine de j2e.

Pour lancer le système de DotNet:

	Dans le répertoire de DAO,ServiceTCF,WcfServiceTCF, il y a un sous répertoire de conf, changer le connectionStrings à vôtre dans le fichier appSettings.xml, et même pour le app.config dans 
	le répertoire de Test.
	Chaque fois, vous devez lancer les deux webservice, un de ServiceTCF.ServiceTCF, l'autre de WcfServiceTCF.ServiceTCF.

Pour le SQL Server:

	Il y a un fichier de DumpTCFLogin.bak pour restaurer le backup de la base de donée.
#############################Comment utilise notre .NetSystem############################
1. Créer un compte.
2. Valider votre accès aux systèmes TCF.

3. Entrer dans le CoD Système.
	*<<admin>> login:admin , mot de passe: admin, vous pouver lister les paiements des différents utilisateurs du service afin d’avoir un historique comptable.
	*<<user>> 1.vous pouvez fournir votre informations de paiements afin de faciliter votre futures commandes
			  2.vous pouvez lister votre historique de paiement afin de connaître le montant de votre factures.
			  3.vous pouvez passer une commande avec le CodSystem.


#############################Comment utilise notre CodSystem############################

Précondition: Le serveur est déjà lancé, après lancez l'utilisateur.

1. Insérez le nom d'utilisateur(Il y a trois utilisateurs prédéfinis dans notre système);
	*<<Tom>>: client avec compte. login: Tom , mot de passe: 123.
	*<<Carter>>: Cadre de boutique de Denver. login: Carter , mot de passe: 123.
	*<<Faith>>: Responsable de l'entreprise TCF. login: Faith , mot de passe: 123.
	*<<Brenda>>: client sans compte. pas de compte pour lancer.

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

3. Soit vous êtes <<Carter>>, vous pouvez regarder la statistique de chiffre de vente de son boutique.
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
	4.6. Payer la commande.

5. Soit vous êtes <<Brenda>>, vous pouvez.
	*créer un compte
	*passer une commande
	5.1 Si vous avez créer un compte, vous pouvez passer une commande comme Tom.
	    Si non, vous n'avez pas les préférences à choisir.
	5.2 Pour créer un compte:
		*Insérer le login
		*Insérer le mot de passe
		*Choisir le boutique préféré.
		*Choisir le recette préféré.
	
	