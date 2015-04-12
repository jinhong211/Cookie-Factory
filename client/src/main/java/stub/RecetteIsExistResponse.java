
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recetteIsExistResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recetteIsExistResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="existRette" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recetteIsExistResponse", propOrder = {
    "existRette"
})
public class RecetteIsExistResponse {

    protected boolean existRette;

    /**
     * Gets the value of the existRette property.
     * 
     */
    public boolean isExistRette() {
        return existRette;
    }

    /**
     * Sets the value of the existRette property.
     * 
     */
    public void setExistRette(boolean value) {
        this.existRette = value;
    }

}
