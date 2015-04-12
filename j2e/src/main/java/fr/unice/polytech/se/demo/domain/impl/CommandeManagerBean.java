package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Commande;
import fr.unice.polytech.se.demo.entities.InfoPayment;
import fr.unice.polytech.se.demo.entities.Recette;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

/**
 * Created by user on 31/03/15.
 */
@Stateless
public class CommandeManagerBean implements CommandeManager {

    @PersistenceContext
    EntityManager entityManager;

    @EJB
    CommandeFinder finder;

    @EJB
    BoutiqueFinder findeB;

    @EJB
    RecetteFinder finderR;

    @EJB
    InfoPaymentFinder finderI;

    @Override
    public Commande create(Boutique boutique,Recette recette, Date date, Integer quantite,InfoPayment infoPayment) {

        InfoPayment infoPayment1 = finderI.findByaddresseClient(infoPayment.getAddresse_Client());


        Boutique boutique1 = findeB.findByAddresse(boutique.getAddresseBoutique());

        Commande c ;
                //finder.findByDate(date).get(0);
        Recette r = finderR.findByName(recette.getNom_recette());


        if(r == null) {
             c = new Commande(recette, date, quantite);
            //entityManager.persist(c);
        }
        else {
             c = new Commande(r, date, quantite);
            //entityManager.persist(c);
        }

        if(boutique1==null){
            boutique.setChiffreVente(boutique.getChiffreVente()+1);
            c.setBoutique(boutique);
        }else{
            boutique1.setChiffreVente(boutique1.getChiffreVente()+1);
            c.setBoutique(boutique1);
        }

        if(infoPayment1==null){
            c.setInfoPayment(infoPayment);
        }else {
            c.setInfoPayment(infoPayment1);
        }

        entityManager.persist(c);
        return c;
    }

    @Override
    public Commande create(Recette recette, Date date, Integer quantite) {

        //InfoPayment infoPayment1 = finderI.findByaddresseClient(infoPayment.getAddresse_Client());


        //Boutique boutique1 = findeB.findByAddresse(boutique.getAddresseBoutique());

        Commande c ;
        //finder.findByDate(date).get(0);
        Recette r = finderR.findByName(recette.getNom_recette());


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
        Commande toUpdate = finder.findById(id);
        Recette r = new Recette(recette,taxe,p);
        //oUpdate.setRecette(r);
    }

    @Override
    public Commande create() {
        Commande c = new Commande();
        entityManager.persist(c);
        return c;
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Initializing CommandMgr");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Destroying CommandMgr");
    }

}
