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
public class PageJQuery extends AbstractTag{
    public PageJQuery(){}
    public String page()
    {
        setChanged();
        notifyObservers();
        return ((new JqueryUI())
                        .addTag((new JqueryHeader()).
                        addTag((new Title()).
                        addTag(new HtmlString("Pagina Test")))).
                        addTag(new JqueryBody().addTag(new JqueryButton("boton1")))).render();
    }
    
    
}
