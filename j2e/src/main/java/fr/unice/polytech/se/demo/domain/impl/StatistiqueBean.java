package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.ProcessCommand;
import fr.unice.polytech.se.demo.domain.Statistique;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Commande;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 27/04/15.
 */
@Stateless
public class StatistiqueBean implements Statistique {

    @EJB
    BoutiqueFinder findeB;

    @EJB
    ProcessCommand finderP;

    @Override
    public int getChiffreVenteBoutiques() {
        List<Boutique> boutiques = findeB.findAll();

        int k = 0;

        for(int i = 0; i<boutiques.size(); i++){
            Set<Commande> commandes = boutiques.get(i).getCommandes();
            Iterator is = commandes.iterator();

            while(is.hasNext()) {
                Commande ii = (Commande) is.next();
                k+= ii.getPrice();
            }

        }

        return k;
    }

    @Override
    public int getChiffreVenteBoutique(String adresseboutique) {
        Boutique boutique = findeB.findByAddresse(adresseboutique);

        int k= 0;

        Set<Commande> commandes = boutique.getCommandes();
        Iterator is = commandes.iterator();

        while(is.hasNext()) {
            Commande ii = (Commande) is.next();
            k+= ii.getPrice();
        }

        return k;
    }

}
