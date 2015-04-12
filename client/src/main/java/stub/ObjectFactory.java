
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

    private final static QName _CreerCommande_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerCommande");
    private final static QName _CreerRecette_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerRecette");
    private final static QName _ChoisirRecetteResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "choisirRecetteResponse");
    private final static QName _CreerBoutique_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerBoutique");
    private final static QName _CreerInfoPaymentResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerInfoPaymentResponse");
    private final static QName _CreerIngredient_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerIngredient");
    private final static QName _GetAllRecetteResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getAllRecetteResponse");
    private final static QName _CreerFacon_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerFacon");
    private final static QName _ChoisirIngredient_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "choisirIngredient");
    private final static QName _ChoisirBoutique_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "choisirBoutique");
    private final static QName _BoutiqueIsExistResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "boutiqueIsExistResponse");
    private final static QName _ChoisirRecette_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "choisirRecette");
    private final static QName _RecetteIsExistResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "recetteIsExistResponse");
    private final static QName _GetAllIngredientResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getAllIngredientResponse");
    private final static QName _IngredientIsExistResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "ingredientIsExistResponse");
    private final static QName _CreerFaconResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerFaconResponse");
    private final static QName _CreerCommandeResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerCommandeResponse");
    private final static QName _BoutiqueIsExist_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "boutiqueIsExist");
    private final static QName _ChoisirBoutiqueResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "choisirBoutiqueResponse");
    private final static QName _ChoisirFaconResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "choisirFaconResponse");
    private final static QName _GetAllIngredient_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getAllIngredient");
    private final static QName _CreerInfoPayment_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerInfoPayment");
    private final static QName _ChoisirIngredientResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "choisirIngredientResponse");
    private final static QName _GetAllFacon_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getAllFacon");
    private final static QName _FaconIsExist_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "faconIsExist");
    private final static QName _CreerRecetteResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerRecetteResponse");
    private final static QName _CreerBoutiqueResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerBoutiqueResponse");
    private final static QName _RecetteIsExist_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "recetteIsExist");
    private final static QName _FaconIsExistResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "faconIsExistResponse");
    private final static QName _GetAllFaconResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getAllFaconResponse");
    private final static QName _GetAllRecette_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getAllRecette");
    private final static QName _GetAllBoutiqueResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getAllBoutiqueResponse");
    private final static QName _CreerIngredientResponse_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "creerIngredientResponse");
    private final static QName _GetAllBoutique_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "getAllBoutique");
    private final static QName _IngredientIsExist_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "ingredientIsExist");
    private final static QName _ChoisirFacon_QNAME = new QName("http://webService.demo.se.polytech.unice.fr/", "choisirFacon");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChoisirFaconResponse }
     * 
     */
    public ChoisirFaconResponse createChoisirFaconResponse() {
        return new ChoisirFaconResponse();
    }

    /**
     * Create an instance of {@link GetAllIngredient }
     * 
     */
    public GetAllIngredient createGetAllIngredient() {
        return new GetAllIngredient();
    }

    /**
     * Create an instance of {@link ChoisirBoutiqueResponse }
     * 
     */
    public ChoisirBoutiqueResponse createChoisirBoutiqueResponse() {
        return new ChoisirBoutiqueResponse();
    }

    /**
     * Create an instance of {@link CreerInfoPayment }
     * 
     */
    public CreerInfoPayment createCreerInfoPayment() {
        return new CreerInfoPayment();
    }

    /**
     * Create an instance of {@link CreerFaconResponse }
     * 
     */
    public CreerFaconResponse createCreerFaconResponse() {
        return new CreerFaconResponse();
    }

    /**
     * Create an instance of {@link IngredientIsExistResponse }
     * 
     */
    public IngredientIsExistResponse createIngredientIsExistResponse() {
        return new IngredientIsExistResponse();
    }

    /**
     * Create an instance of {@link BoutiqueIsExist }
     * 
     */
    public BoutiqueIsExist createBoutiqueIsExist() {
        return new BoutiqueIsExist();
    }

    /**
     * Create an instance of {@link CreerCommandeResponse }
     * 
     */
    public CreerCommandeResponse createCreerCommandeResponse() {
        return new CreerCommandeResponse();
    }

    /**
     * Create an instance of {@link CreerFacon }
     * 
     */
    public CreerFacon createCreerFacon() {
        return new CreerFacon();
    }

    /**
     * Create an instance of {@link GetAllRecetteResponse }
     * 
     */
    public GetAllRecetteResponse createGetAllRecetteResponse() {
        return new GetAllRecetteResponse();
    }

    /**
     * Create an instance of {@link RecetteIsExistResponse }
     * 
     */
    public RecetteIsExistResponse createRecetteIsExistResponse() {
        return new RecetteIsExistResponse();
    }

    /**
     * Create an instance of {@link ChoisirRecette }
     * 
     */
    public ChoisirRecette createChoisirRecette() {
        return new ChoisirRecette();
    }

    /**
     * Create an instance of {@link GetAllIngredientResponse }
     * 
     */
    public GetAllIngredientResponse createGetAllIngredientResponse() {
        return new GetAllIngredientResponse();
    }

    /**
     * Create an instance of {@link ChoisirIngredient }
     * 
     */
    public ChoisirIngredient createChoisirIngredient() {
        return new ChoisirIngredient();
    }

    /**
     * Create an instance of {@link ChoisirBoutique }
     * 
     */
    public ChoisirBoutique createChoisirBoutique() {
        return new ChoisirBoutique();
    }

    /**
     * Create an instance of {@link BoutiqueIsExistResponse }
     * 
     */
    public BoutiqueIsExistResponse createBoutiqueIsExistResponse() {
        return new BoutiqueIsExistResponse();
    }

    /**
     * Create an instance of {@link CreerBoutique }
     * 
     */
    public CreerBoutique createCreerBoutique() {
        return new CreerBoutique();
    }

    /**
     * Create an instance of {@link CreerCommande }
     * 
     */
    public CreerCommande createCreerCommande() {
        return new CreerCommande();
    }

    /**
     * Create an instance of {@link CreerRecette }
     * 
     */
    public CreerRecette createCreerRecette() {
        return new CreerRecette();
    }

    /**
     * Create an instance of {@link ChoisirRecetteResponse }
     * 
     */
    public ChoisirRecetteResponse createChoisirRecetteResponse() {
        return new ChoisirRecetteResponse();
    }

    /**
     * Create an instance of {@link CreerInfoPaymentResponse }
     * 
     */
    public CreerInfoPaymentResponse createCreerInfoPaymentResponse() {
        return new CreerInfoPaymentResponse();
    }

    /**
     * Create an instance of {@link CreerIngredient }
     * 
     */
    public CreerIngredient createCreerIngredient() {
        return new CreerIngredient();
    }

    /**
     * Create an instance of {@link IngredientIsExist }
     * 
     */
    public IngredientIsExist createIngredientIsExist() {
        return new IngredientIsExist();
    }

    /**
     * Create an instance of {@link ChoisirFacon }
     * 
     */
    public ChoisirFacon createChoisirFacon() {
        return new ChoisirFacon();
    }

    /**
     * Create an instance of {@link GetAllRecette }
     * 
     */
    public GetAllRecette createGetAllRecette() {
        return new GetAllRecette();
    }

    /**
     * Create an instance of {@link GetAllBoutique }
     * 
     */
    public GetAllBoutique createGetAllBoutique() {
        return new GetAllBoutique();
    }

    /**
     * Create an instance of {@link CreerIngredientResponse }
     * 
     */
    public CreerIngredientResponse createCreerIngredientResponse() {
        return new CreerIngredientResponse();
    }

    /**
     * Create an instance of {@link GetAllBoutiqueResponse }
     * 
     */
    public GetAllBoutiqueResponse createGetAllBoutiqueResponse() {
        return new GetAllBoutiqueResponse();
    }

    /**
     * Create an instance of {@link GetAllFaconResponse }
     * 
     */
    public GetAllFaconResponse createGetAllFaconResponse() {
        return new GetAllFaconResponse();
    }

    /**
     * Create an instance of {@link FaconIsExistResponse }
     * 
     */
    public FaconIsExistResponse createFaconIsExistResponse() {
        return new FaconIsExistResponse();
    }

    /**
     * Create an instance of {@link CreerBoutiqueResponse }
     * 
     */
    public CreerBoutiqueResponse createCreerBoutiqueResponse() {
        return new CreerBoutiqueResponse();
    }

    /**
     * Create an instance of {@link RecetteIsExist }
     * 
     */
    public RecetteIsExist createRecetteIsExist() {
        return new RecetteIsExist();
    }

    /**
     * Create an instance of {@link GetAllFacon }
     * 
     */
    public GetAllFacon createGetAllFacon() {
        return new GetAllFacon();
    }

    /**
     * Create an instance of {@link CreerRecetteResponse }
     * 
     */
    public CreerRecetteResponse createCreerRecetteResponse() {
        return new CreerRecetteResponse();
    }

    /**
     * Create an instance of {@link FaconIsExist }
     * 
     */
    public FaconIsExist createFaconIsExist() {
        return new FaconIsExist();
    }

    /**
     * Create an instance of {@link ChoisirIngredientResponse }
     * 
     */
    public ChoisirIngredientResponse createChoisirIngredientResponse() {
        return new ChoisirIngredientResponse();
    }

    /**
     * Create an instance of {@link Recette }
     * 
     */
    public Recette createRecette() {
        return new Recette();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link Ingredient }
     * 
     */
    public Ingredient createIngredient() {
        return new Ingredient();
    }

    /**
     * Create an instance of {@link Boutique }
     * 
     */
    public Boutique createBoutique() {
        return new Boutique();
    }

    /**
     * Create an instance of {@link InfoPayment }
     * 
     */
    public InfoPayment createInfoPayment() {
        return new InfoPayment();
    }

    /**
     * Create an instance of {@link Facon }
     * 
     */
    public Facon createFacon() {
        return new Facon();
    }

    /**
     * Create an instance of {@link HoraireVente }
     * 
     */
    public HoraireVente createHoraireVente() {
        return new HoraireVente();
    }

    /**
     * Create an instance of {@link Preference }
     * 
     */
    public Preference createPreference() {
        return new Preference();
    }

    /**
     * Create an instance of {@link HoraireAtlier }
     * 
     */
    public HoraireAtlier createHoraireAtlier() {
        return new HoraireAtlier();
    }

    /**
     * Create an instance of {@link Commande }
     * 
     */
    public Commande createCommande() {
        return new Commande();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerCommande }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerCommande")
    public JAXBElement<CreerCommande> createCreerCommande(CreerCommande value) {
        return new JAXBElement<CreerCommande>(_CreerCommande_QNAME, CreerCommande.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirRecetteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "choisirRecetteResponse")
    public JAXBElement<ChoisirRecetteResponse> createChoisirRecetteResponse(ChoisirRecetteResponse value) {
        return new JAXBElement<ChoisirRecetteResponse>(_ChoisirRecetteResponse_QNAME, ChoisirRecetteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerBoutique }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerBoutique")
    public JAXBElement<CreerBoutique> createCreerBoutique(CreerBoutique value) {
        return new JAXBElement<CreerBoutique>(_CreerBoutique_QNAME, CreerBoutique.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerInfoPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerInfoPaymentResponse")
    public JAXBElement<CreerInfoPaymentResponse> createCreerInfoPaymentResponse(CreerInfoPaymentResponse value) {
        return new JAXBElement<CreerInfoPaymentResponse>(_CreerInfoPaymentResponse_QNAME, CreerInfoPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerIngredient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerIngredient")
    public JAXBElement<CreerIngredient> createCreerIngredient(CreerIngredient value) {
        return new JAXBElement<CreerIngredient>(_CreerIngredient_QNAME, CreerIngredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRecetteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getAllRecetteResponse")
    public JAXBElement<GetAllRecetteResponse> createGetAllRecetteResponse(GetAllRecetteResponse value) {
        return new JAXBElement<GetAllRecetteResponse>(_GetAllRecetteResponse_QNAME, GetAllRecetteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerFacon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerFacon")
    public JAXBElement<CreerFacon> createCreerFacon(CreerFacon value) {
        return new JAXBElement<CreerFacon>(_CreerFacon_QNAME, CreerFacon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirIngredient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "choisirIngredient")
    public JAXBElement<ChoisirIngredient> createChoisirIngredient(ChoisirIngredient value) {
        return new JAXBElement<ChoisirIngredient>(_ChoisirIngredient_QNAME, ChoisirIngredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirBoutique }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "choisirBoutique")
    public JAXBElement<ChoisirBoutique> createChoisirBoutique(ChoisirBoutique value) {
        return new JAXBElement<ChoisirBoutique>(_ChoisirBoutique_QNAME, ChoisirBoutique.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoutiqueIsExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "boutiqueIsExistResponse")
    public JAXBElement<BoutiqueIsExistResponse> createBoutiqueIsExistResponse(BoutiqueIsExistResponse value) {
        return new JAXBElement<BoutiqueIsExistResponse>(_BoutiqueIsExistResponse_QNAME, BoutiqueIsExistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirRecette }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "choisirRecette")
    public JAXBElement<ChoisirRecette> createChoisirRecette(ChoisirRecette value) {
        return new JAXBElement<ChoisirRecette>(_ChoisirRecette_QNAME, ChoisirRecette.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecetteIsExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "recetteIsExistResponse")
    public JAXBElement<RecetteIsExistResponse> createRecetteIsExistResponse(RecetteIsExistResponse value) {
        return new JAXBElement<RecetteIsExistResponse>(_RecetteIsExistResponse_QNAME, RecetteIsExistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIngredientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getAllIngredientResponse")
    public JAXBElement<GetAllIngredientResponse> createGetAllIngredientResponse(GetAllIngredientResponse value) {
        return new JAXBElement<GetAllIngredientResponse>(_GetAllIngredientResponse_QNAME, GetAllIngredientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngredientIsExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "ingredientIsExistResponse")
    public JAXBElement<IngredientIsExistResponse> createIngredientIsExistResponse(IngredientIsExistResponse value) {
        return new JAXBElement<IngredientIsExistResponse>(_IngredientIsExistResponse_QNAME, IngredientIsExistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerFaconResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerFaconResponse")
    public JAXBElement<CreerFaconResponse> createCreerFaconResponse(CreerFaconResponse value) {
        return new JAXBElement<CreerFaconResponse>(_CreerFaconResponse_QNAME, CreerFaconResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerCommandeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerCommandeResponse")
    public JAXBElement<CreerCommandeResponse> createCreerCommandeResponse(CreerCommandeResponse value) {
        return new JAXBElement<CreerCommandeResponse>(_CreerCommandeResponse_QNAME, CreerCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoutiqueIsExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "boutiqueIsExist")
    public JAXBElement<BoutiqueIsExist> createBoutiqueIsExist(BoutiqueIsExist value) {
        return new JAXBElement<BoutiqueIsExist>(_BoutiqueIsExist_QNAME, BoutiqueIsExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirBoutiqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "choisirBoutiqueResponse")
    public JAXBElement<ChoisirBoutiqueResponse> createChoisirBoutiqueResponse(ChoisirBoutiqueResponse value) {
        return new JAXBElement<ChoisirBoutiqueResponse>(_ChoisirBoutiqueResponse_QNAME, ChoisirBoutiqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirFaconResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "choisirFaconResponse")
    public JAXBElement<ChoisirFaconResponse> createChoisirFaconResponse(ChoisirFaconResponse value) {
        return new JAXBElement<ChoisirFaconResponse>(_ChoisirFaconResponse_QNAME, ChoisirFaconResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIngredient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getAllIngredient")
    public JAXBElement<GetAllIngredient> createGetAllIngredient(GetAllIngredient value) {
        return new JAXBElement<GetAllIngredient>(_GetAllIngredient_QNAME, GetAllIngredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerInfoPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerInfoPayment")
    public JAXBElement<CreerInfoPayment> createCreerInfoPayment(CreerInfoPayment value) {
        return new JAXBElement<CreerInfoPayment>(_CreerInfoPayment_QNAME, CreerInfoPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirIngredientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "choisirIngredientResponse")
    public JAXBElement<ChoisirIngredientResponse> createChoisirIngredientResponse(ChoisirIngredientResponse value) {
        return new JAXBElement<ChoisirIngredientResponse>(_ChoisirIngredientResponse_QNAME, ChoisirIngredientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFacon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getAllFacon")
    public JAXBElement<GetAllFacon> createGetAllFacon(GetAllFacon value) {
        return new JAXBElement<GetAllFacon>(_GetAllFacon_QNAME, GetAllFacon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaconIsExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "faconIsExist")
    public JAXBElement<FaconIsExist> createFaconIsExist(FaconIsExist value) {
        return new JAXBElement<FaconIsExist>(_FaconIsExist_QNAME, FaconIsExist.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerBoutiqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerBoutiqueResponse")
    public JAXBElement<CreerBoutiqueResponse> createCreerBoutiqueResponse(CreerBoutiqueResponse value) {
        return new JAXBElement<CreerBoutiqueResponse>(_CreerBoutiqueResponse_QNAME, CreerBoutiqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecetteIsExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "recetteIsExist")
    public JAXBElement<RecetteIsExist> createRecetteIsExist(RecetteIsExist value) {
        return new JAXBElement<RecetteIsExist>(_RecetteIsExist_QNAME, RecetteIsExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaconIsExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "faconIsExistResponse")
    public JAXBElement<FaconIsExistResponse> createFaconIsExistResponse(FaconIsExistResponse value) {
        return new JAXBElement<FaconIsExistResponse>(_FaconIsExistResponse_QNAME, FaconIsExistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFaconResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getAllFaconResponse")
    public JAXBElement<GetAllFaconResponse> createGetAllFaconResponse(GetAllFaconResponse value) {
        return new JAXBElement<GetAllFaconResponse>(_GetAllFaconResponse_QNAME, GetAllFaconResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRecette }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getAllRecette")
    public JAXBElement<GetAllRecette> createGetAllRecette(GetAllRecette value) {
        return new JAXBElement<GetAllRecette>(_GetAllRecette_QNAME, GetAllRecette.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBoutiqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getAllBoutiqueResponse")
    public JAXBElement<GetAllBoutiqueResponse> createGetAllBoutiqueResponse(GetAllBoutiqueResponse value) {
        return new JAXBElement<GetAllBoutiqueResponse>(_GetAllBoutiqueResponse_QNAME, GetAllBoutiqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerIngredientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "creerIngredientResponse")
    public JAXBElement<CreerIngredientResponse> createCreerIngredientResponse(CreerIngredientResponse value) {
        return new JAXBElement<CreerIngredientResponse>(_CreerIngredientResponse_QNAME, CreerIngredientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBoutique }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "getAllBoutique")
    public JAXBElement<GetAllBoutique> createGetAllBoutique(GetAllBoutique value) {
        return new JAXBElement<GetAllBoutique>(_GetAllBoutique_QNAME, GetAllBoutique.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngredientIsExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "ingredientIsExist")
    public JAXBElement<IngredientIsExist> createIngredientIsExist(IngredientIsExist value) {
        return new JAXBElement<IngredientIsExist>(_IngredientIsExist_QNAME, IngredientIsExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirFacon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.demo.se.polytech.unice.fr/", name = "choisirFacon")
    public JAXBElement<ChoisirFacon> createChoisirFacon(ChoisirFacon value) {
        return new JAXBElement<ChoisirFacon>(_ChoisirFacon_QNAME, ChoisirFacon.class, null, value);
    }

}
