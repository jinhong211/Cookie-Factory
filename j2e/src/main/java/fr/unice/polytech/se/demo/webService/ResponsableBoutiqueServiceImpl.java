package fr.unice.polytech.se.demo.webService;

import fr.unice.polytech.se.demo.domain.RecettesduBoutique;
import fr.unice.polytech.se.demo.domain.Statistique;
import fr.unice.polytech.se.demo.entities.Commande;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Set;

/**
 * Created by ding on 30/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/ResponsableBoutique")
@Stateless
public class ResponsableBoutiqueServiceImpl implements ResponsableBoutiqueService{
    @EJB
    RecettesduBoutique recettesduBoutiqueBean;

    @EJB
    Statistique statistique;


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
        return statistique.getChiffreVenteBoutique(adresseBoutique);
    }
}
