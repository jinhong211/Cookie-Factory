package fr.unice.polytech.tcf;

import stub.Boutique;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by ding on 10/04/15.
 */
public class Cadre {

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

    private void showMenu(){
        System.out.println("--------------L'AFFICHAGE DE CHIFFRE VENTE MENU------------");
        System.out.println("----------------[1] POUR AFFICHER LE CHIFFRE VENTE---------");
        System.out.println("----------------[2] POUR ABANDONNER------------------------");
        System.out.println("------------CHOISIR LE NUMERO DE VOTRE ACTION--------------");
        System.out.println("-----------------------------------------------------------");
    }

}
