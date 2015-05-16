
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creerBoutiqueResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creerBoutiqueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerBoutique" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerBoutiqueResponse", propOrder = {
    "creerBoutique"
})
public class CreerBoutiqueResponse {

    protected boolean creerBoutique;

    /**
     * Obtient la valeur de la propri�t� creerBoutique.
     * 
     */
    public boolean isCreerBoutique() {
        return creerBoutique;
    }

    /**
     * D�finit la valeur de la propri�t� creerBoutique.
     * 
     */
    public void setCreerBoutique(boolean value) {
        this.creerBoutique = value;
    }

}
