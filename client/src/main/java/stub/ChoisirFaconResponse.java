
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for choisirFaconResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="choisirFaconResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="choisirFacon" type="{http://webService.demo.se.polytech.unice.fr/}facon" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choisirFaconResponse", propOrder = {
    "choisirFacon"
})
public class ChoisirFaconResponse {

    protected Facon choisirFacon;

    /**
     * Gets the value of the choisirFacon property.
     * 
     * @return
     *     possible object is
     *     {@link Facon }
     *     
     */
    public Facon getChoisirFacon() {
        return choisirFacon;
    }

    /**
     * Sets the value of the choisirFacon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facon }
     *     
     */
    public void setChoisirFacon(Facon value) {
        this.choisirFacon = value;
    }

}
