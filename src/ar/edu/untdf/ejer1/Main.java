/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author soporte
 */
public class Main {

    public static final int HTML = 1;
    public static final int JQUERY = 2;
    public static String paginaSimple(int tipo) {
        String page = "";
        
        switch (tipo) {            
            case HTML: 
                // HTMLUI AGREGO TAG PROPIAS DE HTML, COMO HEADER,TITITULO,STRING,CUERPO
                //DONDE CONTAINER TIENE UN LIST DE TAG
                System.out.println("PAGINA HTML");
                page =
                        ((new HtmlUI()).addTag((new HtmlHeader()).
                        addTag((new Title()).
                        addTag(new HtmlString("Pagina Test")))).
                        addTag(new HtmlBody().addTag(new HtmlButton("boton1")))).render();
                break;

            
            case JQUERY: 
                System.out.println("PAGINA JQUERY");
                page =
                        ((new JqueryUI())
                        .addTag((new JqueryHeader()).
                        addTag((new Title()).
                        addTag(new HtmlString("Pagina Test")))).
                        addTag(new JqueryBody().addTag(new JqueryButton("boton1")))).render();
              break;
        }
        return page;
    }

    public static void main(String[] args) {
        
        /*System.out.println(paginaSimple(HTML));
        System.out.println(paginaSimple(JQUERY));
        */
        AbstractTag tag = PageFactory.createPage(PageFactory.Page_HTML);       
        System.out.println(tag.page());
        tag = PageFactory.createPage(PageFactory.Page_JQuery);
        System.out.println(tag.page());   
    }
}
