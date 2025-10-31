package co.edu.uniquindio.poo.iteradorpatron.model;

public class PlaylistIterator implements Iterator<Cancion> {
    private Playlist playlist;
    private int posicionActual = 0;

    /**
     * Metodo constructor
     * @param playlist
     */
    public PlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
    }

    /**
     * Metodo para saber si hay más canciones para recorrer
     * @return verdadero si tiene una siguiente, falso si es el final de la lista
     */
    @Override
    public boolean hasNext() {
        return posicionActual < playlist.getCantidadCanciones();
    }

    /**
     * Metodo para mostrar la siguiente canción y avanzar en posición
     * @return siguiente canción
     */
    @Override
    public Cancion next() {
        return playlist.getCancion(posicionActual++);
    }

    /**
     * Metodo para determinar si la canción en la posición en la que estamos tiene una anterior
     * @return verdadero si hay una anterior, falso si estamos a inicio de la playlist
     */
    @Override
    public boolean hasPrevious() {
        return posicionActual > 1;
    }

    /**
     * Metodo para retroceder una canción en la playlist
     * @return cancion anterior
     */
    @Override
    public Cancion previous() {
        if (hasPrevious()) {
            posicionActual -= 2;
            return next();
        } else if (posicionActual == 1) {
            posicionActual = 0;
            return playlist.getCancion(0);
        } else {
            return null;
        }
    }

}

