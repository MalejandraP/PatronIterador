package co.edu.uniquindio.poo.iteradorpatron.controller;

import co.edu.uniquindio.poo.iteradorpatron.model.Cancion;
import co.edu.uniquindio.poo.iteradorpatron.model.Playlist;
import co.edu.uniquindio.poo.iteradorpatron.model.PlaylistIterator;

public class PrimaryController {
    private Playlist playlist;
    private PlaylistIterator iterador;

    public PrimaryController() {
        playlist = new Playlist();
        inicializarCanciones();
        iterador = playlist.createIterator();
    }

    private void inicializarCanciones() {
        playlist.agregarCancion(new Cancion("Yellow", "Coldplay"));
        playlist.agregarCancion(new Cancion("Imagine", "John Lennon"));
        playlist.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen"));
        playlist.agregarCancion(new Cancion("Shape of You", "Ed Sheeran"));
        playlist.agregarCancion(new Cancion("Blinding Lights", "The Weeknd"));
        playlist.agregarCancion(new Cancion("Dance Monkey", "Tones and I"));
        playlist.agregarCancion(new Cancion("Someone You Loved", "Lewis Capaldi"));
        playlist.agregarCancion(new Cancion("As It Was", "Harry Styles"));
    }

    public Cancion siguienteCancion() {
        if (iterador.hasNext()) {
            return iterador.next();
        } else {
            return null;
        }
    }
    
    public Cancion anteriorCancion() {
        if (iterador.hasPrevious()) {
            return iterador.previous();
        } else {
            return null;
        }
    }

    public void reiniciarIterador() {
        iterador = playlist.createIterator();
    }

    public Cancion obtenerPrimeraCancion() {
        reiniciarIterador();
        if (iterador.hasNext()) {
            return iterador.next();
        }
        return null;
    }

    public boolean tieneSiguiente() {
        return iterador.hasNext();
    }

    public boolean tieneAnterior() {
        return iterador.hasPrevious();
    }
}
