package fr.unice.polytech.se.demo.domain.impl;

/**
 * Created by user on 31/03/15.
 */


import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.BoutiqueManager;
import fr.unice.polytech.se.demo.domain.RecetteFinder;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.HoraireAtlier;
import fr.unice.polytech.se.demo.entities.Recette;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by sth on 3/24/15.
 */
@Stateless
public class BoutiqueManagerBean implements BoutiqueManager {

    @PersistenceContext
    EntityManager entityManager;

    @EJB
    BoutiqueFinder finder;

    @EJB
    RecetteFinder finderR;

    @Override
    public Boutique create(Recette recette_du_jour, String addresseBoutique, double tax, Integer chiffreVente) {
        Boutique boutique = finder.findByAddresse(addresseBoutique);
        Recette recette = finderR.findByName(recette_du_jour.getNom_recette());
        if (boutique == null) {
            boutique = new Boutique();
            boutique.setAddresseBoutique(addresseBoutique);
            boutique.setChiffreVente(chiffreVente);
            boutique.setTax(tax);
            if (recette_du_jour != null){
                boutique.setRecette_du_jour(recette);
                entityManager.persist(boutique);
            }else{
                boutique.setRecette_du_jour(recette_du_jour);
                entityManager.persist(boutique);
            }
        }
        return boutique;
    }

    @Override
    public Boutique create(String addresseBoutique, double tax, Integer chiffreVente,int  tempsO,int tempsF) {
        HoraireAtlier horaireAtlier=new HoraireAtlier();
        horaireAtlier.setDebutJour(tempsO);
        horaireAtlier.setFinJour(tempsF);
        Boutique boutique = finder.findByAddresse(addresseBoutique);
        //Recette recette = finderR.findByName(recette_du_jour.getNom_recette());
        Recette recette = finderR.findByName("default");

        if (boutique == null) {
            boutique = new Boutique();
            boutique.setAddresseBoutique(addresseBoutique);
            boutique.setChiffreVente(chiffreVente);
            boutique.setTax(tax);
            boutique.setHoraireAtlier(horaireAtlier);
            if (recette == null){
                recette=new Recette("default",0,0);
                boutique.setRecette_du_jour(recette);
                //entityManager.remove(entityManager.merge(recette));
                //recette.setNom_recette("kkkk");
                //entityManager.persist(recette);
                entityManager.persist(boutique);
            }else{

                boutique.setRecette_du_jour(recette);
                //entityManager.remove(entityManager.merge(recette));
                //recette.setNom_recette("KKKK");
                //entityManager.persist(recette);
                entityManager.persist(boutique);
            }
        }
        return boutique;
    }

    @Override
    public Boutique setRecettedujour(Boutique boutique,Recette recette) {
        Boutique toUpdateb = finder.findByAddresse(boutique.getAddresseBoutique());
        //System.out.println(toUpdateb);
        //Recette r = finderR.findByName(recette.getNom_recette());
        //System.out.println(r);
        toUpdateb.setTax(999);
            toUpdateb.setRecette_du_jour(recette);
           // entityManager.merge(recette);
        //Boutique toUpdateb2 = finder.findByAddresse(boutique.getAddresseBoutique());
        //@NamedQuery()
        //System.out.print(toUpdateb.getTax());
        //entityManager.merge(r);
        //System.out.print(recette);
        //System.out.print(entityManager.contains(recette));
        entityManager.merge(toUpdateb);
        //System.out.print(toUpdateb.getTax());
        //entityManager.flush();
        //System.out.print(toUpdateb.getTax());
        return toUpdateb;
    }
}