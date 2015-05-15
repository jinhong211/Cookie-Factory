
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRecettePrefereResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRecettePrefereResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recettePrefere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecettePrefereResponse", propOrder = {
    "recettePrefere"
})
public class GetRecettePrefereResponse {

    protected String recettePrefere;

    /**
     * Gets the value of the recettePrefere property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecettePrefere() {
        return recettePrefere;
    }

    /**
     * Sets the value of the recettePrefere property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecettePrefere(String value) {
        this.recettePrefere = value;
    }

}
