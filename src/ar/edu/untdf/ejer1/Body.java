/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author matiasgel
 */
public class Body extends ContainerTag{
    public Body(){
        super(HtmlString.class);
    }
    
    @Override
    public String getName() {
        return "body";
    }


}
