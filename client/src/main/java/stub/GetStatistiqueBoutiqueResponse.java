
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getStatistiqueBoutiqueResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getStatistiqueBoutiqueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statistiqueBoutique" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatistiqueBoutiqueResponse", propOrder = {
    "statistiqueBoutique"
})
public class GetStatistiqueBoutiqueResponse {

    protected int statistiqueBoutique;

    /**
     * Obtient la valeur de la propri�t� statistiqueBoutique.
     * 
     */
    public int getStatistiqueBoutique() {
        return statistiqueBoutique;
    }

    /**
     * D�finit la valeur de la propri�t� statistiqueBoutique.
     * 
     */
    public void setStatistiqueBoutique(int value) {
        this.statistiqueBoutique = value;
    }

}
