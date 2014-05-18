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
                        addTag(new HtmlBody().addTag(new HtmlButton(" botonAceptar ")).
                        addTag(new NuevaFuncionHabilitar("3343")))).render();
                        //addTag(new NuevaFuncionHabilitar("algo")))).render();
                      //  addTag(new HtmlBody().addTag(new HtmlButton("Aceptarr")).addTag(new Habilitar(page())))).render();
       
       return texto;
    }                    
        
    

}
