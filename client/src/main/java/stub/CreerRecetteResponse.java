
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creerRecetteResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creerRecetteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerRecette" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerRecetteResponse", propOrder = {
    "creerRecette"
})
public class CreerRecetteResponse {

    protected boolean creerRecette;

    /**
     * Obtient la valeur de la propri�t� creerRecette.
     * 
     */
    public boolean isCreerRecette() {
        return creerRecette;
    }

    /**
     * D�finit la valeur de la propri�t� creerRecette.
     * 
     */
    public void setCreerRecette(boolean value) {
        this.creerRecette = value;
    }

}
