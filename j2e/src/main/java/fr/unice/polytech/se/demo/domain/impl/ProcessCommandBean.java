package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.entities.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.*;

/**
 * Created by user on 22/04/15.
 */
@Stateless
public class ProcessCommandBean implements ProcessCommand {
    @PersistenceContext
    EntityManager entityManager;

    @EJB
    BoutiqueFinder findeB;

    @EJB
    ProcessCommand finderP;


/*    @EJB
    CommandeFinder finder;

    @EJB
    BoutiqueFinder findeB;

    @EJB
    RecetteFinder finderR;


    @EJB
    IngredientFinder im ;

    @EJB
    FaconFinder fm ;
    */

    @Override
    public Commande createCommande(Boutique boutique,Recette recette, Date date, Integer quantite) {

       // InfoPayment infoPayment1 = finderI.findByaddresseClient(infoPayment.getAddresse_Client());


        Boutique boutique1 = findeB.findByAddresse(boutique.getAddresseBoutique());

        Commande c ;
        //finder.findByDate(date).get(0);
        Recette r = finderP.findByNameRecette(recette.getNom_recette());


        if(r == null) {
            c = new Commande(recette, date, quantite);
            //entityManager.persist(c);
        }
        else {
            c = new Commande(r, date, quantite);
            //entityManager.persist(c);
        }

        Set<Commande> commandes =new HashSet<Commande>();

        if(boutique1==null){
            commandes=boutique.getCommandes();
            commandes.add(c);
            boutique.setCommandes(commandes);
            boutique.setChiffreVente(boutique.getCommandes().size());
            c.setBoutique(boutique);
        }else{
            Set<Commande> commandes2=boutique1.getCommandes();
            //commandes.size();
//            commandes.add(c);
            boutique1.setCommandes(commandes2);
            //System.out.print();
//            boutique1.setChiffreVente(boutique1.getCommandes().size());
            c.setBoutique(boutique1);
        }
        c.setPrice(quantite*recette.getPrix_recette()*(boutique.getTax()+1));

        /*if(infoPayment1==null){
            c.setInfoPayment(infoPayment);
        }else {
            c.setInfoPayment(infoPayment1);
        }*/

        entityManager.persist(c);
        return c;
    }

    @Override
    public Commande createCommande(Recette recette, Date date, Integer quantite) {

        //InfoPayment infoPayment1 = finderI.findByaddresseClient(infoPayment.getAddresse_Client());


        //Boutique boutique1 = findeB.findByAddresse(boutique.getAddresseBoutique());

        Commande c ;
        //finder.findByDate(date).get(0);
        Recette r = finderP.findByNameRecette(recette.getNom_recette());


        if(r == null) {
            c = new Commande(recette, date, quantite);
            //entityManager.persist(c);
        }
        else {
            c = new Commande(r, date, quantite);
            //entityManager.persist(c);
        }

        /*if(boutique1==null){
            c.setBoutique(boutique);
        }else{
            c.setBoutique(boutique1);
        }*/

       /*if(infoPayment1==null){
            c.setInfoPayment(infoPayment);
        }else {
            c.setInfoPayment(infoPayment1);
        }*/

        entityManager.persist(c);
        return c;
    }



    @Override
    public void addRecette(String recette, double taxe, double p,long id) {
        Commande toUpdate = finderP.findByIdCommande(id);
        Recette r = new Recette(recette,taxe,p);
        //oUpdate.setRecette(r);
    }


    @Override
    public Commande findByIdCommande(long id) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Commande> criteria = builder.createQuery(Commande.class);
        Root<Commande> from = criteria.from(Commande.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("id_Commande"), id));
        TypedQuery<Commande> query = entityManager.createQuery(criteria.select(criteria
                .from(Commande.class)));
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Commande> findByDateCommande(Date date) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Commande> criteria = builder.createQuery(Commande.class);
        Root<Commande> from = criteria.from(Commande.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("date"), date));
        TypedQuery<Commande> query = entityManager.createQuery(criteria.select(criteria
                .from(Commande.class)));
        try {
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }


    @Override
    public List<Commande> findByQuantiteCommande (int quantite) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Commande> criteria = builder.createQuery(Commande.class);
        Root<Commande> from = criteria.from(Commande.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("quantite"), quantite));
        TypedQuery<Commande> query = entityManager.createQuery(criteria.select(criteria
                .from(Commande.class)));
        try {
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Commande> findByIdBoutiqueCommande(long IdBoutique) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Commande> criteria = builder.createQuery(Commande.class);
        Root<Commande> from = criteria.from(Commande.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("IdBoutique"), IdBoutique));
        TypedQuery<Commande> query = entityManager.createQuery(criteria.select(criteria
                .from(Commande.class)));
        try {
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Commande> findAllCommande() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Commande> cq = cb.createQuery(Commande.class);
        TypedQuery<Commande> allQuery = entityManager.createQuery(cq.select(cq
                .from(Commande.class)));

        return allQuery.getResultList();
    }


    @Override
    public Recette createRecette(String n,Set<Ingredient> ingredients,Set<Facon> facons) {
        Set<Ingredient> ingredients1 = new HashSet<Ingredient>();

        double iprix = 0;
        Iterator is = ingredients.iterator();

        while(is.hasNext()){
            Ingredient i=(Ingredient)is.next();
            iprix += i.getPrix_Ingredient();
            Ingredient ingredient = finderP.findByNameIngredient(i.getNom_Ingredient());
            if(ingredient!=null)
                ingredients1.add(ingredient);
            else
                ingredients1.add(i) ;
        }

        Set<Facon> facons1 = new HashSet<Facon>();

        double ftime=0;
        Iterator fs = facons.iterator();

        while(fs.hasNext()){
            Facon f=(Facon)fs.next();
            ftime+=f.getTemps_Utilise();
            Facon facon = finderP.findByNameFacon(f.getNom_Facon());
            if(facon!=null)
                facons1.add(facon);
            else
                facons1.add(f) ;
        }


        Recette recette = finderP.findByNameRecette(n);
        if (recette == null) {
            recette = new Recette();
            recette.setNom_recette(n);
            recette.setIngredients(ingredients1);
            recette.setFacons(facons1);
            recette.setPrix_recette(iprix);
            recette.setTemps_Utiliser(ftime);
            entityManager.persist(recette);
        }

       /* Iterator is2 = ingredients1.iterator();
        while(is2.hasNext()){
            Ingredient i=(Ingredient)is2.next();

            System.out.print("kkkkk"+i.getRecettes().size());
            i.getRecettes().add(recette);
            // System.out.print("kkkkk"+i.getRecettes().size());

        }


        Iterator fs2 = facons1.iterator();

        while(fs2.hasNext()) {
            Facon f = (Facon) fs2.next();

            f.getRecettes().add(recette);
        }
        //recette = finderR.findByName(n);
        //recette.setIngredients(ingredients1);
        //recette.setFacons(facons1);

        entityManager.merge(recette);*/

        /*Iterator is3 = ingredients.iterator();
        while(is2.hasNext()){
            Ingredient i=(Ingredient)is3.next();

            //System.out.print("kkkkk"+i.getRecettes().size());
            //i.getRecettes().add(recette);
            System.out.print("QQQQ"+i.getRecettes().size());

        }*/
        return recette;

    }

    @Override
    public Recette addIngredientToRecette(String ingredient, String recette) {
        Ingredient i= finderP.findByNameIngredient(ingredient);
        Recette r = (Recette) finderP.findByNameRecette(recette);
        /*Set<Ingredient> ingredients = r.getIngredients();
        ingredients.add(i);
        r.setIngredients(ingredients);*/
        entityManager.merge(r);
        //entityManager.merge(i);
        return r;
    }

    @Override
    public Recette deleteIngredientToRecette(String ingredient, String recette) {
        Ingredient i= finderP.findByNameIngredient(ingredient);
        Recette r =(Recette) finderP.findByNameRecette(recette);
        /*Set<Ingredient> ingredients = r.getIngredients();
        ingredients.remove(ingredient);
        r.setIngredients(ingredients);*/
        entityManager.merge(r);
        return r;
    }

    @Override
    public Recette findByIdRecette(int id) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Recette> criteria = builder.createQuery(Recette.class);
        Root<Recette> from = criteria.from(Recette.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("id_Recette"), id));
        TypedQuery<Recette> query = entityManager.createQuery(criteria.select(criteria
                .from(Recette.class)));
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Recette findByNameRecette(String n) {
        List<Recette> recettes = (List<Recette>) findAllRecette();
        Recette recette = null;
        Iterator is = recettes.iterator();
        while(is.hasNext()) {
            Recette i = (Recette) is.next();
            if(i.getNom_recette()==n){
                recette = i;
            }
        }
        return recette;
        /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Recette> criteria = builder.createQuery(Recette.class);
        Root<Recette> from = criteria.from(Recette.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("nom_recette"), n));
        TypedQuery<Recette> query = entityManager.createQuery(criteria.select(criteria
                .from(Recette.class)));
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }*/
    }

    @Override
    public List<Recette> findByPrixRecette(double p) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Recette> criteria = builder.createQuery(Recette.class);
        Root<Recette> from = criteria.from(Recette.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("prix_Recette"), p));
        TypedQuery<Recette> query = entityManager.createQuery(criteria.select(criteria
                .from(Recette.class)));
        try {
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Recette> findByTempsUtiliseRecette(int t) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Recette> criteria = builder.createQuery(Recette.class);
        Root<Recette> from = criteria.from(Recette.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("TempsUtilise"), t));
        TypedQuery<Recette> query = entityManager.createQuery(criteria.select(criteria
                .from(Recette.class)));
        try {
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Recette> findAllRecette() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Recette> cq = cb.createQuery(Recette.class);
        TypedQuery<Recette> allQuery = entityManager.createQuery(cq.select(cq
                .from(Recette.class)));

        return allQuery.getResultList();
    }

    /*@Override
    public List<Recette> findLastRecette(int n, int startIndex) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Recette> criteria = builder.createQuery(Recette.class);

        Root<Recette> from = criteria.from(Recette.class);
        criteria.select(from);
        criteria.orderBy(builder.desc(from.get("id")));

        TypedQuery<Recette> query = entityManager.createQuery(criteria);
        query.setFirstResult(startIndex);
        query.setMaxResults(n);

        try {
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }*/

    @Override
    public Ingredient createIngredient(String name, double t) {
        Ingredient i = new Ingredient(name, t);
        entityManager.persist(i);
        return i;
    }

    @Override
    public Ingredient deleteIngredient(String n){
        Ingredient i = finderP.findByNameIngredient(n);
        entityManager.remove(i);
        return i;
    }

    @Override
    public Ingredient findByNameIngredient(String name) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Ingredient> criteria = builder.createQuery(Ingredient.class);
        Root<Ingredient> from = criteria.from(Ingredient.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("nom_Ingredient"), name));
        TypedQuery<Ingredient> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Ingredient findByPrixIngredient(double n) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Ingredient> criteria = builder.createQuery(Ingredient.class);
        Root<Ingredient> from = criteria.from(Ingredient.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("prix_Ingredient"), n));
        TypedQuery<Ingredient> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Ingredient findByIdIngredient(long id) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Ingredient> criteria = builder.createQuery(Ingredient.class);
        Root<Ingredient> from = criteria.from(Ingredient.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("id_Ingredient"), id));
        TypedQuery<Ingredient> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Ingredient> findAllIngredient() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Ingredient> cq = cb.createQuery(Ingredient.class);
        TypedQuery<Ingredient> allQuery = entityManager.createQuery(cq.select(cq
                .from(Ingredient.class)));

        return allQuery.getResultList();
    }

    @Override
    public Facon createFacon(String name,double time) {
        Facon i=finderP.findByNameFacon(name);
        if(i==null) {
            i = new Facon(name, time);
        }
        entityManager.persist(i);
        return i;
    }

    @Override
    public Facon findByIdFacon(long id) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Facon> criteria = builder.createQuery(Facon.class);
        Root<Facon> from = criteria.from(Facon.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("id"), id));
        TypedQuery<Facon> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Facon findByNameFacon(String n) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Facon> criteria = builder.createQuery(Facon.class);
        Root<Facon> from = criteria.from(Facon.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("nom_Facon"), n));
        TypedQuery<Facon> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Facon findByTempsFacon(double time) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Facon> criteria = builder.createQuery(Facon.class);
        Root<Facon> from = criteria.from(Facon.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("temps_Utilise"), time));
        TypedQuery<Facon> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Facon> findAllFacon() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Facon> cq = cb.createQuery(Facon.class);
        TypedQuery<Facon> allQuery = entityManager.createQuery(cq.select(cq
                .from(Facon.class)));

        return allQuery.getResultList();
    }
}
