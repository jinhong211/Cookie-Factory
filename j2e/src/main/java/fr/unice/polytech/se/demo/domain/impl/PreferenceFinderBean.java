package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.PreferenceFinder;
import fr.unice.polytech.se.demo.entities.Preference;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by user on 07/04/15.
 */
@Stateless
public class PreferenceFinderBean implements PreferenceFinder{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Preference findById(int id_compte) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Preference> criteria = builder.createQuery(Preference.class);
        Root<Preference> from = criteria.from(Preference.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("compte"), id_compte));
        TypedQuery<Preference> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Preference> findAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Preference> cq = cb.createQuery(Preference.class);
        TypedQuery<Preference> allQuery = entityManager.createQuery(cq.select(cq
                .from(Preference.class)));

        return allQuery.getResultList();
    }
}
