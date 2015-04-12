package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.domain.impl.CommandeManagerBean;
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

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/04/15.
 */
@RunWith(Arquillian.class)
public class CommandeManagerTest {

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Commande.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(CommandeManager.class.getPackage())
                .addPackage(CommandeManagerBean.class.getPackage());
    }

    @EJB
    private CommandeManager managerC;

    @EJB
    private RecetteManager managerR;

    @EJB
    private CommandeFinder finderC;

    @EJB
    private RecetteFinder finderR;

    @EJB
    private BoutiqueManager manageB;

    @EJB
    private IngredientManager managerI;

    @EJB
    private IngredientFinder finderI;

    @EJB
    private FaconManager managerF;

    @EJB
    private FaconFinder finderF;

    @EJB
    private InfoPaymentManager managerIF;

    @EJB
    private InfoPaymentFinder finderIF;


    @Test
    public void testCreation()  {

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

        Recette recette=managerR.create("Chocolect", ingredients,facons);

        //Boutique boutique = manageB.create(recette,"Polytech",100,10);

        Boutique boutique = manageB.create("Polytech",100,10,9,5);

        InfoPayment infoPayment = managerIF.create("cc","ac","cb");

       Commande commande=managerC.create(boutique,recette,new Date(0,0,0), 10,infoPayment);

        //Commande commande=managerC.create(recette,new Date(0,0,0), 10);

        // Commande commande=managerC.create(new Date(0,0,0), 10);

        Commande found = finderC.findAll().get(0);

        System.out.print(found.getBoutique().getChiffreVente());

        assertEquals(found.getQuantite(), commande.getQuantite());

        //assertEquals(found.getInfoPayment().getAddresse_Client(), commande.getInfoPayment().getAddresse_Client());

        assertEquals(found.getId(), commande.getId());
    }

}
