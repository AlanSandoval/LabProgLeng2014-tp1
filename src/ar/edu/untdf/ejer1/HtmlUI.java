/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author soporte
 */
public class HtmlUI extends ContainerTag  {

     public  HtmlUI(){
         super(Header.class,Body.class);
    }

    @Override
    public String getName() {
        return "html";
    }

   


}
