package co.edu.uniquindio.poo.iteradorpatron.model;

public interface Iterator<T> {
    public boolean hasNext();
    public T next();

    public boolean hasPrevious();
    public T previous();
}
