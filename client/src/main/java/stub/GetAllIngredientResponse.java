
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllIngredientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllIngredientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allIngredient" type="{http://webService.demo.se.polytech.unice.fr/}ingredient" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllIngredientResponse", propOrder = {
    "allIngredient"
})
public class GetAllIngredientResponse {

    protected List<Ingredient> allIngredient;

    /**
     * Gets the value of the allIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ingredient }
     * 
     * 
     */
    public List<Ingredient> getAllIngredient() {
        if (allIngredient == null) {
            allIngredient = new ArrayList<Ingredient>();
        }
        return this.allIngredient;
    }

}
