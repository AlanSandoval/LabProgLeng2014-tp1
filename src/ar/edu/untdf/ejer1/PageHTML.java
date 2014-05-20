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
        String texto=
             ((new HtmlUI()).addTag((new HtmlHeader()).
                        addTag((new Title()).
                        addTag(new HtmlString("Pagina Test")))).                       
                        addTag(new HtmlBody().addTag(new HtmlButton(" botonAceptar ")))).render();
                        
       texto+=((new NuevaFuncionHabilitar(new HtmlBody()))).render();
       return texto;
    }                    
        
    

}
