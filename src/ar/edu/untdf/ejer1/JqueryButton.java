/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author soporte
 */
public class JqueryButton extends HtmlButton {

    public JqueryButton(String text) {
        super(text);
    }

    @Override
    public String render() {
        
       return  "<script>\n" +
"  $(function() {\n" +
"    $( \"button\" )\n" +
"      .button()\n" +
"     ;\n" +
"  });\n" +
"  </script>"
                +super.render();        
    }
}
