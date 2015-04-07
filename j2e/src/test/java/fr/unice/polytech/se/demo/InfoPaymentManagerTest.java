package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.InfoPaymentFinder;
import fr.unice.polytech.se.demo.domain.InfoPaymentManager;
import fr.unice.polytech.se.demo.domain.impl.InfoPaymentManagerBean;
import fr.unice.polytech.se.demo.entities.InfoPayment;
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
public class InfoPaymentManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(InfoPayment.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(InfoPaymentManager.class.getPackage())
                .addPackage(InfoPaymentManagerBean.class.getPackage());
    }

    @EJB
    private InfoPaymentManager manager;

    @EJB
    private InfoPaymentFinder finder;

    @Test
    public void testCreation()  {
        InfoPayment facon =manager.create("Jack","polyteque","lcl");

        InfoPayment found = finder.findAll().get(0);

        assertEquals(found.getId(), facon.getId());
    }
}
