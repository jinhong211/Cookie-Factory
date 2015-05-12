package fr.unice.polytech.se.demo.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Date;
import java.util.Set;

/**
 * Created by ding on 12/05/15.
 */
@WebService
public interface ClientSansCompteService {

    @WebMethod
    @WebResult(name = "passerCommand")
    public boolean passerCommand(@WebParam(name = "addresseBoutique") String ab, @WebParam(name = "recetteNom") String r, @WebParam(name = "date") Date d, @WebParam(name = "quantite") int q);

    @WebMethod
    @WebResult(name = "creerRecette")
    public boolean creerRecette(@WebParam(name = "recetteNom") String n, @WebParam(name = "ingredients") Set<String> ingredients, @WebParam(name = "facons") Set<String> facons);
}
