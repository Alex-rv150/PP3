
package core.Persona;

import core.Programa.Programa;
import java.util.ArrayList;


public class Locutor extends Persona {
    
    private Programa programa;

    public Locutor(String nombre) {
        super(nombre);
        this.programa= null;
    }
    
    public boolean addPrograma(Programa programa){
        if(programa==null){
            this.programa=programa;
            return true;
        }
        return false;
    }
}
