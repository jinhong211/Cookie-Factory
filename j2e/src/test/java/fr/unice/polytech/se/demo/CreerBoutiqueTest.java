package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.domain.impl.CreerBoutiqueBean;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.HoraireVente;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 22/04/15.
 */
@RunWith(Arquillian.class)
public class CreerBoutiqueTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(CreerBoutique.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(CreerBoutique.class.getPackage())
                .addPackage(CreerBoutiqueBean.class.getPackage());
    }

    @EJB

    private CreerBoutique managerCB;

    @EJB

    private BoutiqueFinder managerF;

    @Test
    public void testCreation()  {

        Boutique boutique = managerCB.createBoutique("Polytech", 100, 10, 9, 5);
        //Boutique boutique = managerB.create(recette,"Polytech",100,10);
        //boutique = managerB.setRecettedujour(boutique,recette);
        //System.out.println(finder.findByAddresse("Polytech").getRecette_du_jour());
        //System.out.print(boutique.getTax());
        Boutique boutique2 = managerCB.createBoutique("Pppp", 100, 10, 9, 5);
        //assertEquals(Commande.getAddresseBoutique(), "Polytech");
        //Commande found = finder.findAll().get(0);
        //assertEquals(found.getId(), commande.getId());
        Boutique found = managerF.findAll().get(0);

        HoraireVente horaireVente =managerCB.createHoraireAtlier();

        HoraireVente foundHoraireVente = managerCB.findAllHoraireAtlier().get(2);

        Assert.assertEquals(foundHoraireVente.getId(), horaireVente.getId());

       /* Facon facon=finderF.findByName("griller");
        System.out.print(facon.getNom_Facon());
        Set<Recette> recettes=facon.getRecettes();

        System.out.print(recettes.size());*/
        // Iterator rs= facon.getRecettes().iterator();

        /*List<Recette> recettes=new ArrayList<Recette>();
        while(rs.hasNext()) {
            Recette i = (Recette) rs.next();
            recettes.add(i);
        }

        System.out.print(recettes.get(0).getNom_recette());*/
        //Recette recette2= managerR.create("Coco", ingredients,facons);
        //Recette foundr = finderr.findAll().get(0);


      //  Recette recette2= managerR.create("Coco", ingredients2, facons2);

     //   Recette foundr2 =finderr.findByName("Coco");
       // System.out.print(foundr2.getNom_recette());

      //  Boutique found2 = finder.findAll().get(1);
      //  System.out.print(found2.getAddresseBoutique());
        assertEquals(found.getAddresseBoutique(), boutique.getAddresseBoutique());
        assertEquals(found.getId(), boutique.getId());
        // System.out.print(found.getRecette_du_jour().getNom_recette());
        assertEquals(found.getRecette_du_jour().getNom_recette(), boutique.getRecette_du_jour().getNom_recette());
        //  assertEquals(found.getRecette_du_jour().getNom_recette(), boutique.getRecette_du_jour().getNom_recette());

        //System.out.print(boutique.getRecette_du_jour().getNom_recette());
        // System.out.print(found2.getRecette_du_jour().getNom_recette());
    }

}
