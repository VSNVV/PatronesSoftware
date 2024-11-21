package Facade;

import Strategy.Estrategia;
import Strategy.EstrategiaEstandar;
import Strategy.EstrategiaPremium;
import Strategy.EstrategiaReducida;

import java.util.Random;

public class TarifaFactura {
    // Atributos de la clase TarifaFactura
    private final Random r = new Random();

    // Métodos de la clase TarifaFactura

    // Método para devolver una Tarifa (Estrategia) al azar
    public Estrategia generarTarifa(){
        Estrategia estrategia = null;
        int eleccion = r.nextInt(3);
        switch (eleccion) {
            case 0 ->
                // Tarifa estandar
                    estrategia = new EstrategiaEstandar();
            case 1 ->
                // Tarifa reducida
                    estrategia = new EstrategiaReducida();
            case 2 ->
                // Tarifa premium
                    estrategia = new EstrategiaPremium();
        }
        return estrategia;
    }


}
