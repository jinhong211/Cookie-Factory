
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creerBoutique complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creerBoutique">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresseBoutique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tempsOuv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tempsFer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerBoutique", propOrder = {
    "addresseBoutique",
    "tax",
    "tempsOuv",
    "tempsFer"
})
public class CreerBoutique {

    protected String addresseBoutique;
    protected double tax;
    protected int tempsOuv;
    protected int tempsFer;

    /**
     * Obtient la valeur de la propri�t� addresseBoutique.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseBoutique() {
        return addresseBoutique;
    }

    /**
     * D�finit la valeur de la propri�t� addresseBoutique.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseBoutique(String value) {
        this.addresseBoutique = value;
    }

    /**
     * Obtient la valeur de la propri�t� tax.
     * 
     */
    public double getTax() {
        return tax;
    }

    /**
     * D�finit la valeur de la propri�t� tax.
     * 
     */
    public void setTax(double value) {
        this.tax = value;
    }

    /**
     * Obtient la valeur de la propri�t� tempsOuv.
     * 
     */
    public int getTempsOuv() {
        return tempsOuv;
    }

    /**
     * D�finit la valeur de la propri�t� tempsOuv.
     * 
     */
    public void setTempsOuv(int value) {
        this.tempsOuv = value;
    }

    /**
     * Obtient la valeur de la propri�t� tempsFer.
     * 
     */
    public int getTempsFer() {
        return tempsFer;
    }

    /**
     * D�finit la valeur de la propri�t� tempsFer.
     * 
     */
    public void setTempsFer(int value) {
        this.tempsFer = value;
    }

}
