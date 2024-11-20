package Strategy;

public class Contexto {
    // Atributos de la clase Contexto
    private Estrategia estrategia;
    private double precio;

    // Métodos de la clase Contexto

    // Constructor
    public Contexto(Estrategia e, double precio){
        this.estrategia = e;
        this.precio = precio;
    }

    // Método para ejecutar la estrategia
    public double ejecutaEstrategia(){
        return estrategia.calcular(precio);
    }
}
