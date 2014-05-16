package ar.edu.untdf.ejer1;
/**
 *
 * @author AlanSandoval
 */
public class Habilitar extends AgregarFunciones{

   HtmlButton boton;
    public Habilitar(HtmlButton boton) {
        super(boton);
    }
    
    
    @Override
    public String Color() {
        return "<enabled> <enabled=true></enabled>";
    }

    @Override
    public String getName() {
        return "Habilitar/Desabilitar";
    }

    @Override
    public String render() {
           return this.boton.render()+"<enabled> <enabled=true></enabled>";
    }

    @Override
    public Tag addTag(Tag tag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
