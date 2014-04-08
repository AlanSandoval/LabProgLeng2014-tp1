/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import javax.swing.JFrame;

/**
 *
 * @author soporte
 */
public class Main {
    public static void main(String[] args){
        HtmlUI hui = new HtmlUI();
        Tag tag=hui;
        hui.getClass().isAssignableFrom(null);
        System.out.println(tag.getClass().getName());
    
    }
    
}
