
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerPreferenceCompte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerPreferenceCompte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boutiques" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerPreferenceCompte", propOrder = {
    "recette",
    "boutiques",
    "compteId"
})
public class CreerPreferenceCompte {

    protected String recette;
    protected String boutiques;
    protected int compteId;

    /**
     * Gets the value of the recette property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecette() {
        return recette;
    }

    /**
     * Sets the value of the recette property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecette(String value) {
        this.recette = value;
    }

    /**
     * Gets the value of the boutiques property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoutiques() {
        return boutiques;
    }

    /**
     * Sets the value of the boutiques property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoutiques(String value) {
        this.boutiques = value;
    }

    /**
     * Gets the value of the compteId property.
     * 
     */
    public int getCompteId() {
        return compteId;
    }

    /**
     * Sets the value of the compteId property.
     * 
     */
    public void setCompteId(int value) {
        this.compteId = value;
    }

}
