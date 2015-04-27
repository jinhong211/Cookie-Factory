package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.domain.impl.ProcessCommandBean;
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
 * Created by user on 22/04/15.
 */
@RunWith(Arquillian.class)
public class ProcessCommandeTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(ProcessCommand.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(ProcessCommand.class.getPackage())
                .addPackage(ProcessCommandBean.class.getPackage());
    }

    @EJB
    private ProcessCommand managerPC;

    @EJB

    private CreerBoutique managerCB;

    @EJB
    private BoutiqueFinder managerF;

    @EJB
    private InfoPaymentManager managerI;

    @Test
    public void testCreation()  {

        Ingredient ingredient1=managerPC.createIngredient("Chocolect", 10);

        Ingredient ingredient2=managerPC.createIngredient("Coco", 5);

        Set<Ingredient> ingredients = new HashSet<Ingredient>();

        ingredients.add(ingredient1);

        ingredients.add(ingredient2);

        Facon facon1 =managerPC.createFacon("griller", 10);

        Facon facon2 =managerPC.createFacon("friter", 5);

        Set<Facon> facons = new HashSet<Facon>();

        facons.add(facon1);

        facons.add(facon2);

        Recette recette=managerPC.createRecette("Chocolect", ingredients, facons);

        //Boutique boutique = manageB.create(recette,"Polytech",100,10);

        Boutique boutique = managerCB.createBoutique("Polytech", 0.5, 10, 9, 5);

        InfoPayment infoPayment = managerI.create("cc", "ac", "cb");

        Commande commande=managerPC.createCommande(boutique, recette, new Date(0, 0, 0), 10, infoPayment);

        //Commande commande=managerC.create(recette,new Date(0,0,0), 10);

        // Commande commande=managerC.create(new Date(0,0,0), 10);

        Commande found = managerPC.findAllCommande().get(0);

        System.out.print(found.getBoutique().getChiffreVente());

        System.out.print("KKKKK"+found.getPrice());

        assertEquals(found.getRecette().getPrix_recette()*found.getQuantite()* (boutique.getTax()+1), commande.getPrice(),0.001);
        assertEquals(found.getBoutique().getChiffreVente(), commande.getBoutique().getChiffreVente());

        assertEquals(found.getQuantite(), commande.getQuantite());

        //assertEquals(found.getInfoPayment().getAddresse_Client(), commande.getInfoPayment().getAddresse_Client());

        assertEquals(found.getId(), commande.getId());
    }
}
