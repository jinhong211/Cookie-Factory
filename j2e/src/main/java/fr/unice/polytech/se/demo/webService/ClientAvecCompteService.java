package fr.unice.polytech.se.demo.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by ding on 12/05/15.
 */
@WebService
public interface ClientAvecCompteService {
    @WebMethod
    @WebResult(name = "boutiquePrefere")
    public String getBoutiquePrefere(@WebParam(name = "compteId") int id_compte);

    @WebMethod
    @WebResult(name = "recettePrefere")
    public String getRecettePrefere(@WebParam(name = "compteId") int id_compte);

}
