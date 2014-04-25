/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.untdf.ejer1;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author AlanSandoval
 */
public abstract class AbstractTag  extends Observable{
    abstract String page();
    
}
