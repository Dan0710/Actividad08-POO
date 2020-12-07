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
    private ArrayList<Instrumento> orquesta;

    public Director() {
        this.orquesta = new ArrayList<Instrumento>();
    }

    public Director(ArrayList<Instrumento> orquesta) {
        this.orquesta = orquesta;
    }

    public ArrayList<Instrumento> getOrquesta() {
        return orquesta;
    }

    public void setOrquesta(ArrayList<Instrumento> orquesta) {
        this.orquesta = orquesta;
    }
    public void ordenarAfinar(){
        for(int i = 0; i < orquesta.size(); i++){
            Instrumento instrumento = orquesta.get(i);
            instrumento.afinarInstrumento();
        }
    }
    public void ordenarTocarNota(){
        for(int i = 0; i < orquesta.size(); i++){
            Instrumento instrumento = orquesta.get(i);
            instrumento.tocarNota();
        }
    }
    public void ordenarPartitura(){
        for(int i = 0; i < orquesta.size(); i++){
            Instrumento instrumento = orquesta.get(i);
            instrumento.ejecutarPiezaMusical();
        }
    }
    
};    
