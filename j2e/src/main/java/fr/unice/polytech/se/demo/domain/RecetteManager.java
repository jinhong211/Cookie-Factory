package fr.unice.polytech.se.demo.domain;

import fr.unice.polytech.se.demo.entities.Facon;
import fr.unice.polytech.se.demo.entities.Ingredient;
import fr.unice.polytech.se.demo.entities.Recette;

import java.util.Set;

/**
 * Created by user on 31/03/15.
 */
public interface RecetteManager {
    public Recette create();

    public Recette create(String n, Set<Ingredient> ingredients,Set<Facon> facons);

    Recette addIngredientToRecette(String ingredient, String recette);

    Recette deleteIngredientToRecette(String ingredient, String recette);
}
