package fr.unice.polytech.se.demo.startup;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.domain.ProcessCommand;
import fr.unice.polytech.se.demo.entities.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ding on 14/05/15.
 */
@Singleton
@Startup
public class StartupBean {

    @EJB
    private CreerBoutique creerBoutique;
    @EJB
    private ProcessCommand processCommand;
    @EJB
    private BoutiqueFinder managerBF;


    private Boutique denver, nice, antibes, valbonne;
    private Ingredient ingredient1, ingredient2, ingredient3, ingredient4, ingredient5, ingredient6, ingredient7, ingredient8;
    private Recette recette1, recette2, recette3, recette4, recette5, recette6, recette7, recette8;
    private Commande commande1, commande2, commande3, commande4, commande5, commande6, commande7, commande8, commande9, commande10;
    private Facon facon1, facon2, facon3, facon4, facon5, facon6, facon7, facon8;
    private Set<Facon> facons1,facons2,facons3,facons4,facons5,facons6,facons7,facons8;
    private Set<Ingredient> ingredients1,ingredients2,ingredients3,ingredients4,ingredients5,ingredients6,ingredients7,ingredients8;
    @PostConstruct
    public void startup(){
        denver = creerBoutique.createBoutique("Denver", 0.5, 10, 9, 5);
        nice = creerBoutique.createBoutique("Nice", 0.20, 0, 8, 19);
        antibes = creerBoutique.createBoutique("Antibes", 0.14, 0, 10, 20);
        valbonne = creerBoutique.createBoutique("Valbonne", 0.10, 0, 12, 18);

        Boutique pp= managerBF.findByAddresse("Denver");

        ingredient1 = processCommand.createIngredient("Pomme", 3.29);
        ingredient2 = processCommand.createIngredient("Chocolat", 4.5);
        ingredient3 = processCommand.createIngredient("Cafe", 4.6);
        ingredient4 = processCommand.createIngredient("Fraise", 2.2);
        ingredient5 = processCommand.createIngredient("Citron", 1.5);
        ingredient6 = processCommand.createIngredient("Lati", 6.7);
        ingredient7 = processCommand.createIngredient("MM", 3.5);
        ingredient8 = processCommand.createIngredient("Nuts", 8.0);

        facon1 = processCommand.createFacon("Cuire", 12.0);
        facon2 = processCommand.createFacon("Melange", 10.0);
        facon3 = processCommand.createFacon("Rotir", 15.0);
        facon4 = processCommand.createFacon("Griller", 20.0);
        facon5 = processCommand.createFacon("Evaporer", 12.0);
        facon6 = processCommand.createFacon("Couper", 8.0);
        facon7 = processCommand.createFacon("Secher", 30.0);
        facon8 = processCommand.createFacon("Mix", 15.0);

        facons1 = new HashSet<Facon>();
        facons2 = new HashSet<Facon>();
        facons3 = new HashSet<Facon>();
        facons4 = new HashSet<Facon>();
        facons5 = new HashSet<Facon>();
        facons6 = new HashSet<Facon>();
        facons7 = new HashSet<Facon>();
        facons8 = new HashSet<Facon>();

        ingredients1 = new HashSet<Ingredient>();
        ingredients2 = new HashSet<Ingredient>();
        ingredients3 = new HashSet<Ingredient>();
        ingredients4 = new HashSet<Ingredient>();
        ingredients5 = new HashSet<Ingredient>();
        ingredients6 = new HashSet<Ingredient>();
        ingredients7 = new HashSet<Ingredient>();
        ingredients8 = new HashSet<Ingredient>();

        facons1.add(facon1);facons1.add(facon2);facons1.add(facon3);
        facons2.add(facon3);facons2.add(facon4);facons2.add(facon5);
        facons3.add(facon4);facons3.add(facon7);facons3.add(facon1);
        facons4.add(facon7);facons4.add(facon5);facons4.add(facon2);
        facons5.add(facon5);facons5.add(facon2);facons5.add(facon4);
        facons6.add(facon8);facons6.add(facon3);facons6.add(facon7);
        facons7.add(facon2);facons7.add(facon4);facons7.add(facon8);
        facons8.add(facon6);facons8.add(facon8);facons8.add(facon1);

        ingredients1.add(ingredient1);ingredients1.add(ingredient2);ingredients1.add(ingredient3);
        ingredients2.add(ingredient2);ingredients2.add(ingredient3);ingredients2.add(ingredient4);
        ingredients3.add(ingredient3);ingredients3.add(ingredient4);ingredients3.add(ingredient5);
        ingredients4.add(ingredient4);ingredients4.add(ingredient5);ingredients4.add(ingredient6);
        ingredients5.add(ingredient5);ingredients5.add(ingredient6);ingredients5.add(ingredient7);
        ingredients6.add(ingredient6);ingredients6.add(ingredient7);ingredients6.add(ingredient8);
        ingredients7.add(ingredient7);ingredients7.add(ingredient8);ingredients7.add(ingredient1);
        ingredients8.add(ingredient8);ingredients8.add(ingredient1);ingredients8.add(ingredient2);

        recette1 = processCommand.createRecette("Recette1", ingredients1,facons1);
        recette2 = processCommand.createRecette("Recette2", ingredients2,facons2);
        recette3 = processCommand.createRecette("Recette3", ingredients3,facons3);
        recette4 = processCommand.createRecette("Recette4", ingredients4,facons4);
        recette5 = processCommand.createRecette("Recette5", ingredients5,facons5);
        recette6 = processCommand.createRecette("Recette6", ingredients6,facons6);
        recette7 = processCommand.createRecette("Recette7", ingredients7,facons7);
        recette8 = processCommand.createRecette("Recette8", ingredients8,facons8);

        commande1 = processCommand.createCommande(denver,recette1,new Date(2015,5,20),20);
        commande2 = processCommand.createCommande(denver,recette2,new Date(2015,5,20),30);
        commande3 = processCommand.createCommande(denver,recette3,new Date(2015,5,20),40);
        commande4 = processCommand.createCommande(nice,recette4,new Date(2015,5,20),20);
        commande5 = processCommand.createCommande(nice,recette5,new Date(2015,5,20),10);
        commande6 = processCommand.createCommande(antibes,recette6,new Date(2015,5,20),25);
        commande7 = processCommand.createCommande(valbonne,recette7,new Date(2015,5,20),50);
        commande8 = processCommand.createCommande(valbonne,recette8,new Date(2015,5,20),12);
        commande9 = processCommand.createCommande(valbonne,recette1,new Date(2015,5,20),250);
        commande10 = processCommand.createCommande(valbonne,recette2,new Date(2015,5,20),70);

    }
    @PreDestroy
    public void cleanup(){
        denver = nice = antibes = valbonne = null;
        ingredient1 = ingredient2 =ingredient3 = ingredient4 = ingredient5 = ingredient6 = ingredient7 = ingredient8 = null;
        facon1 = facon2 = facon3 = facon4 = facon5 = facon6 = facon7 = facon8 = null;
        ingredients1 = ingredients2 = ingredients3 = ingredients4 = ingredients5 = ingredients6 = ingredients7 = ingredients8 = null;
        facons1 = facons2 = facons3 = facons4 = facons5 = facons6 = facons7 = facons8 = null;
        recette1 = recette2 = recette3 = recette4 = recette5 = recette6 = recette7 = recette8 = null;
        commande1 = commande2 = commande3 = commande4 = commande5 = commande6 = commande7 = commande8 = commande9 = commande10 = null;
    }
}
