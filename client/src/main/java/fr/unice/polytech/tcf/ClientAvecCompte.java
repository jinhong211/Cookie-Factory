package fr.unice.polytech.tcf;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by ding on 14/05/15.
 */
public class ClientAvecCompte {
/*
    public static void main(String[] args) throws IOException {
        // Dynamically building the targeted web service location (default to localhost if not provided)
        String host = ( args.length == 0 ? "localhost" : args[0]);
        String address = "http://"+host+":8080/demo/webservices/ClientSansCompteServiceImpl";
        URL wsdlLocation = null;
        String address1 = "http://"+host+":8080/demo/webservices/TcfServiceImpl";
        URL wsdlLocation1 = null;
        String address2 = "http://"+host+":8080/demo/webservices/ClientAvecCompteServiceImpl";
        URL wsdlLocation2 = null;
        try { wsdlLocation = new URL(address + "?wsdl"); } catch (Exception e) { System.exit(0); }
        try { wsdlLocation1 = new URL(address1 + "?wsdl"); } catch (Exception e) { System.exit(0); }
        try { wsdlLocation2 = new URL(address2 + "?wsdl"); } catch (Exception e) { System.exit(0); }

        // Instantiating the client stub code
        stub.ClientSansCompteServiceImplService srv = new ClientSansCompteServiceImplService(wsdlLocation);
        stub.TcfServiceImplService srv1 = new TcfServiceImplService(wsdlLocation1);
        stub.ClientAvecCompteServiceImplService srv2 = new ClientAvecCompteServiceImplService(wsdlLocation2);
        // stub.TcfServiceImplService srv = new TcfServiceImplService(wsdlLocation); // dynamic WSDL location
        stub.ClientSansCompteService port = srv.getClientSansCompteServiceImplPort();
        stub.TcfService port1 = srv1.getTcfServiceImplPort();
        stub.ClientAvecCompteService port2 = srv2.getClientAvecCompteServiceImplPort();
        // stub.TcfService port = srv.getTcfServiceImplPort();


        // Dynamically setting the address where the web service is really deployed
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
        ((BindingProvider) port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address1);
        ((BindingProvider) port2).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address2);

        log(port, port1,port2);
    }*/

    public void log(String login,DotNetStub.IServiceTCF port5,stub.ClientSansCompteService port, stub.TcfService port1, stub.ClientAvecCompteService port2) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------BIENVENUE, VOUS VOULEZ FAIRE UNE COMMANDE---------");
        System.out.println("----------------[1] CHOIX PREFERE--------------------------");
        System.out.println("----------------[2] CHOIX NORMAl---------------------------");
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("--------------INSERER LE NUMERO DE ACTION------------------");
        System.out.println("-----------------------------------------------------------");
        String veux = bufferRead.readLine();
        if("0".equals(veux))return;
        while (!"1".equals(veux) && !"2".equals(veux) && !"3".equals(veux)){
            System.err.println("#####################ACTION INCONNUE#######################");
            System.out.println("----------------[1] CHOIX PREFERE--------------------------");
            System.out.println("----------------[2] CHOIX NORMAl---------------------------");
            System.out.println("----------------[0] POUR ABANDONNER------------------------");
            System.out.println("--------------INSERER LE NUMERO DE ACTION------------------");
            System.out.println("-----------------------------------------------------------");
            veux = bufferRead.readLine();
            if(veux.equals("0"))return;
        }
        if("1".equals(veux)){
            System.out.println(commandePrefere(login,port5,port,port2));
        } else if("2".equals(veux)){
            System.out.println(paserCommand(login,port5,port,port1));
        }

    }

    public double commandePrefere(String login,DotNetStub.IServiceTCF port5,stub.ClientSansCompteService port, stub.ClientAvecCompteService port2) throws IOException {
        int id = port5.getID(login);
        System.out.println(port2.getBoutiquePrefere(id));
        System.out.println(port2.getRecettePrefere(id));
        String boutique = port2.getBoutiquePrefere(id);
        String recette = port2.getRecettePrefere(id);
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nInsérez l'heure de votre récuperation?");
        boolean error;
        int heureI = 0;
        String heure = "";
        heure = bufferRead.readLine();
        heureI = Integer.parseInt(heure);

        System.out.println("-----------------------------------------------------------");
        System.out.println("\nInsérez la quantité?");
        error = true;
        int quantiteI = 0;
        String quantite = "";
        while(error){
            try{
                quantite = bufferRead.readLine();
                quantiteI = Integer.parseInt(quantite);
                error = false;
            } catch (Exception e){
                System.err.println("##################QUANTITE FORME INVALIDE##################");
                System.out.println("-----------------------------------------------------------");
                System.out.println("\nInsérez la quantité?");
            }
        }

        GregorianCalendar cc = new GregorianCalendar();
        cc.set(Calendar.HOUR_OF_DAY, heureI);

        try {
            System.out.println(boutique);
            System.out.println(recette);
            System.out.println(quantiteI);
            System.out.println(DatatypeFactory.newInstance().newXMLGregorianCalendar(cc));
            double prix = port.passerCommand(boutique,recette, DatatypeFactory.newInstance().newXMLGregorianCalendar(cc),quantiteI);
            if(prix - 0 > 0.001){
                Random r=new Random();
                int i=r.nextInt(90000)+10000;
                String result = null;
                String choix = null;
                while(!"success".equals(result)) {
                    System.out.println(port5.addHistAccount(login, i, boutique, recette, quantiteI, DatatypeFactory.newInstance().newXMLGregorianCalendar(cc).toString()));
                    System.out.println("##################SYSTEME DE PAYMENT##################");
                    System.out.println(port5.getListInfoAccount(login));
                    System.out.println("Vous pouvez choisir l'information de payment dans la list(Choisir|Nouveau|Quitter)");
                    choix = bufferRead.readLine();
                    if("Choisir".equals(choix)){
                        int num;
                        int cry;
                        System.out.println("Carte number:");
                        num = Integer.parseInt(bufferRead.readLine());
                        System.out.println("Cryptogramme:");
                        cry = Integer.parseInt(bufferRead.readLine());
                        result = port5.payment("user",login,num,cry,prix);
                    }else if("Nouveau".equals(choix)){
                        String name;
                        String surname;
                        int num;
                        String address;
                        String date;
                        int cry;
                        System.out.println("Name:");
                        name = bufferRead.readLine();
                        System.out.println("Surname:");
                        surname = bufferRead.readLine();
                        System.out.println("Carte number:");
                        num = Integer.parseInt(bufferRead.readLine());
                        System.out.println("Address:");
                        address = bufferRead.readLine();
                        System.out.println("Expiration Date:");
                        date = bufferRead.readLine();
                        System.out.println("Cryptogramme:");
                        cry = Integer.parseInt(bufferRead.readLine());
                        result = port5.payment("custom",login,num,cry,prix);
                        if("success".equals(result)){
                            System.out.println(port5.addInfoAccount(login,name,surname,num,address,date,cry));
                        }
                    }else if("Quitter".equals(choix)){
                        System.out.println("Echec à payer!");
                        break;
                    }
                    System.out.println(result);
                }
                return prix;
            } else{
                return 0;
            }
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public double paserCommand(String login,DotNetStub.IServiceTCF port5,stub.ClientSansCompteService port, stub.TcfService port1) throws IOException {

        String boutique = null, recette = null;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("---------BIENVENUE, VOUS VOULEZ FAIRE UNE COMMANDE---------");
            System.out.println("----------------[1] POUR COMMANDER-------------------------");
            System.out.println("----------------[0] POUR ABANDONNER------------------------");
            System.out.println("--------------INSERER LE NUMERO DE ACTION------------------");
            System.out.println("-----------------------------------------------------------");
            String veux = bufferRead.readLine();
            if("0".equals(veux))return 0;
            while (!"1".equals(veux)){
                System.err.println("#####################ACTION INCONNUE#######################");
                System.out.println("----------------[1] POUR COMMANDER-------------------------");
                System.out.println("----------------[0] POUR ABANDONNER------------------------");
                System.out.println("--------------INSERER LE NUMERO DE ACTION------------------");
                System.out.println("-----------------------------------------------------------");
                veux = bufferRead.readLine();
                if(veux.equals("0"))return 0;
            }

            boutique = choisirBoutique(port1);
            String action;
            showRecetteMainMenu();
            action = bufferRead.readLine();
            while (!"1".equals(action) && !"2".equals(action) && !"0".equals(action)) {
                System.err.println("######################ACTION INVALIDE######################");
                showRecetteMainMenu();
                action = bufferRead.readLine();
            }
            if ("O".equals(action)) {
                System.err.println("###################COMMANDE ABANDONNER#####################");
                return 0;
            } else if ("2".equals(action)) {
                recette = creerRecette(port, port1);
            } else if ("1".equals(action)) {
                recette = choisirRecette(port1);
            }
            if (recette == null) {
                System.err.println("###################COMMANDE ABANDONNER#####################");
                return 0;
            }

        }catch(Exception e){

        }

        System.out.println("\nInsérez l'heure de votre récuperation?");
        boolean error;
        int heureI = 0;
        String heure = "";
        heure = bufferRead.readLine();
        heureI = Integer.parseInt(heure);

        System.out.println("-----------------------------------------------------------");
        System.out.println("\nInsérez la quantité?");
        error = true;
        int quantiteI = 0;
        String quantite = "";
        while(error){
            try{
                quantite = bufferRead.readLine();
                quantiteI = Integer.parseInt(quantite);
                error = false;
            } catch (Exception e){
                System.err.println("##################QUANTITE FORME INVALIDE##################");
                System.out.println("-----------------------------------------------------------");
                System.out.println("\nInsérez la quantité?");
            }
        }

        GregorianCalendar cc = new GregorianCalendar();
        cc.set(Calendar.HOUR_OF_DAY, heureI);


        try {
            System.out.println(boutique);
            System.out.println(recette);
            System.out.println(quantiteI);
            System.out.println(DatatypeFactory.newInstance().newXMLGregorianCalendar(cc));
            double prix = port.passerCommand(boutique,recette, DatatypeFactory.newInstance().newXMLGregorianCalendar(cc),quantiteI);
            if(prix - 0 > 0.0001){
                Random r=new Random();
                int i=r.nextInt(90000)+10000;
                System.out.println(port5.addHistAccount(login,i,boutique,recette,quantiteI,DatatypeFactory.newInstance().newXMLGregorianCalendar(cc).toString()));
                String result = null;
                String choix = null;
                while(!"success".equals(result)) {
                    System.out.println(port5.addHistAccount(login, i, boutique, recette, quantiteI, DatatypeFactory.newInstance().newXMLGregorianCalendar(cc).toString()));
                    System.out.println("##################SYSTEME DE PAYMENT##################");
                    System.out.println(port5.getListInfoAccount(login));
                    System.out.println("Vous pouvez choisir l'information de payment dans la list(Choisir|Nouveau|Quitter)");
                    choix = bufferRead.readLine();
                    if("Choisir".equals(choix)){
                        int num;
                        int cry;
                        System.out.println("Carte number:");
                        num = Integer.parseInt(bufferRead.readLine());
                        System.out.println("Cryptogramme:");
                        cry = Integer.parseInt(bufferRead.readLine());
                        result = port5.payment("user",login,num,cry,prix);
                    }else if("Nouveau".equals(choix)){
                        String name;
                        String surname;
                        int num;
                        String address;
                        String date;
                        int cry;
                        System.out.println("Name:");
                        name = bufferRead.readLine();
                        System.out.println("Surname:");
                        surname = bufferRead.readLine();
                        System.out.println("Carte number:");
                        num = Integer.parseInt(bufferRead.readLine());
                        System.out.println("Address:");
                        address = bufferRead.readLine();
                        System.out.println("Expiration Date:");
                        date = bufferRead.readLine();
                        System.out.println("Cryptogramme:");
                        cry = Integer.parseInt(bufferRead.readLine());
                        result = port5.payment("custom",login,num,cry,prix);
                        if("success".equals(result)){
                            System.out.println(port5.addInfoAccount(login,name,surname,num,address,date,cry));
                        }
                    }else if("Quitter".equals(choix)){
                        System.out.println("Echec à payer!");
                        break;
                    }
                    System.out.println(result);
                }
                return prix;
            } else{
                return 0;
            }
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private void showRecetteMainMenu(){
        System.out.println("----------------------RECETTE ACTION-----------------------");
        System.out.println("----------------[1] POUR CHOISIR UNE RECETTE---------------");
        System.out.println("----------------[2] POUR CREER UNE NOUVELLE RECETTE--------");
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("--------------INSERER LE BUMERO DE VOTRE ACTION------------");
        System.out.println("-----------------------------------------------------------");
    }

    private String creerRecette(stub.ClientSansCompteService port, stub.TcfService port1) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-------------------CREER UNE RECETTE-----------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\nInsérez le nom de votre recette?");
        String nom = bufferRead.readLine();

        List<String> ingredients = new ArrayList<String>();
        List<String> facons = new ArrayList<String>();
        String action = "";
        int i = 0;
        do{
            if(i > 0)System.err.println("##############Choisez au moins un ingrédient!##############");
            do {
                String ingredient;
                System.out.println("-------------------CHOISIR UNE INGREDIENT------------------");
                System.out.println("-----------------------------------------------------------");
                System.out.println("Inserez le numero de ingredient");
                List<String> ingredientList = port1.getAllIngredient();
                int k = 0;
                for(String s : ingredientList){
                    System.out.println("-----------------------[" + k + "] " + s);
                    k++;
                }
                System.out.println("-----------------------------------------------------------");
                action = bufferRead.readLine();
                int actionI = 0;
                boolean error = true;

                while(error){
                    try{
                        actionI = Integer.parseInt(action);
                        error = false;
                        if(actionI < 0 || actionI >= ingredientList.size()) {
                            System.err.println("###################INGREDIENT N'EXISTE PAS#################");
                            System.out.println("-------------------CHOISIR UNE INGREDIENT------------------");
                            System.out.println("-----------------------------------------------------------");
                            System.out.println("Inserez le numero de ingredient");
                            k = 0;
                            for(String s : ingredientList){
                                System.out.println("-----------------------[" + k + "] " + s);
                                k++;
                            }
                            System.out.println("-----------------------------------------------------------");
                            action = bufferRead.readLine();
                            error = true;
                        }
                    } catch(Exception e){
                        System.err.println("###################ACTION FORME INVALIDE###################");
                        System.err.println("###################INGREDIENT N'EXISTE PAS#################");
                        System.out.println("-------------------CHOISIR UNE INGREDIENT------------------");
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Inserez le numero de ingredient");
                        k = 0;
                        for(String s : ingredientList){
                            System.out.println("-----------------------[" + k + "] " + s);
                            k++;
                        }
                        System.out.println("-----------------------------------------------------------");
                        action = bufferRead.readLine();
                        error = true;
                    }
                }

                ingredient = ingredientList.get(actionI);
                ingredients.add(ingredient);


                System.out.println("-----------------------------------------------------------");
                System.out.println("\nVous voulez choisir un autre ingrédient?");
                System.out.println("-----------------[1] Oui!----------------------------------");
                System.out.println("-----------------[2] No, merci!----------------------------");
                action = bufferRead.readLine();
                while(!"1".equals(action) && !"2".equals(action)){
                    System.err.println("#####################ACTION INCONNUE#######################");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\nVous voulez choisir un autre ingrédient?");
                    System.out.println("-----------------[1] Oui!----------------------------------");
                    System.out.println("-----------------[2] No, merci!----------------------------");
                    action = bufferRead.readLine();
                }
            }while ("1".equals(action));
            i++;
        }while(ingredients.isEmpty());


        i = 0;
        do{
            if(i > 0)System.err.println("###############Choisez au moins une façon!################");
            do {
                String facon;
                System.out.println("-------------------CHOISIR UNE FACON-----------------------");
                System.out.println("-----------------------------------------------------------");
                System.out.println("Inserez le numero de facon");
                List<String> faconList = port1.getAllFacon();
                int k = 0;
                for(String s : faconList){
                    System.out.println("-----------------------[" + k + "] " + s);
                    k++;
                }
                System.out.println("-----------------------------------------------------------");
                action = bufferRead.readLine();
                int actionI = 0;
                boolean error = true;

                while(error){
                    try{
                        actionI = Integer.parseInt(action);
                        error = false;
                        if(actionI < 0 || actionI >= faconList.size()) {
                            System.err.println("#####################FACON N'EXISTE PAS####################");
                            System.out.println("-------------------CHOISIR UNE FACON-----------------------");
                            System.out.println("-----------------------------------------------------------");
                            System.out.println("Inserez le numero de facon");
                            k = 0;
                            for(String s : faconList){
                                System.out.println("-----------------------[" + k + "] " + s);
                                k++;
                            }
                            System.out.println("-----------------------------------------------------------");
                            action = bufferRead.readLine();
                            error = true;
                        }
                    } catch(Exception e){
                        System.err.println("###################ACTION FORME INVALIDE###################");
                        System.err.println("#####################FACON N'EXISTE PAS####################");
                        System.out.println("-------------------CHOISIR UNE FACON-----------------------");
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Inserez le numero de facon");
                        k = 0;
                        for(String s : faconList){
                            System.out.println("-----------------------[" + k + "] " + s);
                            k++;
                        }
                        System.out.println("-----------------------------------------------------------");
                        action = bufferRead.readLine();
                        error = true;
                    }
                }

                facon = faconList.get(actionI);
                facons.add(facon);


                System.out.println("-----------------------------------------------------------");
                System.out.println("\nVous voulez choisir une autre façon?");
                System.out.println("-----------------[1] Oui!----------------------------------");
                System.out.println("-----------------[2] No, merci!----------------------------");
                action = bufferRead.readLine();
                while(!"1".equals(action) && !"2".equals(action)){
                    System.err.println("#####################ACTION INCONNUE#######################");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\nVous voulez choisir un autre façon?");
                    System.out.println("-----------------[1] Oui!----------------------------------");
                    System.out.println("-----------------[2] No, merci!----------------------------");
                    action = bufferRead.readLine();
                }
            }while ("1".equals(action));
            i++;
        }while(facons.isEmpty());
        if(port.creerRecette(nom, ingredients, facons) == true){
            return nom;
        } else {
            return null;
        }
    }

    private String choisirBoutique(stub.TcfService port1) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-------------------CHOISIR UNE BOUTIQUE--------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Inserez le numero de boutique");
        List<String> boutiques = port1.getAllBoutique();
        int i = 0;
        for(String s : boutiques){
            System.out.println("-----------------------[" + i + "] " + s);
            i++;
        }
        System.out.println("-----------------------------------------------------------");
        String action = bufferRead.readLine();
        int actionI = 0;
        boolean error = true;

        while(error){
            try{
                actionI = Integer.parseInt(action);
                error = false;
                if(actionI < 0 || actionI >= boutiques.size()) {
                    System.err.println("###################BOUTIQUE N'EXISTE PAS###################");
                    System.out.println("-------------LISTE DE COMMANDE DANS UN BOUTIQUE------------");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Inserez le numero de boutique");
                    i = 0;
                    for(String s : boutiques){
                        System.out.println("-----------------------[" + i + "] " + s);
                        i++;
                    }
                    System.out.println("-----------------------------------------------------------");
                    action = bufferRead.readLine();
                    error = true;
                }
            } catch(Exception e){
                System.err.println("###################ACTION FORME INVALIDE###################");
                System.err.println("###################BOUTIQUE N'EXISTE PAS###################");
                System.out.println("-------------LISTE DE COMMANDE DANS UN BOUTIQUE------------");
                System.out.println("-----------------------------------------------------------");
                System.out.println("Inserez le numero de boutique");
                i = 0;
                for(String s : boutiques){
                    System.out.println("-----------------------[" + i + "] " + s);
                    i++;
                }
                System.out.println("-----------------------------------------------------------");
                action = bufferRead.readLine();
                error = true;
            }
        }
        return boutiques.get(actionI);
    }

    private String choisirRecette(stub.TcfService port1) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-------------------CHOISIR UNE RECETTE---------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Inserez le numero de recette");
        List<String> recettes = port1.getAllRecette();
        int i = 0;
        for(String s : recettes){
            System.out.println("-----------------------[" + i + "] " + s);
            i++;
        }
        System.out.println("-----------------------------------------------------------");
        String action = bufferRead.readLine();
        int actionI = 0;
        boolean error = true;

        while(error){
            try{
                actionI = Integer.parseInt(action);
                error = false;
                if(actionI < 0 || actionI >= recettes.size()) {
                    System.err.println("####################RECETTE N'EXISTE PAS###################");
                    System.out.println("-------------------CHOISIR UNE RECETTE---------------------");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Inserez le numero de recette");
                    i = 0;
                    for(String s : recettes){
                        System.out.println("-----------------------[" + i + "] " + s);
                        i++;
                    }
                    System.out.println("-----------------------------------------------------------");
                    action = bufferRead.readLine();
                    error = true;
                }
            } catch(Exception e){
                System.err.println("###################ACTION FORME INVALIDE###################");
                System.out.println("-------------------CHOISIR UNE RECETTE---------------------");
                System.out.println("-----------------------------------------------------------");
                System.out.println("Inserez le numero de recette");
                i = 0;
                for(String s : recettes){
                    System.out.println("-----------------------[" + i + "] " + s);
                    i++;
                }
                System.out.println("-----------------------------------------------------------");
                action = bufferRead.readLine();
                error = true;
            }
        }
        return recettes.get(actionI);
    }
}
