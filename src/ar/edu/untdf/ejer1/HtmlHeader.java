/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author soporte
 */
public  class HtmlHeader extends ContainerTag{
    public HtmlHeader(){
    super(Title.class);
    }
    @Override
    public String getName() {
        return "header";
    }
    
  
}
