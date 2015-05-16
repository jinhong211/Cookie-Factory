package fr.unice.polytech.se.demo.webService;

import fr.unice.polytech.se.demo.domain.PreferenceFinder;
import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Recette;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Created by ding on 12/05/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/ClientAvecCompte")
@Stateless
public class ClientAvecCompteServiceImpl implements ClientAvecCompteService{

    @EJB
    private PreferenceFinder preferenceFinder;
    @Override
    public String getBoutiquePrefere(int id_compte) {
        Boutique boutique = preferenceFinder.findById(id_compte).getBoutique();
        if(boutique != null){
            return boutique.getAddresseBoutique();
        } else {
            return null;
        }
    }

    @Override
    public String getRecettePrefere(int id_compte) {
        Recette recette = preferenceFinder.findById(id_compte).getRecette();
        if(recette != null){
            return recette.getNom_recette();
        } else {
            return null;
        }
    }
}
