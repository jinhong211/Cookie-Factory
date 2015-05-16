
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creerPreferenceCompteResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété preferenceDansCompte.
     * 
     */
    public boolean isPreferenceDansCompte() {
        return preferenceDansCompte;
    }

    /**
     * Définit la valeur de la propriété preferenceDansCompte.
     * 
     */
    public void setPreferenceDansCompte(boolean value) {
        this.preferenceDansCompte = value;
    }

}
