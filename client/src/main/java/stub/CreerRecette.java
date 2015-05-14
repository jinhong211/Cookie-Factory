
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerRecette complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerRecette">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recetteNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingredients" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="facons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerRecette", propOrder = {
    "recetteNom",
    "ingredients",
    "facons"
})
public class CreerRecette {

    protected String recetteNom;
    protected List<String> ingredients;
    protected List<String> facons;

    /**
     * Gets the value of the recetteNom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecetteNom() {
        return recetteNom;
    }

    /**
     * Sets the value of the recetteNom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecetteNom(String value) {
        this.recetteNom = value;
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIngredients() {
        if (ingredients == null) {
            ingredients = new ArrayList<String>();
        }
        return this.ingredients;
    }

    /**
     * Gets the value of the facons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFacons() {
        if (facons == null) {
            facons = new ArrayList<String>();
        }
        return this.facons;
    }

}
