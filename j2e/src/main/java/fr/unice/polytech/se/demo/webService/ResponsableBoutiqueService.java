package fr.unice.polytech.se.demo.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by ding on 30/04/15.
 */
@WebService
public interface ResponsableBoutiqueService {
    @WebMethod
    @WebResult(name="listCommande")
    public ArrayList<String> getListCommande( @WebParam(name = "addresseBoutique") String adresseBoutiqe);

    @WebMethod
    @WebResult(name="statistiqueBoutique")
    public int getStatistiqueBoutique( @WebParam(name = "addresseBoutique") String adresseBoutique);
}
