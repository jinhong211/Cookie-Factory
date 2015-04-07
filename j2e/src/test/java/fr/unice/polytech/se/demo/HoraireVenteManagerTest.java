package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.HoraireVenteFinder;
import fr.unice.polytech.se.demo.domain.HoraireVenteManager;
import fr.unice.polytech.se.demo.domain.impl.HoraireVenteManagerBean;
import fr.unice.polytech.se.demo.entities.HoraireVente;
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
public class HoraireVenteManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(HoraireVente.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(HoraireVenteManager.class.getPackage())
                .addPackage(HoraireVenteManagerBean.class.getPackage());
    }

    @EJB
    private HoraireVenteManager manager;

    @EJB
    private HoraireVenteFinder finder;

    @Test
    public void testCreation()  {
        HoraireVente facon =manager.create();

        HoraireVente found = finder.findAll().get(0);

        assertEquals(found.getId(), facon.getId());
    }
}
