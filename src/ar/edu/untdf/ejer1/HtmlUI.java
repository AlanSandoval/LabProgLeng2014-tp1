package ar.edu.untdf.ejer1;

/**
 *
 * @author soporte
 */
public class HtmlUI extends ContainerTag  {

     public  HtmlUI(){
         super(HtmlHeader.class,HtmlBody.class);
    }

    @Override
    public String getName() {
        return "html";
    }

   


}
