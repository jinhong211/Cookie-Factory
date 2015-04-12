
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for faconIsExist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faconIsExist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomFacon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faconIsExist", propOrder = {
    "nomFacon"
})
public class FaconIsExist {

    protected String nomFacon;

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

}
