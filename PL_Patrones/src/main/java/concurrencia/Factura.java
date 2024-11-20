package concurrencia;

public class Factura {
    // Atributos de la clase Factura
    private String idVehiculo;
    private double precio;

    // Métodos de la clase Factura

    // Constructor
    public Factura(String idVehiculo, double precio){
        this.idVehiculo = idVehiculo;
        this.precio = precio;
    }

    // Métodos get
    public String getIdVehiculo() {
        return idVehiculo;
    }

    public double getPrecio() {
        return precio;
    }
}
