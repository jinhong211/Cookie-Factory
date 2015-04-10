package fr.unice.polytech.se.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by ding on 31/03/15.
 */
@Entity
@Table (name = "HORAIREVENTE")
public class HoraireVente implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer debutJour;
    private Integer finJour;
/*    private Integer debutSamedi;
    private Integer finSamedi;
    private Integer debutDimanche;
    private Integer finDimanche;*/

    public HoraireVente(){

    }

    /*public String toString(){
        return "HORAIREVENTE[" + this.id + "]#"
                +"\nJour:" + this.debutJour + "-" + this.finJour
                +"\nMardi:" + this.debutMardi + "-" + this.finMardi
                +"\nMercredi:" + this.debutMercredi + "-" + this.finMercredi
                +"\nJeudi:" + this.debutJeudi + "-" + this.finJeudi
                +"\nVendredi:" + this.debutVendredi + "-" + this.finVendredi
                +"\nSamedi:" + this.debutSamedi + "-" + this.finSamedi
                +"\nDimanche:" + this.debutDimanche + "-" + this.finDimanche;
    }*/


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_HORAIREVENTE",length = 32)
    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Column(name = "DEBUTJour")
  //  @NotNull
    public Integer getDebutJour(){
        return this.debutJour;
    }

    public void setDebutJour(Integer i){
        debutJour = i;
    }
    @Column(name = "FINJour")
   // @NotNull
    public Integer getFinJour(){
        return this.finJour;
    }

    public void setFinJour(Integer i){
        finJour = i;
    }
/*   @Column(name = "DEBUTSAMEDI")
  //  @NotNull
    public Integer getDebutSamedi(){
        return this.debutSamedi;
    }

    public void setDebutSamedi(Integer i){
        debutSamedi = i;
    }
    @Column(name = "FINSAMEDI")
  //  @NotNull
    public Integer getFinSamedi(){
        return this.finSamedi;
    }

    public void setFinSamedi(Integer i){
        finSamedi = i;
    }
    @Column(name = "DEBUTDIMANCHE")
  //  @NotNull
    public Integer getDebutDimanche(){
        return this.debutDimanche;
    }

    public void setDebutDimanche(Integer i){
        debutDimanche = i;
    }
    @Column(name = "FINDIMANCHE")
  //  @NotNull
    public Integer getFinDimanche(){
        return this.finDimanche;
    }

    public void setFinDimanche(Integer i){
        finDimanche = i;
    }*/
}
