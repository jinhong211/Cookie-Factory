package fr.unice.polytech.se.demo.presentation;

import fr.unice.polytech.se.demo.domain.CreerBoutique;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by ding on 01/05/15.
 */
@ManagedBean(name = "responsableTCFJsf")
@SessionScoped
public class ResponsableTCFJsf implements Serializable{

    @EJB
    private CreerBoutique creerBoutique;

    private String adresseBoutique;

    private double tax;

    private int chiffreVent = 0;
    private int tempsO, tempsF;

    public void setAdresseBoutique(String ab){
        this.adresseBoutique = ab;
    }

    public String getAdresseBoutique(){
        return adresseBoutique;
    }

    public void setTax(String t) throws Exception{
        this.tax = Double.parseDouble(t);
    }

    public void setChiffreVent(String cv) throws Exception{
        this.tax = Integer.parseInt(cv);
    }

    public void setTempsO(String to) throws Exception{
        this.tempsO = Integer.parseInt(to);
    }

    public void setTempsF(String tf) throws Exception{
        this.tempsF = Integer.parseInt(tf);
    }

    public void setAdresseBoutique(){
        creerBoutique.createBoutique(adresseBoutique,tax,chiffreVent,tempsO,tempsF);
    }

    public String getChiffreVent(){
        return "" + chiffreVent;
    }


}
