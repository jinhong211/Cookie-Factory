
package DotNetStub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commande" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="boutique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "login",
    "commande",
    "boutique",
    "recette",
    "quantite",
    "time"
})
@XmlRootElement(name = "addHistAccount")
public class AddHistAccount {

    @XmlElementRef(name = "login", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> login;
    protected Integer commande;
    @XmlElementRef(name = "boutique", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> boutique;
    @XmlElementRef(name = "recette", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recette;
    protected Integer quantite;
    @XmlElementRef(name = "time", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time;

    /**
     * Obtient la valeur de la propri�t� login.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogin() {
        return login;
    }

    /**
     * D�finit la valeur de la propri�t� login.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogin(JAXBElement<String> value) {
        this.login = value;
    }

    /**
     * Obtient la valeur de la propri�t� commande.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommande() {
        return commande;
    }

    /**
     * D�finit la valeur de la propri�t� commande.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommande(Integer value) {
        this.commande = value;
    }

    /**
     * Obtient la valeur de la propri�t� boutique.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBoutique() {
        return boutique;
    }

    /**
     * D�finit la valeur de la propri�t� boutique.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBoutique(JAXBElement<String> value) {
        this.boutique = value;
    }

    /**
     * Obtient la valeur de la propri�t� recette.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecette() {
        return recette;
    }

    /**
     * D�finit la valeur de la propri�t� recette.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecette(JAXBElement<String> value) {
        this.recette = value;
    }

    /**
     * Obtient la valeur de la propri�t� quantite.
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
     * D�finit la valeur de la propri�t� quantite.
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
     * Obtient la valeur de la propri�t� time.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime() {
        return time;
    }

    /**
     * D�finit la valeur de la propri�t� time.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime(JAXBElement<String> value) {
        this.time = value;
    }

}
