package Adapter;

import concurrencia.Factura;

public class AdaptadorDinero implements Recibo{
    // Atributos de la clase AdaptadorDinero
    private Factura factura;

    // Métodos de la clase AdaptadorDinero
    public AdaptadorDinero(Factura factura){
        this.factura = factura;
    }

    // Método que convierte la cantidad en euros en libras esterlinas
    @Override
    public double getPrecio(){
        double precio = getFactura().getPrecio();
        return precio * 0.83;
    }

    private Factura getFactura() {
        return factura;
    }
}
