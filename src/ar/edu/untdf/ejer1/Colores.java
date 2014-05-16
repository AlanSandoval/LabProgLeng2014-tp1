package ar.edu.untdf.ejer1;
/**
 *
 * @author AlanSandoval
 */
public class Colores extends AgregarFunciones{

    public Colores(Tag tag) {
        super(tag);
    }
    
    @Override
    public String Color() {
        return "<color><backgroundColor:Yellow></color>";
    }

    @Override
    public String getName() {
        return "Color";
    }

    @Override
    public String render() {
           return "<color><backgroundColor:Yellow></color>";
    }

    @Override
    public Tag addTag(Tag tag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
