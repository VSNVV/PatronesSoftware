package Facade;

import Strategy.Estrategia;
import concurrencia.Factura;
import concurrencia.Vehiculo;

public class FachadaFactura {
    // Atributos de la clase FachadaFactura
    GeneradorPrecio generadorPrecio;
    TarifaFactura tarifa;
    GeneradorFactura generadorFactura;

    // Método constructor
    public FachadaFactura(Vehiculo vehiculo){
        this.generadorPrecio = new GeneradorPrecio(vehiculo);
        this.tarifa = new TarifaFactura();
        this.generadorFactura = new GeneradorFactura(vehiculo);
    }

    // Método para generar el precio base
    public double generaPrecioBase(){
        return getGeneradorPrecio().generarPrecio();
    }

    // Método para generar una tarifa al azar
    public Estrategia generaTarifa(){
        return getTarifa().generarTarifa();
    }

    // Método para generar una factura teniendo en cuenta el precio obtenido
    public Factura generaFactura(double precio){
        return getGeneradorFactura().generaFactura(precio);
    }

    // Métodos get
    public GeneradorPrecio getGeneradorPrecio() {
        return generadorPrecio;
    }

    public TarifaFactura getTarifa() {
        return tarifa;
    }

    public GeneradorFactura getGeneradorFactura() {
        return generadorFactura;
    }
}
