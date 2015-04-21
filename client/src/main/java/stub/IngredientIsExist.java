
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ingredientIsExist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ingredientIsExist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomIngredient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingredientIsExist", propOrder = {
    "nomIngredient"
})
public class IngredientIsExist {

    protected String nomIngredient;

    /**
     * Gets the value of the nomIngredient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomIngredient() {
        return nomIngredient;
    }

    /**
     * Sets the value of the nomIngredient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomIngredient(String value) {
        this.nomIngredient = value;
    }

}