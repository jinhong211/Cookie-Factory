package fr.unice.polytech.se.demo.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by ding on 30/04/15.
 */
@WebService
public interface ResponsableTCFService {
    @WebMethod
    @WebResult(name="creerBoutique")
    public boolean creerBoutique( @WebParam(name = "addresseBoutique") String address, @WebParam(name = "tax") double tax, @WebParam(name = "tempsOuv") int to, @WebParam(name = "tempsFer") int tf);

    @WebMethod
    @WebResult(name="statistiqueGlobal")
    public int getStatistiqueGlobal();

    @WebMethod
    @WebResult(name="existBoutique")
    public boolean boutiqueIsExist(@WebParam(name = "addresseBoutique") String address);
}
