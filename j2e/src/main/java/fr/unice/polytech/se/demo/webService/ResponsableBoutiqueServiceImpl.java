package fr.unice.polytech.se.demo.webService;

import fr.unice.polytech.se.demo.domain.impl.RecettesduBoutiqueBean;
import fr.unice.polytech.se.demo.entities.Commande;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Set;

/**
 * Created by ding on 30/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/tcf")
@Stateless
public class ResponsableBoutiqueServiceImpl implements ResponsableBoutiqueService{
    @EJB
    RecettesduBoutiqueBean recettesduBoutiqueBean;


    @Override
    public ArrayList<String> getListCommande(String adresseBoutique) {
        Set<Commande> commandes = recettesduBoutiqueBean.getRecettesduBoutique(adresseBoutique);
        ArrayList<String> commandesNom = new ArrayList<String>();
        for(Commande c : commandes){
            commandesNom.add("COMMANDE[" + c.getId() + "]# Date" + c.getDate() + ", quantite: " + c.getQuantite() + ", recette:" + c.getRecette() + ", prix:" + c.getPrice());
        }
        return commandesNom;
    }

    @Override
    public int getStatistiqueBoutique(String adresseBoutique) {
        return recettesduBoutiqueBean.getStatistiqueBoutique(adresseBoutique);
    }
}
