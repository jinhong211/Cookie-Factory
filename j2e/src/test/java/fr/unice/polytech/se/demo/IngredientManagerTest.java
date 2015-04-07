package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.IngredientFinder;
import fr.unice.polytech.se.demo.domain.IngredientManager;
import fr.unice.polytech.se.demo.domain.impl.IngredientManagerBean;
import fr.unice.polytech.se.demo.entities.Ingredient;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/04/15.
 */

@RunWith(Arquillian.class)


public class IngredientManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Ingredient.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(IngredientManager.class.getPackage())
                .addPackage(IngredientManagerBean.class.getPackage());
    }

    @EJB
    private IngredientManager manager;

    @EJB
    private IngredientFinder finder;

    @Test
    public void testCreation()  {

        Ingredient ingredient=manager.create("Chocolect", 10);

        Ingredient found = finder.findByName("Chocolect");
        assertEquals(found.getNom_Ingredient(), ingredient.getNom_Ingredient());
        assertEquals(found.getId(), ingredient.getId());
    }

}
