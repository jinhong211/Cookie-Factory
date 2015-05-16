
package stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetListCommande_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getListCommande");
    private final static QName _GetListCommandeResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getListCommandeResponse");
    private final static QName _GetStatistiqueBoutiqueResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getStatistiqueBoutiqueResponse");
    private final static QName _GetStatistiqueBoutique_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getStatistiqueBoutique");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatistiqueBoutique }
     * 
     */
    public GetStatistiqueBoutique createGetStatistiqueBoutique() {
        return new GetStatistiqueBoutique();
    }

    /**
     * Create an instance of {@link GetListCommandeResponse }
     * 
     */
    public GetListCommandeResponse createGetListCommandeResponse() {
        return new GetListCommandeResponse();
    }

    /**
     * Create an instance of {@link GetStatistiqueBoutiqueResponse }
     * 
     */
    public GetStatistiqueBoutiqueResponse createGetStatistiqueBoutiqueResponse() {
        return new GetStatistiqueBoutiqueResponse();
    }

    /**
     * Create an instance of {@link GetListCommande }
     * 
     */
    public GetListCommande createGetListCommande() {
        return new GetListCommande();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCommande }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getListCommande")
    public JAXBElement<GetListCommande> createGetListCommande(GetListCommande value) {
        return new JAXBElement<GetListCommande>(_GetListCommande_QNAME, GetListCommande.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCommandeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getListCommandeResponse")
    public JAXBElement<GetListCommandeResponse> createGetListCommandeResponse(GetListCommandeResponse value) {
        return new JAXBElement<GetListCommandeResponse>(_GetListCommandeResponse_QNAME, GetListCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatistiqueBoutiqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getStatistiqueBoutiqueResponse")
    public JAXBElement<GetStatistiqueBoutiqueResponse> createGetStatistiqueBoutiqueResponse(GetStatistiqueBoutiqueResponse value) {
        return new JAXBElement<GetStatistiqueBoutiqueResponse>(_GetStatistiqueBoutiqueResponse_QNAME, GetStatistiqueBoutiqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatistiqueBoutique }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getStatistiqueBoutique")
    public JAXBElement<GetStatistiqueBoutique> createGetStatistiqueBoutique(GetStatistiqueBoutique value) {
        return new JAXBElement<GetStatistiqueBoutique>(_GetStatistiqueBoutique_QNAME, GetStatistiqueBoutique.class, null, value);
    }

}
