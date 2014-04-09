package ar.edu.untdf.ejer1;

import java.util.ArrayList;
import java.util.List;

/**
 * Tag que puede contener otros tags ejmpl. body, div
 *
 * @author matias
 */
public abstract class ContainerTag implements Tag {
    String init="";
    /**
     * Este constructor recibe como parametro un grupo de clases que representan
     * tags e inicializa el listado de tags que acepta este tag.
     *
     * @param claszs grupo de clases que que representan a los tags que pueden
     * ser asignados a este tag
     */
    public ContainerTag(Class... claszs) {
        accepted = new ArrayList();
        tags = new ArrayList();
        //si  Tag es asignable desde un objeto de la clase c, significa       
        // que c implementa la interface Tag, que es requicito minimo para ser aceptado
        for (Class c : claszs) {
            if (Tag.class.isAssignableFrom(c)) {
                accepted.add(c);
            }
        }

    }
    private List<Class> accepted;
    private List<Tag> tags;
    
    /**
     * retorna un string con el tag de inicio
     *
     * @return tag de inicio
     */
    public  String printStartTag() {
        return String.format("<%s>",getName());
    }

    public  String printEndTag(){
        return String.format("</%s>",getName());
    }

    /*
     * imprime un tag contenedor de la forma: tag de unicio - el listado de tag - tag de cierre
     */
    @Override
    public String render() {
        String code = printStartTag();
        code+=init;
        for (Tag tag : tags) {
            code += " " + tag.render();
        }
        code += printEndTag()+"\n";
        return code;
    }

    @Override
    public Tag addTag(Tag tag) {
        if (accepted.contains(tag.getClass())) {
            tags.add(tag);
        }
        return this;
    }
}
