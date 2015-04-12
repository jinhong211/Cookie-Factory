
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerIngredientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerIngredientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerIngredient" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerIngredientResponse", propOrder = {
    "creerIngredient"
})
public class CreerIngredientResponse {

    protected boolean creerIngredient;

    /**
     * Gets the value of the creerIngredient property.
     * 
     */
    public boolean isCreerIngredient() {
        return creerIngredient;
    }

    /**
     * Sets the value of the creerIngredient property.
     * 
     */
    public void setCreerIngredient(boolean value) {
        this.creerIngredient = value;
    }

}
