package fr.unice.polytech.se.demo.domain;

import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Commande;
import fr.unice.polytech.se.demo.entities.InfoPayment;
import fr.unice.polytech.se.demo.entities.Recette;

import java.util.Date;

/**
 * Created by user on 31/03/15.
 */

public interface CommandeManager {

    public Commande create();

    public Commande create(Boutique boutique, Recette recette, Date date, Integer quantite, InfoPayment infoPayment);

    public Commande create(Recette recette, Date date, Integer quantite);

    //public Commande create( Date date, Integer quantite);

    void addRecette(String recette, double taxe, double q, long id);

}
