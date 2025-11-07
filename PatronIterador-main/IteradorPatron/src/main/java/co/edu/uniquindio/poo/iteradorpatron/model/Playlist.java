package co.edu.uniquindio.poo.iteradorpatron.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements ICollection<Cancion> {
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
    @Override
    public Iterator<Cancion> createIterator() {
        return new PlaylistIterator(this);
    }
}

