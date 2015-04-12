
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerBoutique complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerBoutique">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresseBoutique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tempsOuv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tempsFer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerBoutique", propOrder = {
    "addresseBoutique",
    "tax",
    "tempsOuv",
    "tempsFer"
})
public class CreerBoutique {

    protected String addresseBoutique;
    protected double tax;
    protected int tempsOuv;
    protected int tempsFer;

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

    /**
     * Gets the value of the tempsOuv property.
     * 
     */
    public int getTempsOuv() {
        return tempsOuv;
    }

    /**
     * Sets the value of the tempsOuv property.
     * 
     */
    public void setTempsOuv(int value) {
        this.tempsOuv = value;
    }

    /**
     * Gets the value of the tempsFer property.
     * 
     */
    public int getTempsFer() {
        return tempsFer;
    }

    /**
     * Sets the value of the tempsFer property.
     * 
     */
    public void setTempsFer(int value) {
        this.tempsFer = value;
    }

}
