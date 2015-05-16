
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getRecettePrefereResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getRecettePrefereResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recettePrefere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecettePrefereResponse", propOrder = {
    "recettePrefere"
})
public class GetRecettePrefereResponse {

    protected String recettePrefere;

    /**
     * Obtient la valeur de la propriété recettePrefere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecettePrefere() {
        return recettePrefere;
    }

    /**
     * Définit la valeur de la propriété recettePrefere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecettePrefere(String value) {
        this.recettePrefere = value;
    }

}
