/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.untdf.ejer1;

/**
 *
 * @author AlanSandoval
 */
public abstract class AgregarFunciones implements Tag{
        String texto="";
        Tag tag=null;

    public AgregarFunciones(Tag tag) {
        this.tag=tag;       
    }
   
    public abstract String AgregarAtributos();
   
}
