package Iterator;

import Iterator.AgregadoVehiculos;
import Iterator.Iterador;

public class IteradorVehiculos implements Iterador {
    // Atrubutos de la clase IteradorVehiculos
    private AgregadoVehiculos agregado;
    private int index = 0;

    // Métodos de la clase IteradorVehiculos

    // Método constructor
    public IteradorVehiculos(AgregadoVehiculos agregado){
        this.agregado = agregado;
    }

    // Método para devolver el siguiente elemento de la lista
    @Override
    public Object siguiente() throws IndexOutOfBoundsException{
        Object objeto = null;
        if(getIndex() < getAgregado().getListaVehiculos().size()){
            objeto = getAgregado().getListaVehiculos().get(getIndex());
            // Como hemos visitado uno, incrementamos el indice
            setIndex(getIndex() + 1);
        }
        else{
            throw new IndexOutOfBoundsException();
        }
        return objeto;
    }

    // Metodo que devuelve si hay mas o no elementos en la lista
    @Override
    public boolean hayMas(){
        boolean resultado;
        resultado = getIndex() < getAgregado().getListaVehiculos().size();
        return resultado;
    }

    // Métodos get

    public AgregadoVehiculos getAgregado() {
        return this.agregado;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index){
        this.index = index;
    }
}
