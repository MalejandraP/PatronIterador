package co.edu.uniquindio.poo.iteradorpatron.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Cancion> canciones = new ArrayList<>();

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public int getCantidadCanciones() {
        return canciones.size();
    }

    public Cancion getCancion(int index) {
        return canciones.get(index);
    }

    // Método que crea el iterador asociado a esta lista
    public PlaylistIterator createIterator() {
        return new PlaylistIterator(this);
    }
}

