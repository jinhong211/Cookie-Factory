
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerInfoPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerInfoPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addresseClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compteBanque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerInfoPayment", propOrder = {
    "nomClient",
    "addresseClient",
    "compteBanque"
})
public class CreerInfoPayment {

    protected String nomClient;
    protected String addresseClient;
    protected String compteBanque;

    /**
     * Gets the value of the nomClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     * Sets the value of the nomClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomClient(String value) {
        this.nomClient = value;
    }

    /**
     * Gets the value of the addresseClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseClient() {
        return addresseClient;
    }

    /**
     * Sets the value of the addresseClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseClient(String value) {
        this.addresseClient = value;
    }

    /**
     * Gets the value of the compteBanque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompteBanque() {
        return compteBanque;
    }

    /**
     * Sets the value of the compteBanque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompteBanque(String value) {
        this.compteBanque = value;
    }

}
