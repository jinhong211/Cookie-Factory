package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.domain.impl.BoutiqueManagerBean;
import fr.unice.polytech.se.demo.entities.Boutique;
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

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 01/04/15.
 */

@RunWith(Arquillian.class)
public class BoutiqueManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Boutique.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(BoutiqueManager.class.getPackage())
                .addPackage(BoutiqueManagerBean.class.getPackage());
    }

    @EJB

    private BoutiqueManager managerB;

    @EJB
    private RecetteManager managerR;

    @EJB
    private BoutiqueFinder finder;

    @EJB
    private RecetteFinder finderr;

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
         //Boutique boutique = manager.create("Polytech",new Date(1000),new Date(2000),100);

        Ingredient ingredient1=managerI.create("Chocolect", 10);

        Ingredient ingredient2=managerI.create("Coco", 5);

        Set<Ingredient> ingredients = new HashSet<Ingredient>();

        ingredients.add(ingredient1);

        ingredients.add(ingredient2);

        Facon facon1 =managerF.create("griller", 10);

        Facon facon2 =managerF.create("friter", 5);

        Set<Facon> facons = new HashSet<Facon>();

        facons.add(facon1);

        facons.add(facon2);

        Recette recette= managerR.create("Chocolect", ingredients,facons);
        //System.out.println(finderr.findByName("Chocolect"));
        //Recette recette=new Recette("Chocolect", 10,10);

        Boutique boutique = managerB.create("Polytech",100,10,9,5);
        boutique = managerB.setRecettedujour(boutique,recette);
        System.out.println(finder.findByAddresse("Polytech").getRecette_du_jour());
        System.out.print(boutique.getTax());
       // Boutique boutique2 = managerB.create("Pppp",100,10,9,5);
        //assertEquals(Commande.getAddresseBoutique(), "Polytech");
        //Commande found = finder.findAll().get(0);
        //assertEquals(found.getId(), commande.getId());
        Boutique found = finder.findAll().get(0);
     //   Boutique found2 = finder.findAll().get(1);
        assertEquals(found.getAddresseBoutique(), boutique.getAddresseBoutique());
        assertEquals(found.getId(), boutique.getId());
        System.out.print(found.getRecette_du_jour().getNom_recette());
        assertEquals(found.getRecette_du_jour().getNom_recette(), boutique.getRecette_du_jour().getNom_recette());
      //  assertEquals(found.getRecette_du_jour().getNom_recette(), boutique.getRecette_du_jour().getNom_recette());

        //System.out.print(boutique.getRecette_du_jour().getNom_recette());
       // System.out.print(found2.getRecette_du_jour().getNom_recette());
    }



}
