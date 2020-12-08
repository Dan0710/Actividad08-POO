/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author jeffr
 */
public class SoS_Exception extends Exception {
    public enum TInstrumento {Instrumento_Cuerda, Instrumento_Percusion, Instrumento_VientoMadera, Instrumento_VientoMetal}
    
    private TInstrumento tipoInstrumento;
    
    public SoS_Exception(TInstrumento tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    @Override
    public String getMessage() {
        String msjDesperfecto = "";
        
        switch (tipoInstrumento) {
            case Instrumento_Cuerda:
                msjDesperfecto = "El instrumento de tipo Cuerda tiene dos cuerdas dañadas";
                break;
            case Instrumento_Percusion:
                msjDesperfecto = "El instrumento de tipo Percusión tiene su membrada rota";
                break;
            case Instrumento_VientoMadera:
                msjDesperfecto = "El instrumento de tipo Viento Madera tiene su lengüeta partida";
                break;
            case Instrumento_VientoMetal:
                msjDesperfecto = "El instrumento de tipo Viento Metal tiene su tubo principal torcido";
                break;                
        }
        return msjDesperfecto;
    }
    
}
