package co.edu.uniquindio.poo.iteradorpatron.model;

public class PlaylistIterator implements Iterator<Cancion> {
    private Playlist playlist;
    private int posicionActual = 0;

    public PlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        return posicionActual < playlist.getCantidadCanciones();
    }

    @Override
    public Cancion next() {
        return playlist.getCancion(posicionActual++);
    }

    @Override
    public boolean hasPrevious() {
        return posicionActual > 1;
    }

    @Override
    public Cancion previous() {
        if (hasPrevious()) {
            posicionActual -= 2; // retrocede una posición
            return next(); // devuelve la canción anterior
        } else if (posicionActual == 1) {
            posicionActual = 0;
            return playlist.getCancion(0);
        } else {
            return null;
        }
    }

}

