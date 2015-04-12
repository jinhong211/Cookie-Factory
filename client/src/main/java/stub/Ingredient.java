
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ingredient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ingredient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nom_Ingredient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prix_Ingredient" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="recettes" type="{http://webService.demo.se.polytech.unice.fr/}recette" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingredient", propOrder = {
    "id",
    "nomIngredient",
    "prixIngredient",
    "recettes"
})
public class Ingredient {

    protected Long id;
    @XmlElement(name = "nom_Ingredient")
    protected String nomIngredient;
    @XmlElement(name = "prix_Ingredient")
    protected double prixIngredient;
    @XmlElement(nillable = true)
    protected List<Recette> recettes;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the nomIngredient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomIngredient() {
        return nomIngredient;
    }

    /**
     * Sets the value of the nomIngredient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomIngredient(String value) {
        this.nomIngredient = value;
    }

    /**
     * Gets the value of the prixIngredient property.
     * 
     */
    public double getPrixIngredient() {
        return prixIngredient;
    }

    /**
     * Sets the value of the prixIngredient property.
     * 
     */
    public void setPrixIngredient(double value) {
        this.prixIngredient = value;
    }

    /**
     * Gets the value of the recettes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recettes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecettes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recette }
     * 
     * 
     */
    public List<Recette> getRecettes() {
        if (recettes == null) {
            recettes = new ArrayList<Recette>();
        }
        return this.recettes;
    }

}
