package fr.unice.polytech.se.demo.presentation;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.domain.ProcessCommand;
import fr.unice.polytech.se.demo.domain.Statistique;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by ding on 13/05/15.
 */

@ManagedBean(name = "responsableBoutiqueJsf")
@SessionScoped
public class ResponsableBoutiqueJsf implements Serializable {

    @EJB
    private ProcessCommand processCommand;
    @EJB
    private Statistique statistique;
    @EJB
    private BoutiqueFinder boutiqueFinder;
    @EJB
    private CreerBoutique creerBoutique;
}
