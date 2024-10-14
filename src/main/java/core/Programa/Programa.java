
package core.Programa;

import core.Persona.Locutor;
import core.Programa.Emision.Emision;
import java.util.ArrayList;


public class Programa {
    private String nombre;
    private int serial;
    private ArrayList<Emision> emisiones;
    private Locutor locutor;
    
    public Programa (String nombre, Locutor locutor){
        this.nombre= nombre;
        this.serial= 0;
        this.emisiones= new ArrayList<>();
        this.locutor= locutor;

        this.locutor.addPrograma(this);
    }
    
    public boolean addEmision(Emision emision){
        if(!this.emisiones.contains(emision)){
            this.emisiones.add(emision);
            return true;
        }
        return false;
    }
}
