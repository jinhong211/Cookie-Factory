
package stub;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ResponsableBoutiqueService", targetNamespace = "http://webService.demo.se.polytech.unice.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ResponsableBoutiqueService {


    /**
     * 
     * @param addresseBoutique
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "listCommande", targetNamespace = "")
    @RequestWrapper(localName = "getListCommande", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetListCommande")
    @ResponseWrapper(localName = "getListCommandeResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetListCommandeResponse")
    public List<String> getListCommande(
        @WebParam(name = "addresseBoutique", targetNamespace = "")
        String addresseBoutique);

    /**
     * 
     * @param addresseBoutique
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "statistiqueBoutique", targetNamespace = "")
    @RequestWrapper(localName = "getStatistiqueBoutique", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetStatistiqueBoutique")
    @ResponseWrapper(localName = "getStatistiqueBoutiqueResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetStatistiqueBoutiqueResponse")
    public int getStatistiqueBoutique(
        @WebParam(name = "addresseBoutique", targetNamespace = "")
        String addresseBoutique);

}
