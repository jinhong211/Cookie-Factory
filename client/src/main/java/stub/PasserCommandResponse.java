
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour passerCommandResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="passerCommandResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passerCommand" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passerCommandResponse", propOrder = {
    "passerCommand"
})
public class PasserCommandResponse {

    protected double passerCommand;

    /**
     * Obtient la valeur de la propriété passerCommand.
     * 
     */
    public double getPasserCommand() {
        return passerCommand;
    }

    /**
     * Définit la valeur de la propriété passerCommand.
     * 
     */
    public void setPasserCommand(double value) {
        this.passerCommand = value;
    }

}
