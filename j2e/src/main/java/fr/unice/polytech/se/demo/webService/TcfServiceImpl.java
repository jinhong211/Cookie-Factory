package fr.unice.polytech.se.demo.webService;


import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.ProcessCommand;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Facon;
import fr.unice.polytech.se.demo.entities.Ingredient;
import fr.unice.polytech.se.demo.entities.Recette;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31/03/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/tcf")
@Stateless
public class TcfServiceImpl implements TcfService {


    @EJB
    BoutiqueFinder boutiqueFinder;

    @EJB
    ProcessCommand processCommand;

    @Override
    public ArrayList<String> getAllBoutique() {
        List<Boutique> boutiques = boutiqueFinder.findAll();
        ArrayList<String> boutiqueList = new ArrayList<String>();
        for(Boutique b:boutiques){
            boutiqueList.add(b.getAddresseBoutique());
        }
        return boutiqueList;
    }

    @Override
    public ArrayList<String> getAllIngredient() {
        ArrayList<String> ingredientList = new ArrayList<String>();
        List<Ingredient> ingredients = processCommand.findAllIngredient();
        for(Ingredient i : ingredients){
            ingredientList.add(i.getNom_Ingredient());
        }
        return ingredientList;
    }

    @Override
    public ArrayList<String> getAllFacon() {
        ArrayList<String> faconList = new ArrayList<String>();
        List<Facon> facons = processCommand.findAllFacon();
        for(Facon f : facons){
            faconList.add(f.getNom_Facon());
        }
        return faconList;
    }

    @Override
    public ArrayList<String> getAllRecette() {
        ArrayList<String> recetteList = new ArrayList<String>();
        List<Recette> recettes = processCommand.findAllRecette();
        for(Recette r : recettes){
            recetteList.add(r.getNom_recette());
        }
        return recetteList;
    }
}
