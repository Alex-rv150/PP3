
package core.Programa;

import core.Persona.Locutor;
import core.Programa.Emision.Emision;
import java.util.ArrayList;


public class Programa {
    private String nombre;
    private int serial;
    private ArrayList<Emision> emisiones;
    private ArrayList<Locutor> locutores;
    
    public Programa (String nombre, Locutor locutor){
        this.nombre= nombre;
        this.serial= 0;
        this.emisiones= new ArrayList<>();
        this.locutores= new ArrayList<>();
        
        locutores.add(locutor);
    }
}
