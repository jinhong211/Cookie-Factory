
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerCommandeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerCommandeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerCommande" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerCommandeResponse", propOrder = {
    "creerCommande"
})
public class CreerCommandeResponse {

    protected boolean creerCommande;

    /**
     * Gets the value of the creerCommande property.
     * 
     */
    public boolean isCreerCommande() {
        return creerCommande;
    }

    /**
     * Sets the value of the creerCommande property.
     * 
     */
    public void setCreerCommande(boolean value) {
        this.creerCommande = value;
    }

}
