
package stub;

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
@WebService(name = "ResponsableTCFService", targetNamespace = "http://webService.demo.se.polytech.unice.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ResponsableTCFService {


    /**
     * 
     * @param addresseBoutique
     * @param tempsFer
     * @param tax
     * @param tempsOuv
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "creerBoutique", targetNamespace = "")
    @RequestWrapper(localName = "creerBoutique", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerBoutique")
    @ResponseWrapper(localName = "creerBoutiqueResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerBoutiqueResponse")
    public boolean creerBoutique(
        @WebParam(name = "addresseBoutique", targetNamespace = "")
        String addresseBoutique,
        @WebParam(name = "tax", targetNamespace = "")
        double tax,
        @WebParam(name = "tempsOuv", targetNamespace = "")
        int tempsOuv,
        @WebParam(name = "tempsFer", targetNamespace = "")
        int tempsFer);

    /**
     * 
     * @param addresseBoutique
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "existBoutique", targetNamespace = "")
    @RequestWrapper(localName = "boutiqueIsExist", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.BoutiqueIsExist")
    @ResponseWrapper(localName = "boutiqueIsExistResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.BoutiqueIsExistResponse")
    public boolean boutiqueIsExist(
        @WebParam(name = "addresseBoutique", targetNamespace = "")
        String addresseBoutique);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "statistiqueGlobal", targetNamespace = "")
    @RequestWrapper(localName = "getStatistiqueGlobal", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetStatistiqueGlobal")
    @ResponseWrapper(localName = "getStatistiqueGlobalResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetStatistiqueGlobalResponse")
    public int getStatistiqueGlobal();

}
