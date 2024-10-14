
package core.Persona;

import core.Programa.Programa;
import java.util.ArrayList;


public class Locutor extends Persona {
    
    private ArrayList<Programa> programas;

    public Locutor(String nombre) {
        super(nombre);
        this.programas= new ArrayList<>();
    }
    
    
}
