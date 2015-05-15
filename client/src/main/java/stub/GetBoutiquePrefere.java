
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBoutiquePrefere complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBoutiquePrefere">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBoutiquePrefere", propOrder = {
    "compteId"
})
public class GetBoutiquePrefere {

    protected int compteId;

    /**
     * Gets the value of the compteId property.
     * 
     */
    public int getCompteId() {
        return compteId;
    }

    /**
     * Sets the value of the compteId property.
     * 
     */
    public void setCompteId(int value) {
        this.compteId = value;
    }

}
