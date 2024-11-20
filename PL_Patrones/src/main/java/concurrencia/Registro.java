package concurrencia;

import java.util.ArrayList;

public class Registro {
    // Atributos de la clase Registro
    private final ArrayList<String> listaVehiculos;
    private final ArrayList<Factura> listaFacturas;

    // Métodos de la clase Registro

    // Método constructor
    public Registro(){
        this.listaVehiculos = new ArrayList<>();
        this.listaFacturas = new ArrayList<>();
    }

    // Método para anadir un vehiculo a la lista
    public void anadirVehiculo(Vehiculo vehiculo){
        // Se anade el vehiculo en la lista una vez adquirido el cerrojo
        getListaVehiculos().add(vehiculo.getIdentificador());
    }

    // Método para anadir una factura a la lista
    public void anadirFactura(Factura factura){
        getListaFacturas().add(factura);
    }

    // Método get y set

    public ArrayList<String> getListaVehiculos() {
        return listaVehiculos;
    }

    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }
}
