package fr.unice.polytech.se.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by ding on 22/03/15.
 */

@Entity
@Table(name = "PREFERENCE")
public class Preference implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    private int id_compte;

    private Set<Recette> recettes;

    private Set<Boutique> boutiques;

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

    @OneToMany(mappedBy = "preference")
    public Set<Recette> getRecettes(){
        return recettes;
    }

    public void setRecettes(Set<Recette> r){
        recettes = r;
    }

    public String toString(){
        return "PREFERENCE[" + this.id + "]# compte: " + this.id_compte;
    }

    @OneToMany(mappedBy = "preference")
    public Set<Boutique> getBoutiques(){
        return boutiques;
    }

    public void setBoutiques(Set<Boutique> b){
        boutiques = b;
    }

}
