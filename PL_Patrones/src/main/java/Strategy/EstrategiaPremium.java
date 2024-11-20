package Strategy;

import java.text.DecimalFormat;

public class EstrategiaPremium implements Estrategia{
    // Atributos de la clase EstrategiaPremium

    // Métodos de la clase EstraegiaPremium

    @Override
    public double calcular(double precio) {
        // Implementar el algoritmo para calcular la tarifa premium
        // Se le añade un 5%
        return (precio * (1.05));
    }
}
