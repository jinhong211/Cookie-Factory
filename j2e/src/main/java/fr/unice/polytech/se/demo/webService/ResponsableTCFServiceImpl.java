package fr.unice.polytech.se.demo.webService;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.impl.CreerBoutiqueBean;
import fr.unice.polytech.se.demo.domain.impl.StatistiqueBean;
import fr.unice.polytech.se.demo.entities.Boutique;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Created by ding on 30/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/tcf")
@Stateless
public class ResponsableTCFServiceImpl implements ResponsableTCFService{
    @EJB
    CreerBoutiqueBean creerBoutiqueBean;

    @EJB
    BoutiqueFinder boutiqueFinder;

    @EJB
    StatistiqueBean statistiqueBean;


    @Override
    public boolean creerBoutique(String address, double tax, int to, int tf) {
        Boutique boutique = boutiqueFinder.findByAddresse(address);
        if(boutique != null){
            return false;
        } else {
            boutique = creerBoutiqueBean.createBoutique(address,tax,0,to,tf);
            if (boutique != null){
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public int getStatistiqueGlobal() {
        return statistiqueBean.getChiffreVenteBoutiques();
    }
}
