package Flyweight;

import concurrencia.Paso;
import concurrencia.Peaje;
import concurrencia.Vehiculo;

import java.util.HashMap;

public class FactoriaVehiculos {
    // Atributos de la clase FactoriaVehiculos
    public static final int coche = 1;
    private static final HashMap<String, Vehiculo> vehiculosPorNombre = new HashMap<>();

    private final Peaje peaje;

    private final Paso paso;

    Vehiculo vehiculo;

    // Métodos de la clase FactoriaVehiculos

    // Constructor
    public FactoriaVehiculos(Peaje peaje, Paso paso){
        this.peaje = peaje;
        this.paso = paso;
    }

    // Método para crear vehiculos en el caso de que no existan
    public Vehiculo getVehiculo(int eleccion, int num){
        setVehiculo(null);
        if(eleccion == coche){
            String clave = "Coche" + num;
            setVehiculo(vehiculosPorNombre.get(clave));
            if(getVehiculo() == null){
                setVehiculo(new Vehiculo(getPeaje(), "Coche", num, getPaso()));
                vehiculosPorNombre.put(clave, getVehiculo());
            }
            return getVehiculo();
        }
        else{
            String clave = "Camion" + num;
            setVehiculo(vehiculosPorNombre.get(clave));
            if(getVehiculo() == null){
                setVehiculo(new Vehiculo(getPeaje(), "Camion", num, getPaso()));
                vehiculosPorNombre.put(clave, getVehiculo());
            }
            return getVehiculo();
        }

    }

    // Métodos get


    public Peaje getPeaje() {
        return peaje;
    }

    public Paso getPaso() {
        return paso;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }


    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
