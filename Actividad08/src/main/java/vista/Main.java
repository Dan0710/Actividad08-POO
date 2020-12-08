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
        System.out.println("Composición de la orquesta creada");
        Director director = new Director();
        director.crearOrquesta(15);
        director.mostrarComposicion();
        System.out.println("\nSe solicita a todos los instrumentos");
        director.ordenarAfinar();
        director.ordenarTocarNota("do");
        String partitura1 = "Moonlight Sonata";
        director.ordenarPartitura(partitura1);
        director.arreglarInstrumentos();
    }
};
