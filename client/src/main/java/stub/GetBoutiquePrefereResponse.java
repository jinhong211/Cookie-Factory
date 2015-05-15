
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBoutiquePrefereResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBoutiquePrefereResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boutiquePrefere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBoutiquePrefereResponse", propOrder = {
    "boutiquePrefere"
})
public class GetBoutiquePrefereResponse {

    protected String boutiquePrefere;

    /**
     * Gets the value of the boutiquePrefere property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoutiquePrefere() {
        return boutiquePrefere;
    }

    /**
     * Sets the value of the boutiquePrefere property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoutiquePrefere(String value) {
        this.boutiquePrefere = value;
    }

}
