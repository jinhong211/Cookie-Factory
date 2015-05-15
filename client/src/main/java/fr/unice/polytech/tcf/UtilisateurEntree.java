package fr.unice.polytech.tcf;
/*
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

import stub.*;

import javax.xml.ws.BindingProvider;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UtilisateurEntree {

    private static void run(stub.TcfService port, stub.ClientAvecCompteService port1, stub.ClientSansCompteService port2, stub.ResponsableBoutiqueService port3, stub.ResponsableTCFService port4){
        ResponsableBoutique responsableBoutique = new ResponsableBoutique();
        ResponsableTCF responsableTCF = new ResponsableTCF();
        ClientAvecCompte clientAvecCompte = new ClientAvecCompte();
        ClientSansCompte clientSansCompte = new ClientSansCompte();
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));


            boolean userConnue = false;
            while (!userConnue) {
                System.out.println("INSEREZ VOTRE NOM?(Vous êtes Faith, Carter, Brenda, Tom ou Exit?)");
                String nom = bufferRead.readLine();
                if ("Tom".equals(nom)) {
                    clientAvecCompte.log(port2, port, port1);

                } else if ("Carter".equals(nom)) {
                    responsableBoutique.log(port3, port);

                } else if ("Faith".equals(nom)) {
                    responsableTCF.log(port4);

                } else if("Brenda".equals(nom)){
                    clientSansCompte.log(port2, port);

                } else if("Exit".equals(nom)) {
                    break;
                } else {
                    System.err.println("###################UTILISATEUR INCONNUE####################");
                    System.out.println("INSEREZ VOTRE NOM?(Vous êtes Faith, Carter, Brenda, Tom ou EXit?)");
                }
            }
        } catch (Exception e){

        }
    }

    public static void main(String[] args){
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

        String address2 = "http://"+host+":8080/demo/webservices/ResponsableBoutiqueServiceImpl";
        URL wsdlLocation2 = null;
        String address1 = "http://"+host+":8080/demo/webservices/TcfServiceImpl";
        URL wsdlLocation1 = null;
        try { wsdlLocation2 = new URL(address2 + "?wsdl"); } catch (Exception e) { System.exit(0); }
        try { wsdlLocation1 = new URL(address1 + "?wsdl"); } catch (Exception e) { System.exit(0); }

        // Instantiating the client stub code
        stub.ResponsableBoutiqueServiceImplService srv2 = new ResponsableBoutiqueServiceImplService(wsdlLocation2);
        stub.TcfServiceImplService srv1 = new TcfServiceImplService(wsdlLocation1);
        // stub.TcfServiceImplService srv = new TcfServiceImplService(wsdlLocation); // dynamic WSDL location
        stub.ResponsableBoutiqueService port2 = srv2.getResponsableBoutiqueServiceImplPort();
        stub.TcfService port1 = srv1.getTcfServiceImplPort();

        String address3 = "http://"+host+":8080/demo/webservices/ClientSansCompteServiceImpl";
        URL wsdlLocation3 = null;
        String address4 = "http://"+host+":8080/demo/webservices/ClientAvecCompteServiceImpl";
        URL wsdlLocation4 = null;
        try { wsdlLocation3 = new URL(address3 + "?wsdl"); } catch (Exception e) { System.exit(0); }
        try { wsdlLocation4 = new URL(address4 + "?wsdl"); } catch (Exception e) { System.exit(0); }

        // Instantiating the client stub code
        stub.ClientSansCompteServiceImplService srv3 = new ClientSansCompteServiceImplService(wsdlLocation3);
        stub.ClientAvecCompteServiceImplService srv4 = new ClientAvecCompteServiceImplService(wsdlLocation4);
        // stub.TcfServiceImplService srv = new TcfServiceImplService(wsdlLocation); // dynamic WSDL location
        stub.ClientSansCompteService port3 = srv3.getClientSansCompteServiceImplPort();
        stub.ClientAvecCompteService port4 = srv4.getClientAvecCompteServiceImplPort();
        // stub.TcfService port = srv.getTcfServiceImplPort();

        // Dynamically setting the address where the web service is really deployed
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
        ((BindingProvider) port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address1);
        ((BindingProvider) port2).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address2);
        ((BindingProvider) port3).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address3);
        ((BindingProvider) port4).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address4);

        run(port1,port4,port3,port2,port);

    }


}
