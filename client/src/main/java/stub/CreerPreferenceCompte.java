
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creerPreferenceCompte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creerPreferenceCompte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boutiques" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "recette",
    "boutiques",
    "compteId"
})
public class CreerPreferenceCompte {

    protected String recette;
    protected String boutiques;
    protected int compteId;

    /**
     * Obtient la valeur de la propriété recette.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecette() {
        return recette;
    }

    /**
     * Définit la valeur de la propriété recette.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecette(String value) {
        this.recette = value;
    }

    /**
     * Obtient la valeur de la propriété boutiques.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoutiques() {
        return boutiques;
    }

    /**
     * Définit la valeur de la propriété boutiques.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoutiques(String value) {
        this.boutiques = value;
    }

    /**
     * Obtient la valeur de la propriété compteId.
     * 
     */
    public int getCompteId() {
        return compteId;
    }

    /**
     * Définit la valeur de la propriété compteId.
     * 
     */
    public void setCompteId(int value) {
        this.compteId = value;
    }

}
