/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author matiasgel
 */
public class HtmlBody extends ContainerTag{
    public HtmlBody(){
        super(HtmlString.class,HtmlButton.class);
    }
    
    @Override
    public String getName() {
        return "body";
    }


}
