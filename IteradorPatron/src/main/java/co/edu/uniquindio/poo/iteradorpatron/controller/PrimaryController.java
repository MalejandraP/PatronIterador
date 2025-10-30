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
}
