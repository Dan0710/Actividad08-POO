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
    protected String nota;
    protected boolean desperfecto;

    public Instrumento() {
    }

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }
    
    public Instrumento(String nombre, String nota) {
        this.nombre = nombre;
        this.nota = nota;
        desperfecto = false;
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
    
    public String afinarInstrumento() {
        return "Se afinó el instrumento " + nombre;
    }
    
    public String tocarNota() {
        return nombre + " toca la nota " + nota;
    }
    
    public String ejecutarPiezaMusical() {
        return nombre + " está ejecutando su pieza musical";
    }
    
    public abstract void arreglarDesperfecto(boolean esCorregible) throws SoS_Exception;
   
}
