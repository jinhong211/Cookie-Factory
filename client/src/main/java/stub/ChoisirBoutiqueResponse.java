
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for choisirBoutiqueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="choisirBoutiqueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="choisirBoutique" type="{http://webService.demo.se.polytech.unice.fr/}boutique" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choisirBoutiqueResponse", propOrder = {
    "choisirBoutique"
})
public class ChoisirBoutiqueResponse {

    protected Boutique choisirBoutique;

    /**
     * Gets the value of the choisirBoutique property.
     * 
     * @return
     *     possible object is
     *     {@link Boutique }
     *     
     */
    public Boutique getChoisirBoutique() {
        return choisirBoutique;
    }

    /**
     * Sets the value of the choisirBoutique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boutique }
     *     
     */
    public void setChoisirBoutique(Boutique value) {
        this.choisirBoutique = value;
    }

}
