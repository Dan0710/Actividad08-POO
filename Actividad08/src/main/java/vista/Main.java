/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Director;
import control.SoS_Exception;

/**
 *
 * @author Dan
 */
public class main {
    public static void main(String[] args) throws SoS_Exception {
        String partitura1 = "Moonlight Sonata";
        Director director = new Director();
        director.crearOrquesta(15);
        director.ordenarAfinar();
        director.ordenarPartitura();
        director.ordenarTocarNota();
        director.arreglarInstrumentos();
    }
};
