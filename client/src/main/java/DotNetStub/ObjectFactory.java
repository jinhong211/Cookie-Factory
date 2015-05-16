
package DotNetStub;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DotNetStub package. 
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

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _LoginAccountPassward_QNAME = new QName("http://tempuri.org/", "passward");
    private final static QName _LoginAccountLogin_QNAME = new QName("http://tempuri.org/", "login");
    private final static QName _GetListHistoriqueUserResponseGetListHistoriqueUserResult_QNAME = new QName("http://tempuri.org/", "getListHistoriqueUserResult");
    private final static QName _CreateAccountResponseCreateAccountResult_QNAME = new QName("http://tempuri.org/", "createAccountResult");
    private final static QName _DeleteAccountResponseDeleteAccountResult_QNAME = new QName("http://tempuri.org/", "deleteAccountResult");
    private final static QName _AddHistAccountResponseAddHistAccountResult_QNAME = new QName("http://tempuri.org/", "addHistAccountResult");
    private final static QName _GetListInfoAccountResponseGetListInfoAccountResult_QNAME = new QName("http://tempuri.org/", "getListInfoAccountResult");
    private final static QName _UpdateAccountResponseUpdateAccountResult_QNAME = new QName("http://tempuri.org/", "updateAccountResult");
    private final static QName _UpdateAccountType_QNAME = new QName("http://tempuri.org/", "type");
    private final static QName _PaymentResponsePaymentResult_QNAME = new QName("http://tempuri.org/", "paymentResult");
    private final static QName _GetRolesUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _UpdateInfoAccountAddress_QNAME = new QName("http://tempuri.org/", "address");
    private final static QName _GetInfoAccountResponseGetInfoAccountResult_QNAME = new QName("http://tempuri.org/", "getInfoAccountResult");
    private final static QName _GetListAccountResponseGetListAccountResult_QNAME = new QName("http://tempuri.org/", "getListAccountResult");
    private final static QName _LoginAccountResponseLoginAccountResult_QNAME = new QName("http://tempuri.org/", "loginAccountResult");
    private final static QName _AddHistAccountRecette_QNAME = new QName("http://tempuri.org/", "recette");
    private final static QName _AddHistAccountBoutique_QNAME = new QName("http://tempuri.org/", "boutique");
    private final static QName _AddHistAccountTime_QNAME = new QName("http://tempuri.org/", "time");
    private final static QName _PaymentRole_QNAME = new QName("http://tempuri.org/", "role");
    private final static QName _DeleteInfoAccountResponseDeleteInfoAccountResult_QNAME = new QName("http://tempuri.org/", "deleteInfoAccountResult");
    private final static QName _AddInfoAccountResponseAddInfoAccountResult_QNAME = new QName("http://tempuri.org/", "addInfoAccountResult");
    private final static QName _GetListHistoriqueResponseGetListHistoriqueResult_QNAME = new QName("http://tempuri.org/", "getListHistoriqueResult");
    private final static QName _GetRolesResponseGetRolesResult_QNAME = new QName("http://tempuri.org/", "getRolesResult");
    private final static QName _UpdateInfoAccountResponseUpdateInfoAccountResult_QNAME = new QName("http://tempuri.org/", "updateInfoAccountResult");
    private final static QName _AddInfoAccountNom_QNAME = new QName("http://tempuri.org/", "nom");
    private final static QName _AddInfoAccountPrenom_QNAME = new QName("http://tempuri.org/", "prenom");
    private final static QName _AddInfoAccountExp_QNAME = new QName("http://tempuri.org/", "exp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DotNetStub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteAccountResponse }
     * 
     */
    public DeleteAccountResponse createDeleteAccountResponse() {
        return new DeleteAccountResponse();
    }

    /**
     * Create an instance of {@link LoginAccount }
     * 
     */
    public LoginAccount createLoginAccount() {
        return new LoginAccount();
    }

    /**
     * Create an instance of {@link GetListHistoriqueUserResponse }
     * 
     */
    public GetListHistoriqueUserResponse createGetListHistoriqueUserResponse() {
        return new GetListHistoriqueUserResponse();
    }

    /**
     * Create an instance of {@link UpdateInfoAccountResponse }
     * 
     */
    public UpdateInfoAccountResponse createUpdateInfoAccountResponse() {
        return new UpdateInfoAccountResponse();
    }

    /**
     * Create an instance of {@link AddHistAccountResponse }
     * 
     */
    public AddHistAccountResponse createAddHistAccountResponse() {
        return new AddHistAccountResponse();
    }

    /**
     * Create an instance of {@link GetInfoAccount }
     * 
     */
    public GetInfoAccount createGetInfoAccount() {
        return new GetInfoAccount();
    }

    /**
     * Create an instance of {@link UpdateAccount }
     * 
     */
    public UpdateAccount createUpdateAccount() {
        return new UpdateAccount();
    }

    /**
     * Create an instance of {@link GetIDResponse }
     * 
     */
    public GetIDResponse createGetIDResponse() {
        return new GetIDResponse();
    }

    /**
     * Create an instance of {@link DeleteInfoAccountResponse }
     * 
     */
    public DeleteInfoAccountResponse createDeleteInfoAccountResponse() {
        return new DeleteInfoAccountResponse();
    }

    /**
     * Create an instance of {@link GetInfoAccountResponse }
     * 
     */
    public GetInfoAccountResponse createGetInfoAccountResponse() {
        return new GetInfoAccountResponse();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link DeleteInfoAccount }
     * 
     */
    public DeleteInfoAccount createDeleteInfoAccount() {
        return new DeleteInfoAccount();
    }

    /**
     * Create an instance of {@link GetListInfoAccountResponse }
     * 
     */
    public GetListInfoAccountResponse createGetListInfoAccountResponse() {
        return new GetListInfoAccountResponse();
    }

    /**
     * Create an instance of {@link GetListInfoAccount }
     * 
     */
    public GetListInfoAccount createGetListInfoAccount() {
        return new GetListInfoAccount();
    }

    /**
     * Create an instance of {@link GetListHistorique }
     * 
     */
    public GetListHistorique createGetListHistorique() {
        return new GetListHistorique();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link DeleteAccount }
     * 
     */
    public DeleteAccount createDeleteAccount() {
        return new DeleteAccount();
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link UpdateAccountResponse }
     * 
     */
    public UpdateAccountResponse createUpdateAccountResponse() {
        return new UpdateAccountResponse();
    }

    /**
     * Create an instance of {@link LoginAccountResponse }
     * 
     */
    public LoginAccountResponse createLoginAccountResponse() {
        return new LoginAccountResponse();
    }

    /**
     * Create an instance of {@link GetListHistoriqueUser }
     * 
     */
    public GetListHistoriqueUser createGetListHistoriqueUser() {
        return new GetListHistoriqueUser();
    }

    /**
     * Create an instance of {@link AddInfoAccount }
     * 
     */
    public AddInfoAccount createAddInfoAccount() {
        return new AddInfoAccount();
    }

    /**
     * Create an instance of {@link GetID }
     * 
     */
    public GetID createGetID() {
        return new GetID();
    }

    /**
     * Create an instance of {@link GetListHistoriqueResponse }
     * 
     */
    public GetListHistoriqueResponse createGetListHistoriqueResponse() {
        return new GetListHistoriqueResponse();
    }

    /**
     * Create an instance of {@link AddHistAccount }
     * 
     */
    public AddHistAccount createAddHistAccount() {
        return new AddHistAccount();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link AddInfoAccountResponse }
     * 
     */
    public AddInfoAccountResponse createAddInfoAccountResponse() {
        return new AddInfoAccountResponse();
    }

    /**
     * Create an instance of {@link UpdateInfoAccount }
     * 
     */
    public UpdateInfoAccount createUpdateInfoAccount() {
        return new UpdateInfoAccount();
    }

    /**
     * Create an instance of {@link GetListAccountResponse }
     * 
     */
    public GetListAccountResponse createGetListAccountResponse() {
        return new GetListAccountResponse();
    }

    /**
     * Create an instance of {@link GetListAccount }
     * 
     */
    public GetListAccount createGetListAccount() {
        return new GetListAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "passward", scope = LoginAccount.class)
    public JAXBElement<String> createLoginAccountPassward(String value) {
        return new JAXBElement<String>(_LoginAccountPassward_QNAME, String.class, LoginAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = LoginAccount.class)
    public JAXBElement<String> createLoginAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, LoginAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getListHistoriqueUserResult", scope = GetListHistoriqueUserResponse.class)
    public JAXBElement<String> createGetListHistoriqueUserResponseGetListHistoriqueUserResult(String value) {
        return new JAXBElement<String>(_GetListHistoriqueUserResponseGetListHistoriqueUserResult_QNAME, String.class, GetListHistoriqueUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "createAccountResult", scope = CreateAccountResponse.class)
    public JAXBElement<String> createCreateAccountResponseCreateAccountResult(String value) {
        return new JAXBElement<String>(_CreateAccountResponseCreateAccountResult_QNAME, String.class, CreateAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "deleteAccountResult", scope = DeleteAccountResponse.class)
    public JAXBElement<String> createDeleteAccountResponseDeleteAccountResult(String value) {
        return new JAXBElement<String>(_DeleteAccountResponseDeleteAccountResult_QNAME, String.class, DeleteAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "addHistAccountResult", scope = AddHistAccountResponse.class)
    public JAXBElement<String> createAddHistAccountResponseAddHistAccountResult(String value) {
        return new JAXBElement<String>(_AddHistAccountResponseAddHistAccountResult_QNAME, String.class, AddHistAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = GetListInfoAccount.class)
    public JAXBElement<String> createGetListInfoAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, GetListInfoAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getListInfoAccountResult", scope = GetListInfoAccountResponse.class)
    public JAXBElement<String> createGetListInfoAccountResponseGetListInfoAccountResult(String value) {
        return new JAXBElement<String>(_GetListInfoAccountResponseGetListInfoAccountResult_QNAME, String.class, GetListInfoAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "updateAccountResult", scope = UpdateAccountResponse.class)
    public JAXBElement<String> createUpdateAccountResponseUpdateAccountResult(String value) {
        return new JAXBElement<String>(_UpdateAccountResponseUpdateAccountResult_QNAME, String.class, UpdateAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "passward", scope = UpdateAccount.class)
    public JAXBElement<String> createUpdateAccountPassward(String value) {
        return new JAXBElement<String>(_LoginAccountPassward_QNAME, String.class, UpdateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = UpdateAccount.class)
    public JAXBElement<String> createUpdateAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, UpdateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "type", scope = UpdateAccount.class)
    public JAXBElement<String> createUpdateAccountType(String value) {
        return new JAXBElement<String>(_UpdateAccountType_QNAME, String.class, UpdateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "passward", scope = CreateAccount.class)
    public JAXBElement<String> createCreateAccountPassward(String value) {
        return new JAXBElement<String>(_LoginAccountPassward_QNAME, String.class, CreateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = CreateAccount.class)
    public JAXBElement<String> createCreateAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, CreateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "type", scope = CreateAccount.class)
    public JAXBElement<String> createCreateAccountType(String value) {
        return new JAXBElement<String>(_UpdateAccountType_QNAME, String.class, CreateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paymentResult", scope = PaymentResponse.class)
    public JAXBElement<String> createPaymentResponsePaymentResult(String value) {
        return new JAXBElement<String>(_PaymentResponsePaymentResult_QNAME, String.class, PaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetRoles.class)
    public JAXBElement<String> createGetRolesUsername(String value) {
        return new JAXBElement<String>(_GetRolesUsername_QNAME, String.class, GetRoles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = GetInfoAccount.class)
    public JAXBElement<String> createGetInfoAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, GetInfoAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "address", scope = UpdateInfoAccount.class)
    public JAXBElement<String> createUpdateInfoAccountAddress(String value) {
        return new JAXBElement<String>(_UpdateInfoAccountAddress_QNAME, String.class, UpdateInfoAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = UpdateInfoAccount.class)
    public JAXBElement<String> createUpdateInfoAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, UpdateInfoAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getInfoAccountResult", scope = GetInfoAccountResponse.class)
    public JAXBElement<String> createGetInfoAccountResponseGetInfoAccountResult(String value) {
        return new JAXBElement<String>(_GetInfoAccountResponseGetInfoAccountResult_QNAME, String.class, GetInfoAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = DeleteInfoAccount.class)
    public JAXBElement<String> createDeleteInfoAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, DeleteInfoAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getListAccountResult", scope = GetListAccountResponse.class)
    public JAXBElement<String> createGetListAccountResponseGetListAccountResult(String value) {
        return new JAXBElement<String>(_GetListAccountResponseGetListAccountResult_QNAME, String.class, GetListAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginAccountResult", scope = LoginAccountResponse.class)
    public JAXBElement<String> createLoginAccountResponseLoginAccountResult(String value) {
        return new JAXBElement<String>(_LoginAccountResponseLoginAccountResult_QNAME, String.class, LoginAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "recette", scope = AddHistAccount.class)
    public JAXBElement<String> createAddHistAccountRecette(String value) {
        return new JAXBElement<String>(_AddHistAccountRecette_QNAME, String.class, AddHistAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "boutique", scope = AddHistAccount.class)
    public JAXBElement<String> createAddHistAccountBoutique(String value) {
        return new JAXBElement<String>(_AddHistAccountBoutique_QNAME, String.class, AddHistAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "time", scope = AddHistAccount.class)
    public JAXBElement<String> createAddHistAccountTime(String value) {
        return new JAXBElement<String>(_AddHistAccountTime_QNAME, String.class, AddHistAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = AddHistAccount.class)
    public JAXBElement<String> createAddHistAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, AddHistAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "role", scope = Payment.class)
    public JAXBElement<String> createPaymentRole(String value) {
        return new JAXBElement<String>(_PaymentRole_QNAME, String.class, Payment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = Payment.class)
    public JAXBElement<String> createPaymentLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, Payment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetID.class)
    public JAXBElement<String> createGetIDUsername(String value) {
        return new JAXBElement<String>(_GetRolesUsername_QNAME, String.class, GetID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = DeleteAccount.class)
    public JAXBElement<String> createDeleteAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, DeleteAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "deleteInfoAccountResult", scope = DeleteInfoAccountResponse.class)
    public JAXBElement<String> createDeleteInfoAccountResponseDeleteInfoAccountResult(String value) {
        return new JAXBElement<String>(_DeleteInfoAccountResponseDeleteInfoAccountResult_QNAME, String.class, DeleteInfoAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = GetListHistoriqueUser.class)
    public JAXBElement<String> createGetListHistoriqueUserLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, GetListHistoriqueUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "addInfoAccountResult", scope = AddInfoAccountResponse.class)
    public JAXBElement<String> createAddInfoAccountResponseAddInfoAccountResult(String value) {
        return new JAXBElement<String>(_AddInfoAccountResponseAddInfoAccountResult_QNAME, String.class, AddInfoAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getListHistoriqueResult", scope = GetListHistoriqueResponse.class)
    public JAXBElement<String> createGetListHistoriqueResponseGetListHistoriqueResult(String value) {
        return new JAXBElement<String>(_GetListHistoriqueResponseGetListHistoriqueResult_QNAME, String.class, GetListHistoriqueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getRolesResult", scope = GetRolesResponse.class)
    public JAXBElement<String> createGetRolesResponseGetRolesResult(String value) {
        return new JAXBElement<String>(_GetRolesResponseGetRolesResult_QNAME, String.class, GetRolesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "updateInfoAccountResult", scope = UpdateInfoAccountResponse.class)
    public JAXBElement<String> createUpdateInfoAccountResponseUpdateInfoAccountResult(String value) {
        return new JAXBElement<String>(_UpdateInfoAccountResponseUpdateInfoAccountResult_QNAME, String.class, UpdateInfoAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "address", scope = AddInfoAccount.class)
    public JAXBElement<String> createAddInfoAccountAddress(String value) {
        return new JAXBElement<String>(_UpdateInfoAccountAddress_QNAME, String.class, AddInfoAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nom", scope = AddInfoAccount.class)
    public JAXBElement<String> createAddInfoAccountNom(String value) {
        return new JAXBElement<String>(_AddInfoAccountNom_QNAME, String.class, AddInfoAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "prenom", scope = AddInfoAccount.class)
    public JAXBElement<String> createAddInfoAccountPrenom(String value) {
        return new JAXBElement<String>(_AddInfoAccountPrenom_QNAME, String.class, AddInfoAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = AddInfoAccount.class)
    public JAXBElement<String> createAddInfoAccountLogin(String value) {
        return new JAXBElement<String>(_LoginAccountLogin_QNAME, String.class, AddInfoAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "exp", scope = AddInfoAccount.class)
    public JAXBElement<String> createAddInfoAccountExp(String value) {
        return new JAXBElement<String>(_AddInfoAccountExp_QNAME, String.class, AddInfoAccount.class, value);
    }

}
