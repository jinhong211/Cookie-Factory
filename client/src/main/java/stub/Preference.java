
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boutiques" type="{http://webService.demo.se.polytech.unice.fr/}boutique" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="compte" type="{http://webService.demo.se.polytech.unice.fr/}compte" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="infoPayment" type="{http://webService.demo.se.polytech.unice.fr/}infoPayment" minOccurs="0"/>
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
@XmlType(name = "preference", propOrder = {
    "boutiques",
    "compte",
    "id",
    "infoPayment",
    "recettes"
})
public class Preference {

    @XmlElement(nillable = true)
    protected List<Boutique> boutiques;
    protected Compte compte;
    protected Long id;
    protected InfoPayment infoPayment;
    @XmlElement(nillable = true)
    protected List<Recette> recettes;

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
     * Gets the value of the compte property.
     * 
     * @return
     *     possible object is
     *     {@link Compte }
     *     
     */
    public Compte getCompte() {
        return compte;
    }

    /**
     * Sets the value of the compte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compte }
     *     
     */
    public void setCompte(Compte value) {
        this.compte = value;
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
     * Gets the value of the infoPayment property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPayment }
     *     
     */
    public InfoPayment getInfoPayment() {
        return infoPayment;
    }

    /**
     * Sets the value of the infoPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPayment }
     *     
     */
    public void setInfoPayment(InfoPayment value) {
        this.infoPayment = value;
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
