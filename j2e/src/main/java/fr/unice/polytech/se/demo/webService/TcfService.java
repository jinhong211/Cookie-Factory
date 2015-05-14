

package fr.unice.polytech.se.demo.webService;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService
public interface TcfService {

    @WebMethod
    @WebResult(name="allBoutique")
    public ArrayList<String> getAllBoutique();

    @WebMethod
    @WebResult(name="allIngredient")
    public ArrayList<String> getAllIngredient();

    @WebMethod
    @WebResult(name="allFacon")
    public ArrayList<String> getAllFacon();

    @WebMethod
    @WebResult(name="allRettce")
    public ArrayList<String> getAllRecette();
}