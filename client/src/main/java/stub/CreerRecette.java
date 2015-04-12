
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
 *         &lt;element name="nomRette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingredientSet" type="{http://webService.demo.se.polytech.unice.fr/}ingredient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="faconSet" type="{http://webService.demo.se.polytech.unice.fr/}facon" maxOccurs="unbounded" minOccurs="0"/>
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
    "nomRette",
    "ingredientSet",
    "faconSet"
})
public class CreerRecette {

    protected String nomRette;
    protected List<Ingredient> ingredientSet;
    protected List<Facon> faconSet;

    /**
     * Gets the value of the nomRette property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomRette() {
        return nomRette;
    }

    /**
     * Sets the value of the nomRette property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomRette(String value) {
        this.nomRette = value;
    }

    /**
     * Gets the value of the ingredientSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ingredient }
     * 
     * 
     */
    public List<Ingredient> getIngredientSet() {
        if (ingredientSet == null) {
            ingredientSet = new ArrayList<Ingredient>();
        }
        return this.ingredientSet;
    }

    /**
     * Gets the value of the faconSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faconSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaconSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facon }
     * 
     * 
     */
    public List<Facon> getFaconSet() {
        if (faconSet == null) {
            faconSet = new ArrayList<Facon>();
        }
        return this.faconSet;
    }

}
