/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

import java.util.List;

/**
 *
 * @author soporte
 */
public interface Tag {  
    public abstract String getName();
    public abstract String render();
    public abstract Tag addTag(Tag tag);
}
