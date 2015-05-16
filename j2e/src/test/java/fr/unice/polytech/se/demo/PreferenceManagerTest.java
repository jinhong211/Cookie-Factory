package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.domain.impl.PreferenceManagerBean;
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

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/04/15.
 */

@RunWith(Arquillian.class)
public class PreferenceManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Preference.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(PreferenceManager.class.getPackage())
                .addPackage(PreferenceManagerBean.class.getPackage());
    }

    @EJB

    private CreerBoutique managerCB;

    @EJB

    private BoutiqueFinder managerF;

    @EJB
    private PreferenceManager manager;

    @EJB
    private PreferenceFinder finder;

    @EJB
    private ProcessCommand managerPC;

    @Test
    public void testCreation()  {

       // Preference facon =manager.create(10);
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

        Boutique boutique = managerCB.createBoutique("Polytech", 100, 10, 9, 5);

        Boutique boutique2 = managerCB.createBoutique("Pppp", 100, 10, 9, 5);

        Boutique foundB = managerF.findAll().get(0);

        //int integer = new Long(10);
        Preference preference =manager.create(10,boutique,recette);
        //preference = manager.addBoutique(boutique,10);


    //    Preference found = finder.findAll().get(0);
        Preference found = finder.findById(10);





        //Preference found = finder.findById(10);

       System.out.println(found.getBoutique().getAddresseBoutique());

        assertEquals(found.getBoutique().getAddresseBoutique(), preference.getBoutique().getAddresseBoutique());
        assertEquals(found.getId(), preference.getId());
        assertEquals(found.getCompte(), preference.getCompte());

    }
}
