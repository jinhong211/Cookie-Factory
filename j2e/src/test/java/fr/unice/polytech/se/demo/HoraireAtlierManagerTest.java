package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.HoraireAtlierFinder;
import fr.unice.polytech.se.demo.domain.HoraireAtlierManager;
import fr.unice.polytech.se.demo.domain.impl.HoraireAtlierManagerBean;
import fr.unice.polytech.se.demo.entities.HoraireAtlier;
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

public class HoraireAtlierManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(HoraireAtlier.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(HoraireAtlierManager.class.getPackage())
                .addPackage(HoraireAtlierManagerBean.class.getPackage());
    }

    @EJB
    private HoraireAtlierManager manager;

    @EJB
    private HoraireAtlierFinder finder;

    @Test
    public void testCreation()  {
        HoraireAtlier facon =manager.create();

        HoraireAtlier found = finder.findAll().get(0);

        assertEquals(found.getId(), facon.getId());
    }

}