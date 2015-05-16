
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getStatistiqueGlobalResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getStatistiqueGlobalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statistiqueGlobal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatistiqueGlobalResponse", propOrder = {
    "statistiqueGlobal"
})
public class GetStatistiqueGlobalResponse {

    protected int statistiqueGlobal;

    /**
     * Obtient la valeur de la propriété statistiqueGlobal.
     * 
     */
    public int getStatistiqueGlobal() {
        return statistiqueGlobal;
    }

    /**
     * Définit la valeur de la propriété statistiqueGlobal.
     * 
     */
    public void setStatistiqueGlobal(int value) {
        this.statistiqueGlobal = value;
    }

}
