package fr.unice.polytech.se.demo.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by ding on 01/05/15.
 */
@ManagedBean(name="responsableTCF")
@SessionScoped
public class ResponsableTCFJsf implements Serializable{

    public String t = "This is a test";
    public String test(){
        return "This is a test presentation";
    }

}
