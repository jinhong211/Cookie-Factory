package fr.unice.polytech.se.demo.domain;

import fr.unice.polytech.se.demo.entities.Commande;

import java.util.Set;

/**
 * Created by user on 27/04/15.
 */
public interface RecettesduBoutique {

    Set<Commande> getRecettesduBoutique(String adresseBoutique);

    int getStatistiqueBoutique(String adresseBoutique);

}
