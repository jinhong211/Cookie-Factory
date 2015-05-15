
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

    private final static QName _GetRecettePrefereResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getRecettePrefereResponse");
    private final static QName _GetBoutiquePrefere_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getBoutiquePrefere");
    private final static QName _GetBoutiquePrefereResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getBoutiquePrefereResponse");
    private final static QName _GetRecettePrefere_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getRecettePrefere");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBoutiquePrefereResponse }
     * 
     */
    public GetBoutiquePrefereResponse createGetBoutiquePrefereResponse() {
        return new GetBoutiquePrefereResponse();
    }

    /**
     * Create an instance of {@link GetRecettePrefere }
     * 
     */
    public GetRecettePrefere createGetRecettePrefere() {
        return new GetRecettePrefere();
    }

    /**
     * Create an instance of {@link GetRecettePrefereResponse }
     * 
     */
    public GetRecettePrefereResponse createGetRecettePrefereResponse() {
        return new GetRecettePrefereResponse();
    }

    /**
     * Create an instance of {@link GetBoutiquePrefere }
     * 
     */
    public GetBoutiquePrefere createGetBoutiquePrefere() {
        return new GetBoutiquePrefere();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecettePrefereResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getRecettePrefereResponse")
    public JAXBElement<GetRecettePrefereResponse> createGetRecettePrefereResponse(GetRecettePrefereResponse value) {
        return new JAXBElement<GetRecettePrefereResponse>(_GetRecettePrefereResponse_QNAME, GetRecettePrefereResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoutiquePrefere }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getBoutiquePrefere")
    public JAXBElement<GetBoutiquePrefere> createGetBoutiquePrefere(GetBoutiquePrefere value) {
        return new JAXBElement<GetBoutiquePrefere>(_GetBoutiquePrefere_QNAME, GetBoutiquePrefere.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoutiquePrefereResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getBoutiquePrefereResponse")
    public JAXBElement<GetBoutiquePrefereResponse> createGetBoutiquePrefereResponse(GetBoutiquePrefereResponse value) {
        return new JAXBElement<GetBoutiquePrefereResponse>(_GetBoutiquePrefereResponse_QNAME, GetBoutiquePrefereResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecettePrefere }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getRecettePrefere")
    public JAXBElement<GetRecettePrefere> createGetRecettePrefere(GetRecettePrefere value) {
        return new JAXBElement<GetRecettePrefere>(_GetRecettePrefere_QNAME, GetRecettePrefere.class, null, value);
    }

}
