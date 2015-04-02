package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.FaconManager;
import fr.unice.polytech.se.demo.domain.IngredientFinder;
import fr.unice.polytech.se.demo.entities.Facon;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by user on 02/04/15.
 */
@Stateless
public class FaconManagerBean implements FaconManager {
    @PersistenceContext
    EntityManager entityManager;

    @EJB
    IngredientFinder finder;

    @Override
    public Facon create(String name,double t) {
        Facon i = new Facon(name, t);
        entityManager.persist(i);
        return i;
    }
}
