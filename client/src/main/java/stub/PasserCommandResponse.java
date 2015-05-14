
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passerCommandResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passerCommandResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passerCommand" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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

    protected boolean passerCommand;

    /**
     * Gets the value of the passerCommand property.
     * 
     */
    public boolean isPasserCommand() {
        return passerCommand;
    }

    /**
     * Sets the value of the passerCommand property.
     * 
     */
    public void setPasserCommand(boolean value) {
        this.passerCommand = value;
    }

}
