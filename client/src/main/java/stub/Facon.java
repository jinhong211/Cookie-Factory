
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for facon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="facon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nom_Facon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recettes" type="{http://webService.demo.se.polytech.unice.fr/}recette" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="temps_Utilise" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facon", propOrder = {
    "id",
    "nomFacon",
    "recettes",
    "tempsUtilise"
})
public class Facon {

    protected Long id;
    @XmlElement(name = "nom_Facon")
    protected String nomFacon;
    @XmlElement(nillable = true)
    protected List<Recette> recettes;
    @XmlElement(name = "temps_Utilise")
    protected double tempsUtilise;

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
     * Gets the value of the nomFacon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomFacon() {
        return nomFacon;
    }

    /**
     * Sets the value of the nomFacon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomFacon(String value) {
        this.nomFacon = value;
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

    /**
     * Gets the value of the tempsUtilise property.
     * 
     */
    public double getTempsUtilise() {
        return tempsUtilise;
    }

    /**
     * Sets the value of the tempsUtilise property.
     * 
     */
    public void setTempsUtilise(double value) {
        this.tempsUtilise = value;
    }

}
