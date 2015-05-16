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

import DotNetStub.ServiceTCF;
import stub.*;

import javax.xml.ws.BindingProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UtilisateurEntree {

    private void CoD(String role,String login,DotNetStub.IServiceTCF port5,stub.TcfService port, stub.ClientAvecCompteService port1, stub.ClientSansCompteService port2, stub.ResponsableBoutiqueService port3, stub.ResponsableTCFService port4)throws IOException
    {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to CoD System, you logged as " + role);
        boolean t = true;
        try{
            switch (role)
            {
            case "user":
            {
                while (t)
                {
                    System.out.println("1. add payment information.");
                    System.out.println("2. get list of order information.");
                    System.out.println("3. commander");
                    System.out.println("4. quit.");
                    String i = bufferRead.readLine();
                    switch (i)
                    {
                        case "1":
                        {
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
                            System.out.println("Expiration Date(MM/AA):");
                            date = bufferRead.readLine();
                            System.out.println("Cryptogramme:");
                            cry = Integer.parseInt(bufferRead.readLine());
                            System.out.println(port5.addInfoAccount(login,name, surname, num, address, date, cry));
                            break;
                        }
                        case "2":
                        {
                            System.out.println(port5.getListHistoriqueUser(login));
                            break;
                        }
                        case "3":{
                            run(role,login,port5,port,port1,port2,port3,port4);
                        }
                        case "4":
                        {
                            t = false;
                            break;
                        }
                        default: break;
                    }
                }
                break;
            }
            case "admin":
            {
                while (t)
                {
                    System.out.println("1. get the list of all the order informations.");
                    System.out.println("2. quit.");
                    String i = bufferRead.readLine();
                    switch (i)
                    {
                        case "1":
                        {
                            System.out.println(port5.getListHistorique());
                            break;
                        }
                        case "2":
                        {
                            t = false;
                            break;
                        }
                        default: break;
                    }
                }
                break;
            }
            case "responsable":
            {
                run(role,login,port5,port,port1,port2,port3,port4);
                break;
            }
            case "custom":
            {
                run(role,login,port5,port,port1,port2,port3,port4);
                break;
            }
            default:
            {
                run(role,login,port5,port,port1,port2,port3,port4);
                break;
            }
        }
        }catch (Exception e){
            System.err.println("###################ACTION FORME INVALIDE###################");
            String i = bufferRead.readLine();
        }
    }
    private static void run(String role,String login,DotNetStub.IServiceTCF port5,stub.TcfService port, stub.ClientAvecCompteService port1, stub.ClientSansCompteService port2, stub.ResponsableBoutiqueService port3, stub.ResponsableTCFService port4){
        ResponsableBoutique responsableBoutique = new ResponsableBoutique();
        ResponsableTCF responsableTCF = new ResponsableTCF();
        ClientAvecCompte clientAvecCompte = new ClientAvecCompte();
        ClientSansCompte clientSansCompte = new ClientSansCompte();
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));


            boolean userConnue = false;
            while (!userConnue) {
                System.out.println("Continuer ou Exit?");
                String nom = bufferRead.readLine();
                if("Exit".equals(nom)){
                    break;
                }else if("Continuer".equals(nom)){
                    if ("user".equals(role)) {
                        clientAvecCompte.log(login,port5,port2, port, port1);

                    }  else if ("responsable".equals(role)) {
                        responsableTCF.log(port4);

                    } else if("custom".equals(role)){
                        clientSansCompte.log(port5,port2, port);

                    }else  {
                        responsableBoutique.log(role,port3, port);

                    }
                }else {
                    System.err.println("###################ACTION INCONNUE####################");
                }
            }
        } catch (Exception e){

        }
    }

    public static void main(String[] args)throws IOException{
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
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        URL wsdlLocationDotNet = null;
        try {wsdlLocationDotNet = new URL("http://localhost:6606/ServiceTCF.svc?wsdl");} catch (Exception e) { System.exit(0); }
        DotNetStub.ServiceTCF srv5 = new ServiceTCF(wsdlLocationDotNet);
        DotNetStub.IServiceTCF port5 = srv5.getBasicHttpBindingIServiceTCF();
        BindingProvider bp = (BindingProvider)port5;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:6606/ServiceTCF.svc");
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
        ((BindingProvider) port1).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address1);
        ((BindingProvider) port2).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address2);
        ((BindingProvider) port3).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address3);
        ((BindingProvider) port4).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address4);
        int id = -1;
        boolean t = true;
        String role = "custom";
        String login = "custom";
        String passwd = "custom";
        while (t)
        {
            System.out.println("1. creat an account.");
            System.out.println("2. login.");
            System.out.println("3. enter CoD system.");
            System.out.println("4. logout.");
            System.out.println("5. quit.");
            String i = bufferRead.readLine();
            switch (i) {
                case "1":
                {
                    String newlogin;
                    String newpasswd;
                    String newtype;
                    System.out.println("Login name:");
                    newlogin = bufferRead.readLine();
                    System.out.println("Password:");
                    newpasswd = bufferRead.readLine();
                    System.out.println("Type:");
                    newtype = bufferRead.readLine();
                    System.out.println(port5.createAccount(newlogin, newpasswd, newtype));
                    break;
                }
                case "2":
                {
                    System.out.println("Login name:");
                    login = bufferRead.readLine();
                    System.out.println("Password:");
                    passwd = bufferRead.readLine();
                    System.out.println(port5.loginAccount(login, passwd));
                    if (port5.loginAccount(login, passwd).equals("User " + login + " login successfully"))
                    {
                        role = port5.getRoles(login);
                        id = port5.getID(login);
                    }
                    //Console.WriteLine(id);
                    break;
                }
                case "3":
                {
                    new UtilisateurEntree().CoD(role, login, port5,port1,port4,port3,port2,port);
                    break;
                }
                case "4":{
                    id = -1;
                    role = "custom";
                    login = "custom";
                    passwd = "custom";
                    break;
                }
                case "5":
                {
                    t = false;
                    break;
                }
                default: break;
            }
        }
        // Dynamically setting the address where the web service is really deployed




    }


}
