package Strategy;

import java.text.DecimalFormat;

public class EstrategiaEstandar implements Estrategia{
    // Atributos de la clase EstrategiaEstandar

    // Métodos de la clase EstrategiaEstandar

    // Método para calcular la tarifa
    @Override
    public double calcular(double precio) {
        // Se le añade el 21%
        return (precio * (1.21));
    }
}
