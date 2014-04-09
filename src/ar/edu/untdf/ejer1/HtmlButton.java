/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author soporte
 */
public class HtmlButton extends SimpleTag {

    String texto;

    public HtmlButton(String texto) {
        this.texto = texto;
    }

    @Override
    public String getName() {
        return "button";
    }

    @Override
    public String render() {
        return String.format("<%1$2s>%2$2s</%1$2s>", getName(),texto);
                
    }
}
