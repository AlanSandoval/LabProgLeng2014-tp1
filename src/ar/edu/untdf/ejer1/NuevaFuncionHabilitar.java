package ar.edu.untdf.ejer1;

/**
 *
 * @author AlanSandoval
 */
public class NuevaFuncionHabilitar extends AgregarFunciones {


    public NuevaFuncionHabilitar(Tag tag) {
        super(tag);
    }

    
    @Override
    public String AgregarAtributos() {
            
        return "<enabled> <enabled=true></enabled>";
    }

    @Override
    public String getName() {
        return "Focus";
    }

    @Override
    public String render() {
        return String.format("<%1$2s>%2$2s</%1$2s>", getName(),texto);
    }

    @Override
    public Tag addTag(Tag tag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    


