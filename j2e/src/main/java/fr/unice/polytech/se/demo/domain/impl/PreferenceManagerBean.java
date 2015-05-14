package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.domain.PreferenceFinder;
import fr.unice.polytech.se.demo.domain.PreferenceManager;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Preference;
import fr.unice.polytech.se.demo.entities.Recette;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 07/04/15.
 */

@Stateless
public class PreferenceManagerBean implements PreferenceManager {
    @PersistenceContext
    EntityManager entityManager;

    @EJB
    CreerBoutique finder ;

    @EJB
    BoutiqueFinderBean finderB ;

    @EJB
    PreferenceFinder finderP ;

    @Override
    public Preference create() {

        Preference c=new Preference();
        //c.setidcompte(id_compte);
        entityManager.persist(c);

        return c;
    }

    @Override
    public Preference create(int id_compte) {
        Preference preference = null;
             //   finderP.findById(id_compte);
        if(preference==null) {
            Preference c = new Preference();
            c.setCompte(id_compte);

            Set<Boutique> boutiques = new HashSet<Boutique>();
            c.setBoutiques(boutiques);
            entityManager.persist(c);

          //  preference = finderP.findById(id_compte);
            return c;
        }
        else return preference;

    }

    @Override
    public Preference addBoutique(Boutique boutique,int id_compte) {
        Preference preference = finderP.findById(id_compte);

        Set<Boutique> boutiques =preference.getBoutiques();
        if(boutiques==null) {
            boutiques = new HashSet<Boutique>();
        }
       // Boutique boutique1 = finderB.findByAddresse(boutique.getAddresseBoutique());
        //if(boutique1 ==null)
            boutiques.add(boutique);
        /*else
            boutiques.add(boutique1);*/
        preference.setBoutiques(boutiques);

        entityManager.merge(preference);

        return preference;
    }

    @Override
    public Preference addRecette(Recette recette,int id_compte) {
        return null;
    }
}
