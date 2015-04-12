
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerRecetteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerRecetteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerRette" type="{http://webService.demo.se.polytech.unice.fr/}recette" minOccurs="0"/>
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
    "creerRette"
})
public class CreerRecetteResponse {

    protected Recette creerRette;

    /**
     * Gets the value of the creerRette property.
     * 
     * @return
     *     possible object is
     *     {@link Recette }
     *     
     */
    public Recette getCreerRette() {
        return creerRette;
    }

    /**
     * Sets the value of the creerRette property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recette }
     *     
     */
    public void setCreerRette(Recette value) {
        this.creerRette = value;
    }

}
