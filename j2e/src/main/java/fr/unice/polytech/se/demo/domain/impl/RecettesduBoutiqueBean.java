package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.RecettesduBoutique;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Commande;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.Set;

/**
 * Created by user on 27/04/15.
 */
@Stateless
public class RecettesduBoutiqueBean implements RecettesduBoutique{

    @EJB
    BoutiqueFinder findeB;

    @Override
    public Set<Commande> getRecettesduBoutique(String adresseBoutique) {
        Boutique boutique = findeB.findByAddresse(adresseBoutique);

        Set<Commande> commandes = boutique.getCommandes();

        return commandes;
    }

    @Override
    public int getStatistiqueBoutique(String adresseBoutique){
        Boutique boutique = findeB.findByAddresse(adresseBoutique);
        return boutique.getCommandes().size();
    }
}
