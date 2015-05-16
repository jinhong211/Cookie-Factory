package fr.unice.polytech.se.demo.domain;

import fr.unice.polytech.se.demo.entities.Boutique;
import fr.unice.polytech.se.demo.entities.Preference;
import fr.unice.polytech.se.demo.entities.Recette;

/**
 * Created by user on 31/03/15.
 */
public interface PreferenceManager {
    public Preference create(int compte);

    Preference create(int id_compte, Boutique boutique, Recette recette);

    public Preference addBoutique(Boutique boutique,int id_compte);
    public Preference addRecette(Recette recette,int id_compte);
}
