package fr.unice.polytech.se.demo.domain;

import fr.unice.polytech.se.demo.entities.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 22/04/15.
 */
public interface ProcessCommand {

    public Commande createCommande(Boutique boutique, Recette recette, Date date, Integer quantite, InfoPayment infoPayment);

    public Commande createCommande(Recette recette, Date date, Integer quantite);

    //public Commande create( Date date, Integer quantite);

    void addRecette(String recette, double taxe, double q, long id);

    public Commande findByIdCommande(long n);

    public List<Commande> findByDateCommande(Date d);

    public List<Commande> findByQuantiteCommande(int q);

    public List<Commande> findByIdBoutiqueCommande(long b);

    public List<Commande> findAllCommande();

    public Recette createRecette(String n, Set<Ingredient> ingredients,Set<Facon> facons);

    Recette addIngredientToRecette(String ingredient, String recette);

    Recette deleteIngredientToRecette(String ingredient, String recette);

    public Recette findByIdRecette(int n);

    public Recette findByNameRecette(String n);

    public List<Recette> findByPrixRecette(double p);

    public List<Recette> findByTempsUtiliseRecette(int t);

    public List<Recette> findAllRecette();

    public List<Recette> findLastRecette(int n, int startIndex);

    public Ingredient createIngredient(String name, double t);

    public Ingredient deleteIngredient(String n);

    public Ingredient findByNameIngredient(String n);

    public Ingredient findByPrixIngredient(double n);

    public Ingredient findByIdIngredient(long n);

    public List<Ingredient> findAllIngredient();

    public Facon createFacon(String name, double t);

    public Facon findByIdFacon(long id);

    public Facon findByNameFacon(String n);

    public Facon findByTempsFacon(double time);

    public List<Facon> findAllFacon();
}
