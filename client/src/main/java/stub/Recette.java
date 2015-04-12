
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recette complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recette">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boutiques" type="{http://webService.demo.se.polytech.unice.fr/}boutique" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commandes" type="{http://webService.demo.se.polytech.unice.fr/}commande" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="facons" type="{http://webService.demo.se.polytech.unice.fr/}facon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ingredients" type="{http://webService.demo.se.polytech.unice.fr/}ingredient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nom_recette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferences" type="{http://webService.demo.se.polytech.unice.fr/}preference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prix_recette" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="temps_Utiliser" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recette", propOrder = {
    "boutiques",
    "commandes",
    "facons",
    "id",
    "ingredients",
    "nomRecette",
    "preferences",
    "prixRecette",
    "tempsUtiliser"
})
public class Recette {

    @XmlElement(nillable = true)
    protected List<Boutique> boutiques;
    @XmlElement(nillable = true)
    protected List<Commande> commandes;
    @XmlElement(nillable = true)
    protected List<Facon> facons;
    protected Long id;
    @XmlElement(nillable = true)
    protected List<Ingredient> ingredients;
    @XmlElement(name = "nom_recette")
    protected String nomRecette;
    @XmlElement(nillable = true)
    protected List<Preference> preferences;
    @XmlElement(name = "prix_recette")
    protected double prixRecette;
    @XmlElement(name = "temps_Utiliser")
    protected double tempsUtiliser;

    /**
     * Gets the value of the boutiques property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boutiques property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoutiques().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boutique }
     * 
     * 
     */
    public List<Boutique> getBoutiques() {
        if (boutiques == null) {
            boutiques = new ArrayList<Boutique>();
        }
        return this.boutiques;
    }

    /**
     * Gets the value of the commandes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commandes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommandes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commande }
     * 
     * 
     */
    public List<Commande> getCommandes() {
        if (commandes == null) {
            commandes = new ArrayList<Commande>();
        }
        return this.commandes;
    }

    /**
     * Gets the value of the facons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facon }
     * 
     * 
     */
    public List<Facon> getFacons() {
        if (facons == null) {
            facons = new ArrayList<Facon>();
        }
        return this.facons;
    }

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
     * Gets the value of the ingredients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ingredient }
     * 
     * 
     */
    public List<Ingredient> getIngredients() {
        if (ingredients == null) {
            ingredients = new ArrayList<Ingredient>();
        }
        return this.ingredients;
    }

    /**
     * Gets the value of the nomRecette property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomRecette() {
        return nomRecette;
    }

    /**
     * Sets the value of the nomRecette property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomRecette(String value) {
        this.nomRecette = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Preference }
     * 
     * 
     */
    public List<Preference> getPreferences() {
        if (preferences == null) {
            preferences = new ArrayList<Preference>();
        }
        return this.preferences;
    }

    /**
     * Gets the value of the prixRecette property.
     * 
     */
    public double getPrixRecette() {
        return prixRecette;
    }

    /**
     * Sets the value of the prixRecette property.
     * 
     */
    public void setPrixRecette(double value) {
        this.prixRecette = value;
    }

    /**
     * Gets the value of the tempsUtiliser property.
     * 
     */
    public double getTempsUtiliser() {
        return tempsUtiliser;
    }

    /**
     * Sets the value of the tempsUtiliser property.
     * 
     */
    public void setTempsUtiliser(double value) {
        this.tempsUtiliser = value;
    }

}
