/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Instrumento;

/**
 *
 * @author Dan
 */
public class Director {
    private String nombre;
    private ArrayList<Instrumento> orquesta;

    public Director(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setOrquesta(ArrayList<Instrumento> orquesta) {
        this.orquesta = orquesta;
    }

    public ArrayList<Instrumento> getOrquesta() {
        return orquesta;
    }
    public void crearOrquesta(int numeroInstrumentos){
        
    }
    
    
    public void ejecutarPiezaMusical(){

    };
    
}
