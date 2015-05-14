package fr.unice.polytech.tcf;

import stub.ResponsableTCFServiceImplService;

import javax.xml.ws.BindingProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by ding on 09/04/15.
 */
public class ResponsableTCF {

    public static void main(String[] args) throws IOException {
        // Dynamically building the targeted web service location (default to localhost if not provided)
        String host = ( args.length == 0 ? "localhost" : args[0]);
        String address = "http://"+host+":8080/demo/webservices/ResponsableTCFServiceImpl";
        URL wsdlLocation = null;
        try { wsdlLocation = new URL(address + "?wsdl"); } catch (Exception e) { System.exit(0); }

        // Instantiating the client stub code
        stub.ResponsableTCFServiceImplService srv = new ResponsableTCFServiceImplService(wsdlLocation);
       // stub.TcfServiceImplService srv = new TcfServiceImplService(wsdlLocation); // dynamic WSDL location
        stub.ResponsableTCFService port = srv.getResponsableTCFServiceImplPort();
       // stub.TcfService port = srv.getTcfServiceImplPort();

        // Dynamically setting the address where the web service is really deployed
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);


        log(port);

    }

    public static void getStatistiqueG(stub.ResponsableTCFService port){
        System.out.println(""+ port.getStatistiqueGlobal()+"$");
    }

    public static void log(stub.ResponsableTCFService port) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        showMenu();
        String action = bufferRead.readLine();
        int actionI = 0;
        boolean error = true;

        while(error){
            try{
                actionI = Integer.parseInt(action);
                error = false;
                if(actionI != 1 && actionI != 2 && actionI != 3) {
                    System.err.println("######################ACTION INVALIDE######################");
                    showMenu();
                    action = bufferRead.readLine();
                    error = true;
                }
            } catch(Exception e){
                System.err.println("###################ACTION FORME INVALIDE###################");
                action = bufferRead.readLine();
            }
        }
        if(actionI == 3){
            return;
        } else if(actionI == 1){
            System.out.println(creerBoutique(port));
        } else if (actionI == 2){
            getStatistiqueG(port);
        }
    }

    public static boolean creerBoutique(stub.ResponsableTCFService port) throws IOException {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            boolean error = true;

            System.out.println("-------------------CREER UNE BOUTIQUE----------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez votre adresse?");
            String address = bufferRead.readLine();
            while(port.boutiqueIsExist(address)){
                System.err.println("###############Cet adresse est dèjà existe!!###############");
                System.out.println("-----------------------------------------------------------");
                System.out.println("\nInsérez votre adresse?");
                address = bufferRead.readLine();
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez votre tax?(%)");
            String taxs= bufferRead.readLine();
            double tax = 0.0;
            error = true;
            while(error) {
                try{
                    tax = Double.parseDouble(taxs);
                    error = false;
                } catch(Exception e){
                    System.err.println("####################TAXE FORME INVALIDE####################");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\nInsérez votre tax?");
                    taxs = bufferRead.readLine();
                }
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez le temps d'ouvert?(0~24)");
            String tempOuv = bufferRead.readLine();
            int tempOuvI = 0;
            error = true;
            while(error) {
                try{
                    tempOuvI = Integer.parseInt(tempOuv);
                    if(tempOuvI < 0 || tempOuvI > 24){
                        System.err.println("#######################TEMPS INVALIDE######################");
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("\nInsérez le temps d'ouvert?(0~24)");
                        tempOuv = bufferRead.readLine();
                        error = true;
                    } else{
                        error = false;
                    }
                } catch(Exception e){
                    System.err.println("####################TEMPS FORME INVALIDE####################");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("\nInsérez le temps d'ouvert?(0~24)");
                    tempOuv = bufferRead.readLine();
                }
            }
            int f = tempOuvI + 1;
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez le temps de ferme?(" + f + "~24)");
            String tempFer = bufferRead.readLine();
            int tempFerI = 0;
            error = true;
            while(error) {
                try{
                    tempFerI = Integer.parseInt(tempFer);
                    if(tempFerI < f || tempFerI > 24){
                        System.err.println("#######################TEMPS INVALIDE######################");
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("\nInsérez le temps de ferme?(" + f + "~24)");
                        tempFer = bufferRead.readLine();
                        error = true;
                    } else{
                        error = false;
                    }
                } catch(Exception e){
                    System.err.println("####################TEMPS FORME INVALIDE####################");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("\nInsérez le temps ouvert?(" + f + "~24)");
                    tempFer = bufferRead.readLine();
                }
            }

            if (port.creerBoutique(address, tax,tempOuvI,tempFerI))
                return true;
            return false;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
/*
    public boolean creerIngredient(stub.TcfService port){
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            showMenuCreerIngredient();
            String action = bufferRead.readLine();
            int actionI = 0;
            boolean error = true;

            while(error){
                try{
                    actionI = Integer.parseInt(action);
                    error = false;
                    if(actionI != 1 && actionI != 2) {
                        System.err.println("######################ACTION INVALIDE######################");
                        showMenuCreerIngredient();
                        action = bufferRead.readLine();
                        error = true;
                    }
                } catch(Exception e){
                    System.err.println("###################ACTION FORME INVALIDE###################");
                    action = bufferRead.readLine();
                }
            }
            if(actionI == 2)return false;

            System.out.println("-------------------CREER UN INGREDIENT---------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez le nom d'ingredient?");
            String nom = bufferRead.readLine();
            while(port.ingredientIsExist(nom)){
                System.err.println("##############Cet ingrédient est dèjà existe!!#############");
                System.out.println("-----------------------------------------------------------");
                System.out.println("\nInsérez le nom d'ingredient?");
                nom = bufferRead.readLine();
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez le prix de cet ingrédient?($)");
            String prix= bufferRead.readLine();
            double prixD = 0.0;
            error = true;
            while(error) {
                try{
                    prixD = Double.parseDouble(prix);
                    error = false;
                } catch(Exception e){
                    System.err.println("####################PRIX FORME INVALIDE####################");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\nInsérez le prix de cet ingrédient?($)");
                    prix = bufferRead.readLine();
                }
            }


            if (port.creerIngredient(nom, prixD))
                return true;
            return false;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }*/
/*
    public boolean creerFacon(stub.TcfService port){
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            showMenuCreerFacon();
            String action = bufferRead.readLine();
            int actionI = 0;
            boolean error = true;

            while(error){
                try{
                    actionI = Integer.parseInt(action);
                    error = false;
                    if(actionI != 1 && actionI != 2) {
                        System.err.println("######################ACTION INVALIDE######################");
                        showMenuCreerFacon();
                        action = bufferRead.readLine();
                        error = true;
                    }
                } catch(Exception e){
                    System.err.println("###################ACTION FORME INVALIDE###################");
                    action = bufferRead.readLine();
                }
            }
            if(actionI == 2)return false;

            System.out.println("-------------------CREER UNE FACON-------------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez le nom de façon?");
            String nom = bufferRead.readLine();
            while(port.faconIsExist(nom)){
                System.err.println("###############Cette façon est dèjà existe!!###############");
                System.out.println("-----------------------------------------------------------");
                System.out.println("\nInsérez le nom de façon?");
                nom = bufferRead.readLine();
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez le temps utilisé de cette façon?(minute)");
            String temp= bufferRead.readLine();
            double tempD = 0.0;
            error = true;
            while(error) {
                try{
                    tempD = Double.parseDouble(temp);
                    error = false;
                } catch(Exception e){
                    System.err.println("####################TEMPS FORME INVALIDE###################");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\nInsérez le temps utilisé de cette façon?(minute)");
                    temp = bufferRead.readLine();
                }
            }


            if (port.creerFacon(nom,tempD))
                return true;
            return false;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }*/

    private static void showMenu(){
        System.out.println("--------------------CREER BOUTIQUE MENU--------------------");
        System.out.println("----------------[1] POUR CREER UNE BOUTIQUE----------------");
        System.out.println("----------------[2] POUR VOIR LE CHIFFRE D'AFFAIRE---------");
        System.out.println("----------------[3] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
    }
/*
    private void showMenuCreerIngredient(){
        System.out.println("-------------------CREER INGREDIENT MENU-------------------");
        System.out.println("----------------[1] POUR CREER UN INGREDIENT---------------");
        System.out.println("----------------[2] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
    }

    private void showMenuCreerFacon(){
        System.out.println("---------------------CREER FACON MENU----------------------");
        System.out.println("----------------[1] POUR CREER UN FACON--------------------");
        System.out.println("----------------[2] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
    }
*/
}