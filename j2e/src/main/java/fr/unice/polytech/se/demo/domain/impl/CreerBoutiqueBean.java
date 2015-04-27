package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.domain.ProcessCommand;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.HoraireAtlier;
import fr.unice.polytech.se.demo.entities.HoraireVente;
import fr.unice.polytech.se.demo.entities.Recette;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by user on 22/04/15.
 */
@Stateless
public class CreerBoutiqueBean implements CreerBoutique{
    @PersistenceContext
    EntityManager entityManager;

    @EJB
    BoutiqueFinder finder;

    @EJB
    ProcessCommand finderR;

    @Override
    public Boutique createBoutique(Recette recette_du_jour, String addresseBoutique, double tax, Integer chiffreVente) {
        Boutique boutique = finder.findByAddresse(addresseBoutique);
        Recette recette = finderR.findByNameRecette(recette_du_jour.getNom_recette());
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
    public Boutique createBoutique(String addresseBoutique, double tax, Integer chiffreVente,int  tempsO,int tempsF) {
        HoraireAtlier horaireAtlier=new HoraireAtlier();
        horaireAtlier.setDebutJour(tempsO);
        horaireAtlier.setFinJour(tempsF);
        Boutique boutique = finder.findByAddresse(addresseBoutique);
        //Recette recette = finderR.findByName(recette_du_jour.getNom_recette());
        Recette recette = finderR.findByNameRecette("default");

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
    public Boutique setRecettedujourduBoutique(Boutique boutique,Recette recette) {
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

    @Override
    public HoraireAtlier createHoraireAtlier() {

        HoraireAtlier c=new HoraireAtlier();
        entityManager.persist(c);

        return c;
    }

    @Override
    public HoraireAtlier findByIdHoraireAtlier(long id) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<HoraireAtlier> criteria = builder.createQuery(HoraireAtlier.class);
        Root<HoraireAtlier> from = criteria.from(HoraireAtlier.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("id"), id));
        TypedQuery<HoraireAtlier> query = entityManager.createQuery(criteria.select(criteria
                .from(HoraireAtlier.class)));
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<HoraireAtlier> findAllHoraireAtlier() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<HoraireAtlier> cq = cb.createQuery(HoraireAtlier.class);
        TypedQuery<HoraireAtlier> allQuery = entityManager.createQuery(cq.select(cq
                .from(HoraireAtlier.class)));

        return allQuery.getResultList();
    }

    @Override
    public HoraireVente createHoraireVente() {

        HoraireVente c=new HoraireVente();
        entityManager.persist(c);

        return c;
    }

    @Override
    public HoraireVente findByIdHoraireVente(long id) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<HoraireVente> criteria = builder.createQuery(HoraireVente.class);
        Root<HoraireVente> from = criteria.from(HoraireVente.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("id"), id));
        TypedQuery<HoraireVente> query = entityManager.createQuery(criteria.select(criteria
                .from(HoraireVente.class)));
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<HoraireVente> findAllHoraireVente() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<HoraireVente> cq = cb.createQuery(HoraireVente.class);
        TypedQuery<HoraireVente> allQuery = entityManager.createQuery(cq.select(cq
                .from(HoraireVente.class)));

        return allQuery.getResultList();
    }

}
