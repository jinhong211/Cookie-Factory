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
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ding on 12/05/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/ClientSansCompte")
@Stateless
public class ClientSansCompteServiceImpl implements ClientSansCompteService{

    @EJB
    private BoutiqueFinder boutiqueFinder;

    @EJB
    private ProcessCommand processCommand;

    @Override
    public boolean passerCommand(String ab, String r, Date d, int q) {
        Boutique boutique;
        Recette recette;
        boutique = boutiqueFinder.findByAddresse(ab);
        recette = processCommand.findByNameRecette(r);
        if(boutique != null && recette != null){
            if(processCommand.createCommande(boutique,recette,d,q) != null){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean creerRecette(String n, Set<String> ingredients, Set<String> facons) {
        Recette recette;
        Set<Ingredient> ingredientList = new HashSet<Ingredient>();
        Set<Facon> fanconList = new HashSet<Facon>();
        for(String i : ingredients){
            Ingredient ingredient = processCommand.findByNameIngredient(i);
            if(ingredient != null){
                ingredientList.add(ingredient);
            }
        }

        for(String f : facons){
            Facon facon = processCommand.findByNameFacon(f);
            if(f != null){
                facons.add(f);
            }
        }

        recette = processCommand.createRecette(n,ingredientList, fanconList);

        if(recette != null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean creerPreferenceCompte(ArrayList<String> recettes, ArrayList<String> boutiques, int id_compte) {
        return false;
    }


}
