package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.PreferenceFinder;
import fr.unice.polytech.se.demo.domain.PreferenceManager;
import fr.unice.polytech.se.demo.domain.impl.PreferenceManagerBean;
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
    private PreferenceManager manager;

    @EJB
    private PreferenceFinder finder;

    @Test
    public void testCreation()  {
        Preference facon =manager.create();

        Preference found = finder.findAll().get(0);

        assertEquals(found.getId(), facon.getId());
    }
}
