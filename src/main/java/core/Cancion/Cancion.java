
package core.Cancion;

import core.Genero.Genero;
import core.Persona.Artista;

public class Cancion {
    private String nombre;
    private Artista artista;
    private Genero genero;
    
    public Cancion(String nombre,Artista artista, Genero genero){
        this.nombre =nombre;
        this.artista= artista;
        this.genero= genero;
        
        this.artista.addCancion(this);
    }
}
