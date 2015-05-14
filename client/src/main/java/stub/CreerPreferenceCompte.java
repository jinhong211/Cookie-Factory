
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerPreferenceCompte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerPreferenceCompte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recettes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="boutiques" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="compteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerPreferenceCompte", propOrder = {
    "recettes",
    "boutiques",
    "compteId"
})
public class CreerPreferenceCompte {

    protected List<String> recettes;
    protected List<String> boutiques;
    protected int compteId;

    /**
     * Gets the value of the recettes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recettes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecettes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecettes() {
        if (recettes == null) {
            recettes = new ArrayList<String>();
        }
        return this.recettes;
    }

    /**
     * Gets the value of the boutiques property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boutiques property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoutiques().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBoutiques() {
        if (boutiques == null) {
            boutiques = new ArrayList<String>();
        }
        return this.boutiques;
    }

    /**
     * Gets the value of the compteId property.
     * 
     */
    public int getCompteId() {
        return compteId;
    }

    /**
     * Sets the value of the compteId property.
     * 
     */
    public void setCompteId(int value) {
        this.compteId = value;
    }

}
