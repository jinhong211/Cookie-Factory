package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.domain.PreferenceFinder;
import fr.unice.polytech.se.demo.domain.PreferenceManager;
import fr.unice.polytech.se.demo.domain.impl.PreferenceManagerBean;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Preference;
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

    @Test
    public void testCreation()  {
        Boutique boutique = managerCB.createBoutique("Polytech", 100, 10, 9, 5);

        Boutique boutique2 = managerCB.createBoutique("Pppp", 100, 10, 9, 5);

        //Boutique foundB = managerF.findAll().get(0);

        //int integer = new Long(10);
        Preference preference =manager.create(10);

        preference = manager.addBoutique(boutique,10);


        Preference found = finder.findAll().get(0);
        //Preference found = finder.findById(10);




        System.out.println(preference.getBoutiques().size());
        assertEquals(found.getBoutiques().size(), preference.getBoutiques().size());
        assertEquals(found.getId(), preference.getId());
        assertEquals(found.getCompte(), preference.getCompte());
    }
}
