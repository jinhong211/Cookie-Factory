package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.FaconFinder;
import fr.unice.polytech.se.demo.domain.IngredientFinder;
import fr.unice.polytech.se.demo.domain.RecetteFinder;
import fr.unice.polytech.se.demo.domain.RecetteManager;
import fr.unice.polytech.se.demo.entities.Facon;
import fr.unice.polytech.se.demo.entities.Ingredient;
import fr.unice.polytech.se.demo.entities.Recette;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 31/03/15.
 */
@Stateless
public class RecetteManagerBean implements RecetteManager {
    @PersistenceContext
    EntityManager entityManager;

    @EJB
    IngredientFinder im = new IngredientFinderBean();

    @EJB
    FaconFinder fm = new FaconFinderBean();

    @EJB
    RecetteFinder rm = new RecetteFinderBean();

    @Override
    public Recette create() {
        return null;
    }

    @Override
    public Recette create(String n,Set<Ingredient> ingredients,Set<Facon> facons) {
        Set<Ingredient> ingredients1 = new HashSet<Ingredient>();

        double iprix = 0;
        Iterator is = ingredients.iterator();

        while(is.hasNext()){
            Ingredient i=(Ingredient)is.next();
            iprix += i.getPrix_Ingredient();
            Ingredient ingredient = im.findByName(i.getNom_Ingredient());
            if(ingredient!=null)
               ingredients1.add(ingredient);
            else
               ingredients1.add(i) ;
        }

        Set<Facon> facons1 = new HashSet<Facon>();

        double ftime=0;
        Iterator fs = facons.iterator();

        while(fs.hasNext()){
            Facon f=(Facon)fs.next();
            ftime+=f.getTemps_Utilise();
            Facon facon = fm.findByName(f.getNom_Facon());
            if(facon!=null)
                facons1.add(facon);
            else
                facons1.add(f) ;
        }


        Recette recette = rm.findByName(n);
        if (recette == null) {
            recette = new Recette();
            recette.setNom_recette(n);
            recette.setIngredients(ingredients1);
            recette.setFacons(facons1);
            recette.setPrix_recette(iprix);
            recette.setTemps_Utiliser(ftime);
            entityManager.persist(recette);
        }
        return recette;
    }

    @Override
    public Recette addIngredientToRecette(String ingredient, String recette) {
        Ingredient i= im.findByName(ingredient);
        Recette r = (Recette) rm.findByName(recette);
        Set<Ingredient> ingredients = r.getIngredients();
        ingredients.add(i);
        r.setIngredients(ingredients);
        entityManager.merge(r);
        //entityManager.merge(i);
        return r;
    }

    @Override
    public Recette deleteIngredientToRecette(String ingredient, String recette) {
        Ingredient i= im.findByName(ingredient);
        Recette r =(Recette) rm.findByName(recette);
        Set<Ingredient> ingredients = r.getIngredients();
        ingredients.remove(ingredient);
        r.setIngredients(ingredients);
        entityManager.merge(r);
        return r;
    }


}