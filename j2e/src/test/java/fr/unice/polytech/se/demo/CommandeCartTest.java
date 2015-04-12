package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.CommandeCart;
import fr.unice.polytech.se.demo.domain.CommandeManager;
import fr.unice.polytech.se.demo.domain.RecetteManager;
import fr.unice.polytech.se.demo.domain.impl.CommandeCartBean;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

/**
 * Created by user on 02/04/15.
 */
@RunWith(Arquillian.class)
public class CommandeCartTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(CommandeCart.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(CommandeCart.class.getPackage())
                .addPackage(CommandeCartBean.class.getPackage());
    }

    @EJB
    private CommandeCart cart;

    @EJB
    private CommandeManager managerC;

    @EJB
    private RecetteManager managerR;


    @Test
    public void testCart(){
        /*assertTrue(cart.getContents().isEmpty());

        Recette recette = managerR.create("Coco",10,10);
        Commande commande = managerC.create(recette,new Date(0,0,0),10);
        cart.addCommande(commande);
        assertEquals(cart.getContents().size(), 1);
        cart.deleteCommande(commande);
        assertTrue(cart.getContents().isEmpty());*/
    }



}