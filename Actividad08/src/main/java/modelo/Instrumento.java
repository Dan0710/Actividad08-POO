/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.SoS_Exception;

/**
 *
 * @author Dan
 */
public abstract class Instrumento {
    protected String nombre;
    protected String tipoInstrumento;
    protected String nota;
    protected boolean desperfecto;

    public Instrumento() {
    }

    public Instrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public boolean isDesperfecto() {
        return desperfecto;
    }

    public void setDesperfecto(boolean desperfecto) {
        this.desperfecto = desperfecto;
    }

    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
    
    
    
    public String afinarInstrumento() {
        return "Se afinó el instrumento " + nombre;
    }
    
    public String tocarNota(String nombreNota) {
        return nombre + " toca la nota " + nombreNota + ", para instrumentos de tipo " + tipoInstrumento;
    }
    
    public String ejecutarPiezaMusical(String nombrePieza) {
        return nombre + " está ejecutando la partitura de " + nombrePieza + ", para instrumentos de tipo " + tipoInstrumento;
    }
    public String adaptarPartitura(String nombrePieza) {
        return nombre + " está transformando la pieza musical: " + nombrePieza + ", para instrumentos de tipo " + tipoInstrumento;
    }
    
    
    public abstract void arreglarDesperfecto(boolean esCorregible) throws SoS_Exception;
   
}
