package fr.unice.polytech.se.demo.presentation;

import fr.unice.polytech.se.demo.domain.BoutiqueFinder;
import fr.unice.polytech.se.demo.domain.CreerBoutique;
import fr.unice.polytech.se.demo.entities.Boutique;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ding on 01/05/15.
 */
@ManagedBean(name = "responsableTCFJsf")
@SessionScoped
public class ResponsableTCFJsf implements Serializable{

    @EJB
    private CreerBoutique creerBoutique;
    @EJB
    private BoutiqueFinder boutiqueFinder;

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

    public void setTax(double t) throws Exception{
        this.tax = t;
    }

    public double getTax() throws Exception{
        return tax;
    }

    public void setTempsO(int to) throws Exception{
        this.tempsO = to;
    }

    public void setTempsF(int tf) throws Exception{
        this.tempsF = tf;
    }

    public int getTempsO(){
        return tempsO;
    }

    public int getTempsF(){
        return tempsF;
    }

    public void creerBoutique(){
        creerBoutique.createBoutique(adresseBoutique, tax, 0, tempsO, tempsF);
    }

    public ArrayList<String> getAllBoutique(){
        String s = "";
        ArrayList<String> ss = new ArrayList<String>();
        creerBoutique.createBoutique("Polytech",2.2,0,6,10);
        creerBoutique.createBoutique("Antibes",1.3,0,10,12);
        List<Boutique> boutiques = boutiqueFinder.findAll();
        for(Boutique b : boutiques){
            s += b.getAddresseBoutique();
            ss.add(b.getAddresseBoutique());
        }
        return ss;
    }

    public int getChiffreVent(){
        return chiffreVent;
    }

    public void setChiffreVent(int cv) throws Exception{
        this.chiffreVent = cv;
    }


}
