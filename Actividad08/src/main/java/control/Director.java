/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Cuerda;
import modelo.Instrumento;
import modelo.Percusion;
import modelo.VientoMadera;
import modelo.VientoMetal;

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
    
    public void crearOrquesta(int numeroInstrumentos){
        if (!orquesta.isEmpty()){
            orquesta.clear();
        }
        for(int i = 0; i < numeroInstrumentos ; i++){
            if(i % 4 == 0){
                Instrumento nuevo = new Cuerda();
                nuevo.setNombre(nuevo.getNombre()+Integer.toString(i));
                orquesta.add(nuevo);
            }
            if(i % 4 == 1){
                Instrumento nuevo = new Percusion();
                nuevo.setNombre(nuevo.getNombre()+Integer.toString(i));
                orquesta.add(nuevo);
            }
            if(i % 4 == 2){
                Instrumento nuevo = new VientoMadera();
                nuevo.setNombre(nuevo.getNombre()+Integer.toString(i));
                orquesta.add(nuevo);
            }
            if(i % 4 == 3){
                Instrumento nuevo = new VientoMetal();
                nuevo.setNombre(nuevo.getNombre()+Integer.toString(i));
                orquesta.add(nuevo);
            }
        }
    }
    
    public void mostrarComposicion(){
        int nCuerda = 0;
        int nPercusion = 0;
        int nVientoMadera = 0;
        int nVientoMetal = 0;
        for (int i = 0; i < orquesta.size(); i++){
            if(orquesta.get(i).getNombre().contains("Cuerda")){
                nCuerda++;
            }
            if(orquesta.get(i).getNombre().contains("Percusión")){
                nPercusion++;
            }
            if(orquesta.get(i).getNombre().contains("Viento madera")){
                nVientoMadera++;
            }
            if(orquesta.get(i).getNombre().contains("Viento metal")){
                nVientoMetal++;
            }
        }
        System.out.println("Instrumentos de cuerda: " + Integer.toString(nCuerda));
        System.out.println("Instrumentos de percusión: " + Integer.toString(nPercusion));
        System.out.println("Instrumentos de viento madera: " + Integer.toString(nVientoMadera));
        System.out.println("Instrumentos de viento metal: " + Integer.toString(nVientoMetal));
    }
    
    public void ordenarAfinar(){
        for(int i = 0; i < orquesta.size(); i++){
            Instrumento instrumento = orquesta.get(i);
            System.out.println(instrumento.afinarInstrumento());
        }
    }
    public void ordenarTocarNota(){
        for(int i = 0; i < orquesta.size(); i++){
            Instrumento instrumento = orquesta.get(i);
            System.out.println(instrumento.tocarNota());
        }
    }
    public void ordenarPartitura(){
        for(int i = 0; i < orquesta.size(); i++){
            Instrumento instrumento = orquesta.get(i);
            System.out.println(instrumento.ejecutarPiezaMusical());
        }
    }

};    
