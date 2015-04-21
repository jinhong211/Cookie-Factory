package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.domain.impl.RecetteManagerBean;
import fr.unice.polytech.se.demo.entities.Facon;
import fr.unice.polytech.se.demo.entities.Ingredient;
import fr.unice.polytech.se.demo.entities.Recette;
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
 * Created by user on 01/04/15.
 */
@RunWith(Arquillian.class)

public class RecetteManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Recette.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(RecetteManager.class.getPackage())
                .addPackage(RecetteManagerBean.class.getPackage());
    }

    @EJB
    private RecetteManager managerR;

    @EJB
    private RecetteFinder finder;

    @EJB
    private IngredientManager managerI;

    @EJB
    private IngredientFinder finderI;

    @EJB
    private FaconManager managerF;

    @EJB
    private FaconFinder finderF;

    @Test
    public void testCreation()  {
        Ingredient ingredient1=managerI.create("Chocolect", 10);

        Ingredient ingredient2=managerI.create("Coco", 5);

        Set<Ingredient> ingredients = new HashSet<Ingredient>();

        ingredients.add(ingredient1);

        ingredients.add(ingredient2);

        Ingredient ingredient3=managerI.create("Fraise", 10);

        //Ingredient ingredient2=managerI.create("Coco", 5);

        Set<Ingredient> ingredients2 = new HashSet<Ingredient>();

        ingredients2.add(ingredient3);

        //ingredients2.add(ingredient2);

        Facon facon1 =managerF.create("griller", 10);

        Facon facon2 =managerF.create("friter", 5);

        Set<Facon> facons = new HashSet<Facon>();

        facons.add(facon1);

        facons.add(facon2);

        Facon facon3 =managerF.create("main", 10);

        //Facon facon2 =managerF.create("friter", 5);

        Set<Facon> facons2 = new HashSet<Facon>();

        facons2.add(facon3);

        //facons.add(facon2);

        // Boutique boutique = manager.create("Polytech",new Date(1000),new Date(2000),100);
        Recette Recette=managerR.create("Chocolect", ingredients,facons);

        Recette found = finder.findByName("Chocolect");



        Recette Recette2=managerR.create("Coco", ingredients2,facons2);

        //Recette found2 = finder.findAll().get(1);
        //assertEquals(Commande.getAddresseBoutique(), "Polytech");
        //Commande found = finder.findAll().get(0);
        //assertEquals(found.getId(), commande.getId());

        Recette found2 = finder.findByName("Chocolect");

        //found = finder.findAll().get(0);
        System.out.print(found2.getNom_recette());

        /*Facon facon=finderF.findByName("griller");
        System.out.print(facon.getNom_Facon());
        Set<Recette> recettes=facon.getRecettes();

        System.out.print(recettes.size());*/

        assertEquals(found.getNom_recette(), Recette.getNom_recette());
        assertEquals(found.getId(), Recette.getId());
        //assertEquals(found.getIngredients().size(), Recette.getIngredients().size());
    }

}
