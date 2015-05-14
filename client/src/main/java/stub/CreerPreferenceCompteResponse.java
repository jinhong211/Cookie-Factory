
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerPreferenceCompteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerPreferenceCompteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preferenceDansCompte" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerPreferenceCompteResponse", propOrder = {
    "preferenceDansCompte"
})
public class CreerPreferenceCompteResponse {

    protected boolean preferenceDansCompte;

    /**
     * Gets the value of the preferenceDansCompte property.
     * 
     */
    public boolean isPreferenceDansCompte() {
        return preferenceDansCompte;
    }

    /**
     * Sets the value of the preferenceDansCompte property.
     * 
     */
    public void setPreferenceDansCompte(boolean value) {
        this.preferenceDansCompte = value;
    }

}
