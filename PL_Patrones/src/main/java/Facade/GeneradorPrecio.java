package Facade;

import concurrencia.Vehiculo;

public class GeneradorPrecio {
    // Atributos de la clase GeneradorPrecio
    private Vehiculo vehiculo;

    // Métodos de la clase GeneradorPrecio

    // Constructor
    public GeneradorPrecio(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    //Método para generar el precio base
    public double generarPrecio(){
        double precio = 0.0;
        if(getVehiculo().getIdentificador().contains("Coche")){
            precio = 3.0;
        }
        else if(getVehiculo().getIdentificador().contains("Camion")){
            precio = 5.0;
        }
        return precio;
    }

    // Método get
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
