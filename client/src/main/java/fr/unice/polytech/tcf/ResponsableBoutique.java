package fr.unice.polytech.tcf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by ding on 10/04/15.
 */
public class ResponsableBoutique {
    /*public static void main(String[] args) throws IOException {
        // Dynamically building the targeted web service location (default to localhost if not provided)
        String host = ( args.length == 0 ? "localhost" : args[0]);
        String address = "http://"+host+":8080/demo/webservices/ResponsableBoutiqueServiceImpl";
        URL wsdlLocation = null;
        String address1 = "http://"+host+":8080/demo/webservices/TcfServiceImpl";
        URL wsdlLocation1 = null;
        try { wsdlLocation = new URL(address + "?wsdl"); } catch (Exception e) { System.exit(0); }
        try { wsdlLocation1 = new URL(address1 + "?wsdl"); } catch (Exception e) { System.exit(0); }

        // Instantiating the client stub code
        stub.ResponsableBoutiqueServiceImplService srv = new ResponsableBoutiqueServiceImplService(wsdlLocation);
        stub.TcfServiceImplService srv1 = new TcfServiceImplService(wsdlLocation1);
        // stub.TcfServiceImplService srv = new TcfServiceImplService(wsdlLocation); // dynamic WSDL location
        stub.ResponsableBoutiqueService port = srv.getResponsableBoutiqueServiceImplPort();
        stub.TcfService port1 = srv1.getTcfServiceImplPort();
        // stub.TcfService port = srv.getTcfServiceImplPort();

        // Dynamically setting the address where the web service is really deployed
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
        ((BindingProvider) port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address1);

        log(port,port1);

    }*/

    public void log(String role,stub.ResponsableBoutiqueService port, stub.TcfService port1) throws IOException {
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
            getCommandes(role,port,port1);
        } else if (actionI == 2){
            getChiffreVente(role,port,port1);
        }
    }

    public void getCommandes(String role,stub.ResponsableBoutiqueService port, stub.TcfService port1) throws IOException {
        System.out.println("-------------LISTE DE COMMANDE DANS UN BOUTIQUE------------");
        System.out.println("-----------------------------------------------------------");
        List<String> commandess = port.getListCommande(role);
        for(String s : commandess){
            System.out.println(s);
        }
    }

    public void getChiffreVente(String role,stub.ResponsableBoutiqueService port, stub.TcfService port1) throws IOException {
        System.out.println("------------------CHIFFRE VENTE DE BOUTIQUE----------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println(""+port.getStatistiqueBoutique(role) + "$");
    }

/*
    public void venteStatistique(stub.TcfService port) {
        try{
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            showMenu();
            String action = bufferRead.readLine();
            int actionI = 0;
            boolean error = true;
            while (error) {
                try {
                    actionI = Integer.parseInt(action);
                    error = false;
                    if (actionI != 1 && actionI != 2) {
                        System.err.println("######################ACTION INVALIDE######################");
                        showMenu();
                        action = bufferRead.readLine();
                        error = true;
                    }
                } catch (Exception e) {
                    System.err.println("###################ACTION FORME INVALIDE###################");
                    action = bufferRead.readLine();
                }
            }
            if (actionI == 2) return;

            List<Boutique> boutiques = port.getAllBoutique();

            for (Boutique b : boutiques) {
                System.out.println("Boutique[" + b.getId() + "]#Addresse: " + b.getAddresseBoutique() + ", #chiffre vente: " + b.getChiffreVente());
            }
        } catch(Exception e){

        }
    }
*/
    private void showMenu(){
        System.out.println("--------------L'AFFICHAGE DE CHIFFRE VENTE MENU------------");
        System.out.println("----------------[1] LISTE DE COMMANDE----------------------");
        System.out.println("----------------[2] CHIFFRE D'AFFAIRE DE BOUTIQUE----------");
        System.out.println("----------------[3] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
    }

}
