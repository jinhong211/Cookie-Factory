package fr.unice.polytech.se.demo;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.domain.impl.BoutiqueManagerBean;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Facon;
import fr.unice.polytech.se.demo.entities.Ingredient;
import fr.unice.polytech.se.demo.entities.Recette;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 01/04/15.
 */

@RunWith(Arquillian.class)
public class BoutiqueManagerTest {
    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Boutique.class.getPackage())
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsWebInfResource("META-INF/persistence.xml", "persistence.xml")
                .addPackage(BoutiqueManager.class.getPackage())
                .addPackage(BoutiqueManagerBean.class.getPackage());
    }

    @EJB

    private BoutiqueManager managerB;

    @EJB
    private RecetteManager managerR;

    @EJB
    private BoutiqueFinder finder;

    @EJB
    private RecetteFinder finderr;

    @EJB
    private IngredientManager managerI;

    @EJB
    private IngredientFinder finderI;

    @EJB
    private FaconManager managerF;

    @EJB
    private FaconFinder finderF;

    @Test
    public void testCreation()  {
         //Boutique boutique = manager.create("Polytech",new Date(1000),new Date(2000),100);

        Ingredient ingredient1=managerI.create("Chocolect", 10);

        Ingredient ingredient2=managerI.create("Coco", 5);

        Set<Ingredient> ingredients = new HashSet<Ingredient>();

        ingredients.add(ingredient1);

        ingredients.add(ingredient2);

        Facon facon1 =managerF.create("griller", 10);

        Facon facon2 =managerF.create("friter", 5);

        Set<Facon> facons = new HashSet<Facon>();

        facons.add(facon1);

        facons.add(facon2);

        Ingredient ingredient3=managerI.create("Fraise", 10);

        //Ingredient ingredient2=managerI.create("Coco", 5);

        Set<Ingredient> ingredients2 = new HashSet<Ingredient>();

        ingredients2.add(ingredient3);

        Facon facon3 =managerF.create("main", 10);

        //Facon facon2 =managerF.create("friter", 5);

        Set<Facon> facons2 = new HashSet<Facon>();

        facons2.add(facon3);

        Recette recette= managerR.create("Chocolect", ingredients,facons);

        Recette foundr =finderr.findByName("Chocolect");
        System.out.print(foundr.getNom_recette());


        //System.out.println(finderr.findByName("Chocolect"));
        //Recette recette=new Recette("Chocolect", 10,10);

        Boutique boutique = managerB.create("Polytech",100,10,9,5);
        //Boutique boutique = managerB.create(recette,"Polytech",100,10);
        //boutique = managerB.setRecettedujour(boutique,recette);
        //System.out.println(finder.findByAddresse("Polytech").getRecette_du_jour());
        //System.out.print(boutique.getTax());
        Boutique boutique2 = managerB.create("Pppp",100,10,9,5);
        //assertEquals(Commande.getAddresseBoutique(), "Polytech");
        //Commande found = finder.findAll().get(0);
        //assertEquals(found.getId(), commande.getId());
        Boutique found = finder.findAll().get(0);


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


        Recette recette2= managerR.create("Coco", ingredients2, facons2);

        Recette foundr2 =finderr.findByName("Coco");
        System.out.print(foundr2.getNom_recette());

        Boutique found2 = finder.findAll().get(1);
        System.out.print(found2.getAddresseBoutique());
        assertEquals(found.getAddresseBoutique(), boutique.getAddresseBoutique());
        assertEquals(found.getId(), boutique.getId());
       // System.out.print(found.getRecette_du_jour().getNom_recette());
        assertEquals(found.getRecette_du_jour().getNom_recette(), boutique.getRecette_du_jour().getNom_recette());
      //  assertEquals(found.getRecette_du_jour().getNom_recette(), boutique.getRecette_du_jour().getNom_recette());

        //System.out.print(boutique.getRecette_du_jour().getNom_recette());
       // System.out.print(found2.getRecette_du_jour().getNom_recette());
    }



}
