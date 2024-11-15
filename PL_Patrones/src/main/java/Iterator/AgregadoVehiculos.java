package Iterator;

import java.util.ArrayList;

public class AgregadoVehiculos implements Agregado {
    // Atributos de la clase AgregadoVehiculos
    private ArrayList<String> listaVehiculos; // Lista de elementos a recorrer

    // Métodos de la clase AgregadoVehiculos

    //Método constructor
    public AgregadoVehiculos(ArrayList<String> listaVehiclos){
        this.listaVehiculos = listaVehiclos;
    }

    @Override
    public Iterador crearIterador(){
        return new IteradorVehiculos(this);
    }

    // Metodos get

    public ArrayList<String> getListaVehiculos() {
        return listaVehiculos;
    }
}
