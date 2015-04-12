
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerBoutiqueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerBoutiqueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerBoutique" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerBoutiqueResponse", propOrder = {
    "creerBoutique"
})
public class CreerBoutiqueResponse {

    protected boolean creerBoutique;

    /**
     * Gets the value of the creerBoutique property.
     * 
     */
    public boolean isCreerBoutique() {
        return creerBoutique;
    }

    /**
     * Sets the value of the creerBoutique property.
     * 
     */
    public void setCreerBoutique(boolean value) {
        this.creerBoutique = value;
    }

}
