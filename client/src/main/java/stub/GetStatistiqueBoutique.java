
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getStatistiqueBoutique complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getStatistiqueBoutique">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresseBoutique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatistiqueBoutique", propOrder = {
    "addresseBoutique"
})
public class GetStatistiqueBoutique {

    protected String addresseBoutique;

    /**
     * Obtient la valeur de la propriété addresseBoutique.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseBoutique() {
        return addresseBoutique;
    }

    /**
     * Définit la valeur de la propriété addresseBoutique.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseBoutique(String value) {
        this.addresseBoutique = value;
    }

}
