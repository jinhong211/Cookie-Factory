package fr.unice.polytech.se.demo.domain;

import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.HoraireVente;
import fr.unice.polytech.se.demo.entities.Recette;

import java.util.List;

/**
 * Created by user on 22/04/15.
 */
public interface CreerBoutique {
    public Boutique createBoutique(Recette recette_du_jour, String addresseBoutique, double tax, Integer chiffreVente);
    public Boutique createBoutique(String addresseBoutique, double tax, Integer chiffreVente, int tempsOuv, int tempsFer);
    public Boutique setRecettedujourduBoutique(Boutique boutique, Recette recette) ;

    public HoraireVente createHoraireAtlier();

    public HoraireVente findByIdHoraireAtlier(long id);

    public List<HoraireVente> findAllHoraireAtlier();

    public HoraireVente createHoraireVente();

    public HoraireVente findByIdHoraireVente(long id);

    public List<HoraireVente> findAllHoraireVente();


}
