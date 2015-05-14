package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.domain.PreferenceManager;
import fr.unice.polytech.se.demo.entities.Preference;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by user on 07/04/15.
 */

@Stateless
public class PreferenceManagerBean implements PreferenceManager {
    @PersistenceContext
    EntityManager entityManager;

    @EJB
    CreerBoutique finder ;


    @Override
    public Preference create(int compte) {

        Preference c=new Preference();
        c.setCompte(compte);
        entityManager.persist(c);

        return c;
    }
}
