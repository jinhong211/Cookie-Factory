
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for choisirRecetteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="choisirRecetteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="choisirRette" type="{http://webService.demo.se.polytech.unice.fr/}recette" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choisirRecetteResponse", propOrder = {
    "choisirRette"
})
public class ChoisirRecetteResponse {

    protected Recette choisirRette;

    /**
     * Gets the value of the choisirRette property.
     * 
     * @return
     *     possible object is
     *     {@link Recette }
     *     
     */
    public Recette getChoisirRette() {
        return choisirRette;
    }

    /**
     * Sets the value of the choisirRette property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recette }
     *     
     */
    public void setChoisirRette(Recette value) {
        this.choisirRette = value;
    }

}
