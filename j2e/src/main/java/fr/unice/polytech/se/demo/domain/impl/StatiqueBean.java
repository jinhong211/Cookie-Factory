package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.ProcessCommand;
import fr.unice.polytech.se.demo.domain.Statique;
import fr.unice.polytech.se.demo.entities.Boutique;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by user on 27/04/15.
 */
@Stateless
public class StatiqueBean implements Statique {

    @EJB
    BoutiqueFinder findeB;

    @EJB
    ProcessCommand finderP;

    @Override
    public int getChriffeVenteBoutiques() {
        List<Boutique> boutiques = findeB.findAll();

        int k = 0;

        for(int i = 0; i<boutiques.size(); i++){
            k += boutiques.get(i).getChiffreVente();
        }

        return k;
    }
}
