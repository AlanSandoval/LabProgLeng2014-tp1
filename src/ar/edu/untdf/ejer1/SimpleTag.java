/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author soporte
 */
public abstract class SimpleTag implements Tag{



    @Override
    public void addTag(Tag tag) {
        throw new UnsupportedOperationException(this.getClass().getName()+": No es un tag contenedor."); 
    }
    
}
