
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for choisirRecette complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="choisirRecette">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomRette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choisirRecette", propOrder = {
    "nomRette"
})
public class ChoisirRecette {

    protected String nomRette;

    /**
     * Gets the value of the nomRette property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomRette() {
        return nomRette;
    }

    /**
     * Sets the value of the nomRette property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomRette(String value) {
        this.nomRette = value;
    }

}
