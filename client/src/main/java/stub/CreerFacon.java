
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerFacon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerFacon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomFacon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prixIngredient" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerFacon", propOrder = {
    "nomFacon",
    "prixIngredient"
})
public class CreerFacon {

    protected String nomFacon;
    protected double prixIngredient;

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

}
