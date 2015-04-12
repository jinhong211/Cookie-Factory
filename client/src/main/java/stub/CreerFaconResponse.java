
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerFaconResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerFaconResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerFacon" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerFaconResponse", propOrder = {
    "creerFacon"
})
public class CreerFaconResponse {

    protected boolean creerFacon;

    /**
     * Gets the value of the creerFacon property.
     * 
     */
    public boolean isCreerFacon() {
        return creerFacon;
    }

    /**
     * Sets the value of the creerFacon property.
     * 
     */
    public void setCreerFacon(boolean value) {
        this.creerFacon = value;
    }

}
