
package core.RockRollRadio;

import core.Cancion.Cancion;
import core.Persona.Artista;
import core.Persona.Invitado;
import core.Persona.Locutor;
import core.Programa.Emision.Emision;
import core.Programa.Programa;
import java.util.ArrayList;


public class RockRollRadio {
    
    private ArrayList<Artista> artistas;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private ArrayList<Locutor> locutores;
    private ArrayList<Programa> programas;
    private ArrayList<Emision> emisiones;
    
    
    
    public RockRollRadio (){
    artistas = new ArrayList<>();
    canciones = new ArrayList<>();
    invitados = new ArrayList<>();
    locutores =new ArrayList<>();
    programas = new ArrayList<>();
    emisiones = new ArrayList<>();
    }
    
    public boolean addLocutor (Locutor locutor){
    if (!locutores.contains(locutor)){
    locutores.add(locutor);
    return true;
    }else{
    return false;
    }
    }
    
    
    
    public boolean addPrograma (Programa programa){
            if (!programas.contains(programa)){
                programas.add(programa);
                return true;
            }else{
                return false;
            }
        }
    
    public boolean  addArtista (Artista artista){
            if (!artistas.contains(artista)){
                artistas.add(artista);
                return true;
            }else{
                return false;
            }
        }
            
    
    
        public boolean  addCancion (Cancion cancion){
            if (!canciones.contains(cancion)){
                canciones.add(cancion);
                return true;
            }else{
                return false;
            }
        }
            
        public boolean  addEmision (Emision  emision ){
            if (!canciones.contains(emision)){
                canciones.add(emision);
                return true;
            }else{
                return false;
            }
        }
            
           
                    
                    
    addInvitado
    
    
    
    
   
    
    
  
    
    
    
}
