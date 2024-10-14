
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
        
        this.programa.addEmision(this);
    }
    
    public boolean addInvitado(Invitado invitado){
    
        if (!this.invitados.contains(invitado)) {
            this.invitados.add(invitado);
            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean addCancion(Cancion cancion){
        this.canciones.add(cancion);
        return true;
        
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    
    
}
