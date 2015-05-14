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

    private int compte;

    private Set<Recette> recettes;

    private Set<Boutique> boutiques;

    public Preference(){}

    public Preference(int id_compte){this.compte = id_compte; System.out.print(this.compte);}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PREFERENCE",length = 32)
    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Column(name = "COMPTE", length = 10)
    @NotNull
    public int getCompte(){
        return compte;
    }

    public void setCompte(int c){
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
        return "PREFERENCE[" + this.id + "]# idcompte: " + this.compte;
    }

  //  @ManyToMany(mappedBy = "preferences")
    public Set<Boutique> getBoutiques(){
        return boutiques;
    }

    public void setBoutiques(Set<Boutique> b){
        boutiques = b;
    }

}
