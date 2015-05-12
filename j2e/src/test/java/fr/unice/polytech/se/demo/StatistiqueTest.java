package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.domain.ProcessCommand;
import fr.unice.polytech.se.demo.domain.Statistique;
import fr.unice.polytech.se.demo.domain.impl.StatistiqueBean;
import fr.unice.polytech.se.demo.entities.*;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 27/04/15.
 */
@RunWith(Arquillian.class)
public class StatistiqueTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Statistique.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(Statistique.class.getPackage())
                .addPackage(StatistiqueBean.class.getPackage());
    }

    @EJB
    private Statistique managerS;

    @EJB
    private ProcessCommand managerPC;

    @EJB

    private CreerBoutique managerCB;

    @EJB
    private BoutiqueFinder managerF;

    @Test
    public void testCreation() {
        Ingredient ingredient1=managerPC.createIngredient("Chocolect", 10);

        Ingredient ingredient2=managerPC.createIngredient("Coco", 5);

        Ingredient ingredient3=managerPC.createIngredient("Fraise", 5);

        Set<Ingredient> ingredients = new HashSet<Ingredient>();

        ingredients.add(ingredient1);

        ingredients.add(ingredient2);

        Set<Ingredient> ingredients2 = new HashSet<Ingredient>();

        ingredients.add(ingredient3);

        Facon facon1 =managerPC.createFacon("griller", 10);

        Facon facon2 =managerPC.createFacon("friter", 5);

        Facon facon3 =managerPC.createFacon("main", 5);

        Set<Facon> facons = new HashSet<Facon>();

        facons.add(facon1);

        facons.add(facon2);

        Set<Facon> facons2 = new HashSet<Facon>();

        facons2.add(facon3);


        Recette recette=managerPC.createRecette("Chocolect", ingredients, facons);

        Recette recette2=managerPC.createRecette("Coco", ingredients2, facons2);

        Recette r=managerPC.findByNameRecette("Chocolect");

        System.out.print(r.getNom_recette());
        //Recette recette2=managerPC.createRecette("Coco", ingredients2, facons2);
        //Boutique boutique = manageB.create(recette,"Polytech",100,10);

        Boutique boutique = managerCB.createBoutique("Polytech", 0.5, 10, 9, 5);

        Commande commande=managerPC.createCommande(boutique, recette, new Date(0, 0, 0), 10);

       // int s = managerS.getChiffreVenteBoutiques();

        int s = managerS.getChiffreVenteBoutique("Polytech");

        System.out.print(s);
    }

}
