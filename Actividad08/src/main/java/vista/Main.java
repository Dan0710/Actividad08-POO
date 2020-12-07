/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Director;
import java.util.ArrayList;
import modelo.Instrumento;

/**
 *
 * @author Dan
 */
public class main {
    public static void main(String[] args) {
        String partitura1 = "Moonlight Sonata";
        Director director = new Director();
        
        director.crearOrquesta(80);
        
        director.mostrarComposicion();
        
       
    }
}
