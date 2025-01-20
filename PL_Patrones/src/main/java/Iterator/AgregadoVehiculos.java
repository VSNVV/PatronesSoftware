package Iterator;

import concurrencia.Vehiculo;

import java.util.ArrayList;

public class AgregadoVehiculos implements Agregado {
    // Atributos de la clase AgregadoVehiculos
    private ArrayList<Vehiculo> listaVehiculos; // Lista de elementos a recorrer

    // Métodos de la clase AgregadoVehiculos

    //Método constructor
    public AgregadoVehiculos(ArrayList<Vehiculo> listaVehiclos){
        this.listaVehiculos = listaVehiclos;
    }

    @Override
    public Iterador crearIterador(){
        return new IteradorVehiculos(this);
    }

    // Metodos get

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}
