
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for choisirIngredientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="choisirIngredientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="choisirIngredient" type="{http://webService.demo.se.polytech.unice.fr/}ingredient" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choisirIngredientResponse", propOrder = {
    "choisirIngredient"
})
public class ChoisirIngredientResponse {

    protected Ingredient choisirIngredient;

    /**
     * Gets the value of the choisirIngredient property.
     * 
     * @return
     *     possible object is
     *     {@link Ingredient }
     *     
     */
    public Ingredient getChoisirIngredient() {
        return choisirIngredient;
    }

    /**
     * Sets the value of the choisirIngredient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ingredient }
     *     
     */
    public void setChoisirIngredient(Ingredient value) {
        this.choisirIngredient = value;
    }

}
