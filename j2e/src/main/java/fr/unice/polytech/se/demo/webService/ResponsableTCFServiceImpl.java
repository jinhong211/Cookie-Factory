package fr.unice.polytech.se.demo.webService;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.domain.Statistique;
import fr.unice.polytech.se.demo.entities.Boutique;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Created by ding on 30/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/Responsabletcf")
@Stateless
public class ResponsableTCFServiceImpl implements ResponsableTCFService{
    @EJB
    CreerBoutique creerBoutique;

    @EJB
    BoutiqueFinder boutiqueFinder;

    @EJB
    Statistique statistique;


    @Override
    public boolean creerBoutique(String address, double tax, int to, int tf) {
        Boutique boutique = creerBoutique.createBoutique(address,tax,0,to,tf);
        if (boutique != null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getStatistiqueGlobal() {
        return statistique.getChiffreVenteBoutiques();
    }

    @Override
    public boolean boutiqueIsExist(String address) {
        Boutique boutique = boutiqueFinder.findByAddresse(address);
        if(boutique != null){
            return true;
        }
        return false;
    }
}
