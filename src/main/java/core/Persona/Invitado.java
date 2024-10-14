
package core.Persona;

import core.Programa.Emision.Emision;
import java.util.ArrayList;


public class Invitado extends Persona{
    
    private ArrayList<Emision> emisiones;
    
    public Invitado(String nombre) {
        super(nombre);
        this.emisiones= new ArrayList<>();
       
    }
    public boolean addEmision(Emision emision){
        emisiones.add(emision);
        return true;
    }
    
}
