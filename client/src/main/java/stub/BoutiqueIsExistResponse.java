
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boutiqueIsExistResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boutiqueIsExistResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="existBoutique" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boutiqueIsExistResponse", propOrder = {
    "existBoutique"
})
public class BoutiqueIsExistResponse {

    protected boolean existBoutique;

    /**
     * Gets the value of the existBoutique property.
     * 
     */
    public boolean isExistBoutique() {
        return existBoutique;
    }

    /**
     * Sets the value of the existBoutique property.
     * 
     */
    public void setExistBoutique(boolean value) {
        this.existBoutique = value;
    }

}
