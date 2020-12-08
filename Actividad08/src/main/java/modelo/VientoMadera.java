/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.SoS_Exception;
import static control.SoS_Exception.TInstrumento.Instrumento_VientoMadera;

/**
 *
 * @author elias
 */
public class VientoMadera extends Instrumento {
    
     public VientoMadera() {
        super("Viento madera");
    }
     
    @Override
    public String ejecutarPiezaMusical(String nombrePieza) {
        return super.ejecutarPiezaMusical(nombrePieza);
    }
    

    @Override
    public String tocarNota(String nombreNota) {
        return super.tocarNota(nombreNota);
    }


    @Override
    public void arreglarDesperfecto(boolean esCorregible) throws SoS_Exception {
        if (esCorregible) {
            System.out.println("El instrumento de tipo " + super.tipoInstrumento + " ha sido arreglado correctamente");
        }
        else {
            throw new SoS_Exception(Instrumento_VientoMadera);
        }
    }
}
