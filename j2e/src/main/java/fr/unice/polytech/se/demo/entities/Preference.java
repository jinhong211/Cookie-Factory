package fr.unice.polytech.se.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by ding on 22/03/15.
 */

@Entity
@Table(name = "PREFERENCE")
public class Preference implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    private int id_compte;

    private Recette recette;

    private Boutique boutique;

    public Preference(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PREFERENCE",length = 32)
    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Column(name = "IDCOMPTE", length = 10)
    @NotNull
    public int getCompte(){
        return id_compte;
    }

    public void setCompte(int c){
        id_compte = c;
    }

    @ManyToOne(cascade = {CascadeType.ALL, CascadeType.MERGE}, fetch = FetchType.EAGER)
    public Recette getRecette(){
        return recette;
    }

    public void setRecette(Recette r){
        recette = r;
    }

    public String toString(){
        return "PREFERENCE[" + this.id + "]# compte: " + this.id_compte;
    }

    @ManyToOne(cascade = {CascadeType.ALL, CascadeType.MERGE}, fetch = FetchType.EAGER)
    public Boutique getBoutique(){
        return boutique;
    }

    public void setBoutique(Boutique b){
        boutique = b;
    }

}
