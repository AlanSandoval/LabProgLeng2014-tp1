/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author matiasgel
 */
public class HtmlString extends SimpleTag {

    private String string;

    public HtmlString(String string) {
        this.string = string;
    }

    @Override
    public String render() {
        return string;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("no soporta esta operación.");
    }
}
