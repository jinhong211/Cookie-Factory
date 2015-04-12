package fr.unice.polytech.tcf;

import stub.*;

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
public class Client {

    public boolean paserCommand(stub.TcfService port){
        Commande commande = null;
        Recette recette = null;
        Boutique boutique = null;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("---------BIENVENUE, VOUS VOULEZ FAIRE UNE COMMANDE---------");
            System.out.println("----------------[1] POUR COMMANDER-------------------------");
            System.out.println("----------------[0] POUR ABANDONNER------------------------");
            System.out.println("--------------INSERER L'ADDRESSE DE BOUTIQUE---------------");
            System.out.println("-----------------------------------------------------------");
            String veux = bufferRead.readLine();
            if(veux.equals("0"))return false;
            while (!veux.equals("1")){
                System.err.println("#####################ACTION INCONNUE#######################");
                System.out.println("----------------[1] POUR COMMANDER-------------------------");
                System.out.println("----------------[0] POUR ABANDONNER------------------------");
                System.out.println("--------------INSERER L'ADDRESSE DE BOUTIQUE---------------");
                System.out.println("-----------------------------------------------------------");
                veux = bufferRead.readLine();
                if(veux.equals("0"))return false;
            }

            boutique = choisirBoutique(port);
            if (boutique == null){
                System.err.println("###################COMMANDE ABANDONNER#####################");
                return false;
            }

            showRecetteMainMenu();
            String action = bufferRead.readLine();
            while (!"1".equals(action) && !"2".equals(action) && !"0".equals(action)){
                System.err.println("######################ACTION INVALIDE######################");
                showRecetteMainMenu();
                action = bufferRead.readLine();
            }
            if ("O".equals(action)){
                System.err.println("###################COMMANDE ABANDONNER#####################");
                return false;
            } else if("2".equals(action)){
                recette = creerRecette(port);
            } else if ("1".equals(action)){
                recette = choisirRecette(port);
            }
            if (recette == null){
                System.err.println("###################COMMANDE ABANDONNER#####################");
                return false;
            }
        }catch(Exception e){

        }
        System.out.println("-----------------------------------------------------------");
        HoraireAtlier horaireAtlier= boutique.getHoraireAtlier();
        System.out.println("\nInsérez l'heure de votre récuperation?(" + horaireAtlier.getDebutJour() + "~" + horaireAtlier.getFinJour() + ")");
        boolean error = true;
        int heureI = 0;
        String heure = "";
        while(error){
            try{
                heure = bufferRead.readLine();
                heureI = Integer.parseInt(heure);
                if(heureI >= horaireAtlier.getDebutJour() && heureI <= horaireAtlier.getFinJour()){
                    error = false;
                } else {
                    System.err.println("#####################TEMPS INVALIDE########################");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\nInsérez l'heure de votre récuperation?(" + horaireAtlier.getDebutJour() + "~" + horaireAtlier.getFinJour() + ")");
                }
            } catch (Exception e){
                System.err.println("###################TEMPS FORME INVALIDE####################");
                System.out.println("-----------------------------------------------------------");
                System.out.println("\nInsérez l'heure de votre récuperation?(" + horaireAtlier.getDebutJour() + "~" + horaireAtlier.getFinJour() + ")");
            }
        }

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
        InfoPayment infoPayment = null;
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez votre nom?");
            String nc = bufferRead.readLine();

            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez votre addresse?");
            String ac = bufferRead.readLine();

            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez votre compte banque?");
            String cb = bufferRead.readLine();

            infoPayment = port.creerInfoPayment(nc,ac,cb);

        } catch(Exception e){

        }
        GregorianCalendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY,heureI);

        try {
            System.out.println(boutique);
            System.out.println(recette);
            System.out.println(quantite);
            System.out.println(infoPayment);
            System.out.println(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
            if(port.creerCommande(boutique,recette, DatatypeFactory.newInstance().newXMLGregorianCalendar(c),quantiteI,infoPayment)) {
                System.out.println("Succès");
                return true;
            }
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        System.out.println("Échec");
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

    private Recette creerRecette(stub.TcfService port) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-------------------CREER UNE RECETTE-----------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\nInsérez le nom de votre recette?");
        String nom = bufferRead.readLine();
        while(port.recetteIsExist(nom)){
            System.err.println("###############Cette recette est dèjà existe!!#############");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nInsérez le nom de votre recette?");
            nom = bufferRead.readLine();
        }
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        List<Facon> facons = new ArrayList<Facon>();
        Ingredient ingredient = choisirIngredient(port);
        if (ingredient != null) ingredients.add(ingredient);
        Facon facon = choisirFacon(port);
        if (facon != null) facons.add(facon);
        return port.creerRecette(nom, ingredients,facons);
    }

    private Boutique choisirBoutique(stub.TcfService port){
        Boutique boutique = null;
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            showMenu(port);
            String action = bufferRead.readLine();
            if("0".equals(action))return null;
            boutique = port.choisirBoutique(action);
            while (boutique == null){
                System.err.println("###################BOUTIQUE INCONNUE###################");
                showMenu(port);
                action = bufferRead.readLine();
                if("0".equals(action))return null;
                boutique = port.choisirBoutique(action);
            }
        }catch(Exception e){

        }
        return boutique;
    }

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

    private Recette choisirRecette(stub.TcfService port){
        Recette recette = null;
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            showMenuRecette(port);
            String action = bufferRead.readLine();
            if("0".equals(action))return null;
            recette = port.choisirRecette(action);
            while (recette == null){
                System.err.println("####################RECETTE INCONNUE###################");
                showMenuRecette(port);
                action = bufferRead.readLine();
                if("0".equals(action))return null;
                recette = port.choisirRecette(action);
            }
        }catch(Exception e){

        }
        return recette;
    }

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

}
