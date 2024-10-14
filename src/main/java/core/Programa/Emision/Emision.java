
package core.Programa.Emision;

import core.Cancion.Cancion;
import core.Persona.Invitado;
import core.Programa.Programa;
import java.util.ArrayList;


public class Emision {
    private int serial;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private Programa programa;
    
    public Emision(Programa programa){
        this.serial=0;
        this.canciones= new ArrayList<>();
        this.invitados= new ArrayList<>();
        this.programa= programa;
    }
}
