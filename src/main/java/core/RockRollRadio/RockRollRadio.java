
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

    public RockRollRadio() {
        artistas = new ArrayList<>();
        canciones = new ArrayList<>();
        invitados = new ArrayList<>();
        locutores = new ArrayList<>();
        programas = new ArrayList<>();
        emisiones = new ArrayList<>();
    }

    public boolean addLocutor(Locutor locutor) {
        if (!this.locutores.contains(locutor)) {
            this.locutores.add(locutor);
            return true;
        } else {
            return false;
        }
    }

    public boolean addPrograma(Programa programa) {
        if (!this.programas.contains(programa)) {
            this.programas.add(programa);
            return true;
        } else {
            return false;
        }
    }

    public boolean addArtista(Artista artista) {
        if (!this.artistas.contains(artista)) {
            this.artistas.add(artista);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCancion(Cancion cancion) {
        if (!this.canciones.contains(cancion)) {
            this.canciones.add(cancion);
            return true;
        } else {
            return false;
        }
    }

    public boolean addEmision(Emision emision) {
        if (!this.emisiones.contains(emision)) {
            this.emisiones.add(emision);
            return true;
        } else {
            return false;
        }
    }

    public boolean addInvitado(Invitado invitado, Emision emision) {
        
        emision.addInvitado(invitado);
        
        
        if (!this.invitados.contains(invitado)) {
            this.invitados.add(invitado);
            int num;
            num = invitados.indexOf(invitado);
            invitados.get(num).addEmision(emision);
        
            return true;
        } else {
            int num;
            num = invitados.indexOf(invitado);
            invitados.get(num).addEmision(emision);
        
            return false;
        }
        
     
    }

    /* getts */
    public Locutor getLocutor(int index) {
        return this.locutores.get(index);
    }

    public Programa getPrograma(int index) {
        return this.programas.get(index);
    }

    public Artista getArtista(int index) {
        return this.artistas.get(index);
    }

    public Cancion getCancion(int index) {
        return this.canciones.get(index);
    }

    public Emision getEmision(int index) {
        return this.emisiones.get(index);
    }

    public Invitado getInvitado(int index) {
        return this.invitados.get(index);
    }

           
                    
                
}
