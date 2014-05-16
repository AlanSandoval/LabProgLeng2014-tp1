package ar.edu.untdf.ejer1;
/**
 *
 * @author AlanSandoval
 */
public class PageHTML extends AbstractTag{
    public PageHTML(){}
    
    public String page()
    {
        setChanged();
        notifyObservers();
        return ((new HtmlUI()).addTag((new HtmlHeader()).
                        addTag((new Title()).
                        addTag(new HtmlString("Pagina Test")))).                       
                        //addTag(new HtmlBody().addTag(new HtmlButton("boton1")))).render();
                        addTag(new HtmlBody().addTag(new HtmlButton("Aceptar")).addTag(new Habilitar(null)))).render();
                        
                        
        
    }
}
