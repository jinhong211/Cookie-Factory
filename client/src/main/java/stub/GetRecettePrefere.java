
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getRecettePrefere complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getRecettePrefere">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getRecettePrefere", propOrder = {
    "compteId"
})
public class GetRecettePrefere {

    protected int compteId;

    /**
     * Obtient la valeur de la propri�t� compteId.
     * 
     */
    public int getCompteId() {
        return compteId;
    }

    /**
     * D�finit la valeur de la propri�t� compteId.
     * 
     */
    public void setCompteId(int value) {
        this.compteId = value;
    }

}
