package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.FaconFinder;
import fr.unice.polytech.se.demo.domain.FaconManager;
import fr.unice.polytech.se.demo.domain.impl.FaconManagerBean;
import fr.unice.polytech.se.demo.entities.Facon;
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

public class FaconManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Facon.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(FaconManager.class.getPackage())
                .addPackage(FaconManagerBean.class.getPackage());
    }

    @EJB
    private FaconManager manager;

    @EJB
    private FaconFinder finder;

    @Test
    public void testCreation()  {
        Facon facon =manager.create("griller", 10);

        Facon found = finder.findByName("griller");

        assertEquals(found.getNom_Facon(), facon.getNom_Facon());
        assertEquals(found.getId(), facon.getId());
    }
}
