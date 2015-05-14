
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStatistiqueBoutiqueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStatistiqueBoutiqueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statistiqueBoutique" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatistiqueBoutiqueResponse", propOrder = {
    "statistiqueBoutique"
})
public class GetStatistiqueBoutiqueResponse {

    protected int statistiqueBoutique;

    /**
     * Gets the value of the statistiqueBoutique property.
     * 
     */
    public int getStatistiqueBoutique() {
        return statistiqueBoutique;
    }

    /**
     * Sets the value of the statistiqueBoutique property.
     * 
     */
    public void setStatistiqueBoutique(int value) {
        this.statistiqueBoutique = value;
    }

}
