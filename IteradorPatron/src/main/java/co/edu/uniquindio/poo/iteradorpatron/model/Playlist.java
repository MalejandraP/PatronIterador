package co.edu.uniquindio.poo.iteradorpatron.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Collection {
    private List<Cancion> canciones = new ArrayList<>();

    /**
     * Metodo constructor
     * @param cancion
     */
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    /**
     * Metodo para obtener el tamaño de la lista de canciones, cantidad de canciones
     * @return numero de canciones dentro de la lista
     */
    public int getCantidadCanciones() {
        return canciones.size();
    }

    /**
     *  Metodo para obtener la cancion en la posicion ingresada
     * @param index
     * @return
     */
    public Cancion getCancion(int index) {
        return canciones.get(index);
    }

    /**
     * Metodo para crear un iterador asociado a esta playlist
     * @return objeto que implementa al iterador
     */
    @Override
    public Iterator<Cancion> createIterator() {
        return new PlaylistIterator(this);
    }
}

