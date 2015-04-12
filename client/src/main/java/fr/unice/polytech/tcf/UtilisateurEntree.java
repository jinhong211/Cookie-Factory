package fr.unice.polytech.tcf;

import stub.Boutique;
import stub.Recette;
import stub.TcfServiceImplService;

import javax.xml.ws.BindingProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

/**
 * Created by ding on 10/04/15.
 */
public class UtilisateurEntree {

    private static void showRespMenu(){
        System.out.println("--------------------CHOISEZ VOTRE ACTION-------------------");
        System.out.println("----------------[1] CREER UNE BOUTIQUE---------------------");
        System.out.println("----------------[2] CREER UN INGREDIENT--------------------");
        System.out.println("----------------[3] CREER UNE FACON------------------------");
        System.out.println("----------------[4] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
    }

    private static void showCadreMenu(){
        System.out.println("--------------------CHOISEZ VOTRE ACTION-------------------");
        System.out.println("----------------[1] L'AFFICHAGE DE CHIFFRE VENTE MENU------");
        System.out.println("----------------[2] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
    }

    private static void showClientMenu(){
        System.out.println("--------------------CHOISEZ VOTRE ACTION-------------------");
        System.out.println("----------------[1] PASSER UNE COMMANDE--------------------");
        System.out.println("----------------[2] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
    }

    private static void responsableAction(stub.TcfService port) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        Responsable responsable = new Responsable();
        showRespMenu();
        String action = bufferRead.readLine();
        int actionI = 0;
        boolean error = true;
        while(error){
            try{
                actionI = Integer.parseInt(action);
                error = false;
                if(actionI != 1 && actionI != 2 && actionI != 3 && actionI != 4) {
                    System.err.println("######################ACTION INVALIDE######################");
                    showRespMenu();
                    action = bufferRead.readLine();
                    error = true;
                }
            } catch(Exception e){
                System.err.println("###################ACTION FORME INVALIDE###################");
                showRespMenu();
                action = bufferRead.readLine();
            }
        }
        if(actionI == 4){
            return;
        } else if(actionI == 1){
            System.out.println(responsable.creerBoutique(port));
        } else if(actionI == 2){
            System.out.println(responsable.creerIngredient(port));
        } else if(actionI == 3){
            System.out.println(responsable.creerFacon(port));
        }
    }

    private static void cadreAction(stub.TcfService port) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        Cadre cadre = new Cadre();
        showCadreMenu();
        String action = bufferRead.readLine();
        int actionI = 0;
        boolean error = true;
        while(error){
            try{
                actionI = Integer.parseInt(action);
                error = false;
                if(actionI != 1 && actionI != 2) {
                    System.err.println("######################ACTION INVALIDE######################");
                    showCadreMenu();
                    action = bufferRead.readLine();
                    error = true;
                }
            } catch(Exception e){
                System.err.println("###################ACTION FORME INVALIDE###################");
                action = bufferRead.readLine();
            }
        }
        if(actionI == 2){
            return;
        } else if(actionI == 1){
            cadre.venteStatistique(port);
        }
    }

    private static void clientAction(stub.TcfService port) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        Client client = new Client();
        showClientMenu();
        String action = bufferRead.readLine();
        int actionI = 0;
        boolean error = true;
        while(error){
            try{
                actionI = Integer.parseInt(action);
                error = false;
                if(actionI != 1 && actionI != 2) {
                    System.err.println("######################ACTION INVALIDE######################");
                    showClientMenu();
                    action = bufferRead.readLine();
                    error = true;
                }
            } catch(Exception e){
                System.err.println("###################ACTION FORME INVALIDE###################");
                action = bufferRead.readLine();
            }
        }
        if(actionI == 2){
            return;
        } else if(actionI == 1){
            client.paserCommand(port);
        }
    }

    private static void autoRunAction(stub.TcfService port){
        System.out.println("---------------------Soit vous êtes Faith------------------");
        System.out.println("###########################################################");
        System.out.println("INSEREZ VOTRE NOM?(Vous êtes Faith, Carter ou Tom?)");
        System.out.println("Faith");
        System.out.println("--------------------CHOISEZ VOTRE ACTION-------------------");
        System.out.println("----------------[1] CREER UNE BOUTIQUE---------------------");
        System.out.println("----------------[2] CREER UN INGREDIENT--------------------");
        System.out.println("----------------[3] CREER UNE FACON------------------------");
        System.out.println("----------------[4] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1");
        System.out.println("--------------------CREER BOUTIQUE MENU--------------------");
        System.out.println("----------------[1] POUR CREER UNE BOUTIQUE----------------");
        System.out.println("----------------[2] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1");
        System.out.println("\nInsérez votre adresse?");
        System.out.println("polytech");
        System.out.println("\nInsérez votre tax?(%)");
        System.out.println("3.3");
        System.out.println("\nInsérez le temps d'ouvert?(0~24)");
        System.out.println("9");
        System.out.println("\nInsérez le temps de ferme?(9~24)");
        System.out.println("19");
        System.out.println("Succès");
        port.creerBoutique("polytech", 3.3, 9, 19);
        port.creerBoutique("nice", 3.2, 8, 20);
        port.creerBoutique("antibes", 3.5, 11, 22);
        port.creerBoutique("valbonne", 3.1, 10, 21);
        System.out.println("###########################################################");
        System.out.println("INSEREZ VOTRE NOM?(Vous êtes Faith, Carter ou Tom?)");
        System.out.println("Faith");
        System.out.println("--------------------CHOISEZ VOTRE ACTION-------------------");
        System.out.println("----------------[1] CREER UNE BOUTIQUE---------------------");
        System.out.println("----------------[2] CREER UN INGREDIENT--------------------");
        System.out.println("----------------[3] CREER UNE FACON------------------------");
        System.out.println("----------------[4] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("2");
        System.out.println("-------------------CREER INGREDIENT MENU-------------------");
        System.out.println("----------------[1] POUR CREER UN INGREDIENT---------------");
        System.out.println("----------------[2] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1");
        System.out.println("\nInsérez le nom d'ingredient?");
        System.out.println("caramel");
        System.out.println("\nInsérez le prix de cet ingrédient?($)");
        System.out.println("5.5");
        System.out.println("Succès");
        port.creerIngredient("caramel", 5.5);
        port.creerIngredient("chocolat", 2.5);
        port.creerIngredient("pomme", 1.3);
        port.creerIngredient("fraise", 2.2);
        System.out.println("###########################################################");
        System.out.println("INSEREZ VOTRE NOM?(Vous êtes Faith, Carter ou Tom?)");
        System.out.println("Faith");
        System.out.println("--------------------CHOISEZ VOTRE ACTION-------------------");
        System.out.println("----------------[1] CREER UNE BOUTIQUE---------------------");
        System.out.println("----------------[2] CREER UN INGREDIENT--------------------");
        System.out.println("----------------[3] CREER UNE FACON------------------------");
        System.out.println("----------------[4] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("3");
        System.out.println("---------------------CREER FACON MENU----------------------");
        System.out.println("----------------[1] POUR CREER UN FACON--------------------");
        System.out.println("----------------[2] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1");
        System.out.println("\nInsérez le nom de façon?");
        System.out.println("defaultfacon1");
        System.out.println("\nInsérez le temps utilisé de cette façon?(minute)");
        System.out.println("15");
        System.out.println("Succès");
        port.creerFacon("defaultfacon1",15);
        port.creerFacon("defaultfacon2",15);
        port.creerFacon("defaultfacon3",15);
        port.creerFacon("defaultfacon4",15);
        System.out.println("---------------------Soit vous êtes Tom--------------------");
        System.out.println("###########################################################");
        System.out.println("INSEREZ VOTRE NOM?(Vous êtes Faith, Carter ou Tom?)");
        System.out.println("Tom");
        System.out.println("---------BIENVENUE, VOUS VOULEZ FAIRE UNE COMMANDE---------");
        System.out.println("----------------[1] POUR COMMANDER-------------------------");
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("--------------INSERER L'ADDRESSE DE BOUTIQUE---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1");
        System.out.println("-------------------CHOISIR BOUTIQUE MENU-------------------");
        for(Boutique b : port.getAllBoutique()){
            System.out.println("----------Boutique[" + b.getId() + "]#adresse: " + b.getAddresseBoutique());
        }
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("--------------INSERER L'ADDRESSE DE BOUTIQUE---------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("nice");
        System.out.println("-------------------CHOISIR RECETTE MENU--------------------");
        for(Recette r : port.getAllRecette()){
            System.out.println("----------RECETTE[" + r.getId() + "]#nom: " + r.getNomRecette());
        }
        System.out.println("----------------[0] POUR ABANDONNER------------------------");
        System.out.println("--------------INSERER LE NOM DE RECETTE--------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("default");
        System.out.println("\nInsérez l'heure de votre récuperation?(9~19)");
        System.out.println("15");
        System.out.println("\nInsérez la quantité?");
        System.out.println("100");
        System.out.println("\nInsérez votre nom?");
        System.out.println("ding");
        System.out.println("\nInsérez votre addresse?");
        System.out.println("dolines");
        System.out.println("\nInsérez votre compte banque?");
        System.out.println("12345678");
        System.out.println("Succès");
        System.out.println("---------------------Soit vous êtes Carter-----------------");
        System.out.println("###########################################################");
        System.out.println("INSEREZ VOTRE NOM?(Vous êtes Faith, Carter ou Tom?)");
        System.out.println("Carter");
        System.out.println("--------------L'AFFICHAGE DE CHIFFRE VENTE MENU------------");
        System.out.println("----------------[1] POUR AFFICHER LE CHIFFRE VENTE---------");
        System.out.println("----------------[2] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1");
        List<Boutique> boutiques = port.getAllBoutique();

        for (Boutique b : boutiques) {
            System.out.println("Boutique[" + b.getId() + "]#Addresse: " + b.getAddresseBoutique() + ", #chiffre vente: " + b.getChiffreVente());
        }
    }

    private static void run(stub.TcfService port){
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("INSEREZ VOTRE NOM?(Vous êtes Faith, Carter ou Tom?)");
            System.out.println("Si vous ne savez pas comment faire, insérez <<auto-run>>");
            String nom = bufferRead.readLine();
            boolean userConnue = false;
            while (!userConnue) {
                if ("Tom".equals(nom)) {
                    clientAction(port);
                    userConnue = true;
                } else if ("Carter".equals(nom)) {
                    cadreAction(port);
                    userConnue = true;
                } else if ("Faith".equals(nom)) {
                    responsableAction(port);
                    userConnue = true;
                } else if("auto-run".equals(nom)){
                    autoRunAction(port);
                    userConnue = true;
                } else {
                    System.err.println("###################UTILISATEUR INCONNUE####################");
                    System.out.println("INSEREZ VOTRE NOM?(Vous êtes Faith, Carter ou Tom?)");
                    System.out.println("Si vous ne savez pas comment faire, insérez <<auto-run>>");
                    nom = bufferRead.readLine();
                }
            }
        } catch (Exception e){

        }
    }

    public static void main(String[] args){
        // Dynamically building the targeted web service location (default to localhost if not provided)
        String host = ( args.length == 0 ? "localhost" : args[0]);
        String address = "http://"+host+":8080/demo/webservices/TcfServiceImpl";
        URL wsdlLocation = null;
        try { wsdlLocation = new URL(address + "?wsdl"); } catch (Exception e) { System.exit(0); }

        // Instantiating the client stub code
        stub.TcfServiceImplService srv = new TcfServiceImplService(wsdlLocation); // dynamic WSDL location
        stub.TcfService port = srv.getTcfServiceImplPort();

        // Dynamically setting the address where the web service is really deployed
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);

        run(port);

    }


}
