
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boutique complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boutique">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresseBoutique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chiffreVente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="commandes" type="{http://webService.demo.se.polytech.unice.fr/}commande" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="horaireAtlier" type="{http://webService.demo.se.polytech.unice.fr/}horaireAtlier" minOccurs="0"/>
 *         &lt;element name="horaireVente" type="{http://webService.demo.se.polytech.unice.fr/}horaireVente" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preferences" type="{http://webService.demo.se.polytech.unice.fr/}preference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recette_du_jour" type="{http://webService.demo.se.polytech.unice.fr/}recette" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boutique", propOrder = {
    "addresseBoutique",
    "chiffreVente",
    "commandes",
    "horaireAtlier",
    "horaireVente",
    "id",
    "preferences",
    "recetteDuJour",
    "tax"
})
public class Boutique {

    protected String addresseBoutique;
    protected Integer chiffreVente;
    @XmlElement(nillable = true)
    protected List<Commande> commandes;
    protected HoraireAtlier horaireAtlier;
    protected HoraireVente horaireVente;
    protected Long id;
    @XmlElement(nillable = true)
    protected List<Preference> preferences;
    @XmlElement(name = "recette_du_jour")
    protected Recette recetteDuJour;
    protected double tax;

    /**
     * Gets the value of the addresseBoutique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseBoutique() {
        return addresseBoutique;
    }

    /**
     * Sets the value of the addresseBoutique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseBoutique(String value) {
        this.addresseBoutique = value;
    }

    /**
     * Gets the value of the chiffreVente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChiffreVente() {
        return chiffreVente;
    }

    /**
     * Sets the value of the chiffreVente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChiffreVente(Integer value) {
        this.chiffreVente = value;
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
     * Gets the value of the horaireAtlier property.
     * 
     * @return
     *     possible object is
     *     {@link HoraireAtlier }
     *     
     */
    public HoraireAtlier getHoraireAtlier() {
        return horaireAtlier;
    }

    /**
     * Sets the value of the horaireAtlier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoraireAtlier }
     *     
     */
    public void setHoraireAtlier(HoraireAtlier value) {
        this.horaireAtlier = value;
    }

    /**
     * Gets the value of the horaireVente property.
     * 
     * @return
     *     possible object is
     *     {@link HoraireVente }
     *     
     */
    public HoraireVente getHoraireVente() {
        return horaireVente;
    }

    /**
     * Sets the value of the horaireVente property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoraireVente }
     *     
     */
    public void setHoraireVente(HoraireVente value) {
        this.horaireVente = value;
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
     * Gets the value of the recetteDuJour property.
     * 
     * @return
     *     possible object is
     *     {@link Recette }
     *     
     */
    public Recette getRecetteDuJour() {
        return recetteDuJour;
    }

    /**
     * Sets the value of the recetteDuJour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recette }
     *     
     */
    public void setRecetteDuJour(Recette value) {
        this.recetteDuJour = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     */
    public double getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     */
    public void setTax(double value) {
        this.tax = value;
    }

}
