package fr.unice.polytech.se.demo.presentation;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.entities.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.*;

/**
 * Created by ding on 13/05/15.
 */

@ManagedBean(name = "responsableBoutiqueJsf")
@SessionScoped
public class ResponsableBoutiqueJsf implements Serializable {

    @EJB
    private Statistique statistique;
    @EJB
    private BoutiqueFinder boutiqueFinder;
    @EJB
    private RecettesduBoutique recettesduBoutique;
    @EJB
    private CreerBoutique creerBoutique;
    @EJB
    private ProcessCommand processCommand;

    private String adresseBoutique;

    private static ArrayList<String> selectBoutiqueMenu;

    private static ArrayList<String> commandList;

    public int getStatistiqueBoutique(){
        return statistique.getChiffreVenteBoutique(adresseBoutique);
    }

    public void setAdresseBoutique(String adresseBoutique){
        this.adresseBoutique = adresseBoutique;
    }

    public String getAdresseBoutique(){
        return adresseBoutique;
    }

    public ArrayList<String> getSelectBoutiqueMenu(){

        selectBoutiqueMenu = new ArrayList<String>();
        List<Boutique> allBoutique = boutiqueFinder.findAll();
        for(Boutique b : allBoutique){
            selectBoutiqueMenu.add(b.getAddresseBoutique());
        }
        return selectBoutiqueMenu;
    }

    public ArrayList<String> getCommandList(){
        commandList = new ArrayList<String>();
        Set<Commande> commandes = recettesduBoutique.getRecettesduBoutique(adresseBoutique);
        for(Commande c : commandes){
            commandList.add("Commande[" + c.getId() +"] :" + c.getRecette().getNom_recette() + ", quantite: " + c.getQuantite() + ", prix: "+c.getPrice() + ", lieu: "+c.getBoutique().getAddresseBoutique()+", Date: "+c.getDate().toString());
        }
        return commandList;
    }

}
