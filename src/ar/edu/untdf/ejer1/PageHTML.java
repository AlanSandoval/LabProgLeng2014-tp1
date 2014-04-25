/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.untdf.ejer1;

/**
 *
 * @author AlanSandoval
 */
public class PageHTML extends AbstractTag{
    public PageHTML(){}
    
    public String page()
    {
        return ((new HtmlUI()).addTag((new HtmlHeader()).
                        addTag((new Title()).
                        addTag(new HtmlString("Pagina Test")))).
                        addTag(new HtmlBody().addTag(new HtmlButton("boton1")))).render();
    }
}
