
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresse_Client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compte_Banque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nom_Client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoPayment", propOrder = {
    "addresseClient",
    "compteBanque",
    "id",
    "nomClient"
})
public class InfoPayment {

    @XmlElement(name = "addresse_Client")
    protected String addresseClient;
    @XmlElement(name = "compte_Banque")
    protected String compteBanque;
    protected Long id;
    @XmlElement(name = "nom_Client")
    protected String nomClient;

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

}
