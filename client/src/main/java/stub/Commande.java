
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for commande complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commande">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boutique" type="{http://webService.demo.se.polytech.unice.fr/}boutique" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="infoPayment" type="{http://webService.demo.se.polytech.unice.fr/}infoPayment" minOccurs="0"/>
 *         &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recette" type="{http://webService.demo.se.polytech.unice.fr/}recette" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commande", propOrder = {
    "boutique",
    "date",
    "id",
    "infoPayment",
    "quantite",
    "recette"
})
public class Commande {

    protected Boutique boutique;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected Long id;
    protected InfoPayment infoPayment;
    protected Integer quantite;
    protected Recette recette;

    /**
     * Gets the value of the boutique property.
     * 
     * @return
     *     possible object is
     *     {@link Boutique }
     *     
     */
    public Boutique getBoutique() {
        return boutique;
    }

    /**
     * Sets the value of the boutique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boutique }
     *     
     */
    public void setBoutique(Boutique value) {
        this.boutique = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the infoPayment property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPayment }
     *     
     */
    public InfoPayment getInfoPayment() {
        return infoPayment;
    }

    /**
     * Sets the value of the infoPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPayment }
     *     
     */
    public void setInfoPayment(InfoPayment value) {
        this.infoPayment = value;
    }

    /**
     * Gets the value of the quantite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantite() {
        return quantite;
    }

    /**
     * Sets the value of the quantite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantite(Integer value) {
        this.quantite = value;
    }

    /**
     * Gets the value of the recette property.
     * 
     * @return
     *     possible object is
     *     {@link Recette }
     *     
     */
    public Recette getRecette() {
        return recette;
    }

    /**
     * Sets the value of the recette property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recette }
     *     
     */
    public void setRecette(Recette value) {
        this.recette = value;
    }

}
