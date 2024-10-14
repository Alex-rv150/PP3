
package core.Persona;

import core.Cancion.Cancion;
import java.util.ArrayList;

public class Artista extends Persona{
    private ArrayList<Cancion> canciones;
    
    public Artista(String nombre) {
        super(nombre);
        this.canciones = new ArrayList<>();
    }
    
    public boolean addCancion(Cancion cancion){
        if(!this.canciones.contains(cancion)){
            this.canciones.add(cancion);
            return true;
        }
        return false;
    }
    
    
}
