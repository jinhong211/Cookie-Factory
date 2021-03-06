
package stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ClientSansCompteServiceImplService", targetNamespace = "http://www.polytech.unice.fr/ClientSansCompte", wsdlLocation = "http://localhost:8080/demo/webservices/ClientSansCompteServiceImpl?wsdl")
public class ClientSansCompteServiceImplService
    extends Service
{

    private final static URL CLIENTSANSCOMPTESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CLIENTSANSCOMPTESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CLIENTSANSCOMPTESERVICEIMPLSERVICE_QNAME = new QName("http://www.polytech.unice.fr/ClientSansCompte", "ClientSansCompteServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/demo/webservices/ClientSansCompteServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTSANSCOMPTESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CLIENTSANSCOMPTESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ClientSansCompteServiceImplService() {
        super(__getWsdlLocation(), CLIENTSANSCOMPTESERVICEIMPLSERVICE_QNAME);
    }

    public ClientSansCompteServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLIENTSANSCOMPTESERVICEIMPLSERVICE_QNAME, features);
    }

    public ClientSansCompteServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CLIENTSANSCOMPTESERVICEIMPLSERVICE_QNAME);
    }

    public ClientSansCompteServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLIENTSANSCOMPTESERVICEIMPLSERVICE_QNAME, features);
    }

    public ClientSansCompteServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClientSansCompteServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClientSansCompteService
     */
    @WebEndpoint(name = "ClientSansCompteServiceImplPort")
    public ClientSansCompteService getClientSansCompteServiceImplPort() {
        return super.getPort(new QName("http://www.polytech.unice.fr/ClientSansCompte", "ClientSansCompteServiceImplPort"), ClientSansCompteService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClientSansCompteService
     */
    @WebEndpoint(name = "ClientSansCompteServiceImplPort")
    public ClientSansCompteService getClientSansCompteServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.polytech.unice.fr/ClientSansCompte", "ClientSansCompteServiceImplPort"), ClientSansCompteService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTSANSCOMPTESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CLIENTSANSCOMPTESERVICEIMPLSERVICE_EXCEPTION;
        }
        return CLIENTSANSCOMPTESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
