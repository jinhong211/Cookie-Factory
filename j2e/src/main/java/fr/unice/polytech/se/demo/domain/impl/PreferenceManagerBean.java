package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.*;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Preference;
import fr.unice.polytech.se.demo.entities.Recette;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by user on 07/04/15.
 */

@Stateless
public class PreferenceManagerBean implements PreferenceManager{
    @PersistenceContext
    EntityManager entityManager;

    @EJB
    CreerBoutique finder ;

    @EJB
    BoutiqueFinder finderB ;

    @EJB
    PreferenceFinder finderP ;

    @EJB
    private ProcessCommand managerPC;


    @Override
    public Preference create(int id_compte) {
        Preference preference = null;
        //   finderP.findById(id_compte);
        if(preference==null) {
            Preference c = new Preference();
            c.setCompte(id_compte);

            //Set<Boutique> boutiques = new HashSet<Boutique>();
            //c.setBoutique(boutique);
            entityManager.persist(c);

            //  preference = finderP.findById(id_compte);
            return c;
        }
        else return preference;

    }

    @Override
    public Preference create(int id_compte, Boutique boutique,Recette recette) {
        //Preference preference = null;
        //   finderP.findById(id_compte);
        Boutique boutique1 = finderB.findByAddresse(boutique.getAddresseBoutique());

        Recette recette1 = managerPC.findByNameRecette(recette.getNom_recette());
        //b=finderB.findByAddresse(boutique.getAddresseBoutique());

       // Set<Preference> preferences = boutique.getPreference();

        //if(preference==null) {
        Preference c = new Preference();
        c.setCompte(id_compte);
        if(boutique1==null) {
            c.setBoutique(boutique);
            if(recette1 ==null)
                c.setRecette(recette);
            else
                c.setRecette(recette1);
        }
        else {
            c.setBoutique(boutique1);

            if(recette1 ==null)
                c.setRecette(recette);
            else
                c.setRecette(recette1);
        }
        entityManager.persist(c);
        return c;
    }

    @Override
    public Preference addBoutique(Boutique boutique,int id_compte) {
        Preference preference = finderP.findById(id_compte);

        Boutique boutique1 = finderB.findByAddresse(boutique.getAddresseBoutique());
        // Boutique boutique1 = finderB.findByAddresse(boutique.getAddresseBoutique());
        //if(boutique1 ==null)
        //Set<Preference>preferences = boutique.getPreferences();

        //preferences.add(preference);
        if(boutique1==null) {
            //boutique.setPreferences(preferences);
            preference.setBoutique(boutique);
        }
        else {
            preference.setBoutique(boutique1);
        }
        System.out.print("kkk");
        entityManager.merge(preference);

        return preference;
    }

    @Override
    public Preference addRecette(Recette recette,int id_compte) {
        return null;
    }
}
