package fr.unice.polytech.se.demo.entities;

import javax.persistence.*;
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

    private Compte compte;

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

    @OneToOne(optional = true, cascade = CascadeType.ALL)
    public Compte getCompte(){
        return compte;
    }

    public void setCompte(Compte c){
        compte = c;
    }

    @ManyToMany(mappedBy = "preferences")
    public Set<Recette> getRecettes(){
        return recettes;
    }

    public void setRecettes(Set<Recette> r){
        recettes = r;
    }

    public String toString(){
        return "PREFERENCE[" + this.id + "]# compte: " + this.compte.toString();
    }

    @ManyToMany(mappedBy = "preferences")
    public Set<Boutique> getBoutiques(){
        return boutiques;
    }

    public void setBoutiques(Set<Boutique> b){
        boutiques = b;
    }

}
