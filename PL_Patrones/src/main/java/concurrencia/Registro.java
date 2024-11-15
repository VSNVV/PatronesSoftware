package concurrencia;

import java.util.ArrayList;

public class Registro {
    // Atributos de la clase Registro
    private final ArrayList<String> listaVehiculos;

    // Métodos de la clase Registro

    // Método constructor
    public Registro(){
        this.listaVehiculos = new ArrayList<>();
    }

    // Método para anadir un vehiculo a la lista
    public void anadir(Vehiculo vehiculo){
        // Se anade el vehiculo en la lista una vez adquirido el cerrojo
        getListaVehiculos().add(vehiculo.getIdentificador());
    }

    // Método get y set

    public ArrayList<String> getListaVehiculos() {
        return listaVehiculos;
    }
}
