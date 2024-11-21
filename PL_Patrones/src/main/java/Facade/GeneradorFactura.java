package Facade;

import concurrencia.Factura;
import concurrencia.Vehiculo;

public class GeneradorFactura {
    // Atributos de la clase GeneradorFactura
    private Vehiculo vehiculo;

    // Métodos de la clase GeneradorFactura

    // Constructor
    public GeneradorFactura(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    // Método para generar una factura
    public Factura generaFactura(double precio){
        return new Factura(getVehiculo().getIdentificador(), precio);
    }

    // Métodos get
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
