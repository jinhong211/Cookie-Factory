
package stub;

import java.util.List;
import javax.jws.WebMethod;
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
@WebService(name = "TcfService", targetNamespace = "http://webService.demo.se.polytech.unice.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TcfService {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "allFacon", targetNamespace = "")
    @RequestWrapper(localName = "getAllFacon", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllFacon")
    @ResponseWrapper(localName = "getAllFaconResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllFaconResponse")
    public List<String> getAllFacon();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "allBoutique", targetNamespace = "")
    @RequestWrapper(localName = "getAllBoutique", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllBoutique")
    @ResponseWrapper(localName = "getAllBoutiqueResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllBoutiqueResponse")
    public List<String> getAllBoutique();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "allIngredient", targetNamespace = "")
    @RequestWrapper(localName = "getAllIngredient", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllIngredient")
    @ResponseWrapper(localName = "getAllIngredientResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllIngredientResponse")
    public List<String> getAllIngredient();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "allRettce", targetNamespace = "")
    @RequestWrapper(localName = "getAllRecette", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllRecette")
    @ResponseWrapper(localName = "getAllRecetteResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllRecetteResponse")
    public List<String> getAllRecette();

}
