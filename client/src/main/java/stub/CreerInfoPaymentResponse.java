
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerInfoPaymentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerInfoPaymentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerInfoPayment" type="{http://webService.demo.se.polytech.unice.fr/}infoPayment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerInfoPaymentResponse", propOrder = {
    "creerInfoPayment"
})
public class CreerInfoPaymentResponse {

    protected InfoPayment creerInfoPayment;

    /**
     * Gets the value of the creerInfoPayment property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPayment }
     *     
     */
    public InfoPayment getCreerInfoPayment() {
        return creerInfoPayment;
    }

    /**
     * Sets the value of the creerInfoPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPayment }
     *     
     */
    public void setCreerInfoPayment(InfoPayment value) {
        this.creerInfoPayment = value;
    }

}
