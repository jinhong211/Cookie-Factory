
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStatistiqueGlobalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStatistiqueGlobalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statistiqueGlobal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatistiqueGlobalResponse", propOrder = {
    "statistiqueGlobal"
})
public class GetStatistiqueGlobalResponse {

    protected int statistiqueGlobal;

    /**
     * Gets the value of the statistiqueGlobal property.
     * 
     */
    public int getStatistiqueGlobal() {
        return statistiqueGlobal;
    }

    /**
     * Sets the value of the statistiqueGlobal property.
     * 
     */
    public void setStatistiqueGlobal(int value) {
        this.statistiqueGlobal = value;
    }

}
