
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllFaconResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllFaconResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allFacon" type="{http://webService.demo.se.polytech.unice.fr/}facon" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllFaconResponse", propOrder = {
    "allFacon"
})
public class GetAllFaconResponse {

    protected List<Facon> allFacon;

    /**
     * Gets the value of the allFacon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allFacon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllFacon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facon }
     * 
     * 
     */
    public List<Facon> getAllFacon() {
        if (allFacon == null) {
            allFacon = new ArrayList<Facon>();
        }
        return this.allFacon;
    }

}
