
package stub;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
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
     * @param nomRette
     * @param faconSet
     * @param ingredientSet
     * @return
     *     returns stub.Recette
     */
    @WebMethod
    @WebResult(name = "creerRette", targetNamespace = "")
    @RequestWrapper(localName = "creerRecette", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerRecette")
    @ResponseWrapper(localName = "creerRecetteResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerRecetteResponse")
    public Recette creerRecette(
        @WebParam(name = "nomRette", targetNamespace = "")
        String nomRette,
        @WebParam(name = "ingredientSet", targetNamespace = "")
        List<Ingredient> ingredientSet,
        @WebParam(name = "faconSet", targetNamespace = "")
        List<Facon> faconSet);

    /**
     * 
     * @param prixIngredient
     * @param nomIngredient
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "creerIngredient", targetNamespace = "")
    @RequestWrapper(localName = "creerIngredient", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerIngredient")
    @ResponseWrapper(localName = "creerIngredientResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerIngredientResponse")
    public boolean creerIngredient(
        @WebParam(name = "nomIngredient", targetNamespace = "")
        String nomIngredient,
        @WebParam(name = "prixIngredient", targetNamespace = "")
        double prixIngredient);

    /**
     * 
     * @param nomRette
     * @return
     *     returns stub.Recette
     */
    @WebMethod
    @WebResult(name = "choisirRette", targetNamespace = "")
    @RequestWrapper(localName = "choisirRecette", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.ChoisirRecette")
    @ResponseWrapper(localName = "choisirRecetteResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.ChoisirRecetteResponse")
    public Recette choisirRecette(
        @WebParam(name = "nomRette", targetNamespace = "")
        String nomRette);

    /**
     * 
     * @param nomFacon
     * @param prixIngredient
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "creerFacon", targetNamespace = "")
    @RequestWrapper(localName = "creerFacon", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerFacon")
    @ResponseWrapper(localName = "creerFaconResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerFaconResponse")
    public boolean creerFacon(
        @WebParam(name = "nomFacon", targetNamespace = "")
        String nomFacon,
        @WebParam(name = "prixIngredient", targetNamespace = "")
        double prixIngredient);

    /**
     * 
     * @return
     *     returns java.util.List<stub.Facon>
     */
    @WebMethod
    @WebResult(name = "allFacon", targetNamespace = "")
    @RequestWrapper(localName = "getAllFacon", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllFacon")
    @ResponseWrapper(localName = "getAllFaconResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllFaconResponse")
    public List<Facon> getAllFacon();

    /**
     * 
     * @param nomFacon
     * @return
     *     returns stub.Facon
     */
    @WebMethod
    @WebResult(name = "choisirFacon", targetNamespace = "")
    @RequestWrapper(localName = "choisirFacon", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.ChoisirFacon")
    @ResponseWrapper(localName = "choisirFaconResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.ChoisirFaconResponse")
    public Facon choisirFacon(
        @WebParam(name = "nomFacon", targetNamespace = "")
        String nomFacon);

    /**
     * 
     * @param nomIngredient
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "existIngredient", targetNamespace = "")
    @RequestWrapper(localName = "ingredientIsExist", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.IngredientIsExist")
    @ResponseWrapper(localName = "ingredientIsExistResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.IngredientIsExistResponse")
    public boolean ingredientIsExist(
        @WebParam(name = "nomIngredient", targetNamespace = "")
        String nomIngredient);

    /**
     * 
     * @param tempsOuv
     * @param tax
     * @param addresseBoutique
     * @param tempsFer
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
     * @param nomFacon
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "existFacon", targetNamespace = "")
    @RequestWrapper(localName = "faconIsExist", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.FaconIsExist")
    @ResponseWrapper(localName = "faconIsExistResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.FaconIsExistResponse")
    public boolean faconIsExist(
        @WebParam(name = "nomFacon", targetNamespace = "")
        String nomFacon);

    /**
     * 
     * @param nomRette
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "existRette", targetNamespace = "")
    @RequestWrapper(localName = "recetteIsExist", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.RecetteIsExist")
    @ResponseWrapper(localName = "recetteIsExistResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.RecetteIsExistResponse")
    public boolean recetteIsExist(
        @WebParam(name = "nomRette", targetNamespace = "")
        String nomRette);

    /**
     * 
     * @return
     *     returns java.util.List<stub.Recette>
     */
    @WebMethod
    @WebResult(name = "allRette", targetNamespace = "")
    @RequestWrapper(localName = "getAllRecette", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllRecette")
    @ResponseWrapper(localName = "getAllRecetteResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllRecetteResponse")
    public List<Recette> getAllRecette();

    /**
     * 
     * @return
     *     returns java.util.List<stub.Ingredient>
     */
    @WebMethod
    @WebResult(name = "allIngredient", targetNamespace = "")
    @RequestWrapper(localName = "getAllIngredient", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllIngredient")
    @ResponseWrapper(localName = "getAllIngredientResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllIngredientResponse")
    public List<Ingredient> getAllIngredient();

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
     *     returns java.util.List<stub.Boutique>
     */
    @WebMethod
    @WebResult(name = "allBoutique", targetNamespace = "")
    @RequestWrapper(localName = "getAllBoutique", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllBoutique")
    @ResponseWrapper(localName = "getAllBoutiqueResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.GetAllBoutiqueResponse")
    public List<Boutique> getAllBoutique();

    /**
     * 
     * @param addresseBoutique
     * @return
     *     returns stub.Boutique
     */
    @WebMethod
    @WebResult(name = "choisirBoutique", targetNamespace = "")
    @RequestWrapper(localName = "choisirBoutique", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.ChoisirBoutique")
    @ResponseWrapper(localName = "choisirBoutiqueResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.ChoisirBoutiqueResponse")
    public Boutique choisirBoutique(
        @WebParam(name = "addresseBoutique", targetNamespace = "")
        String addresseBoutique);

    /**
     * 
     * @param nomIngredient
     * @return
     *     returns stub.Ingredient
     */
    @WebMethod
    @WebResult(name = "choisirIngredient", targetNamespace = "")
    @RequestWrapper(localName = "choisirIngredient", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.ChoisirIngredient")
    @ResponseWrapper(localName = "choisirIngredientResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.ChoisirIngredientResponse")
    public Ingredient choisirIngredient(
        @WebParam(name = "nomIngredient", targetNamespace = "")
        String nomIngredient);

    /**
     * 
     * @param nomClient
     * @param addresseClient
     * @param compteBanque
     * @return
     *     returns stub.InfoPayment
     */
    @WebMethod
    @WebResult(name = "creerInfoPayment", targetNamespace = "")
    @RequestWrapper(localName = "creerInfoPayment", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerInfoPayment")
    @ResponseWrapper(localName = "creerInfoPaymentResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerInfoPaymentResponse")
    public InfoPayment creerInfoPayment(
        @WebParam(name = "nomClient", targetNamespace = "")
        String nomClient,
        @WebParam(name = "addresseClient", targetNamespace = "")
        String addresseClient,
        @WebParam(name = "compteBanque", targetNamespace = "")
        String compteBanque);

    /**
     * 
     * @param recette
     * @param quantite
     * @param date
     * @param boutique
     * @param infoPayment
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "creerCommande", targetNamespace = "")
    @RequestWrapper(localName = "creerCommande", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerCommande")
    @ResponseWrapper(localName = "creerCommandeResponse", targetNamespace = "http://webService.demo.se.polytech.unice.fr/", className = "stub.CreerCommandeResponse")
    public boolean creerCommande(
        @WebParam(name = "boutique", targetNamespace = "")
        Boutique boutique,
        @WebParam(name = "recette", targetNamespace = "")
        Recette recette,
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date,
        @WebParam(name = "quantite", targetNamespace = "")
        Integer quantite,
        @WebParam(name = "infoPayment", targetNamespace = "")
        InfoPayment infoPayment);

}
