package fr.unice.polytech.tcf;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by ding on 10/04/15.
 */
public class ClientSansCompte {
/*
    public static void main(String[] args) throws IOException {
        // Dynamically building the targeted web service location (default to localhost if not provided)
        String host = ( args.length == 0 ? "localhost" : args[0]);
        String address = "http://"+host+":8080/demo/webservices/ClientSansCompteServiceImpl";
        URL wsdlLocation = null;
        String address1 = "http://"+host+":8080/demo/webservices/TcfServiceImpl";
        URL wsdlLocation1 = null;
        try { wsdlLocation = new URL(address + "?wsdl"); } catch (Exception e) { System.exit(0); }
        try { wsdlLocation1 = new URL(address1 + "?wsdl"); } catch (Exception e) { System.exit(0); }

        // Instantiating the client stub code
        stub.ClientSansCompteServiceImplService srv = new ClientSansCompteServiceImplService(wsdlLocation);
        stub.TcfServiceImplService srv1 = new TcfServiceImplService(wsdlLocation1);
        // stub.TcfServiceImplService srv = new TcfServiceImplService(wsdlLocation); // dynamic WSDL location
        stub.ClientSansCompteService port = srv.getClientSansCompteServiceImplPort();
        stub.TcfService port1 = srv1.getTcfServiceImplPort();
        // stub.TcfService port = srv.getTcfServiceImplPort();

        // Dynamically setting the address where the web service is really deployed
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
        ((BindingProvider) port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address1);

        log(port, port1);

    }
*/
    public void log(stub.ClientSansCompteService port, stub.TcfService port1) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------BIENVENUE, VOUS VOULEZ FAIRE UNE COMMANDE---------");
        System.out.println("----------------[1] POUR COMMANDER-------------------------");
        System.out.println("----------------[2] CREER UN COMPTE------------------------");
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("--------------INSERER LE NUMERO DE ACTION------------------");
        System.out.println("-----------------------------------------------------------");
        String veux = bufferRead.readLine();
        if("0".equals(veux))return;
        while (!"1".equals(veux) && !"2".equals(veux)){
            System.err.println("#####################ACTION INCONNUE#######################");
            System.out.println("----------------[1] POUR COMMANDER-------------------------");
            System.out.println("----------------[2] CREER UN COMPTE------------------------");
            System.out.println("----------------[0] POUR ABANDONNER------------------------");
            System.out.println("--------------INSERER LE NUMERO DE ACTION------------------");
            System.out.println("-----------------------------------------------------------");
            veux = bufferRead.readLine();
            if(veux.equals("0"))return;
        }
        if("1".equals(veux)){
            System.out.println(paserCommand(port,port1));
        } else if("2".equals(veux)){
            System.out.println(creerCompte(port,port1));
        }
    }

    public boolean creerCompte(stub.ClientSansCompteService port, stub.TcfService port1) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------------- CREER UN COMPTE------------------------");
        String boutique = choisirBoutique(port1);
        String recette = choisirRecette(port1);
        if(port.creerPreferenceCompte(recette,boutique,1)){
            return true;
        } else {
            return false;
        }
    }

    public boolean paserCommand(stub.ClientSansCompteService port, stub.TcfService port1) throws IOException {

        String boutique = null, recette = null;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("---------BIENVENUE, VOUS VOULEZ FAIRE UNE COMMANDE---------");
            System.out.println("----------------[1] POUR COMMANDER-------------------------");
            System.out.println("----------------[0] POUR ABANDONNER------------------------");
            System.out.println("--------------INSERER LE NUMERO DE ACTION------------------");
            System.out.println("-----------------------------------------------------------");
            String veux = bufferRead.readLine();
            if("0".equals(veux))return false;
            while (!"1".equals(veux)){
                System.err.println("#####################ACTION INCONNUE#######################");
                System.out.println("----------------[1] POUR COMMANDER-------------------------");
                System.out.println("----------------[0] POUR ABANDONNER------------------------");
                System.out.println("--------------INSERER LE NUMERO DE ACTION------------------");
                System.out.println("-----------------------------------------------------------");
                veux = bufferRead.readLine();
                if(veux.equals("0"))return false;
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
                    return false;
                } else if ("2".equals(action)) {
                    recette = creerRecette(port, port1);
                } else if ("1".equals(action)) {
                    recette = choisirRecette(port1);
                }
                if (recette == null) {
                    System.err.println("###################COMMANDE ABANDONNER#####################");
                    return false;
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
            if(port.passerCommand(boutique,recette, DatatypeFactory.newInstance().newXMLGregorianCalendar(cc),quantiteI)){
                return true;
            } else{
                return false;
            }
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return false;
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
/*
    private Ingredient choisirIngredient(stub.TcfService port){
        Ingredient ingredient = null;
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            showMenuIngredient(port);
            String action = bufferRead.readLine();
            if("0".equals(action))return null;
            ingredient = port.choisirIngredient(action);
            while (ingredient == null){
                System.err.println("##################INGREDIENT INCONNUE##################");
                showMenuIngredient(port);
                action = bufferRead.readLine();
                if("0".equals(action))return null;
                ingredient = port.choisirIngredient(action);
            }
        }catch(Exception e){

        }
        return ingredient;
    }

    private Facon choisirFacon(stub.TcfService port){
        Facon facon = null;
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            showMenuFacon(port);
            String action = bufferRead.readLine();
            if("0".equals(action))return null;
            facon = port.choisirFacon(action);
            while (facon == null){
                System.err.println("####################FACON INCONNUE#####################");
                showMenuFacon(port);
                action = bufferRead.readLine();
                if("0".equals(action))return null;
                facon = port.choisirFacon(action);
            }
        }catch(Exception e){

        }
        return facon;
    }
*/
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
/*
    private void showMenu(stub.TcfService port){
        System.out.println("-------------------CHOISIR BOUTIQUE MENU-------------------");
        for(Boutique b : port.getAllBoutique()){
            System.out.println("----------Boutique[" + b.getId() + "]#adresse: " + b.getAddresseBoutique());
        }
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("--------------INSERER L'ADDRESSE DE BOUTIQUE---------------");
        System.out.println("-----------------------------------------------------------");
    }

    private void showMenuIngredient(stub.TcfService port){
        System.out.println("------------------CHOISIR INGREDIENT MENU------------------");
        for(Ingredient i : port.getAllIngredient()){
            System.out.println("----------INGREDIENT[" + i.getId() + "]#nom: " + i.getNomIngredient() + ", #prix: "+ i.getPrixIngredient());
        }
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("---------------INSERER LE NOM D'INGREDIENT-----------------");
        System.out.println("-----------------------------------------------------------");

    }

    private void showMenuFacon(stub.TcfService port){
        System.out.println("--------------------CHOISIR FACON MENU---------------------");
        for(Facon f : port.getAllFacon()){
            System.out.println("----------FACON[" + f.getId() + "]#nom: " + f.getNomFacon() + ", #temps utilisé: " + f.getTempsUtilise());
        }
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("--------------INSERER LE NOM DE FACON----------------------");
        System.out.println("-----------------------------------------------------------");

    }

    private void showMenuRecette(stub.TcfService port){
        System.out.println("-------------------CHOISIR RECETTE MENU--------------------");
        for(Recette r : port.getAllRecette()){
            System.out.println("----------RECETTE[" + r.getId() + "]#nom: " + r.getNomRecette());
        }
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("--------------INSERER LE NOM DE RECETTE--------------------");
        System.out.println("-----------------------------------------------------------");

    }
*/
}
