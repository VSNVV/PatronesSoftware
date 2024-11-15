package Iterator;

public interface Iterador {

    // Método que devuelve el siguiente de la lista
    Object siguiente() throws IndexOutOfBoundsException;

    // Método que devuelve si hay o no mas elementos en la lista
    boolean hayMas();
}
