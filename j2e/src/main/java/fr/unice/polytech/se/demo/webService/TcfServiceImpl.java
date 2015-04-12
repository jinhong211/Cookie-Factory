package fr.unice.polytech.se.demo.webService;


import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.entities.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 31/03/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/tcf")
@Stateless
public class TcfServiceImpl implements TcfService {

    @EJB
    BoutiqueManager boutiqueManager;

    @EJB
    BoutiqueFinder boutiqueFinder;

    @EJB
    IngredientManager ingredientManager;

    @EJB
    IngredientFinder ingredientFinder;

    @EJB
    FaconManager faconManager;

    @EJB
    FaconFinder faconFinder;

    @EJB
    RecetteManager recetteManager;

    @EJB
    RecetteFinder recetteFinder;

    @EJB
    InfoPaymentManager infoPaymentManager;

    @EJB
    CommandeManager commandeManager;



    @Override
    public boolean creerBoutique(String address, double tax, int to, int tf) {
        Boutique boutique = boutiqueFinder.findByAddresse(address);
        if(boutique != null){
            return false;
        } else {
            boutique = boutiqueManager.create(address,tax,0,to,tf);
            if (boutique != null){
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean boutiqueIsExist(String address) {
        Boutique boutique = boutiqueFinder.findByAddresse(address);
        if(boutique != null){
            return true;
        }
        return false;
    }

    @Override
    public List<Boutique> getAllBoutique() {
        return boutiqueFinder.findAll();
    }

    @Override
    public Boutique choisirBoutique(String adresse) {
        return boutiqueFinder.findByAddresse(adresse);
    }

    @Override
    public boolean creerIngredient(String nom, double prix) {
        Ingredient ingredient = ingredientFinder.findByName(nom);
        if(ingredient != null){
            return false;
        } else {
            ingredient = ingredientManager.create(nom,prix);
            if (ingredient != null){
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean ingredientIsExist(String nom) {
        Ingredient ingredient = ingredientFinder.findByName(nom);
        if(ingredient != null){
            return true;
        }
        return false;
    }

    @Override
    public List<Ingredient> getAllIngredient() {
        return ingredientFinder.findAll();
    }

    @Override
    public Ingredient choisirIngredient(String nom) {
        return ingredientFinder.findByName(nom);
    }

    @Override
    public boolean creerFacon(String nom, double temps) {
        Facon facon = faconFinder.findByName(nom);
        if(facon != null){
            return false;
        } else {
            facon = faconManager.create(nom,temps);
            if (facon != null){
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean faconIsExist(String nom) {
        Facon facon = faconFinder.findByName(nom);
        if(facon != null){
            return true;
        }
        return false;
    }

    @Override
    public List<Facon> getAllFacon() {
        return faconFinder.findAll();
    }

    @Override
    public Facon choisirFacon(String nom) {
        return faconFinder.findByName(nom);
    }

    @Override
    public Recette creerRecette(String nom, Set<Ingredient> ingredients, Set<Facon> facons) {
        Recette recette = recetteFinder.findByName(nom);
        if(recette != null){
            return null;
        } else {
            recette = recetteManager.create(nom,ingredients,facons);
            if (recette != null){
                return recette;
            } else {
                return null;
            }
        }
    }

    @Override
    public boolean recetteIsExist(String nom) {
        Recette recette = recetteFinder.findByName(nom);
        if(recette != null){
            return true;
        }
        return false;
    }

    @Override
    public List<Recette> getAllRecette() {
        return recetteFinder.findAll();
    }

    @Override
    public Recette choisirRecette(String nom) {
        return recetteFinder.findByName(nom);
    }

    @Override
    public InfoPayment creerInfoPayment(String nc, String ac, String cb) {
        return infoPaymentManager.create(nc,ac,cb);
    }

    @Override
    public boolean creerCommande(Boutique boutique, Recette recette, Date date, Integer quantite, InfoPayment infoPayment) {
            if (commandeManager.create(boutique,recette,date,quantite,infoPayment) != null){
                return true;
            } else {
                return false;
            }
    }

}
