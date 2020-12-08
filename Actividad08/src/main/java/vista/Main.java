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
        System.out.println("Composición de la orquesta creada\n");
        Director director = new Director();
        director.crearOrquesta(85);
        director.mostrarComposicion();
        System.out.println("\nSe crea la pieza musical \"Moonlight Sonata\" que se dividirá en diversas partituras para cada tipo de instrumento");
        director.setPiezaMusical("Moonlight Sonata");
        System.out.println("\nSe solicita a todos la orquesta afinar sus instrumentos\n");
        director.ordenarAfinar();
        System.out.println("\nSe solicita a todos la orquesta tocar la nota \"do\"\n");
        director.ordenarTocarNota("do");
        System.out.println("\nSe solicita a todos la orquesta tocar la pieza musical \"Moonlight Sonata\"\n");
        director.ordenarPartitura();
        System.out.println("\nPor último, se solicitan a dos instrumentos que corrijan sus errores.\n");
        director.arreglarInstrumentos();
    }
};