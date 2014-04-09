/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author soporte
 */
public class Title extends ContainerTag{
    public Title(){
     super(HtmlString.class);
    }
    @Override
    public String getName(){
        return "Title";
    }
}
