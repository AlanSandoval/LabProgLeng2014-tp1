/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.untdf.ejer1;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author AlanSandoval
 */

// Tengo un conjunto de observadores
public class PageFactory implements Observer{
    public static final int Page_HTML=0;
    public static final int Page_JQuery=1;
 
    public PageFactory(){
        
    }
 
    public static AbstractTag createPage(int tipoPage){
        if (tipoPage==PageFactory.Page_HTML){
             
            return new PageHTML();
             
             
       }
        if (tipoPage==PageFactory.Page_JQuery){
            return new PageJQuery();
        }
 
        return null;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o.toString()); 
   }
 
}
