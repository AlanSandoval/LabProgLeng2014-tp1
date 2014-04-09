/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author soporte
 */
public class JqueryBody extends ContainerTag {

    public JqueryBody() {
        super(HtmlString.class, JqueryButton.class);
    }

    @Override
    public String getName() {
        return "body";
    }
}
