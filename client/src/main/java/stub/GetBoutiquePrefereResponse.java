
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getBoutiquePrefereResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getBoutiquePrefereResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boutiquePrefere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBoutiquePrefereResponse", propOrder = {
    "boutiquePrefere"
})
public class GetBoutiquePrefereResponse {

    protected String boutiquePrefere;

    /**
     * Obtient la valeur de la propri�t� boutiquePrefere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoutiquePrefere() {
        return boutiquePrefere;
    }

    /**
     * D�finit la valeur de la propri�t� boutiquePrefere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoutiquePrefere(String value) {
        this.boutiquePrefere = value;
    }

}
