
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for faconIsExistResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faconIsExistResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="existFacon" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faconIsExistResponse", propOrder = {
    "existFacon"
})
public class FaconIsExistResponse {

    protected boolean existFacon;

    /**
     * Gets the value of the existFacon property.
     * 
     */
    public boolean isExistFacon() {
        return existFacon;
    }

    /**
     * Sets the value of the existFacon property.
     * 
     */
    public void setExistFacon(boolean value) {
        this.existFacon = value;
    }

}
