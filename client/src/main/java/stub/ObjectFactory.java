
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

    private final static QName _CreerRecette_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerRecette");
    private final static QName _CreerPreferenceCompteResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerPreferenceCompteResponse");
    private final static QName _CreerRecetteResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerRecetteResponse");
    private final static QName _CreerPreferenceCompte_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerPreferenceCompte");
    private final static QName _PasserCommand_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "passerCommand");
    private final static QName _PasserCommandResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "passerCommandResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PasserCommandResponse }
     * 
     */
    public PasserCommandResponse createPasserCommandResponse() {
        return new PasserCommandResponse();
    }

    /**
     * Create an instance of {@link PasserCommand }
     * 
     */
    public PasserCommand createPasserCommand() {
        return new PasserCommand();
    }

    /**
     * Create an instance of {@link CreerPreferenceCompte }
     * 
     */
    public CreerPreferenceCompte createCreerPreferenceCompte() {
        return new CreerPreferenceCompte();
    }

    /**
     * Create an instance of {@link CreerRecette }
     * 
     */
    public CreerRecette createCreerRecette() {
        return new CreerRecette();
    }

    /**
     * Create an instance of {@link CreerRecetteResponse }
     * 
     */
    public CreerRecetteResponse createCreerRecetteResponse() {
        return new CreerRecetteResponse();
    }

    /**
     * Create an instance of {@link CreerPreferenceCompteResponse }
     * 
     */
    public CreerPreferenceCompteResponse createCreerPreferenceCompteResponse() {
        return new CreerPreferenceCompteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerRecette }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerRecette")
    public JAXBElement<CreerRecette> createCreerRecette(CreerRecette value) {
        return new JAXBElement<CreerRecette>(_CreerRecette_QNAME, CreerRecette.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerPreferenceCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerPreferenceCompteResponse")
    public JAXBElement<CreerPreferenceCompteResponse> createCreerPreferenceCompteResponse(CreerPreferenceCompteResponse value) {
        return new JAXBElement<CreerPreferenceCompteResponse>(_CreerPreferenceCompteResponse_QNAME, CreerPreferenceCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerRecetteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerRecetteResponse")
    public JAXBElement<CreerRecetteResponse> createCreerRecetteResponse(CreerRecetteResponse value) {
        return new JAXBElement<CreerRecetteResponse>(_CreerRecetteResponse_QNAME, CreerRecetteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerPreferenceCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerPreferenceCompte")
    public JAXBElement<CreerPreferenceCompte> createCreerPreferenceCompte(CreerPreferenceCompte value) {
        return new JAXBElement<CreerPreferenceCompte>(_CreerPreferenceCompte_QNAME, CreerPreferenceCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasserCommand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "passerCommand")
    public JAXBElement<PasserCommand> createPasserCommand(PasserCommand value) {
        return new JAXBElement<PasserCommand>(_PasserCommand_QNAME, PasserCommand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasserCommandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "passerCommandResponse")
    public JAXBElement<PasserCommandResponse> createPasserCommandResponse(PasserCommandResponse value) {
        return new JAXBElement<PasserCommandResponse>(_PasserCommandResponse_QNAME, PasserCommandResponse.class, null, value);
    }

}
